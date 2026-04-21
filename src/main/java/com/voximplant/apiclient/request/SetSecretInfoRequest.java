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

public class SetSecretInfoRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Application ID
    */
    public SetSecretInfoRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Application name. Can be used instead of <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Application name. Can be used instead of <b>application_id</b>
    */
    public SetSecretInfoRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long secretId;

    @RequestField(name="secret_id")
    /**
    * Secret ID to edit
    */
    public Long getSecretId() {
        return this.secretId;
    }

    public boolean hasSecretId() {
        return this.secretId != null;
    }

    /**
    * Secret ID to edit
    */
    public SetSecretInfoRequest setSecretId(long d) {
        this.secretId = Long.valueOf(d);
        return this;
    }

    private String secretName;

    @RequestField(name="secret_name")
    /**
    * Secret name. Can be used instead of <b>secret_id</b>
    */
    public String getSecretName() {
        return this.secretName;
    }

    public boolean hasSecretName() {
        return this.secretName != null;
    }

    /**
    * Secret name. Can be used instead of <b>secret_id</b>
    */
    public SetSecretInfoRequest setSecretName(String d) {
        this.secretName = d;
        return this;
    }

    private String newSecretName;

    @RequestField(name="new_secret_name")
    /**
    * New secret name. The name must start with a Latin letter and can
    * contain up to 64 characters, including Latin letters, digits and
    * underscores
    */
    public String getNewSecretName() {
        return this.newSecretName;
    }

    public boolean hasNewSecretName() {
        return this.newSecretName != null;
    }

    /**
    * New secret name. The name must start with a Latin letter and can
    * contain up to 64 characters, including Latin letters, digits and
    * underscores
    */
    public SetSecretInfoRequest setNewSecretName(String d) {
        this.newSecretName = d;
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
    public SetSecretInfoRequest setSecretValue(String d) {
        this.secretValue = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * Secret description. When processing, the length is truncated to the
    * first 200 characters
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * Secret description. When processing, the length is truncated to the
    * first 200 characters
    */
    public SetSecretInfoRequest setDescription(String d) {
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
        if (secretId != null) {
            sb.append(aligned)
                .append("\"secretId\": \"")
                .append(secretId)
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
        if (newSecretName != null) {
            sb.append(aligned)
                .append("\"newSecretName\": \"")
                .append(newSecretName)
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