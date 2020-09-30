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

public class GetSipRegistrationsRequest {
    private Long sipRegistrationId;

    @RequestField(name="sip_registration_id")
    /**
    * The SIP registration ID.
    */
    public long getSipRegistrationId() {
        return this.sipRegistrationId.longValue();
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    /**
    * The SIP registration ID.
    */
    public GetSipRegistrationsRequest setSipRegistrationId(long d) {
        this.sipRegistrationId = Long.valueOf(d);
        return this;
    }

    private String sipUsername;

    @RequestField(name="sip_username")
    /**
    * The SIP user name to filter.
    */
    public String getSipUsername() {
        return this.sipUsername;
    }

    public boolean hasSipUsername() {
        return this.sipUsername != null;
    }

    /**
    * The SIP user name to filter.
    */
    public GetSipRegistrationsRequest setSipUsername(String d) {
        this.sipUsername = d;
        return this;
    }

    private Boolean deactivated;

    @RequestField(name="deactivated")
    /**
    * Set true to show the frozen SIP registrations only.
    */
    public boolean getDeactivated() {
        return this.deactivated.booleanValue();
    }

    public boolean hasDeactivated() {
        return this.deactivated != null;
    }

    /**
    * Set true to show the frozen SIP registrations only.
    */
    public GetSipRegistrationsRequest setDeactivated(boolean d) {
        this.deactivated = Boolean.valueOf(d);
        return this;
    }

    private Boolean successful;

    @RequestField(name="successful")
    /**
    * Set false to show the unsuccessful SIP registrations only.
    */
    public boolean getSuccessful() {
        return this.successful.booleanValue();
    }

    public boolean hasSuccessful() {
        return this.successful != null;
    }

    /**
    * Set false to show the unsuccessful SIP registrations only.
    */
    public GetSipRegistrationsRequest setSuccessful(boolean d) {
        this.successful = Boolean.valueOf(d);
        return this;
    }

    private Boolean isPersistent;

    @RequestField(name="is_persistent")
    /**
    * The persistent flag to filter.
    */
    public boolean getIsPersistent() {
        return this.isPersistent.booleanValue();
    }

    public boolean hasIsPersistent() {
        return this.isPersistent != null;
    }

    /**
    * The persistent flag to filter.
    */
    public GetSipRegistrationsRequest setIsPersistent(boolean d) {
        this.isPersistent = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID list separated by the ';' symbol to filter. Can be
    * used instead of <b>appliction_name</b>.
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID list separated by the ';' symbol to filter. Can be
    * used instead of <b>appliction_name</b>.
    */
    public GetSipRegistrationsRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private MultiArgument<String> applicationName;

    @RequestField(name="application_name")
    /**
    * The application name list separated by the ';' symbol to filter. Can
    * be used instead of <b>appliction_id</b>.
    */
    public MultiArgument<String> getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name list separated by the ';' symbol to filter. Can
    * be used instead of <b>appliction_id</b>.
    */
    public GetSipRegistrationsRequest setApplicationName(MultiArgument<String> d) {
        this.applicationName = d;
        return this;
    }

    private Boolean isBoundToApplication;

    @RequestField(name="is_bound_to_application")
    /**
    * Is a SIP registration bound to an application.
    */
    public boolean getIsBoundToApplication() {
        return this.isBoundToApplication.booleanValue();
    }

    public boolean hasIsBoundToApplication() {
        return this.isBoundToApplication != null;
    }

    /**
    * Is a SIP registration bound to an application.
    */
    public GetSipRegistrationsRequest setIsBoundToApplication(boolean d) {
        this.isBoundToApplication = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID list separated by the ';' symbol to filter. Can be used
    * instead of <b>rule_name</b>.
    */
    public MultiArgument<Long> getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID list separated by the ';' symbol to filter. Can be used
    * instead of <b>rule_name</b>.
    */
    public GetSipRegistrationsRequest setRuleId(MultiArgument<Long> d) {
        this.ruleId = d;
        return this;
    }

    private MultiArgument<String> ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name list separated by the ';' symbol to filter. Can be used
    * instead of <b>rule_id</b>.
    */
    public MultiArgument<String> getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name list separated by the ';' symbol to filter. Can be used
    * instead of <b>rule_id</b>.
    */
    public GetSipRegistrationsRequest setRuleName(MultiArgument<String> d) {
        this.ruleName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by the ';' symbol to filter. Can be used
    * instead of <b>user_name</b>.
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by the ';' symbol to filter. Can be used
    * instead of <b>user_name</b>.
    */
    public GetSipRegistrationsRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * The user name list separated by the ';' symbol to filter. Can be used
    * instead of <b>user_id</b>.
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name list separated by the ';' symbol to filter. Can be used
    * instead of <b>user_id</b>.
    */
    public GetSipRegistrationsRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private MultiArgument<String> proxy;

    @RequestField(name="proxy")
    /**
    * The list of proxy servers to use, divided by the ';' symbol.
    */
    public MultiArgument<String> getProxy() {
        return this.proxy;
    }

    public boolean hasProxy() {
        return this.proxy != null;
    }

    /**
    * The list of proxy servers to use, divided by the ';' symbol.
    */
    public GetSipRegistrationsRequest setProxy(MultiArgument<String> d) {
        this.proxy = d;
        return this;
    }

    private Boolean inProgress;

    @RequestField(name="in_progress")
    /**
    * Is the SIP registration is still in progress or not?
    */
    public boolean getInProgress() {
        return this.inProgress.booleanValue();
    }

    public boolean hasInProgress() {
        return this.inProgress != null;
    }

    /**
    * Is the SIP registration is still in progress or not?
    */
    public GetSipRegistrationsRequest setInProgress(boolean d) {
        this.inProgress = Boolean.valueOf(d);
        return this;
    }

    private String statusCode;

    @RequestField(name="status_code")
    /**
    * The list of SIP response codes. The __code1:code2__ means a range
    * from __code1__ to __code2__ including; the __code1;code2__ meanse
    * either __code1__ or __code2__. You can combine ranges, e.g.,
    * __code1;code2:code3__.
    */
    public String getStatusCode() {
        return this.statusCode;
    }

    public boolean hasStatusCode() {
        return this.statusCode != null;
    }

    /**
    * The list of SIP response codes. The __code1:code2__ means a range
    * from __code1__ to __code2__ including; the __code1;code2__ meanse
    * either __code1__ or __code2__. You can combine ranges, e.g.,
    * __code1;code2:code3__.
    */
    public GetSipRegistrationsRequest setStatusCode(String d) {
        this.statusCode = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetSipRegistrationsRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetSipRegistrationsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}