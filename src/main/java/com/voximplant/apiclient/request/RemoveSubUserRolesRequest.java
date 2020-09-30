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

public class RemoveSubUserRolesRequest {
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
    public RemoveSubUserRolesRequest setSubuserId(long d) {
        this.subuserId = Long.valueOf(d);
        return this;
    }

    private MultiArgument<Long> roleId;

    @RequestField(name="role_id")
    /**
    * The role id list separated by the ';' symbol.
    */
    public MultiArgument<Long> getRoleId() {
        return this.roleId;
    }

    public boolean hasRoleId() {
        return this.roleId != null;
    }

    /**
    * The role id list separated by the ';' symbol.
    */
    public RemoveSubUserRolesRequest setRoleId(MultiArgument<Long> d) {
        this.roleId = d;
        return this;
    }

    private MultiArgument<String> roleName;

    @RequestField(name="role_name")
    /**
    * The role name list separated by the ';' symbol.
    */
    public MultiArgument<String> getRoleName() {
        return this.roleName;
    }

    public boolean hasRoleName() {
        return this.roleName != null;
    }

    /**
    * The role name list separated by the ';' symbol.
    */
    public RemoveSubUserRolesRequest setRoleName(MultiArgument<String> d) {
        this.roleName = d;
        return this;
    }

    private Boolean force;

    @RequestField(name="force")
    /**
    * Remove roles from all subuser keys.
    */
    public boolean getForce() {
        return this.force.booleanValue();
    }

    public boolean hasForce() {
        return this.force != null;
    }

    /**
    * Remove roles from all subuser keys.
    */
    public RemoveSubUserRolesRequest setForce(boolean d) {
        this.force = Boolean.valueOf(d);
        return this;
    }

}