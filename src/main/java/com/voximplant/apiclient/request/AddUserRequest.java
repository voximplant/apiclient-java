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

public class AddUserRequest implements Alignable {
    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name in format [a-z0-9][a-z0-9_-]{2,49}
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name in format [a-z0-9][a-z0-9_-]{2,49}
    */
    public AddUserRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private String userDisplayName;

    @RequestField(name="user_display_name")
    /**
    * The user display name. The length must be less than 256
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    /**
    * The user display name. The length must be less than 256
    */
    public AddUserRequest setUserDisplayName(String d) {
        this.userDisplayName = d;
        return this;
    }

    private String userPassword;

    @RequestField(name="user_password")
    /**
    * The user password. Must be at least 8 characters long and contain at
    * least one uppercase and lowercase letter, one number, and one special
    * character
    */
    public String getUserPassword() {
        return this.userPassword;
    }

    public boolean hasUserPassword() {
        return this.userPassword != null;
    }

    /**
    * The user password. Must be at least 8 characters long and contain at
    * least one uppercase and lowercase letter, one number, and one special
    * character
    */
    public AddUserRequest setUserPassword(String d) {
        this.userPassword = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID which a new user is to be bound to. Can be used
    * instead of the <b>application_name</b> parameter
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID which a new user is to be bound to. Can be used
    * instead of the <b>application_name</b> parameter
    */
    public AddUserRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name which a new user is to be bound to. Can be used
    * instead of the <b>application_id</b> parameter
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name which a new user is to be bound to. Can be used
    * instead of the <b>application_id</b> parameter
    */
    public AddUserRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Boolean parentAccounting;

    @RequestField(name="parent_accounting")
    /**
    * Whether the user uses the parent account's money, 'false' if the user
    * has a separate balance
    */
    public Boolean getParentAccounting() {
        return this.parentAccounting;
    }

    public boolean hasParentAccounting() {
        return this.parentAccounting != null;
    }

    /**
    * Whether the user uses the parent account's money, 'false' if the user
    * has a separate balance
    */
    public AddUserRequest setParentAccounting(boolean d) {
        this.parentAccounting = Boolean.valueOf(d);
        return this;
    }

    private String mobilePhone;

    @RequestField(name="mobile_phone")
    /**
    * The user mobile phone. The length must be less than 50
    */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public boolean hasMobilePhone() {
        return this.mobilePhone != null;
    }

    /**
    * The user mobile phone. The length must be less than 50
    */
    public AddUserRequest setMobilePhone(String d) {
        this.mobilePhone = d;
        return this;
    }

    private Boolean userActive;

    @RequestField(name="user_active")
    /**
    * Whether the user is active. Inactive users cannot log in to
    * applications
    */
    public Boolean getUserActive() {
        return this.userActive;
    }

    public boolean hasUserActive() {
        return this.userActive != null;
    }

    /**
    * Whether the user is active. Inactive users cannot log in to
    * applications
    */
    public AddUserRequest setUserActive(boolean d) {
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
    public AddUserRequest setUserCustomData(String d) {
        this.userCustomData = d;
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
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
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
        if (parentAccounting != null) {
            sb.append(aligned)
                .append("\"parentAccounting\": \"")
                .append(parentAccounting)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}