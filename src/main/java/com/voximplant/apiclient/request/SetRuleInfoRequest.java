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

public class SetRuleInfoRequest implements Alignable {
    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID
    */
    public SetRuleInfoRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The new rule name. The length must be less than 100
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The new rule name. The length must be less than 100
    */
    public SetRuleInfoRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private String rulePattern;

    @RequestField(name="rule_pattern")
    /**
    * The new rule pattern regex. The length must be less than 64 KB
    */
    public String getRulePattern() {
        return this.rulePattern;
    }

    public boolean hasRulePattern() {
        return this.rulePattern != null;
    }

    /**
    * The new rule pattern regex. The length must be less than 64 KB
    */
    public SetRuleInfoRequest setRulePattern(String d) {
        this.rulePattern = d;
        return this;
    }

    private String rulePatternExclude;

    @RequestField(name="rule_pattern_exclude")
    /**
    * The new exclude pattern regex. The length must be less than 64 KB
    */
    public String getRulePatternExclude() {
        return this.rulePatternExclude;
    }

    public boolean hasRulePatternExclude() {
        return this.rulePatternExclude != null;
    }

    /**
    * The new exclude pattern regex. The length must be less than 64 KB
    */
    public SetRuleInfoRequest setRulePatternExclude(String d) {
        this.rulePatternExclude = d;
        return this;
    }

    private Boolean videoConference;

    @RequestField(name="video_conference")
    /**
    * Whether video conference is required
    */
    public Boolean getVideoConference() {
        return this.videoConference;
    }

    public boolean hasVideoConference() {
        return this.videoConference != null;
    }

    /**
    * Whether video conference is required
    */
    public SetRuleInfoRequest setVideoConference(boolean d) {
        this.videoConference = Boolean.valueOf(d);
        return this;
    }

    private String bindKeyId;

    @RequestField(name="bind_key_id")
    /**
    * The service account ID to bind to the rule. Read more in the
    * [guide](/docs/guides/voxengine/management-api)
    */
    public String getBindKeyId() {
        return this.bindKeyId;
    }

    public boolean hasBindKeyId() {
        return this.bindKeyId != null;
    }

    /**
    * The service account ID to bind to the rule. Read more in the
    * [guide](/docs/guides/voxengine/management-api)
    */
    public SetRuleInfoRequest setBindKeyId(String d) {
        this.bindKeyId = d;
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
        if (rulePattern != null) {
            sb.append(aligned)
                .append("\"rulePattern\": \"")
                .append(rulePattern)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (rulePatternExclude != null) {
            sb.append(aligned)
                .append("\"rulePatternExclude\": \"")
                .append(rulePatternExclude)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (videoConference != null) {
            sb.append(aligned)
                .append("\"videoConference\": \"")
                .append(videoConference)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bindKeyId != null) {
            sb.append(aligned)
                .append("\"bindKeyId\": \"")
                .append(bindKeyId)
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