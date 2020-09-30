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

public class GetAdminRolesRequest {
    private Long adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The admin role ID to filter.
    */
    public long getAdminRoleId() {
        return this.adminRoleId.longValue();
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The admin role ID to filter.
    */
    public GetAdminRolesRequest setAdminRoleId(long d) {
        this.adminRoleId = Long.valueOf(d);
        return this;
    }

    private String adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The admin role name part to filter.
    */
    public String getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The admin role name part to filter.
    */
    public GetAdminRolesRequest setAdminRoleName(String d) {
        this.adminRoleName = d;
        return this;
    }

    private Boolean adminRoleActive;

    @RequestField(name="admin_role_active")
    /**
    * The admin role active flag to filter.
    */
    public boolean getAdminRoleActive() {
        return this.adminRoleActive.booleanValue();
    }

    public boolean hasAdminRoleActive() {
        return this.adminRoleActive != null;
    }

    /**
    * The admin role active flag to filter.
    */
    public GetAdminRolesRequest setAdminRoleActive(boolean d) {
        this.adminRoleActive = Boolean.valueOf(d);
        return this;
    }

    private Boolean withEntries;

    @RequestField(name="with_entries")
    /**
    * Set true to get the permissions.
    */
    public boolean getWithEntries() {
        return this.withEntries.booleanValue();
    }

    public boolean hasWithEntries() {
        return this.withEntries != null;
    }

    /**
    * Set true to get the permissions.
    */
    public GetAdminRolesRequest setWithEntries(boolean d) {
        this.withEntries = Boolean.valueOf(d);
        return this;
    }

    private Boolean withAccountRoles;

    @RequestField(name="with_account_roles")
    /**
    * Set false to omit the account roles.
    */
    public boolean getWithAccountRoles() {
        return this.withAccountRoles.booleanValue();
    }

    public boolean hasWithAccountRoles() {
        return this.withAccountRoles != null;
    }

    /**
    * Set false to omit the account roles.
    */
    public GetAdminRolesRequest setWithAccountRoles(boolean d) {
        this.withAccountRoles = Boolean.valueOf(d);
        return this;
    }

    private Boolean withParentRoles;

    @RequestField(name="with_parent_roles")
    /**
    * Set false to omit the parent roles.
    */
    public boolean getWithParentRoles() {
        return this.withParentRoles.booleanValue();
    }

    public boolean hasWithParentRoles() {
        return this.withParentRoles != null;
    }

    /**
    * Set false to omit the parent roles.
    */
    public GetAdminRolesRequest setWithParentRoles(boolean d) {
        this.withParentRoles = Boolean.valueOf(d);
        return this;
    }

    private Boolean withSystemRoles;

    @RequestField(name="with_system_roles")
    /**
    * Set false to omit the system roles.
    */
    public boolean getWithSystemRoles() {
        return this.withSystemRoles.booleanValue();
    }

    public boolean hasWithSystemRoles() {
        return this.withSystemRoles != null;
    }

    /**
    * Set false to omit the system roles.
    */
    public GetAdminRolesRequest setWithSystemRoles(boolean d) {
        this.withSystemRoles = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> includedAdminUserId;

    @RequestField(name="included_admin_user_id")
    /**
    * The attached admin user ID list separated by the ';' symbol or the
    * 'all' value.
    */
    public MultiArgument<Long> getIncludedAdminUserId() {
        return this.includedAdminUserId;
    }

    public boolean hasIncludedAdminUserId() {
        return this.includedAdminUserId != null;
    }

    /**
    * The attached admin user ID list separated by the ';' symbol or the
    * 'all' value.
    */
    public GetAdminRolesRequest setIncludedAdminUserId(MultiArgument<Long> d) {
        this.includedAdminUserId = d;
        return this;
    }

    private MultiArgument<Long> excludedAdminUserId;

    @RequestField(name="excluded_admin_user_id")
    /**
    * The not attached admin user ID list separated by the ';' symbol or
    * the 'all' value.
    */
    public MultiArgument<Long> getExcludedAdminUserId() {
        return this.excludedAdminUserId;
    }

    public boolean hasExcludedAdminUserId() {
        return this.excludedAdminUserId != null;
    }

    /**
    * The not attached admin user ID list separated by the ';' symbol or
    * the 'all' value.
    */
    public GetAdminRolesRequest setExcludedAdminUserId(MultiArgument<Long> d) {
        this.excludedAdminUserId = d;
        return this;
    }

    private String fullAdminUsersMatching;

    @RequestField(name="full_admin_users_matching")
    /**
    * Set false to get roles with partial admin user list matching.
    */
    public String getFullAdminUsersMatching() {
        return this.fullAdminUsersMatching;
    }

    public boolean hasFullAdminUsersMatching() {
        return this.fullAdminUsersMatching != null;
    }

    /**
    * Set false to get roles with partial admin user list matching.
    */
    public GetAdminRolesRequest setFullAdminUsersMatching(String d) {
        this.fullAdminUsersMatching = d;
        return this;
    }

    private Long showingAdminUserId;

    @RequestField(name="showing_admin_user_id")
    /**
    * The admin user to show in the 'admin_users' field output.
    */
    public long getShowingAdminUserId() {
        return this.showingAdminUserId.longValue();
    }

    public boolean hasShowingAdminUserId() {
        return this.showingAdminUserId != null;
    }

    /**
    * The admin user to show in the 'admin_users' field output.
    */
    public GetAdminRolesRequest setShowingAdminUserId(long d) {
        this.showingAdminUserId = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetAdminRolesRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetAdminRolesRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}