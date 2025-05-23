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

public class BindSipRegistrationRequest implements Alignable {
    private Long sipRegistrationId;

    @RequestField(name="sip_registration_id")
    /**
    * The registration ID
    */
    public Long getSipRegistrationId() {
        return this.sipRegistrationId;
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
    * The application ID which the SIP registration is to be bound to. Can
    * be used instead of the <b>application_name</b> parameter
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID which the SIP registration is to be bound to. Can
    * be used instead of the <b>application_name</b> parameter
    */
    public BindSipRegistrationRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name which the SIP registration is to be bound to.
    * Can be used instead of the <b>application_id</b> parameter
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name which the SIP registration is to be bound to.
    * Can be used instead of the <b>application_id</b> parameter
    */
    public BindSipRegistrationRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID which the SIP registration is to be bound to. Can be used
    * instead of the <b>rule_name</b> parameter
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID which the SIP registration is to be bound to. Can be used
    * instead of the <b>rule_name</b> parameter
    */
    public BindSipRegistrationRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name which the SIP registration is to be bound to. Can be
    * used instead of the <b>rule_id</b> parameter
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name which the SIP registration is to be bound to. Can be
    * used instead of the <b>rule_id</b> parameter
    */
    public BindSipRegistrationRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user ID which the SIP registration is to be bound to. Can be used
    * instead of the <b>user_name</b> parameter
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID which the SIP registration is to be bound to. Can be used
    * instead of the <b>user_name</b> parameter
    */
    public BindSipRegistrationRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name which the SIP registration is to be bound to. Can be
    * used instead of the <b>user_id</b> parameter
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name which the SIP registration is to be bound to. Can be
    * used instead of the <b>user_id</b> parameter
    */
    public BindSipRegistrationRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Boolean bind;

    @RequestField(name="bind")
    /**
    * Whether to bind or unbind (set true or false respectively)
    */
    public Boolean getBind() {
        return this.bind;
    }

    public boolean hasBind() {
        return this.bind != null;
    }

    /**
    * Whether to bind or unbind (set true or false respectively)
    */
    public BindSipRegistrationRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
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
        if (bind != null) {
            sb.append(aligned)
                .append("\"bind\": \"")
                .append(bind)
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