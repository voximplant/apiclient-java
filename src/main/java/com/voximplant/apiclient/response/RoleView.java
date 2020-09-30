package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The role view.
*/
public class RoleView {

    private String roleName;

    /**
    * The role name.
    */
    public String getRoleName() {
        return this.roleName;
    }

    public boolean hasRoleName() {
        return this.roleName != null;
    }

    private Long roleId;

    /**
    * The role ID.
    */
    public long getRoleId() {
        return this.roleId.longValue();
    }

    public boolean hasRoleId() {
        return this.roleId != null;
    }

    private Boolean inherited;

    /**
    * Shows that the role is inherited.
    */
    public boolean getInherited() {
        return this.inherited.booleanValue();
    }

    public boolean hasInherited() {
        return this.inherited != null;
    }

    private long[] childIds;

    /**
    * Child roles IDs array.
    */
    public long[] getChildIds() {
        return this.childIds;
    }

    public boolean hasChildIds() {
        return this.childIds != null;
    }

    private long[] parentRoleId;

    /**
    * Parent roles IDs array.
    */
    public long[] getParentRoleId() {
        return this.parentRoleId;
    }

    public boolean hasParentRoleId() {
        return this.parentRoleId != null;
    }

    private Boolean guiOnly;

    /**
    * Shows that the role is gui only.
    */
    public boolean getGuiOnly() {
        return this.guiOnly.booleanValue();
    }

    public boolean hasGuiOnly() {
        return this.guiOnly != null;
    }

}