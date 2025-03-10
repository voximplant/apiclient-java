package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [CreateKey] function result.
*/
public class KeyInfo implements Alignable {

    private String accountEmail;

    /**
    * Client email
    */
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public boolean hasAccountEmail() {
        return this.accountEmail != null;
    }

    private Long accountId;

    /**
    * The account ID
    */
    public Long getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private String keyId;

    /**
    * The key ID
    */
    public String getKeyId() {
        return this.keyId;
    }

    public boolean hasKeyId() {
        return this.keyId != null;
    }

    private String privateKey;

    /**
    * The private key
    */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public boolean hasPrivateKey() {
        return this.privateKey != null;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (accountEmail != null) {
            sb.append(aligned)
                .append("\"accountEmail\": \"")
                .append(accountEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (keyId != null) {
            sb.append(aligned)
                .append("\"keyId\": \"")
                .append(keyId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (privateKey != null) {
            sb.append(aligned)
                .append("\"privateKey\": \"")
                .append(privateKey)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}