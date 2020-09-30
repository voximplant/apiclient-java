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

public class DelUserRequest {
    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by the ';' symbol or the 'all' value.
    */
    public DelUserRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * The user name list separated by the ';' symbol that can be used
    * instead of <b>user_id</b>.
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name list separated by the ';' symbol that can be used
    * instead of <b>user_id</b>.
    */
    public DelUserRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Delete the specified users bound to the application ID. It is
    * required if the <b>user_name</b> is specified.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Delete the specified users bound to the application ID. It is
    * required if the <b>user_name</b> is specified.
    */
    public DelUserRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Delete the specified users bound to the application name. Can be used
    * instead of the <b>application_id</b> parameter.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Delete the specified users bound to the application name. Can be used
    * instead of the <b>application_id</b> parameter.
    */
    public DelUserRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

}