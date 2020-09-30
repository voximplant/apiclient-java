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

public class BindPhoneNumberToApplicationRequest {
    private MultiArgument<Long> phoneId;

    @RequestField(name="phone_id")
    /**
    * The phone ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getPhoneId() {
        return this.phoneId;
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    /**
    * The phone ID list separated by the ';' symbol or the 'all' value.
    */
    public BindPhoneNumberToApplicationRequest setPhoneId(MultiArgument<Long> d) {
        this.phoneId = d;
        return this;
    }

    private MultiArgument<String> phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone number list separated by the ';' symbol that can be used
    * instead of <b>phone_id</b>.
    */
    public MultiArgument<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone number list separated by the ';' symbol that can be used
    * instead of <b>phone_id</b>.
    */
    public BindPhoneNumberToApplicationRequest setPhoneNumber(MultiArgument<String> d) {
        this.phoneNumber = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID.
    */
    public BindPhoneNumberToApplicationRequest setApplicationId(long d) {
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
    public BindPhoneNumberToApplicationRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID.
    */
    public long getRuleId() {
        return this.ruleId.longValue();
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID.
    */
    public BindPhoneNumberToApplicationRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name that can be used instead of <b>rule_id</b>.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name that can be used instead of <b>rule_id</b>.
    */
    public BindPhoneNumberToApplicationRequest setRuleName(String d) {
        this.ruleName = d;
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
    public BindPhoneNumberToApplicationRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
        return this;
    }

}