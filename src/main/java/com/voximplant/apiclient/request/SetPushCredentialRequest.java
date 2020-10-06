package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class SetPushCredentialRequest implements Alignable {
    private Long pushCredentialId;

    @RequestField(name="push_credential_id")
    /**
    * The push credentials id.
    */
    public Long getPushCredentialId() {
        return this.pushCredentialId;
    }

    public boolean hasPushCredentialId() {
        return this.pushCredentialId != null;
    }

    /**
    * The push credentials id.
    */
    public SetPushCredentialRequest setPushCredentialId(long d) {
        this.pushCredentialId = Long.valueOf(d);
        return this;
    }

    private String certContent;

    @RequestField(name="cert_content")
    /**
    * Public and private keys in PKCS12 format.
    */
    public String getCertContent() {
        return this.certContent;
    }

    public boolean hasCertContent() {
        return this.certContent != null;
    }

    /**
    * Public and private keys in PKCS12 format.
    */
    public SetPushCredentialRequest setCertContent(String d) {
        this.certContent = d;
        return this;
    }

    private String certPassword;

    @RequestField(name="cert_password")
    /**
    * The secret password for private key.
    */
    public String getCertPassword() {
        return this.certPassword;
    }

    public boolean hasCertPassword() {
        return this.certPassword != null;
    }

    /**
    * The secret password for private key.
    */
    public SetPushCredentialRequest setCertPassword(String d) {
        this.certPassword = d;
        return this;
    }

    private Boolean isDevMode;

    @RequestField(name="is_dev_mode")
    /**
    * Set true for use this certificate in apple's sandbox environment
    */
    public Boolean getIsDevMode() {
        return this.isDevMode;
    }

    public boolean hasIsDevMode() {
        return this.isDevMode != null;
    }

    /**
    * Set true for use this certificate in apple's sandbox environment
    */
    public SetPushCredentialRequest setIsDevMode(boolean d) {
        this.isDevMode = Boolean.valueOf(d);
        return this;
    }

    private String senderId;

    @RequestField(name="sender_id")
    /**
    * The sender id, provided by Google.
    */
    public String getSenderId() {
        return this.senderId;
    }

    public boolean hasSenderId() {
        return this.senderId != null;
    }

    /**
    * The sender id, provided by Google.
    */
    public SetPushCredentialRequest setSenderId(String d) {
        this.senderId = d;
        return this;
    }

    private String serverKey;

    @RequestField(name="server_key")
    /**
    * The server key, provided by Google.
    */
    public String getServerKey() {
        return this.serverKey;
    }

    public boolean hasServerKey() {
        return this.serverKey != null;
    }

    /**
    * The server key, provided by Google.
    */
    public SetPushCredentialRequest setServerKey(String d) {
        this.serverKey = d;
        return this;
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
        if (pushCredentialId != null) {
            sb.append(aligned)
                .append("\"pushCredentialId\": \"")
                .append(pushCredentialId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (certContent != null) {
            sb.append(aligned)
                .append("\"certContent\": \"")
                .append(certContent)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (certPassword != null) {
            sb.append(aligned)
                .append("\"certPassword\": \"")
                .append(certPassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isDevMode != null) {
            sb.append(aligned)
                .append("\"isDevMode\": \"")
                .append(isDevMode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (senderId != null) {
            sb.append(aligned)
                .append("\"senderId\": \"")
                .append(senderId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serverKey != null) {
            sb.append(aligned)
                .append("\"serverKey\": \"")
                .append(serverKey)
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