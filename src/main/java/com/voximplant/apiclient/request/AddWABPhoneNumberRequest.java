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

public class AddWABPhoneNumberRequest implements Alignable {
    private String wabPhoneNumber;

    @RequestField(name="wab_phone_number")
    /**
    * WhatsApp Business phone number
    */
    public String getWabPhoneNumber() {
        return this.wabPhoneNumber;
    }

    public boolean hasWabPhoneNumber() {
        return this.wabPhoneNumber != null;
    }

    /**
    * WhatsApp Business phone number
    */
    public AddWABPhoneNumberRequest setWabPhoneNumber(String d) {
        this.wabPhoneNumber = d;
        return this;
    }

    private String voicePassword;

    @RequestField(name="voice_password")
    /**
    * WhatsApp Business SIP password
    */
    public String getVoicePassword() {
        return this.voicePassword;
    }

    public boolean hasVoicePassword() {
        return this.voicePassword != null;
    }

    /**
    * WhatsApp Business SIP password
    */
    public AddWABPhoneNumberRequest setVoicePassword(String d) {
        this.voicePassword = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * WhatsApp Business phone number description
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * WhatsApp Business phone number description
    */
    public AddWABPhoneNumberRequest setDescription(String d) {
        this.description = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Bound application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Bound application ID
    */
    public AddWABPhoneNumberRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Bound application name that can be used instead of
    * <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Bound application name that can be used instead of
    * <b>application_id</b>
    */
    public AddWABPhoneNumberRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * Bound rule ID
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * Bound rule ID
    */
    public AddWABPhoneNumberRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * Bound rule name that can be used instead of <b>rule_id</b>
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * Bound rule name that can be used instead of <b>rule_id</b>
    */
    public AddWABPhoneNumberRequest setRuleName(String d) {
        this.ruleName = d;
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
        if (wabPhoneNumber != null) {
            sb.append(aligned)
                .append("\"wabPhoneNumber\": \"")
                .append(wabPhoneNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (voicePassword != null) {
            sb.append(aligned)
                .append("\"voicePassword\": \"")
                .append(voicePassword)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}