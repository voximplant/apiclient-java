package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetAdminUsers] function result.
*/
public class AdminUserType implements Alignable {

    private Long adminUserId;

    /**
    * The admin user ID
    */
    public Long getAdminUserId() {
        return this.adminUserId;
    }

    public boolean hasAdminUserId() {
        return this.adminUserId != null;
    }

    private String adminUserName;

    /**
    * The admin user name
    */
    public String getAdminUserName() {
        return this.adminUserName;
    }

    public boolean hasAdminUserName() {
        return this.adminUserName != null;
    }

    private String adminUserDisplayName;

    /**
    * The admin user display name
    */
    public String getAdminUserDisplayName() {
        return this.adminUserDisplayName;
    }

    public boolean hasAdminUserDisplayName() {
        return this.adminUserDisplayName != null;
    }

    private Boolean adminUserActive;

    /**
    * Whether login is allowed
    */
    public Boolean getAdminUserActive() {
        return this.adminUserActive;
    }

    public boolean hasAdminUserActive() {
        return this.adminUserActive != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The admin user editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

    private String[] accessEntries;

    /**
    * The allowed access entries (the API function names)
    */
    public String[] getAccessEntries() {
        return this.accessEntries;
    }

    public boolean hasAccessEntries() {
        return this.accessEntries != null;
    }

    private AdminRoleType[] adminRoles;

    /**
    * The attached admin roles
    */
    public AdminRoleType[] getAdminRoles() {
        return this.adminRoles;
    }

    public boolean hasAdminRoles() {
        return this.adminRoles != null;
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
        if (adminUserId != null) {
            sb.append(aligned)
                .append("\"adminUserId\": \"")
                .append(adminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminUserName != null) {
            sb.append(aligned)
                .append("\"adminUserName\": \"")
                .append(adminUserName)
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
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accessEntries != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(accessEntries, alignment + 1))
                .append(System.lineSeparator());
        }
        if (adminRoles != null) {
            sb.append(aligned)
                .append("\"AdminRoleType\": ")
                .append(StringHelper.arrayToString(adminRoles, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}