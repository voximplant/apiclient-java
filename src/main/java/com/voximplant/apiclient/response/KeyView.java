package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetKeys] function result.
*/
public class KeyView {

    private String keyId;

    /**
    * The key ID.
    */
    public String getKeyId() {
        return this.keyId;
    }

    public boolean hasKeyId() {
        return this.keyId != null;
    }

    private RoleView[] roles;

    /**
    * The key roles.
    */
    public RoleView[] getRoles() {
        return this.roles;
    }

    public boolean hasRoles() {
        return this.roles != null;
    }

    private String description;

    /**
    * The key description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    private SubUserView[] subuser;

    /**
    * The key subuser.
    */
    public SubUserView[] getSubuser() {
        return this.subuser;
    }

    public boolean hasSubuser() {
        return this.subuser != null;
    }

}