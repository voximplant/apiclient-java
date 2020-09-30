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

public class DelAdminRoleRequest {
    private MultiArgument<Long> adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The admin role ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The admin role ID list separated by the ';' symbol or the 'all' value.
    */
    public DelAdminRoleRequest setAdminRoleId(MultiArgument<Long> d) {
        this.adminRoleId = d;
        return this;
    }

    private MultiArgument<String> adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The admin role name to delete, can be used instead of
    * <b>admin_role_id</b>.
    */
    public MultiArgument<String> getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The admin role name to delete, can be used instead of
    * <b>admin_role_id</b>.
    */
    public DelAdminRoleRequest setAdminRoleName(MultiArgument<String> d) {
        this.adminRoleName = d;
        return this;
    }

}