package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAdminRoles] function result.
*/
public class AdminRoleType {

    private Long adminRoleId;

    /**
    * The admin role ID.
    */
    public long getAdminRoleId() {
        return this.adminRoleId.longValue();
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
    public boolean getAdminRoleActive() {
        return this.adminRoleActive.booleanValue();
    }

    public boolean hasAdminRoleActive() {
        return this.adminRoleActive != null;
    }

    private Boolean systemRole;

    /**
    * Is a system role?
    */
    public boolean getSystemRole() {
        return this.systemRole.booleanValue();
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

}