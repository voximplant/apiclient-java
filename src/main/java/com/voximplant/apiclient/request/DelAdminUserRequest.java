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

public class DelAdminUserRequest implements Alignable {
    private MultiArgument<Long> requiredAdminUserId;

    @RequestField(name="required_admin_user_id")
    /**
    * The admin user ID list separated by semicolons (;). Use the 'all'
    * value to select all admin users
    */
    public MultiArgument<Long> getRequiredAdminUserId() {
        return this.requiredAdminUserId;
    }

    public boolean hasRequiredAdminUserId() {
        return this.requiredAdminUserId != null;
    }

    /**
    * The admin user ID list separated by semicolons (;). Use the 'all'
    * value to select all admin users
    */
    public DelAdminUserRequest setRequiredAdminUserId(MultiArgument<Long> d) {
        this.requiredAdminUserId = d;
        return this;
    }

    private MultiArgument<String> requiredAdminUserName;

    @RequestField(name="required_admin_user_name")
    /**
    * The admin user name to delete, can be used instead of
    * <b>required_admin_user_id</b>
    */
    public MultiArgument<String> getRequiredAdminUserName() {
        return this.requiredAdminUserName;
    }

    public boolean hasRequiredAdminUserName() {
        return this.requiredAdminUserName != null;
    }

    /**
    * The admin user name to delete, can be used instead of
    * <b>required_admin_user_id</b>
    */
    public DelAdminUserRequest setRequiredAdminUserName(MultiArgument<String> d) {
        this.requiredAdminUserName = d;
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
        if (requiredAdminUserId != null) {
            sb.append(aligned)
                .append("\"requiredAdminUserId\": \"")
                .append(requiredAdminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (requiredAdminUserName != null) {
            sb.append(aligned)
                .append("\"requiredAdminUserName\": \"")
                .append(requiredAdminUserName)
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