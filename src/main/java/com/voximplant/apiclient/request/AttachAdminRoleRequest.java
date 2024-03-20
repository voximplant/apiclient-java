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

public class AttachAdminRoleRequest implements Alignable {
    private MultiArgument<Long> requiredAdminUserId;

    @RequestField(name="required_admin_user_id")
    /**
    * The admin user ID list separated by semicolons (;). Use the 'all'
    * value to select all admin users
    */
    public MultiArgument<Long> getRequiredAdminUserId() {
        return this.requiredAdminUserId;
    }

    public boolean hasRequiredAdminUserId() {
        return this.requiredAdminUserId != null;
    }

    /**
    * The admin user ID list separated by semicolons (;). Use the 'all'
    * value to select all admin users
    */
    public AttachAdminRoleRequest setRequiredAdminUserId(MultiArgument<Long> d) {
        this.requiredAdminUserId = d;
        return this;
    }

    private MultiArgument<String> requiredAdminUserName;

    @RequestField(name="required_admin_user_name")
    /**
    * The admin user name to bind, can be used instead of
    * <b>required_admin_user_id</b>
    */
    public MultiArgument<String> getRequiredAdminUserName() {
        return this.requiredAdminUserName;
    }

    public boolean hasRequiredAdminUserName() {
        return this.requiredAdminUserName != null;
    }

    /**
    * The admin user name to bind, can be used instead of
    * <b>required_admin_user_id</b>
    */
    public AttachAdminRoleRequest setRequiredAdminUserName(MultiArgument<String> d) {
        this.requiredAdminUserName = d;
        return this;
    }

    private MultiArgument<Long> adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The role(s) ID created via <a
    * href='/docs/references/httpapi/adminroles'>Managing Admin Roles</a>
    * methods. The attached admin role ID list separated by semicolons (;).
    * Use the 'all' value to select alladmin roles
    */
    public MultiArgument<Long> getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The role(s) ID created via <a
    * href='/docs/references/httpapi/adminroles'>Managing Admin Roles</a>
    * methods. The attached admin role ID list separated by semicolons (;).
    * Use the 'all' value to select alladmin roles
    */
    public AttachAdminRoleRequest setAdminRoleId(MultiArgument<Long> d) {
        this.adminRoleId = d;
        return this;
    }

    private MultiArgument<String> adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The role(s) name(s) created via <a
    * href='/docs/references/httpapi/adminroles'>Managing Admin Roles</a>
    * methods. The admin role name to attach, can be used instead of
    * <b>admin_role_id</b>
    */
    public MultiArgument<String> getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The role(s) name(s) created via <a
    * href='/docs/references/httpapi/adminroles'>Managing Admin Roles</a>
    * methods. The admin role name to attach, can be used instead of
    * <b>admin_role_id</b>
    */
    public AttachAdminRoleRequest setAdminRoleName(MultiArgument<String> d) {
        this.adminRoleName = d;
        return this;
    }

    private String mode;

    @RequestField(name="mode")
    /**
    * The merge mode. The following values are possible: add, del, set
    */
    public String getMode() {
        return this.mode;
    }

    public boolean hasMode() {
        return this.mode != null;
    }

    /**
    * The merge mode. The following values are possible: add, del, set
    */
    public AttachAdminRoleRequest setMode(String d) {
        this.mode = d;
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
        if (requiredAdminUserId != null) {
            sb.append(aligned)
                .append("\"requiredAdminUserId\": \"")
                .append(requiredAdminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (requiredAdminUserName != null) {
            sb.append(aligned)
                .append("\"requiredAdminUserName\": \"")
                .append(requiredAdminUserName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminRoleId != null) {
            sb.append(aligned)
                .append("\"adminRoleId\": \"")
                .append(adminRoleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminRoleName != null) {
            sb.append(aligned)
                .append("\"adminRoleName\": \"")
                .append(adminRoleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mode != null) {
            sb.append(aligned)
                .append("\"mode\": \"")
                .append(mode)
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