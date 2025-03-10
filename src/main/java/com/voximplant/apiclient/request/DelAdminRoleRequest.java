package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class DelAdminRoleRequest implements Alignable {
    private MultiArgument<Long> adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The admin role ID list separated by semicolons (;). Use the 'all'
    * value to select all admin roles
    */
    public MultiArgument<Long> getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The admin role ID list separated by semicolons (;). Use the 'all'
    * value to select all admin roles
    */
    public DelAdminRoleRequest setAdminRoleId(MultiArgument<Long> d) {
        this.adminRoleId = d;
        return this;
    }

    private MultiArgument<String> adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The admin role name to delete, can be used instead of
    * <b>admin_role_id</b>
    */
    public MultiArgument<String> getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The admin role name to delete, can be used instead of
    * <b>admin_role_id</b>
    */
    public DelAdminRoleRequest setAdminRoleName(MultiArgument<String> d) {
        this.adminRoleName = d;
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
        if (adminRoleId != null) {
            sb.append(aligned)
                .append("\"adminRoleId\": \"")
                .append(adminRoleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminRoleName != null) {
            sb.append(aligned)
                .append("\"adminRoleName\": \"")
                .append(adminRoleName)
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