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

public class AddAdminUserRequest implements Alignable {
    private String newAdminUserName;

    @RequestField(name="new_admin_user_name")
    /**
    * The admin user name. The length must be less than 50
    */
    public String getNewAdminUserName() {
        return this.newAdminUserName;
    }

    public boolean hasNewAdminUserName() {
        return this.newAdminUserName != null;
    }

    /**
    * The admin user name. The length must be less than 50
    */
    public AddAdminUserRequest setNewAdminUserName(String d) {
        this.newAdminUserName = d;
        return this;
    }

    private String adminUserDisplayName;

    @RequestField(name="admin_user_display_name")
    /**
    * The admin user display name. The length must be less than 256
    */
    public String getAdminUserDisplayName() {
        return this.adminUserDisplayName;
    }

    public boolean hasAdminUserDisplayName() {
        return this.adminUserDisplayName != null;
    }

    /**
    * The admin user display name. The length must be less than 256
    */
    public AddAdminUserRequest setAdminUserDisplayName(String d) {
        this.adminUserDisplayName = d;
        return this;
    }

    private String newAdminUserPassword;

    @RequestField(name="new_admin_user_password")
    /**
    * The admin user password. The length must be at least 6 symbols
    */
    public String getNewAdminUserPassword() {
        return this.newAdminUserPassword;
    }

    public boolean hasNewAdminUserPassword() {
        return this.newAdminUserPassword != null;
    }

    /**
    * The admin user password. The length must be at least 6 symbols
    */
    public AddAdminUserRequest setNewAdminUserPassword(String d) {
        this.newAdminUserPassword = d;
        return this;
    }

    private Boolean adminUserActive;

    @RequestField(name="admin_user_active")
    /**
    * The admin user enable flag
    */
    public Boolean getAdminUserActive() {
        return this.adminUserActive;
    }

    public boolean hasAdminUserActive() {
        return this.adminUserActive != null;
    }

    /**
    * The admin user enable flag
    */
    public AddAdminUserRequest setAdminUserActive(boolean d) {
        this.adminUserActive = Boolean.valueOf(d);
        return this;
    }

    private String adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The role(s) ID created via <a
    * href='/docs/references/httpapi/adminroles'>Managing Admin Roles</a>
    * methods. The attaching admin role ID list separated by semicolons
    * (;). Use the 'all' value to select all admin roles
    */
    public String getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The role(s) ID created via <a
    * href='/docs/references/httpapi/adminroles'>Managing Admin Roles</a>
    * methods. The attaching admin role ID list separated by semicolons
    * (;). Use the 'all' value to select all admin roles
    */
    public AddAdminUserRequest setAdminRoleId(String d) {
        this.adminRoleId = d;
        return this;
    }

    private MultiArgument<String> adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The role(s) name(s) created via <a
    * href='/docs/references/httpapi/adminroles'>Managing Admin Roles</a>
    * methods. The attaching admin role name that can be used instead of
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
    * methods. The attaching admin role name that can be used instead of
    * <b>admin_role_id</b>
    */
    public AddAdminUserRequest setAdminRoleName(MultiArgument<String> d) {
        this.adminRoleName = d;
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
        if (newAdminUserName != null) {
            sb.append(aligned)
                .append("\"newAdminUserName\": \"")
                .append(newAdminUserName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminUserDisplayName != null) {
            sb.append(aligned)
                .append("\"adminUserDisplayName\": \"")
                .append(adminUserDisplayName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newAdminUserPassword != null) {
            sb.append(aligned)
                .append("\"newAdminUserPassword\": \"")
                .append(newAdminUserPassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminUserActive != null) {
            sb.append(aligned)
                .append("\"adminUserActive\": \"")
                .append(adminUserActive)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}