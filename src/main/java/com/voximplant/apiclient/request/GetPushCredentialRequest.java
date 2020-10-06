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

public class GetPushCredentialRequest implements Alignable {
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
    public GetPushCredentialRequest setPushCredentialId(long d) {
        this.pushCredentialId = Long.valueOf(d);
        return this;
    }

    private String pushProviderName;

    @RequestField(name="push_provider_name")
    /**
    * The push provider name. The possible values are: APPLE, APPLE_VOIP,
    * GOOGLE.
    */
    public String getPushProviderName() {
        return this.pushProviderName;
    }

    public boolean hasPushProviderName() {
        return this.pushProviderName != null;
    }

    /**
    * The push provider name. The possible values are: APPLE, APPLE_VOIP,
    * GOOGLE.
    */
    public GetPushCredentialRequest setPushProviderName(String d) {
        this.pushProviderName = d;
        return this;
    }

    private Long pushProviderId;

    @RequestField(name="push_provider_id")
    /**
    * The push provider id.
    */
    public Long getPushProviderId() {
        return this.pushProviderId;
    }

    public boolean hasPushProviderId() {
        return this.pushProviderId != null;
    }

    /**
    * The push provider id.
    */
    public GetPushCredentialRequest setPushProviderId(long d) {
        this.pushProviderId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The name of the bound application.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The name of the bound application.
    */
    public GetPushCredentialRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The id of the bound application.
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The id of the bound application.
    */
    public GetPushCredentialRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private Boolean withCert;

    @RequestField(name="with_cert")
    /**
    * Set true to get the user's certificate.
    */
    public Boolean getWithCert() {
        return this.withCert;
    }

    public boolean hasWithCert() {
        return this.withCert != null;
    }

    /**
    * Set true to get the user's certificate.
    */
    public GetPushCredentialRequest setWithCert(boolean d) {
        this.withCert = Boolean.valueOf(d);
        return this;
    }

    private Boolean withSecretInfo;

    @RequestField(name="with_secret_info")
    /**
    * Set true to get the certificate's password.
    */
    public Boolean getWithSecretInfo() {
        return this.withSecretInfo;
    }

    public boolean hasWithSecretInfo() {
        return this.withSecretInfo != null;
    }

    /**
    * Set true to get the certificate's password.
    */
    public GetPushCredentialRequest setWithSecretInfo(boolean d) {
        this.withSecretInfo = Boolean.valueOf(d);
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
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
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
        if (withCert != null) {
            sb.append(aligned)
                .append("\"withCert\": \"")
                .append(withCert)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withSecretInfo != null) {
            sb.append(aligned)
                .append("\"withSecretInfo\": \"")
                .append(withSecretInfo)
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