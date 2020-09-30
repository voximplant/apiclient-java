package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetSubUsers] function result.
*/
public class SubUserView {

    private Long subuserId;

    /**
    * The subuser ID.
    */
    public long getSubuserId() {
        return this.subuserId.longValue();
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

    private String subuserName;

    /**
    * The subuser name, can be used as __subuser_login__ to <a
    * href="#how-auth-works">authenticate</a>.
    */
    public String getSubuserName() {
        return this.subuserName;
    }

    public boolean hasSubuserName() {
        return this.subuserName != null;
    }

    private String description;

    /**
    * The subuser description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    private RoleView[] roles;

    /**
    * The subuser roles.
    */
    public RoleView[] getRoles() {
        return this.roles;
    }

    public boolean hasRoles() {
        return this.roles != null;
    }

}