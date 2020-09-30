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

public class UpdateKeyRequest {
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
    * The key's description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The key's description.
    */
    public UpdateKeyRequest setDescription(String d) {
        this.description = d;
        return this;
    }

}