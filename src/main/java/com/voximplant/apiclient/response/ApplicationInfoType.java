package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetApplications] function result.
*/
public class ApplicationInfoType {

    private Long applicationId;

    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private String applicationName;

    /**
    * The full application name.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The application editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

    private Boolean secureRecordStorage;

    /**
    * This flag indicates whether a secure storage for logs and records is
    * enabled or not.
    */
    public boolean getSecureRecordStorage() {
        return this.secureRecordStorage.booleanValue();
    }

    public boolean hasSecureRecordStorage() {
        return this.secureRecordStorage != null;
    }

    private UserInfoType[] users;

    /**
    * The filtered users. (Note: a user object contains the 'user_id' field
    * only)
    */
    public UserInfoType[] getUsers() {
        return this.users;
    }

    public boolean hasUsers() {
        return this.users != null;
    }

}