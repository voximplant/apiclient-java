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

public class SetUserInfoRequest implements Alignable {
    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user to edit
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user to edit
    */
    public SetUserInfoRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name that can be used instead of <b>user_id</b>
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name that can be used instead of <b>user_id</b>
    */
    public SetUserInfoRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified
    */
    public SetUserInfoRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public SetUserInfoRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String newUserName;

    @RequestField(name="new_user_name")
    /**
    * The new user name in format [a-z0-9][a-z0-9_-]{2,49}
    */
    public String getNewUserName() {
        return this.newUserName;
    }

    public boolean hasNewUserName() {
        return this.newUserName != null;
    }

    /**
    * The new user name in format [a-z0-9][a-z0-9_-]{2,49}
    */
    public SetUserInfoRequest setNewUserName(String d) {
        this.newUserName = d;
        return this;
    }

    private String userDisplayName;

    @RequestField(name="user_display_name")
    /**
    * The new user display name. The length must be less than 256
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    /**
    * The new user display name. The length must be less than 256
    */
    public SetUserInfoRequest setUserDisplayName(String d) {
        this.userDisplayName = d;
        return this;
    }

    private String userPassword;

    @RequestField(name="user_password")
    /**
    * The new user password. Must be at least 8 characters long and contain
    * at least one uppercase and lowercase letter, one number, and one
    * special character
    */
    public String getUserPassword() {
        return this.userPassword;
    }

    public boolean hasUserPassword() {
        return this.userPassword != null;
    }

    /**
    * The new user password. Must be at least 8 characters long and contain
    * at least one uppercase and lowercase letter, one number, and one
    * special character
    */
    public SetUserInfoRequest setUserPassword(String d) {
        this.userPassword = d;
        return this;
    }

    private Boolean parentAccounting;

    @RequestField(name="parent_accounting")
    /**
    * Set 'true' to use the parent account's money, 'false' to use a
    * separate user balance
    */
    public Boolean getParentAccounting() {
        return this.parentAccounting;
    }

    public boolean hasParentAccounting() {
        return this.parentAccounting != null;
    }

    /**
    * Set 'true' to use the parent account's money, 'false' to use a
    * separate user balance
    */
    public SetUserInfoRequest setParentAccounting(boolean d) {
        this.parentAccounting = Boolean.valueOf(d);
        return this;
    }

    private Boolean userActive;

    @RequestField(name="user_active")
    /**
    * The user enable flag
    */
    public Boolean getUserActive() {
        return this.userActive;
    }

    public boolean hasUserActive() {
        return this.userActive != null;
    }

    /**
    * The user enable flag
    */
    public SetUserInfoRequest setUserActive(boolean d) {
        this.userActive = Boolean.valueOf(d);
        return this;
    }

    private String userCustomData;

    @RequestField(name="user_custom_data")
    /**
    * Any string
    */
    public String getUserCustomData() {
        return this.userCustomData;
    }

    public boolean hasUserCustomData() {
        return this.userCustomData != null;
    }

    /**
    * Any string
    */
    public SetUserInfoRequest setUserCustomData(String d) {
        this.userCustomData = d;
        return this;
    }

    private String mobilePhone;

    @RequestField(name="mobile_phone")
    /**
    * The new user mobile phone. The length must be less than 50
    */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public boolean hasMobilePhone() {
        return this.mobilePhone != null;
    }

    /**
    * The new user mobile phone. The length must be less than 50
    */
    public SetUserInfoRequest setMobilePhone(String d) {
        this.mobilePhone = d;
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
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newUserName != null) {
            sb.append(aligned)
                .append("\"newUserName\": \"")
                .append(newUserName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userDisplayName != null) {
            sb.append(aligned)
                .append("\"userDisplayName\": \"")
                .append(userDisplayName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userPassword != null) {
            sb.append(aligned)
                .append("\"userPassword\": \"")
                .append(userPassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (parentAccounting != null) {
            sb.append(aligned)
                .append("\"parentAccounting\": \"")
                .append(parentAccounting)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userActive != null) {
            sb.append(aligned)
                .append("\"userActive\": \"")
                .append(userActive)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userCustomData != null) {
            sb.append(aligned)
                .append("\"userCustomData\": \"")
                .append(userCustomData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mobilePhone != null) {
            sb.append(aligned)
                .append("\"mobilePhone\": \"")
                .append(mobilePhone)
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