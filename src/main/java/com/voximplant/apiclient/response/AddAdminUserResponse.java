package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class AddAdminUserResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public long getResult() {
        return this.result.longValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long adminUserId;

    /**
    * The new admin user ID.
    */
    public long getAdminUserId() {
        return this.adminUserId.longValue();
    }

    public boolean hasAdminUserId() {
        return this.adminUserId != null;
    }

    private String adminUserApiKey;

    /**
    * The admin user API key.
    */
    public String getAdminUserApiKey() {
        return this.adminUserApiKey;
    }

    public boolean hasAdminUserApiKey() {
        return this.adminUserApiKey != null;
    }

}