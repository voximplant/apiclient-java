package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The push credentials list item info.
*/
public class PushCredentialContent implements Alignable {

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
    public Boolean getIsDevMode() {
        return this.isDevMode;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (certFileName != null) {
            sb.append(aligned)
                .append("\"certFileName\": \"")
                .append(certFileName)
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
        if (certContent != null) {
            sb.append(aligned)
                .append("\"certContent\": \"")
                .append(certContent)
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