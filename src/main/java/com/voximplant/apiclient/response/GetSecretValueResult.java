package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetSecretValue] function result
*/
public class GetSecretValueResult implements Alignable {

    private Long secretId;

    /**
    * Secret ID
    */
    public Long getSecretId() {
        return this.secretId;
    }

    public boolean hasSecretId() {
        return this.secretId != null;
    }

    private String secretName;

    /**
    * Secret name
    */
    public String getSecretName() {
        return this.secretName;
    }

    public boolean hasSecretName() {
        return this.secretName != null;
    }

    private String secretValue;

    /**
    * Secret value
    */
    public String getSecretValue() {
        return this.secretValue;
    }

    public boolean hasSecretValue() {
        return this.secretValue != null;
    }

    private String description;

    /**
    * Secret description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * Secret creation timestamp
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * Secret modification timestamp
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
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
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
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