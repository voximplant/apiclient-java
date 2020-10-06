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
* The role view.
*/
public class RoleView implements Alignable {

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
    public Long getRoleId() {
        return this.roleId;
    }

    public boolean hasRoleId() {
        return this.roleId != null;
    }

    private Boolean inherited;

    /**
    * Shows that the role is inherited.
    */
    public Boolean getInherited() {
        return this.inherited;
    }

    public boolean hasInherited() {
        return this.inherited != null;
    }

    private Long[] childIds;

    /**
    * Child roles IDs array.
    */
    public Long[] getChildIds() {
        return this.childIds;
    }

    public boolean hasChildIds() {
        return this.childIds != null;
    }

    private Long[] parentRoleId;

    /**
    * Parent roles IDs array.
    */
    public Long[] getParentRoleId() {
        return this.parentRoleId;
    }

    public boolean hasParentRoleId() {
        return this.parentRoleId != null;
    }

    private Boolean guiOnly;

    /**
    * Shows that the role is gui only.
    */
    public Boolean getGuiOnly() {
        return this.guiOnly;
    }

    public boolean hasGuiOnly() {
        return this.guiOnly != null;
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
        if (roleName != null) {
            sb.append(aligned)
                .append("\"roleName\": \"")
                .append(roleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (roleId != null) {
            sb.append(aligned)
                .append("\"roleId\": \"")
                .append(roleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (inherited != null) {
            sb.append(aligned)
                .append("\"inherited\": \"")
                .append(inherited)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childIds != null) {
            sb.append(aligned)
                .append("\"number\": ")
                .append(StringHelper.arrayToString(childIds, alignment + 1))
                .append(System.lineSeparator());
        }
        if (parentRoleId != null) {
            sb.append(aligned)
                .append("\"number\": ")
                .append(StringHelper.arrayToString(parentRoleId, alignment + 1))
                .append(System.lineSeparator());
        }
        if (guiOnly != null) {
            sb.append(aligned)
                .append("\"guiOnly\": \"")
                .append(guiOnly)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}