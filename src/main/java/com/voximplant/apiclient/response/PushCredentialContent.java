package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The push credentials list item info.
*/
public class PushCredentialContent {

    private String certFileName;

    /**
    * The file name. Credentials for APPLE push.
    */
    public String getCertFileName() {
        return this.certFileName;
    }

    public boolean hasCertFileName() {
        return this.certFileName != null;
    }

    private String certPassword;

    /**
    * The password for private key. Credentials for APPLE push.
    */
    public String getCertPassword() {
        return this.certPassword;
    }

    public boolean hasCertPassword() {
        return this.certPassword != null;
    }

    private String certContent;

    /**
    * The certificate content in BASE64. Credentials for APPLE push.
    */
    public String getCertContent() {
        return this.certContent;
    }

    public boolean hasCertContent() {
        return this.certContent != null;
    }

    private Boolean isDevMode;

    /**
    * The use in a Apple sandbox environment. Credentials for APPLE push.
    */
    public boolean getIsDevMode() {
        return this.isDevMode.booleanValue();
    }

    public boolean hasIsDevMode() {
        return this.isDevMode != null;
    }

    private String senderId;

    /**
    * The sender id provided by Google. Credentials for GOOGLE push.
    */
    public String getSenderId() {
        return this.senderId;
    }

    public boolean hasSenderId() {
        return this.senderId != null;
    }

    private String serverKey;

    /**
    * The server key provided by Google. Credentials for GOOGLE push.
    */
    public String getServerKey() {
        return this.serverKey;
    }

    public boolean hasServerKey() {
        return this.serverKey != null;
    }

}