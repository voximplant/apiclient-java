package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetKeysRequest {
    private String keyId;

    @RequestField(name="key_id")
    /**
    * The key's ID.
    */
    public String getKeyId() {
        return this.keyId;
    }

    public boolean hasKeyId() {
        return this.keyId != null;
    }

    /**
    * The key's ID.
    */
    public GetKeysRequest setKeyId(String d) {
        this.keyId = d;
        return this;
    }

    private Boolean withRoles;

    @RequestField(name="with_roles")
    /**
    * Show roles for the key.
    */
    public boolean getWithRoles() {
        return this.withRoles.booleanValue();
    }

    public boolean hasWithRoles() {
        return this.withRoles != null;
    }

    /**
    * Show roles for the key.
    */
    public GetKeysRequest setWithRoles(boolean d) {
        this.withRoles = Boolean.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetKeysRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetKeysRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

}