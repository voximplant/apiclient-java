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

public class AddPushCredentialRequest implements Alignable {
    private String pushProviderName;

    @RequestField(name="push_provider_name")
    /**
    * The push provider name. The possible values are APPLE, APPLE_VOIP,
    * GOOGLE, HUAWEI
    */
    public String getPushProviderName() {
        return this.pushProviderName;
    }

    public boolean hasPushProviderName() {
        return this.pushProviderName != null;
    }

    /**
    * The push provider name. The possible values are APPLE, APPLE_VOIP,
    * GOOGLE, HUAWEI
    */
    public AddPushCredentialRequest setPushProviderName(String d) {
        this.pushProviderName = d;
        return this;
    }

    private Long pushProviderId;

    @RequestField(name="push_provider_id")
    /**
    * The push provider id. Can be used instead of <b>push_provider_name</b>
    */
    public Long getPushProviderId() {
        return this.pushProviderId;
    }

    public boolean hasPushProviderId() {
        return this.pushProviderId != null;
    }

    /**
    * The push provider id. Can be used instead of <b>push_provider_name</b>
    */
    public AddPushCredentialRequest setPushProviderId(long d) {
        this.pushProviderId = Long.valueOf(d);
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application id
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application id
    */
    public AddPushCredentialRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public AddPushCredentialRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String credentialBundle;

    @RequestField(name="credential_bundle")
    /**
    * The bundle of Android/iOS/Huawei application
    */
    public String getCredentialBundle() {
        return this.credentialBundle;
    }

    public boolean hasCredentialBundle() {
        return this.credentialBundle != null;
    }

    /**
    * The bundle of Android/iOS/Huawei application
    */
    public AddPushCredentialRequest setCredentialBundle(String d) {
        this.credentialBundle = d;
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
    public AddPushCredentialRequest setCertContent(String d) {
        this.certContent = d;
        return this;
    }

    private String certFileName;

    @RequestField(name="cert_file_name")
    /**
    * The parameter is required, when set 'cert_content' as POST body.
    * Credentials for APPLE push
    */
    public String getCertFileName() {
        return this.certFileName;
    }

    public boolean hasCertFileName() {
        return this.certFileName != null;
    }

    /**
    * The parameter is required, when set 'cert_content' as POST body.
    * Credentials for APPLE push
    */
    public AddPushCredentialRequest setCertFileName(String d) {
        this.certFileName = d;
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
    public AddPushCredentialRequest setCertPassword(String d) {
        this.certPassword = d;
        return this;
    }

    private Boolean isDevMode;

    @RequestField(name="is_dev_mode")
    /**
    * Set true to use this certificate in apple's sandbox environment.
    * Credentials for APPLE push
    */
    public Boolean getIsDevMode() {
        return this.isDevMode;
    }

    public boolean hasIsDevMode() {
        return this.isDevMode != null;
    }

    /**
    * Set true to use this certificate in apple's sandbox environment.
    * Credentials for APPLE push
    */
    public AddPushCredentialRequest setIsDevMode(boolean d) {
        this.isDevMode = Boolean.valueOf(d);
        return this;
    }

    private String senderId;

    @RequestField(name="sender_id")
    /**
    * The sender id, provided by Google. Credentials for GOOGLE push
    */
    public String getSenderId() {
        return this.senderId;
    }

    public boolean hasSenderId() {
        return this.senderId != null;
    }

    /**
    * The sender id, provided by Google. Credentials for GOOGLE push
    */
    public AddPushCredentialRequest setSenderId(String d) {
        this.senderId = d;
        return this;
    }

    private String serverKey;

    @RequestField(name="server_key")
    /**
    * The server key, provided by Google. Credentials for GOOGLE push
    */
    public String getServerKey() {
        return this.serverKey;
    }

    public boolean hasServerKey() {
        return this.serverKey != null;
    }

    /**
    * The server key, provided by Google. Credentials for GOOGLE push
    */
    public AddPushCredentialRequest setServerKey(String d) {
        this.serverKey = d;
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
    public AddPushCredentialRequest setServiceAccountFile(String d) {
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
    public AddPushCredentialRequest setHuaweiClientId(String d) {
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
    public AddPushCredentialRequest setHuaweiClientSecret(String d) {
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
    public AddPushCredentialRequest setHuaweiApplicationId(String d) {
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
        if (pushProviderName != null) {
            sb.append(aligned)
                .append("\"pushProviderName\": \"")
                .append(pushProviderName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (pushProviderId != null) {
            sb.append(aligned)
                .append("\"pushProviderId\": \"")
                .append(pushProviderId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (credentialBundle != null) {
            sb.append(aligned)
                .append("\"credentialBundle\": \"")
                .append(credentialBundle)
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