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

public class GetAdminRolesRequest implements Alignable {
    private Long adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The admin role ID to filter
    */
    public Long getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The admin role ID to filter
    */
    public GetAdminRolesRequest setAdminRoleId(long d) {
        this.adminRoleId = Long.valueOf(d);
        return this;
    }

    private String adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The admin role name part to filter
    */
    public String getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The admin role name part to filter
    */
    public GetAdminRolesRequest setAdminRoleName(String d) {
        this.adminRoleName = d;
        return this;
    }

    private Boolean adminRoleActive;

    @RequestField(name="admin_role_active")
    /**
    * Whether the admin role is enabled to filter
    */
    public Boolean getAdminRoleActive() {
        return this.adminRoleActive;
    }

    public boolean hasAdminRoleActive() {
        return this.adminRoleActive != null;
    }

    /**
    * Whether the admin role is enabled to filter
    */
    public GetAdminRolesRequest setAdminRoleActive(boolean d) {
        this.adminRoleActive = Boolean.valueOf(d);
        return this;
    }

    private Boolean withEntries;

    @RequestField(name="with_entries")
    /**
    * Whether to get the permissions
    */
    public Boolean getWithEntries() {
        return this.withEntries;
    }

    public boolean hasWithEntries() {
        return this.withEntries != null;
    }

    /**
    * Whether to get the permissions
    */
    public GetAdminRolesRequest setWithEntries(boolean d) {
        this.withEntries = Boolean.valueOf(d);
        return this;
    }

    private Boolean withAccountRoles;

    @RequestField(name="with_account_roles")
    /**
    * Whether to include the account roles
    */
    public Boolean getWithAccountRoles() {
        return this.withAccountRoles;
    }

    public boolean hasWithAccountRoles() {
        return this.withAccountRoles != null;
    }

    /**
    * Whether to include the account roles
    */
    public GetAdminRolesRequest setWithAccountRoles(boolean d) {
        this.withAccountRoles = Boolean.valueOf(d);
        return this;
    }

    private Boolean withParentRoles;

    @RequestField(name="with_parent_roles")
    /**
    * Whether to include the parent roles
    */
    public Boolean getWithParentRoles() {
        return this.withParentRoles;
    }

    public boolean hasWithParentRoles() {
        return this.withParentRoles != null;
    }

    /**
    * Whether to include the parent roles
    */
    public GetAdminRolesRequest setWithParentRoles(boolean d) {
        this.withParentRoles = Boolean.valueOf(d);
        return this;
    }

    private Boolean withSystemRoles;

    @RequestField(name="with_system_roles")
    /**
    * Whether to include the system roles
    */
    public Boolean getWithSystemRoles() {
        return this.withSystemRoles;
    }

    public boolean hasWithSystemRoles() {
        return this.withSystemRoles != null;
    }

    /**
    * Whether to include the system roles
    */
    public GetAdminRolesRequest setWithSystemRoles(boolean d) {
        this.withSystemRoles = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> includedAdminUserId;

    @RequestField(name="included_admin_user_id")
    /**
    * The attached admin user ID list separated by semicolons (;). Use the
    * 'all' value to select all admin users
    */
    public MultiArgument<Long> getIncludedAdminUserId() {
        return this.includedAdminUserId;
    }

    public boolean hasIncludedAdminUserId() {
        return this.includedAdminUserId != null;
    }

    /**
    * The attached admin user ID list separated by semicolons (;). Use the
    * 'all' value to select all admin users
    */
    public GetAdminRolesRequest setIncludedAdminUserId(MultiArgument<Long> d) {
        this.includedAdminUserId = d;
        return this;
    }

    private MultiArgument<Long> excludedAdminUserId;

    @RequestField(name="excluded_admin_user_id")
    /**
    * Not attached admin user ID list separated by semicolons (;). Use the
    * 'all' value to select all admin users
    */
    public MultiArgument<Long> getExcludedAdminUserId() {
        return this.excludedAdminUserId;
    }

    public boolean hasExcludedAdminUserId() {
        return this.excludedAdminUserId != null;
    }

    /**
    * Not attached admin user ID list separated by semicolons (;). Use the
    * 'all' value to select all admin users
    */
    public GetAdminRolesRequest setExcludedAdminUserId(MultiArgument<Long> d) {
        this.excludedAdminUserId = d;
        return this;
    }

    private String fullAdminUsersMatching;

    @RequestField(name="full_admin_users_matching")
    /**
    * Set false to get roles with partial admin user list matching
    */
    public String getFullAdminUsersMatching() {
        return this.fullAdminUsersMatching;
    }

    public boolean hasFullAdminUsersMatching() {
        return this.fullAdminUsersMatching != null;
    }

    /**
    * Set false to get roles with partial admin user list matching
    */
    public GetAdminRolesRequest setFullAdminUsersMatching(String d) {
        this.fullAdminUsersMatching = d;
        return this;
    }

    private Long showingAdminUserId;

    @RequestField(name="showing_admin_user_id")
    /**
    * The admin user to show in the 'admin_users' field output
    */
    public Long getShowingAdminUserId() {
        return this.showingAdminUserId;
    }

    public boolean hasShowingAdminUserId() {
        return this.showingAdminUserId != null;
    }

    /**
    * The admin user to show in the 'admin_users' field output
    */
    public GetAdminRolesRequest setShowingAdminUserId(long d) {
        this.showingAdminUserId = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetAdminRolesRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetAdminRolesRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
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
        if (adminRoleActive != null) {
            sb.append(aligned)
                .append("\"adminRoleActive\": \"")
                .append(adminRoleActive)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withEntries != null) {
            sb.append(aligned)
                .append("\"withEntries\": \"")
                .append(withEntries)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withAccountRoles != null) {
            sb.append(aligned)
                .append("\"withAccountRoles\": \"")
                .append(withAccountRoles)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withParentRoles != null) {
            sb.append(aligned)
                .append("\"withParentRoles\": \"")
                .append(withParentRoles)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withSystemRoles != null) {
            sb.append(aligned)
                .append("\"withSystemRoles\": \"")
                .append(withSystemRoles)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (includedAdminUserId != null) {
            sb.append(aligned)
                .append("\"includedAdminUserId\": \"")
                .append(includedAdminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (excludedAdminUserId != null) {
            sb.append(aligned)
                .append("\"excludedAdminUserId\": \"")
                .append(excludedAdminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fullAdminUsersMatching != null) {
            sb.append(aligned)
                .append("\"fullAdminUsersMatching\": \"")
                .append(fullAdminUsersMatching)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (showingAdminUserId != null) {
            sb.append(aligned)
                .append("\"showingAdminUserId\": \"")
                .append(showingAdminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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