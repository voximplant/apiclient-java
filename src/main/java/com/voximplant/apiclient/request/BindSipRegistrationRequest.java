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

public class BindSipRegistrationRequest {
    private Long sipRegistrationId;

    @RequestField(name="sip_registration_id")
    /**
    * The registration ID
    */
    public long getSipRegistrationId() {
        return this.sipRegistrationId.longValue();
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    /**
    * The registration ID
    */
    public BindSipRegistrationRequest setSipRegistrationId(long d) {
        this.sipRegistrationId = Long.valueOf(d);
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID which the SIP registration will be bound to. Can
    * be used instead of the <b>application_name</b> parameter.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID which the SIP registration will be bound to. Can
    * be used instead of the <b>application_name</b> parameter.
    */
    public BindSipRegistrationRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name which the SIP registration will be bound to. Can
    * be used instead of the <b>application_id</b> parameter.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name which the SIP registration will be bound to. Can
    * be used instead of the <b>application_id</b> parameter.
    */
    public BindSipRegistrationRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID which the SIP registration will be bound to. Can be used
    * instead of the <b>rule_name</b> parameter.
    */
    public long getRuleId() {
        return this.ruleId.longValue();
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID which the SIP registration will be bound to. Can be used
    * instead of the <b>rule_name</b> parameter.
    */
    public BindSipRegistrationRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name which the SIP registration will be bound to. Can be
    * used instead of the <b>rule_id</b> parameter.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name which the SIP registration will be bound to. Can be
    * used instead of the <b>rule_id</b> parameter.
    */
    public BindSipRegistrationRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user ID which the SIP registration will be bound to. Can be used
    * instead of the <b>user_name</b> parameter.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID which the SIP registration will be bound to. Can be used
    * instead of the <b>user_name</b> parameter.
    */
    public BindSipRegistrationRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name which the SIP registration will be bound to. Can be
    * used instead of the <b>user_id</b> parameter.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name which the SIP registration will be bound to. Can be
    * used instead of the <b>user_id</b> parameter.
    */
    public BindSipRegistrationRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Boolean bind;

    @RequestField(name="bind")
    /**
    * Bind or unbind?
    */
    public boolean getBind() {
        return this.bind.booleanValue();
    }

    public boolean hasBind() {
        return this.bind != null;
    }

    /**
    * Bind or unbind?
    */
    public BindSipRegistrationRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
        return this;
    }

}