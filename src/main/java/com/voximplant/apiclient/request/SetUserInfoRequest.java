package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class SetUserInfoRequest {
    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user to edit.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user to edit.
    */
    public SetUserInfoRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name that can be used instead of <b>user_id</b>.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name that can be used instead of <b>user_id</b>.
    */
    public SetUserInfoRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified.
    */
    public SetUserInfoRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
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
    * The new user display name. The length must be less than 256.
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    /**
    * The new user display name. The length must be less than 256.
    */
    public SetUserInfoRequest setUserDisplayName(String d) {
        this.userDisplayName = d;
        return this;
    }

    private String userPassword;

    @RequestField(name="user_password")
    /**
    * The new user password. The length must be at least 6 symbols.
    */
    public String getUserPassword() {
        return this.userPassword;
    }

    public boolean hasUserPassword() {
        return this.userPassword != null;
    }

    /**
    * The new user password. The length must be at least 6 symbols.
    */
    public SetUserInfoRequest setUserPassword(String d) {
        this.userPassword = d;
        return this;
    }

    private Boolean parentAccounting;

    @RequestField(name="parent_accounting")
    /**
    * Set 'true' to use the parent account's money, 'false' to use a
    * separate user balance.
    */
    public boolean getParentAccounting() {
        return this.parentAccounting.booleanValue();
    }

    public boolean hasParentAccounting() {
        return this.parentAccounting != null;
    }

    /**
    * Set 'true' to use the parent account's money, 'false' to use a
    * separate user balance.
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
    public boolean getUserActive() {
        return this.userActive.booleanValue();
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
    * The new user mobile phone. The length must be less than 50.
    */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public boolean hasMobilePhone() {
        return this.mobilePhone != null;
    }

    /**
    * The new user mobile phone. The length must be less than 50.
    */
    public SetUserInfoRequest setMobilePhone(String d) {
        this.mobilePhone = d;
        return this;
    }

}