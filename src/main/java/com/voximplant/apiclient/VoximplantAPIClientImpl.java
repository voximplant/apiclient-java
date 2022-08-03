package com.voximplant.apiclient;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

class VoximplantAPIClientImpl {
    private static final long latencyCompensationTime = 5000L;
    private final long tokenLifespan;
    private final Credentials credentials;
    private final String apiUrl;
    private final Key privateKey;
    private volatile String authHeader;
    private volatile long tokenRefreshTimestamp;

    VoximplantAPIClientImpl(ClientConfiguration clientConfiguration) throws IOException, ClientException {
        this.tokenLifespan = clientConfiguration.getTokenLifespan();
        this.tokenRefreshTimestamp = System.currentTimeMillis() - tokenLifespan;
        this.apiUrl = clientConfiguration.getProtocol() + "://" + clientConfiguration.getApiHost() +
                "/" + clientConfiguration.getApiPrefix() + "/";
        final String jwtKey = new String(Files.readAllBytes(Paths.get(clientConfiguration.getCredentials())), StandardCharsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        this.credentials = mapper.readValue(jwtKey, Credentials.class);

        // Remove the "BEGIN" and "END" lines, as well as any whitespace
        String pkcs8Pem = this.credentials.getPrivateKey().toString();
        pkcs8Pem = pkcs8Pem.replace("-----BEGIN PRIVATE KEY-----", "");
        pkcs8Pem = pkcs8Pem.replace("-----END PRIVATE KEY-----", "");
        pkcs8Pem = pkcs8Pem.replaceAll("\\s+", "");        // Base64 decode the result
        byte[] pkcs8EncodedBytes = Base64.getDecoder().decode(pkcs8Pem);        // extract the private key
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pkcs8EncodedBytes);
        try {
            KeyFactory kf = KeyFactory.getInstance("RSA");
            this.privateKey =  kf.generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            ex.printStackTrace(System.err);
            throw new ClientException("Error loading private key", ex);
        }
    }

    private String generateAuthHeader() {
        JwtBuilder builder = Jwts.builder();
        builder.setIssuer(Long.toString(this.credentials.getAccountId()));
        long now = System.currentTimeMillis();

        builder.setIssuedAt(new Date(now - latencyCompensationTime));
        builder.setExpiration(new Date(now + tokenLifespan));

        Map<String, Object> headers = new HashMap<>();
        headers.put("kid", this.credentials.getKeyId());

        builder.setHeader(headers);
        builder.signWith(SignatureAlgorithm.RS256, this.privateKey);
        String ss = builder.compact();
        
        return "Bearer "+ss;
    }

    private String getAuthHeader() {
        long currentTime = System.currentTimeMillis();
        if (currentTime + latencyCompensationTime > tokenRefreshTimestamp + tokenLifespan) {
            synchronized (this) {
                if (currentTime + latencyCompensationTime > tokenRefreshTimestamp + tokenLifespan) {
                    authHeader = generateAuthHeader();
                    tokenRefreshTimestamp = System.currentTimeMillis();
                }
            }
        }
        return authHeader;
    }

    String performRequest(String name,Map<String, String> params) throws IOException {
        Request request = Request.Post(apiUrl + name);
        Form form = Form.form();
        form.add("account_id", Long.toString(this.credentials.getAccountId()));
        if (params != null) {
            for (Map.Entry<String, String> param:params.entrySet()) {
                form.add(param.getKey(), param.getValue());
            }
        }
        request.addHeader("Authorization", this.getAuthHeader());
        request.bodyForm(form.build(), StandardCharsets.UTF_8);
        Content content = request.execute().returnContent();
        return content.asString();
    }
}
