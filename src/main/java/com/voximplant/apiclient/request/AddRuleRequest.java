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

public class AddRuleRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID
    */
    public AddRuleRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name, can be used instead of <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name, can be used instead of <b>application_id</b>
    */
    public AddRuleRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name. The length must be less than 100
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name. The length must be less than 100
    */
    public AddRuleRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private String rulePattern;

    @RequestField(name="rule_pattern")
    /**
    * The rule pattern regex. The length must be less than 64 KB
    */
    public String getRulePattern() {
        return this.rulePattern;
    }

    public boolean hasRulePattern() {
        return this.rulePattern != null;
    }

    /**
    * The rule pattern regex. The length must be less than 64 KB
    */
    public AddRuleRequest setRulePattern(String d) {
        this.rulePattern = d;
        return this;
    }

    private String rulePatternExclude;

    @RequestField(name="rule_pattern_exclude")
    /**
    * The exclude pattern regex. The length must be less than 64 KB
    */
    public String getRulePatternExclude() {
        return this.rulePatternExclude;
    }

    public boolean hasRulePatternExclude() {
        return this.rulePatternExclude != null;
    }

    /**
    * The exclude pattern regex. The length must be less than 64 KB
    */
    public AddRuleRequest setRulePatternExclude(String d) {
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
    public AddRuleRequest setVideoConference(boolean d) {
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
    public AddRuleRequest setBindKeyId(String d) {
        this.bindKeyId = d;
        return this;
    }

    private MultiArgument<Long> scenarioId;

    @RequestField(name="scenario_id")
    /**
    * The scenario ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getScenarioId() {
        return this.scenarioId;
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    /**
    * The scenario ID list separated by semicolons (;)
    */
    public AddRuleRequest setScenarioId(MultiArgument<Long> d) {
        this.scenarioId = d;
        return this;
    }

    private MultiArgument<String> scenarioName;

    @RequestField(name="scenario_name")
    /**
    * The scenario name list separated by semicolons (;). Can be used
    * instead of <b>scenario_id</b>
    */
    public MultiArgument<String> getScenarioName() {
        return this.scenarioName;
    }

    public boolean hasScenarioName() {
        return this.scenarioName != null;
    }

    /**
    * The scenario name list separated by semicolons (;). Can be used
    * instead of <b>scenario_id</b>
    */
    public AddRuleRequest setScenarioName(MultiArgument<String> d) {
        this.scenarioName = d;
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
        if (scenarioId != null) {
            sb.append(aligned)
                .append("\"scenarioId\": \"")
                .append(scenarioId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (scenarioName != null) {
            sb.append(aligned)
                .append("\"scenarioName\": \"")
                .append(scenarioName)
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