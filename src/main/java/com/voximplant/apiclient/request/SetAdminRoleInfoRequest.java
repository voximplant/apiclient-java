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

public class SetAdminRoleInfoRequest {
    private Long adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The admin role to edit.
    */
    public long getAdminRoleId() {
        return this.adminRoleId.longValue();
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The admin role to edit.
    */
    public SetAdminRoleInfoRequest setAdminRoleId(long d) {
        this.adminRoleId = Long.valueOf(d);
        return this;
    }

    private String adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The admin role to edit, can be used instead of <b>admin_role_id</b>.
    */
    public String getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The admin role to edit, can be used instead of <b>admin_role_id</b>.
    */
    public SetAdminRoleInfoRequest setAdminRoleName(String d) {
        this.adminRoleName = d;
        return this;
    }

    private String newAdminRoleName;

    @RequestField(name="new_admin_role_name")
    /**
    * The new admin role name. The length must be less than 50.
    */
    public String getNewAdminRoleName() {
        return this.newAdminRoleName;
    }

    public boolean hasNewAdminRoleName() {
        return this.newAdminRoleName != null;
    }

    /**
    * The new admin role name. The length must be less than 50.
    */
    public SetAdminRoleInfoRequest setNewAdminRoleName(String d) {
        this.newAdminRoleName = d;
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
    public SetAdminRoleInfoRequest setAdminRoleActive(boolean d) {
        this.adminRoleActive = Boolean.valueOf(d);
        return this;
    }

    private String entryModificationMode;

    @RequestField(name="entry_modification_mode")
    /**
    * The modification mode of the permission lists (allowed_entries and
    * denied_entries). The following values are possible: add, del, set.
    */
    public String getEntryModificationMode() {
        return this.entryModificationMode;
    }

    public boolean hasEntryModificationMode() {
        return this.entryModificationMode != null;
    }

    /**
    * The modification mode of the permission lists (allowed_entries and
    * denied_entries). The following values are possible: add, del, set.
    */
    public SetAdminRoleInfoRequest setEntryModificationMode(String d) {
        this.entryModificationMode = d;
        return this;
    }

    private MultiArgument<String> allowedEntries;

    @RequestField(name="allowed_entries")
    /**
    * The list of allowed access entry changes separated by the ';' symbol
    * (the API function names).
    */
    public MultiArgument<String> getAllowedEntries() {
        return this.allowedEntries;
    }

    public boolean hasAllowedEntries() {
        return this.allowedEntries != null;
    }

    /**
    * The list of allowed access entry changes separated by the ';' symbol
    * (the API function names).
    */
    public SetAdminRoleInfoRequest setAllowedEntries(MultiArgument<String> d) {
        this.allowedEntries = d;
        return this;
    }

    private MultiArgument<String> deniedEntries;

    @RequestField(name="denied_entries")
    /**
    * The list of denied access entry changes separated by the ';' symbol
    * (the API function names).
    */
    public MultiArgument<String> getDeniedEntries() {
        return this.deniedEntries;
    }

    public boolean hasDeniedEntries() {
        return this.deniedEntries != null;
    }

    /**
    * The list of denied access entry changes separated by the ';' symbol
    * (the API function names).
    */
    public SetAdminRoleInfoRequest setDeniedEntries(MultiArgument<String> d) {
        this.deniedEntries = d;
        return this;
    }

    private MultiArgument<Long> likeAdminRoleId;

    @RequestField(name="like_admin_role_id")
    /**
    * The admin role ID list separated by the ';' symbol or the 'all'
    * value. The list specifies the roles from which the allowed_entries
    * and denied_entries will be merged.
    */
    public MultiArgument<Long> getLikeAdminRoleId() {
        return this.likeAdminRoleId;
    }

    public boolean hasLikeAdminRoleId() {
        return this.likeAdminRoleId != null;
    }

    /**
    * The admin role ID list separated by the ';' symbol or the 'all'
    * value. The list specifies the roles from which the allowed_entries
    * and denied_entries will be merged.
    */
    public SetAdminRoleInfoRequest setLikeAdminRoleId(MultiArgument<Long> d) {
        this.likeAdminRoleId = d;
        return this;
    }

    private MultiArgument<String> likeAdminRoleName;

    @RequestField(name="like_admin_role_name")
    /**
    * The admin role name, can be used instead of
    * <b>like_admin_role_id</b>. The name specifies a role from which the
    * allowed_entries and denied_entries will be merged.
    */
    public MultiArgument<String> getLikeAdminRoleName() {
        return this.likeAdminRoleName;
    }

    public boolean hasLikeAdminRoleName() {
        return this.likeAdminRoleName != null;
    }

    /**
    * The admin role name, can be used instead of
    * <b>like_admin_role_id</b>. The name specifies a role from which the
    * allowed_entries and denied_entries will be merged.
    */
    public SetAdminRoleInfoRequest setLikeAdminRoleName(MultiArgument<String> d) {
        this.likeAdminRoleName = d;
        return this;
    }

}