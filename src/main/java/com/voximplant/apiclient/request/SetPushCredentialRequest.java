package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
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
    * The push credentials id
    */
    public Long getPushCredentialId() {
        return this.pushCredentialId;
    }

    public boolean hasPushCredentialId() {
        return this.pushCredentialId != null;
    }

    /**
    * The push credentials id
    */
    public SetPushCredentialRequest setPushCredentialId(long d) {
        this.pushCredentialId = Long.valueOf(d);
        return this;
    }

    private String certContent;

    @RequestField(name="cert_content")
    /**
    * Public and private keys in PKCS12 format. Credentials for APPLE push
    */
    public String getCertContent() {
        return this.certContent;
    }

    public boolean hasCertContent() {
        return this.certContent != null;
    }

    /**
    * Public and private keys in PKCS12 format. Credentials for APPLE push
    */
    public SetPushCredentialRequest setCertContent(String d) {
        this.certContent = d;
        return this;
    }

    private String certPassword;

    @RequestField(name="cert_password")
    /**
    * The secret password for private key. Credentials for APPLE push
    */
    public String getCertPassword() {
        return this.certPassword;
    }

    public boolean hasCertPassword() {
        return this.certPassword != null;
    }

    /**
    * The secret password for private key. Credentials for APPLE push
    */
    public SetPushCredentialRequest setCertPassword(String d) {
        this.certPassword = d;
        return this;
    }

    private Boolean isDevMode;

    @RequestField(name="is_dev_mode")
    /**
    * Whether to use this certificate in apple's sandbox environment.
    * Credentials for APPLE push
    */
    public Boolean getIsDevMode() {
        return this.isDevMode;
    }

    public boolean hasIsDevMode() {
        return this.isDevMode != null;
    }

    /**
    * Whether to use this certificate in apple's sandbox environment.
    * Credentials for APPLE push
    */
    public SetPushCredentialRequest setIsDevMode(boolean d) {
        this.isDevMode = Boolean.valueOf(d);
        return this;
    }

    private String serviceAccountFile;

    @RequestField(name="service_account_file")
    /**
    * The service account key file, provided by Google. Can be used instead
    * of <b>server_key</b>. Credentials for GOOGLE push
    */
    public String getServiceAccountFile() {
        return this.serviceAccountFile;
    }

    public boolean hasServiceAccountFile() {
        return this.serviceAccountFile != null;
    }

    /**
    * The service account key file, provided by Google. Can be used instead
    * of <b>server_key</b>. Credentials for GOOGLE push
    */
    public SetPushCredentialRequest setServiceAccountFile(String d) {
        this.serviceAccountFile = d;
        return this;
    }

    private String huaweiClientId;

    @RequestField(name="huawei_client_id")
    /**
    * The client id, provided by Huawei. Credentials for HUAWEI push
    */
    public String getHuaweiClientId() {
        return this.huaweiClientId;
    }

    public boolean hasHuaweiClientId() {
        return this.huaweiClientId != null;
    }

    /**
    * The client id, provided by Huawei. Credentials for HUAWEI push
    */
    public SetPushCredentialRequest setHuaweiClientId(String d) {
        this.huaweiClientId = d;
        return this;
    }

    private String huaweiClientSecret;

    @RequestField(name="huawei_client_secret")
    /**
    * The client secret, provided by Huawei. Credentials for HUAWEI push
    */
    public String getHuaweiClientSecret() {
        return this.huaweiClientSecret;
    }

    public boolean hasHuaweiClientSecret() {
        return this.huaweiClientSecret != null;
    }

    /**
    * The client secret, provided by Huawei. Credentials for HUAWEI push
    */
    public SetPushCredentialRequest setHuaweiClientSecret(String d) {
        this.huaweiClientSecret = d;
        return this;
    }

    private String huaweiApplicationId;

    @RequestField(name="huawei_application_id")
    /**
    * The application id, provided by Huawei. Credentials for HUAWEI push
    */
    public String getHuaweiApplicationId() {
        return this.huaweiApplicationId;
    }

    public boolean hasHuaweiApplicationId() {
        return this.huaweiApplicationId != null;
    }

    /**
    * The application id, provided by Huawei. Credentials for HUAWEI push
    */
    public SetPushCredentialRequest setHuaweiApplicationId(String d) {
        this.huaweiApplicationId = d;
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
        if (serviceAccountFile != null) {
            sb.append(aligned)
                .append("\"serviceAccountFile\": \"")
                .append(serviceAccountFile)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (huaweiClientId != null) {
            sb.append(aligned)
                .append("\"huaweiClientId\": \"")
                .append(huaweiClientId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (huaweiClientSecret != null) {
            sb.append(aligned)
                .append("\"huaweiClientSecret\": \"")
                .append(huaweiClientSecret)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (huaweiApplicationId != null) {
            sb.append(aligned)
                .append("\"huaweiApplicationId\": \"")
                .append(huaweiApplicationId)
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