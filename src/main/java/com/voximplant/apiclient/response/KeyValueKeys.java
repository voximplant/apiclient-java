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
* GetKeyValueKeys function result.
*/
public class KeyValueKeys implements Alignable {

    private String key;

    /**
    * Key that matches the pattern
    */
    public String getKey() {
        return this.key;
    }

    public boolean hasKey() {
        return this.key != null;
    }

    private Long expiresAt;

    /**
    * Expiration date based on **ttl** (timestamp without milliseconds)
    */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public boolean hasExpiresAt() {
        return this.expiresAt != null;
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
        if (key != null) {
            sb.append(aligned)
                .append("\"key\": \"")
                .append(key)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expiresAt != null) {
            sb.append(aligned)
                .append("\"expiresAt\": \"")
                .append(expiresAt)
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