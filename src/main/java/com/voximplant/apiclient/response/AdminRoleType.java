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
* The [GetAdminRoles] function result.
*/
public class AdminRoleType implements Alignable {

    private Long adminRoleId;

    /**
    * The admin role ID.
    */
    public Long getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    private String adminRoleName;

    /**
    * The admin role name.
    */
    public String getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    private Boolean adminRoleActive;

    /**
    * If false the allowed and denied entries have no affect.
    */
    public Boolean getAdminRoleActive() {
        return this.adminRoleActive;
    }

    public boolean hasAdminRoleActive() {
        return this.adminRoleActive != null;
    }

    private Boolean systemRole;

    /**
    * Is a system role?
    */
    public Boolean getSystemRole() {
        return this.systemRole;
    }

    public boolean hasSystemRole() {
        return this.systemRole != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The admin role editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

    private String[] allowedEntries;

    /**
    * The allowed access entries (the API function names).
    */
    public String[] getAllowedEntries() {
        return this.allowedEntries;
    }

    public boolean hasAllowedEntries() {
        return this.allowedEntries != null;
    }

    private String[] deniedEntries;

    /**
    * The denied access entries (the API function names).
    */
    public String[] getDeniedEntries() {
        return this.deniedEntries;
    }

    public boolean hasDeniedEntries() {
        return this.deniedEntries != null;
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
        if (systemRole != null) {
            sb.append(aligned)
                .append("\"systemRole\": \"")
                .append(systemRole)
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
        if (allowedEntries != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(allowedEntries, alignment + 1))
                .append(System.lineSeparator());
        }
        if (deniedEntries != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(deniedEntries, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}