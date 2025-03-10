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

public class SetKeyValueItemRequest implements Alignable {
    private String key;

    @RequestField(name="key")
    /**
    * Key, up to 200 characters. A key can contain a namespace that is
    * written before the ':' symbol, for example, test:1234. Thus,
    * namespace 'test' can be used as a pattern in the
    * [GetKeyValueItems](/docs/references/httpapi/keyvaluestorage#getkeyvalueitems)
    * and
    * [GetKeyValueKeys](/docs/references/httpapi/keyvaluestorage#getkeyvaluekeys)
    * methods to find the keys with the same namespace
    */
    public String getKey() {
        return this.key;
    }

    public boolean hasKey() {
        return this.key != null;
    }

    /**
    * Key, up to 200 characters. A key can contain a namespace that is
    * written before the ':' symbol, for example, test:1234. Thus,
    * namespace 'test' can be used as a pattern in the
    * [GetKeyValueItems](/docs/references/httpapi/keyvaluestorage#getkeyvalueitems)
    * and
    * [GetKeyValueKeys](/docs/references/httpapi/keyvaluestorage#getkeyvaluekeys)
    * methods to find the keys with the same namespace
    */
    public SetKeyValueItemRequest setKey(String d) {
        this.key = d;
        return this;
    }

    private String value;

    @RequestField(name="value")
    /**
    * Value for the specified key, up to 2000 characters
    */
    public String getValue() {
        return this.value;
    }

    public boolean hasValue() {
        return this.value != null;
    }

    /**
    * Value for the specified key, up to 2000 characters
    */
    public SetKeyValueItemRequest setValue(String d) {
        this.value = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID
    */
    public SetKeyValueItemRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name
    */
    public SetKeyValueItemRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long ttl;

    @RequestField(name="ttl")
    /**
    * Key expiry time in seconds. The value is in range of 0..7,776,000 (90
    * days), the default value is 30 days (2,592,000 seconds). The TTL is
    * converted to an **expires_at** Unix timestamp field as part of the
    * storage object. Note that one of the two parameters (ttl or
    * expires_at) must be set
    */
    public Long getTtl() {
        return this.ttl;
    }

    public boolean hasTtl() {
        return this.ttl != null;
    }

    /**
    * Key expiry time in seconds. The value is in range of 0..7,776,000 (90
    * days), the default value is 30 days (2,592,000 seconds). The TTL is
    * converted to an **expires_at** Unix timestamp field as part of the
    * storage object. Note that one of the two parameters (ttl or
    * expires_at) must be set
    */
    public SetKeyValueItemRequest setTtl(long d) {
        this.ttl = Long.valueOf(d);
        return this;
    }

    private Long expiresAt;

    @RequestField(name="expires_at")
    /**
    * Expiration date based on **ttl** (timestamp without milliseconds).
    * Note that one of the two parameters (ttl or expires_at) must be set
    */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public boolean hasExpiresAt() {
        return this.expiresAt != null;
    }

    /**
    * Expiration date based on **ttl** (timestamp without milliseconds).
    * Note that one of the two parameters (ttl or expires_at) must be set
    */
    public SetKeyValueItemRequest setExpiresAt(long d) {
        this.expiresAt = Long.valueOf(d);
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
        if (key != null) {
            sb.append(aligned)
                .append("\"key\": \"")
                .append(key)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (value != null) {
            sb.append(aligned)
                .append("\"value\": \"")
                .append(value)
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
        if (ttl != null) {
            sb.append(aligned)
                .append("\"ttl\": \"")
                .append(ttl)
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