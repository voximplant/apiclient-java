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

public class GetKeyRolesRequest {
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
    public GetKeyRolesRequest setKeyId(String d) {
        this.keyId = d;
        return this;
    }

    private Boolean withExpandedRoles;

    @RequestField(name="with_expanded_roles")
    /**
    * Show the roles' additional properties.
    */
    public boolean getWithExpandedRoles() {
        return this.withExpandedRoles.booleanValue();
    }

    public boolean hasWithExpandedRoles() {
        return this.withExpandedRoles != null;
    }

    /**
    * Show the roles' additional properties.
    */
    public GetKeyRolesRequest setWithExpandedRoles(boolean d) {
        this.withExpandedRoles = Boolean.valueOf(d);
        return this;
    }

}