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

public class AddAdminRoleRequest implements Alignable {
    private String adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The admin role name. The length must be less than 50
    */
    public String getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The admin role name. The length must be less than 50
    */
    public AddAdminRoleRequest setAdminRoleName(String d) {
        this.adminRoleName = d;
        return this;
    }

    private Boolean adminRoleActive;

    @RequestField(name="admin_role_active")
    /**
    * The admin role enable flag. If false the allowed and denied entries
    * have no affect
    */
    public Boolean getAdminRoleActive() {
        return this.adminRoleActive;
    }

    public boolean hasAdminRoleActive() {
        return this.adminRoleActive != null;
    }

    /**
    * The admin role enable flag. If false the allowed and denied entries
    * have no affect
    */
    public AddAdminRoleRequest setAdminRoleActive(boolean d) {
        this.adminRoleActive = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> likeAdminRoleId;

    @RequestField(name="like_admin_role_id")
    /**
    * The admin role ID list separated by semicolons (;). Use the 'all'
    * value to select all admin roles. The list specifies the roles from
    * which the new role automatically copies all permissions
    * (allowed_entries and denied_entries)
    */
    public MultiArgument<Long> getLikeAdminRoleId() {
        return this.likeAdminRoleId;
    }

    public boolean hasLikeAdminRoleId() {
        return this.likeAdminRoleId != null;
    }

    /**
    * The admin role ID list separated by semicolons (;). Use the 'all'
    * value to select all admin roles. The list specifies the roles from
    * which the new role automatically copies all permissions
    * (allowed_entries and denied_entries)
    */
    public AddAdminRoleRequest setLikeAdminRoleId(MultiArgument<Long> d) {
        this.likeAdminRoleId = d;
        return this;
    }

    private MultiArgument<String> likeAdminRoleName;

    @RequestField(name="like_admin_role_name")
    /**
    * The admin role name that can be used instead of
    * <b>like_admin_role_id</b>. The name specifies a role from which the
    * new role automatically copies all permissions (allowed_entries and
    * denied_entries)
    */
    public MultiArgument<String> getLikeAdminRoleName() {
        return this.likeAdminRoleName;
    }

    public boolean hasLikeAdminRoleName() {
        return this.likeAdminRoleName != null;
    }

    /**
    * The admin role name that can be used instead of
    * <b>like_admin_role_id</b>. The name specifies a role from which the
    * new role automatically copies all permissions (allowed_entries and
    * denied_entries)
    */
    public AddAdminRoleRequest setLikeAdminRoleName(MultiArgument<String> d) {
        this.likeAdminRoleName = d;
        return this;
    }

    private MultiArgument<String> allowedEntries;

    @RequestField(name="allowed_entries")
    /**
    * The list of allowed access entries separated by semicolons (;) (the
    * API function names)
    */
    public MultiArgument<String> getAllowedEntries() {
        return this.allowedEntries;
    }

    public boolean hasAllowedEntries() {
        return this.allowedEntries != null;
    }

    /**
    * The list of allowed access entries separated by semicolons (;) (the
    * API function names)
    */
    public AddAdminRoleRequest setAllowedEntries(MultiArgument<String> d) {
        this.allowedEntries = d;
        return this;
    }

    private MultiArgument<String> deniedEntries;

    @RequestField(name="denied_entries")
    /**
    * The list of denied access entries separated by semicolons (;) (the
    * API function names)
    */
    public MultiArgument<String> getDeniedEntries() {
        return this.deniedEntries;
    }

    public boolean hasDeniedEntries() {
        return this.deniedEntries != null;
    }

    /**
    * The list of denied access entries separated by semicolons (;) (the
    * API function names)
    */
    public AddAdminRoleRequest setDeniedEntries(MultiArgument<String> d) {
        this.deniedEntries = d;
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
        if (adminRoleName != null) {
            sb.append(aligned)
                .append("\"adminRoleName\": \"")
                .append(adminRoleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminRoleActive != null) {
            sb.append(aligned)
                .append("\"adminRoleActive\": \"")
                .append(adminRoleActive)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (likeAdminRoleId != null) {
            sb.append(aligned)
                .append("\"likeAdminRoleId\": \"")
                .append(likeAdminRoleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (likeAdminRoleName != null) {
            sb.append(aligned)
                .append("\"likeAdminRoleName\": \"")
                .append(likeAdminRoleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (allowedEntries != null) {
            sb.append(aligned)
                .append("\"allowedEntries\": \"")
                .append(allowedEntries)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (deniedEntries != null) {
            sb.append(aligned)
                .append("\"deniedEntries\": \"")
                .append(deniedEntries)
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