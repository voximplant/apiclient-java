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

public class DelSecretRequest implements Alignable {
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
    public DelSecretRequest setApplicationId(long d) {
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
    public DelSecretRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> secretId;

    @RequestField(name="secret_id")
    /**
    * IDs to delete. A list separated by semicolons (;). Use the 'all'
    * value to delete all secrets
    */
    public MultiArgument<Long> getSecretId() {
        return this.secretId;
    }

    public boolean hasSecretId() {
        return this.secretId != null;
    }

    /**
    * IDs to delete. A list separated by semicolons (;). Use the 'all'
    * value to delete all secrets
    */
    public DelSecretRequest setSecretId(MultiArgument<Long> d) {
        this.secretId = d;
        return this;
    }

    private MultiArgument<String> secretName;

    @RequestField(name="secret_name")
    /**
    * Secret names to delete. List separated by semicolons (;)
    */
    public MultiArgument<String> getSecretName() {
        return this.secretName;
    }

    public boolean hasSecretName() {
        return this.secretName != null;
    }

    /**
    * Secret names to delete. List separated by semicolons (;)
    */
    public DelSecretRequest setSecretName(MultiArgument<String> d) {
        this.secretName = d;
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}