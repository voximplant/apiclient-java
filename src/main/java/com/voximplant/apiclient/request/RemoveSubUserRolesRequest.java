package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class RemoveSubUserRolesRequest implements Alignable {
    private Long subuserId;

    @RequestField(name="subuser_id")
    /**
    * The subuser's ID
    */
    public Long getSubuserId() {
        return this.subuserId;
    }

    public boolean hasSubuserId() {
        return this.subuserId != null;
    }

    /**
    * The subuser's ID
    */
    public RemoveSubUserRolesRequest setSubuserId(long d) {
        this.subuserId = Long.valueOf(d);
        return this;
    }

    private MultiArgument<Long> roleId;

    @RequestField(name="role_id")
    /**
    * The role id list separated by semicolons (;)
    */
    public MultiArgument<Long> getRoleId() {
        return this.roleId;
    }

    public boolean hasRoleId() {
        return this.roleId != null;
    }

    /**
    * The role id list separated by semicolons (;)
    */
    public RemoveSubUserRolesRequest setRoleId(MultiArgument<Long> d) {
        this.roleId = d;
        return this;
    }

    private MultiArgument<String> roleName;

    @RequestField(name="role_name")
    /**
    * The role name list separated by semicolons (;)
    */
    public MultiArgument<String> getRoleName() {
        return this.roleName;
    }

    public boolean hasRoleName() {
        return this.roleName != null;
    }

    /**
    * The role name list separated by semicolons (;)
    */
    public RemoveSubUserRolesRequest setRoleName(MultiArgument<String> d) {
        this.roleName = d;
        return this;
    }

    private Boolean force;

    @RequestField(name="force")
    /**
    * Remove roles from all subuser keys
    */
    public Boolean getForce() {
        return this.force;
    }

    public boolean hasForce() {
        return this.force != null;
    }

    /**
    * Remove roles from all subuser keys
    */
    public RemoveSubUserRolesRequest setForce(boolean d) {
        this.force = Boolean.valueOf(d);
        return this;
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
        if (subuserId != null) {
            sb.append(aligned)
                .append("\"subuserId\": \"")
                .append(subuserId)
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
        if (roleName != null) {
            sb.append(aligned)
                .append("\"roleName\": \"")
                .append(roleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (force != null) {
            sb.append(aligned)
                .append("\"force\": \"")
                .append(force)
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