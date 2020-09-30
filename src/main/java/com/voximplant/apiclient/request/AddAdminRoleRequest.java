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

public class AddAdminRoleRequest {
    private String adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The admin role name. The length must be less than 50.
    */
    public String getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The admin role name. The length must be less than 50.
    */
    public AddAdminRoleRequest setAdminRoleName(String d) {
        this.adminRoleName = d;
        return this;
    }

    private Boolean adminRoleActive;

    @RequestField(name="admin_role_active")
    /**
    * The admin role enable flag. If false the allowed and denied entries
    * have no affect.
    */
    public boolean getAdminRoleActive() {
        return this.adminRoleActive.booleanValue();
    }

    public boolean hasAdminRoleActive() {
        return this.adminRoleActive != null;
    }

    /**
    * The admin role enable flag. If false the allowed and denied entries
    * have no affect.
    */
    public AddAdminRoleRequest setAdminRoleActive(boolean d) {
        this.adminRoleActive = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> likeAdminRoleId;

    @RequestField(name="like_admin_role_id")
    /**
    * The admin role ID list separated by the ';' symbol or the 'all'
    * value. The list specifies the roles from which the new role
    * automatically copies all permissions (allowed_entries and
    * denied_entries).
    */
    public MultiArgument<Long> getLikeAdminRoleId() {
        return this.likeAdminRoleId;
    }

    public boolean hasLikeAdminRoleId() {
        return this.likeAdminRoleId != null;
    }

    /**
    * The admin role ID list separated by the ';' symbol or the 'all'
    * value. The list specifies the roles from which the new role
    * automatically copies all permissions (allowed_entries and
    * denied_entries).
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
    * denied_entries).
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
    * denied_entries).
    */
    public AddAdminRoleRequest setLikeAdminRoleName(MultiArgument<String> d) {
        this.likeAdminRoleName = d;
        return this;
    }

    private MultiArgument<String> allowedEntries;

    @RequestField(name="allowed_entries")
    /**
    * The list of allowed access entries separated by the ';' symbol (the
    * API function names).
    */
    public MultiArgument<String> getAllowedEntries() {
        return this.allowedEntries;
    }

    public boolean hasAllowedEntries() {
        return this.allowedEntries != null;
    }

    /**
    * The list of allowed access entries separated by the ';' symbol (the
    * API function names).
    */
    public AddAdminRoleRequest setAllowedEntries(MultiArgument<String> d) {
        this.allowedEntries = d;
        return this;
    }

    private MultiArgument<String> deniedEntries;

    @RequestField(name="denied_entries")
    /**
    * The list of denied access entries separated by the ';' symbol (the
    * API function names).
    */
    public MultiArgument<String> getDeniedEntries() {
        return this.deniedEntries;
    }

    public boolean hasDeniedEntries() {
        return this.deniedEntries != null;
    }

    /**
    * The list of denied access entries separated by the ';' symbol (the
    * API function names).
    */
    public AddAdminRoleRequest setDeniedEntries(MultiArgument<String> d) {
        this.deniedEntries = d;
        return this;
    }

}