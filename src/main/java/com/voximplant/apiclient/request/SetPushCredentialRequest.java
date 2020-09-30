package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class SetPushCredentialRequest {
    private Long pushCredentialId;

    @RequestField(name="push_credential_id")
    /**
    * The push credentials id.
    */
    public long getPushCredentialId() {
        return this.pushCredentialId.longValue();
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
    public boolean getIsDevMode() {
        return this.isDevMode.booleanValue();
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

}