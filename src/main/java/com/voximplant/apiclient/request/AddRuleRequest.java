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

public class AddRuleRequest {
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
    public AddRuleRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name, can be used instead of <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name, can be used instead of <b>application_id</b>.
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
    * The rule pattern regex. The length must be less than 64 KB.
    */
    public String getRulePattern() {
        return this.rulePattern;
    }

    public boolean hasRulePattern() {
        return this.rulePattern != null;
    }

    /**
    * The rule pattern regex. The length must be less than 64 KB.
    */
    public AddRuleRequest setRulePattern(String d) {
        this.rulePattern = d;
        return this;
    }

    private String rulePatternExclude;

    @RequestField(name="rule_pattern_exclude")
    /**
    * The exclude pattern regex. The length must be less than 64 KB.
    */
    public String getRulePatternExclude() {
        return this.rulePatternExclude;
    }

    public boolean hasRulePatternExclude() {
        return this.rulePatternExclude != null;
    }

    /**
    * The exclude pattern regex. The length must be less than 64 KB.
    */
    public AddRuleRequest setRulePatternExclude(String d) {
        this.rulePatternExclude = d;
        return this;
    }

    private Boolean videoConference;

    @RequestField(name="video_conference")
    /**
    * Is video conference required?
    */
    public boolean getVideoConference() {
        return this.videoConference.booleanValue();
    }

    public boolean hasVideoConference() {
        return this.videoConference != null;
    }

    /**
    * Is video conference required?
    */
    public AddRuleRequest setVideoConference(boolean d) {
        this.videoConference = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> scenarioId;

    @RequestField(name="scenario_id")
    /**
    * The scenario ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getScenarioId() {
        return this.scenarioId;
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    /**
    * The scenario ID list separated by the ';' symbol.
    */
    public AddRuleRequest setScenarioId(MultiArgument<Long> d) {
        this.scenarioId = d;
        return this;
    }

    private MultiArgument<String> scenarioName;

    @RequestField(name="scenario_name")
    /**
    * The scenario name list separated by the ';' symbol. Can be used
    * instead of <b>scenario_id</b>.
    */
    public MultiArgument<String> getScenarioName() {
        return this.scenarioName;
    }

    public boolean hasScenarioName() {
        return this.scenarioName != null;
    }

    /**
    * The scenario name list separated by the ';' symbol. Can be used
    * instead of <b>scenario_id</b>.
    */
    public AddRuleRequest setScenarioName(MultiArgument<String> d) {
        this.scenarioName = d;
        return this;
    }

}