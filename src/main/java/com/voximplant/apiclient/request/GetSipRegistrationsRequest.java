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

public class GetSipRegistrationsRequest implements Alignable {
    private Long sipRegistrationId;

    @RequestField(name="sip_registration_id")
    /**
    * The SIP registration ID
    */
    public Long getSipRegistrationId() {
        return this.sipRegistrationId;
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    /**
    * The SIP registration ID
    */
    public GetSipRegistrationsRequest setSipRegistrationId(long d) {
        this.sipRegistrationId = Long.valueOf(d);
        return this;
    }

    private String sipUsername;

    @RequestField(name="sip_username")
    /**
    * The SIP user name to filter
    */
    public String getSipUsername() {
        return this.sipUsername;
    }

    public boolean hasSipUsername() {
        return this.sipUsername != null;
    }

    /**
    * The SIP user name to filter
    */
    public GetSipRegistrationsRequest setSipUsername(String d) {
        this.sipUsername = d;
        return this;
    }

    private Boolean deactivated;

    @RequestField(name="deactivated")
    /**
    * Whether to show the frozen SIP registrations only
    */
    public Boolean getDeactivated() {
        return this.deactivated;
    }

    public boolean hasDeactivated() {
        return this.deactivated != null;
    }

    /**
    * Whether to show the frozen SIP registrations only
    */
    public GetSipRegistrationsRequest setDeactivated(boolean d) {
        this.deactivated = Boolean.valueOf(d);
        return this;
    }

    private Boolean successful;

    @RequestField(name="successful")
    /**
    * Whether to show the successful SIP registrations only
    */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public boolean hasSuccessful() {
        return this.successful != null;
    }

    /**
    * Whether to show the successful SIP registrations only
    */
    public GetSipRegistrationsRequest setSuccessful(boolean d) {
        this.successful = Boolean.valueOf(d);
        return this;
    }

    private Boolean isPersistent;

    @RequestField(name="is_persistent")
    /**
    * Whether the SIP registration is persistent to filter
    */
    public Boolean getIsPersistent() {
        return this.isPersistent;
    }

    public boolean hasIsPersistent() {
        return this.isPersistent != null;
    }

    /**
    * Whether the SIP registration is persistent to filter
    */
    public GetSipRegistrationsRequest setIsPersistent(boolean d) {
        this.isPersistent = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID list separated by semicolons (;) to filter. Can be
    * used instead of <b>application_name</b>
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID list separated by semicolons (;) to filter. Can be
    * used instead of <b>application_name</b>
    */
    public GetSipRegistrationsRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private MultiArgument<String> applicationName;

    @RequestField(name="application_name")
    /**
    * The application name list separated by semicolons (;) to filter. Can
    * be used instead of <b>application_id</b>
    */
    public MultiArgument<String> getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name list separated by semicolons (;) to filter. Can
    * be used instead of <b>application_id</b>
    */
    public GetSipRegistrationsRequest setApplicationName(MultiArgument<String> d) {
        this.applicationName = d;
        return this;
    }

    private Boolean isBoundToApplication;

    @RequestField(name="is_bound_to_application")
    /**
    * Whether SIP registration bound to an application
    */
    public Boolean getIsBoundToApplication() {
        return this.isBoundToApplication;
    }

    public boolean hasIsBoundToApplication() {
        return this.isBoundToApplication != null;
    }

    /**
    * Whether SIP registration bound to an application
    */
    public GetSipRegistrationsRequest setIsBoundToApplication(boolean d) {
        this.isBoundToApplication = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID list separated by semicolons (;) to filter. Can be used
    * instead of <b>rule_name</b>
    */
    public MultiArgument<Long> getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID list separated by semicolons (;) to filter. Can be used
    * instead of <b>rule_name</b>
    */
    public GetSipRegistrationsRequest setRuleId(MultiArgument<Long> d) {
        this.ruleId = d;
        return this;
    }

    private MultiArgument<String> ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name list separated by semicolons (;) to filter. Can be used
    * instead of <b>rule_id</b>
    */
    public MultiArgument<String> getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name list separated by semicolons (;) to filter. Can be used
    * instead of <b>rule_id</b>
    */
    public GetSipRegistrationsRequest setRuleName(MultiArgument<String> d) {
        this.ruleName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by semicolons (;) to filter. Can be used
    * instead of <b>user_name</b>
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by semicolons (;) to filter. Can be used
    * instead of <b>user_name</b>
    */
    public GetSipRegistrationsRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * The user name list separated by semicolons (;) to filter. Can be used
    * instead of <b>user_id</b>
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name list separated by semicolons (;) to filter. Can be used
    * instead of <b>user_id</b>
    */
    public GetSipRegistrationsRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private MultiArgument<String> proxy;

    @RequestField(name="proxy")
    /**
    * The list of proxy servers to use, divided by semicolon (;)
    */
    public MultiArgument<String> getProxy() {
        return this.proxy;
    }

    public boolean hasProxy() {
        return this.proxy != null;
    }

    /**
    * The list of proxy servers to use, divided by semicolon (;)
    */
    public GetSipRegistrationsRequest setProxy(MultiArgument<String> d) {
        this.proxy = d;
        return this;
    }

    private Boolean inProgress;

    @RequestField(name="in_progress")
    /**
    * Whether SIP registration is still in progress
    */
    public Boolean getInProgress() {
        return this.inProgress;
    }

    public boolean hasInProgress() {
        return this.inProgress != null;
    }

    /**
    * Whether SIP registration is still in progress
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
    * __code1;code2:code3__
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
    * __code1;code2:code3__
    */
    public GetSipRegistrationsRequest setStatusCode(String d) {
        this.statusCode = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetSipRegistrationsRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetSipRegistrationsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
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
        if (sipRegistrationId != null) {
            sb.append(aligned)
                .append("\"sipRegistrationId\": \"")
                .append(sipRegistrationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sipUsername != null) {
            sb.append(aligned)
                .append("\"sipUsername\": \"")
                .append(sipUsername)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (deactivated != null) {
            sb.append(aligned)
                .append("\"deactivated\": \"")
                .append(deactivated)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (successful != null) {
            sb.append(aligned)
                .append("\"successful\": \"")
                .append(successful)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isPersistent != null) {
            sb.append(aligned)
                .append("\"isPersistent\": \"")
                .append(isPersistent)
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
        if (isBoundToApplication != null) {
            sb.append(aligned)
                .append("\"isBoundToApplication\": \"")
                .append(isBoundToApplication)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleName != null) {
            sb.append(aligned)
                .append("\"ruleName\": \"")
                .append(ruleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
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
        if (proxy != null) {
            sb.append(aligned)
                .append("\"proxy\": \"")
                .append(proxy)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (inProgress != null) {
            sb.append(aligned)
                .append("\"inProgress\": \"")
                .append(inProgress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (statusCode != null) {
            sb.append(aligned)
                .append("\"statusCode\": \"")
                .append(statusCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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