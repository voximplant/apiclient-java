package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
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

public class GetKeyRolesRequest implements Alignable {
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
    public GetKeyRolesRequest setKeyId(String d) {
        this.keyId = d;
        return this;
    }

    private Boolean withExpandedRoles;

    @RequestField(name="with_expanded_roles")
    /**
    * Whether to show the roles' additional properties
    */
    public Boolean getWithExpandedRoles() {
        return this.withExpandedRoles;
    }

    public boolean hasWithExpandedRoles() {
        return this.withExpandedRoles != null;
    }

    /**
    * Whether to show the roles' additional properties
    */
    public GetKeyRolesRequest setWithExpandedRoles(boolean d) {
        this.withExpandedRoles = Boolean.valueOf(d);
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
        if (withExpandedRoles != null) {
            sb.append(aligned)
                .append("\"withExpandedRoles\": \"")
                .append(withExpandedRoles)
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