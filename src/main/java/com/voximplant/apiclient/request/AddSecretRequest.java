package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class AddSecretRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Application ID to add the secret to. <b>Required</b> unless
    * <b>application_name</b> is provided.
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Application ID to add the secret to. <b>Required</b> unless
    * <b>application_name</b> is provided.
    */
    public AddSecretRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Application name. <b>Required</b> unless <b>application_id</b> is
    * provided.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Application name. <b>Required</b> unless <b>application_id</b> is
    * provided.
    */
    public AddSecretRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String secretName;

    @RequestField(name="secret_name")
    /**
    * Secret name. The name must start with a Latin letter and can contain
    * up to 64 characters, including Latin letters, digits and underscores
    */
    public String getSecretName() {
        return this.secretName;
    }

    public boolean hasSecretName() {
        return this.secretName != null;
    }

    /**
    * Secret name. The name must start with a Latin letter and can contain
    * up to 64 characters, including Latin letters, digits and underscores
    */
    public AddSecretRequest setSecretName(String d) {
        this.secretName = d;
        return this;
    }

    private String secretValue;

    @RequestField(name="secret_value")
    /**
    * Secret value. Maximum length is 8192 characters
    */
    public String getSecretValue() {
        return this.secretValue;
    }

    public boolean hasSecretValue() {
        return this.secretValue != null;
    }

    /**
    * Secret value. Maximum length is 8192 characters
    */
    public AddSecretRequest setSecretValue(String d) {
        this.secretValue = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * Optional. Secret description. When processing, the length is
    * truncated to the first 200 characters
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * Optional. Secret description. When processing, the length is
    * truncated to the first 200 characters
    */
    public AddSecretRequest setDescription(String d) {
        this.description = d;
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
        if (secretName != null) {
            sb.append(aligned)
                .append("\"secretName\": \"")
                .append(secretName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (secretValue != null) {
            sb.append(aligned)
                .append("\"secretValue\": \"")
                .append(secretValue)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
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