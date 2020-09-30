package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The cloned admin user info.
*/
public class ClonedAdminUserType {

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

    private String adminUserApiKey;

    /**
    * The API key of the admin user.
    */
    public String getAdminUserApiKey() {
        return this.adminUserApiKey;
    }

    public boolean hasAdminUserApiKey() {
        return this.adminUserApiKey != null;
    }

}