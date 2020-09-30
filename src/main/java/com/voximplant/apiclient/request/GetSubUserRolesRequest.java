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

public class GetSubUserRolesRequest {
    private Long subuserId;

    @RequestField(name="subuser_id")
    /**
    * The subuser's ID.
    */
    public long getSubuserId() {
        return this.subuserId.longValue();
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

    /**
    * The subuser's ID.
    */
    public GetSubUserRolesRequest setSubuserId(long d) {
        this.subuserId = Long.valueOf(d);
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
    public GetSubUserRolesRequest setWithExpandedRoles(boolean d) {
        this.withExpandedRoles = Boolean.valueOf(d);
        return this;
    }

}