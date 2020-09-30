package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The cloned admin role info.
*/
public class ClonedAdminRoleType {

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

}