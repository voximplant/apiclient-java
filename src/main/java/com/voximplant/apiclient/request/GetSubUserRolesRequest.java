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

public class GetSubUserRolesRequest implements Alignable {
    private Long subuserId;

    @RequestField(name="subuser_id")
    /**
    * The subuser's ID
    */
    public Long getSubuserId() {
        return this.subuserId;
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

    /**
    * The subuser's ID
    */
    public GetSubUserRolesRequest setSubuserId(long d) {
        this.subuserId = Long.valueOf(d);
        return this;
    }

    private Boolean withExpandedRoles;

    @RequestField(name="with_expanded_roles")
    /**
    * Show the roles' additional properties
    */
    public Boolean getWithExpandedRoles() {
        return this.withExpandedRoles;
    }

    public boolean hasWithExpandedRoles() {
        return this.withExpandedRoles != null;
    }

    /**
    * Show the roles' additional properties
    */
    public GetSubUserRolesRequest setWithExpandedRoles(boolean d) {
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
        if (subuserId != null) {
            sb.append(aligned)
                .append("\"subuserId\": \"")
                .append(subuserId)
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