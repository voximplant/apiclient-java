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

public class SetAdminUserInfoRequest implements Alignable {
    private Long requiredAdminUserId;

    @RequestField(name="required_admin_user_id")
    /**
    * The admin user to edit
    */
    public Long getRequiredAdminUserId() {
        return this.requiredAdminUserId;
    }

    public boolean hasRequiredAdminUserId() {
        return this.requiredAdminUserId != null;
    }

    /**
    * The admin user to edit
    */
    public SetAdminUserInfoRequest setRequiredAdminUserId(long d) {
        this.requiredAdminUserId = Long.valueOf(d);
        return this;
    }

    private String requiredAdminUserName;

    @RequestField(name="required_admin_user_name")
    /**
    * The admin user to edit, can be used instead of
    * <b>required_admin_user_id</b>
    */
    public String getRequiredAdminUserName() {
        return this.requiredAdminUserName;
    }

    public boolean hasRequiredAdminUserName() {
        return this.requiredAdminUserName != null;
    }

    /**
    * The admin user to edit, can be used instead of
    * <b>required_admin_user_id</b>
    */
    public SetAdminUserInfoRequest setRequiredAdminUserName(String d) {
        this.requiredAdminUserName = d;
        return this;
    }

    private String newAdminUserName;

    @RequestField(name="new_admin_user_name")
    /**
    * The new admin user name. The length must be less than 50
    */
    public String getNewAdminUserName() {
        return this.newAdminUserName;
    }

    public boolean hasNewAdminUserName() {
        return this.newAdminUserName != null;
    }

    /**
    * The new admin user name. The length must be less than 50
    */
    public SetAdminUserInfoRequest setNewAdminUserName(String d) {
        this.newAdminUserName = d;
        return this;
    }

    private String adminUserDisplayName;

    @RequestField(name="admin_user_display_name")
    /**
    * The new admin user display name. The length must be less than 256
    */
    public String getAdminUserDisplayName() {
        return this.adminUserDisplayName;
    }

    public boolean hasAdminUserDisplayName() {
        return this.adminUserDisplayName != null;
    }

    /**
    * The new admin user display name. The length must be less than 256
    */
    public SetAdminUserInfoRequest setAdminUserDisplayName(String d) {
        this.adminUserDisplayName = d;
        return this;
    }

    private String newAdminUserPassword;

    @RequestField(name="new_admin_user_password")
    /**
    * The new admin user password. The length must be at least 6 symbols
    */
    public String getNewAdminUserPassword() {
        return this.newAdminUserPassword;
    }

    public boolean hasNewAdminUserPassword() {
        return this.newAdminUserPassword != null;
    }

    /**
    * The new admin user password. The length must be at least 6 symbols
    */
    public SetAdminUserInfoRequest setNewAdminUserPassword(String d) {
        this.newAdminUserPassword = d;
        return this;
    }

    private Boolean adminUserActive;

    @RequestField(name="admin_user_active")
    /**
    * The admin user enable flag
    */
    public Boolean getAdminUserActive() {
        return this.adminUserActive;
    }

    public boolean hasAdminUserActive() {
        return this.adminUserActive != null;
    }

    /**
    * The admin user enable flag
    */
    public SetAdminUserInfoRequest setAdminUserActive(boolean d) {
        this.adminUserActive = Boolean.valueOf(d);
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
        if (newAdminUserName != null) {
            sb.append(aligned)
                .append("\"newAdminUserName\": \"")
                .append(newAdminUserName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminUserDisplayName != null) {
            sb.append(aligned)
                .append("\"adminUserDisplayName\": \"")
                .append(adminUserDisplayName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newAdminUserPassword != null) {
            sb.append(aligned)
                .append("\"newAdminUserPassword\": \"")
                .append(newAdminUserPassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminUserActive != null) {
            sb.append(aligned)
                .append("\"adminUserActive\": \"")
                .append(adminUserActive)
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