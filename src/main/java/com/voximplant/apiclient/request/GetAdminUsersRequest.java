package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetAdminUsersRequest implements Alignable {
    private Long requiredAdminUserId;

    @RequestField(name="required_admin_user_id")
    /**
    * The admin user ID to filter.
    */
    public Long getRequiredAdminUserId() {
        return this.requiredAdminUserId;
    }

    public boolean hasRequiredAdminUserId() {
        return this.requiredAdminUserId != null;
    }

    /**
    * The admin user ID to filter.
    */
    public GetAdminUsersRequest setRequiredAdminUserId(long d) {
        this.requiredAdminUserId = Long.valueOf(d);
        return this;
    }

    private String requiredAdminUserName;

    @RequestField(name="required_admin_user_name")
    /**
    * The admin user name part to filter.
    */
    public String getRequiredAdminUserName() {
        return this.requiredAdminUserName;
    }

    public boolean hasRequiredAdminUserName() {
        return this.requiredAdminUserName != null;
    }

    /**
    * The admin user name part to filter.
    */
    public GetAdminUsersRequest setRequiredAdminUserName(String d) {
        this.requiredAdminUserName = d;
        return this;
    }

    private String adminUserDisplayName;

    @RequestField(name="admin_user_display_name")
    /**
    * The admin user display name part to filter.
    */
    public String getAdminUserDisplayName() {
        return this.adminUserDisplayName;
    }

    public boolean hasAdminUserDisplayName() {
        return this.adminUserDisplayName != null;
    }

    /**
    * The admin user display name part to filter.
    */
    public GetAdminUsersRequest setAdminUserDisplayName(String d) {
        this.adminUserDisplayName = d;
        return this;
    }

    private Boolean adminUserActive;

    @RequestField(name="admin_user_active")
    /**
    * The admin user active flag to filter.
    */
    public Boolean getAdminUserActive() {
        return this.adminUserActive;
    }

    public boolean hasAdminUserActive() {
        return this.adminUserActive != null;
    }

    /**
    * The admin user active flag to filter.
    */
    public GetAdminUsersRequest setAdminUserActive(boolean d) {
        this.adminUserActive = Boolean.valueOf(d);
        return this;
    }

    private Boolean withRoles;

    @RequestField(name="with_roles")
    /**
    * Set true to get the attached admin roles.
    */
    public Boolean getWithRoles() {
        return this.withRoles;
    }

    public boolean hasWithRoles() {
        return this.withRoles != null;
    }

    /**
    * Set true to get the attached admin roles.
    */
    public GetAdminUsersRequest setWithRoles(boolean d) {
        this.withRoles = Boolean.valueOf(d);
        return this;
    }

    private Boolean withAccessEntries;

    @RequestField(name="with_access_entries")
    /**
    * Set true to get the admin user permissions.
    */
    public Boolean getWithAccessEntries() {
        return this.withAccessEntries;
    }

    public boolean hasWithAccessEntries() {
        return this.withAccessEntries != null;
    }

    /**
    * Set true to get the admin user permissions.
    */
    public GetAdminUsersRequest setWithAccessEntries(boolean d) {
        this.withAccessEntries = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetAdminUsersRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetAdminUsersRequest setOffset(long d) {
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
        if (adminUserDisplayName != null) {
            sb.append(aligned)
                .append("\"adminUserDisplayName\": \"")
                .append(adminUserDisplayName)
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
        if (withRoles != null) {
            sb.append(aligned)
                .append("\"withRoles\": \"")
                .append(withRoles)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withAccessEntries != null) {
            sb.append(aligned)
                .append("\"withAccessEntries\": \"")
                .append(withAccessEntries)
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