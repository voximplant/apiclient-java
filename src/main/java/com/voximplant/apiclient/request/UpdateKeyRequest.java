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

public class UpdateKeyRequest implements Alignable {
    private String keyId;

    @RequestField(name="key_id")
    /**
    * The key's ID
    */
    public String getKeyId() {
        return this.keyId;
    }

    public boolean hasKeyId() {
        return this.keyId != null;
    }

    /**
    * The key's ID
    */
    public UpdateKeyRequest setKeyId(String d) {
        this.keyId = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * The key's description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The key's description
    */
    public UpdateKeyRequest setDescription(String d) {
        this.description = d;
        return this;
    }

    private String keyName;

    @RequestField(name="key_name")
    /**
    * The key's name, up to 50 characters. Cannot be empty
    */
    public String getKeyName() {
        return this.keyName;
    }

    public boolean hasKeyName() {
        return this.keyName != null;
    }

    /**
    * The key's name, up to 50 characters. Cannot be empty
    */
    public UpdateKeyRequest setKeyName(String d) {
        this.keyName = d;
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
        if (keyId != null) {
            sb.append(aligned)
                .append("\"keyId\": \"")
                .append(keyId)
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
        if (keyName != null) {
            sb.append(aligned)
                .append("\"keyName\": \"")
                .append(keyName)
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