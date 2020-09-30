package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAdminUsers] function result.
*/
public class AdminUserType {

    private Long adminUserId;

    /**
    * The admin user ID.
    */
    public long getAdminUserId() {
        return this.adminUserId.longValue();
    }

    public boolean hasAdminUserId() {
        return this.adminUserId != null;
    }

    private String adminUserName;

    /**
    * The admin user name.
    */
    public String getAdminUserName() {
        return this.adminUserName;
    }

    public boolean hasAdminUserName() {
        return this.adminUserName != null;
    }

    private String adminUserDisplayName;

    /**
    * The admin user display name.
    */
    public String getAdminUserDisplayName() {
        return this.adminUserDisplayName;
    }

    public boolean hasAdminUserDisplayName() {
        return this.adminUserDisplayName != null;
    }

    private Boolean adminUserActive;

    /**
    * Is allowed to logon?
    */
    public boolean getAdminUserActive() {
        return this.adminUserActive.booleanValue();
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
    * The allowed access entries (the API function names).
    */
    public String[] getAccessEntries() {
        return this.accessEntries;
    }

    public boolean hasAccessEntries() {
        return this.accessEntries != null;
    }

    private AdminRoleType[] adminRoles;

    /**
    * The attached admin roles.
    */
    public AdminRoleType[] getAdminRoles() {
        return this.adminRoles;
    }

    public boolean hasAdminRoles() {
        return this.adminRoles != null;
    }

}