package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetRules] function result item.
*/
public class RuleInfoType {

    private Long ruleId;

    /**
    * The rule ID.
    */
    public long getRuleId() {
        return this.ruleId.longValue();
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    private Long applicationId;

    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private String ruleName;

    /**
    * The rule name.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    private String rulePattern;

    /**
    * The rule pattern regex.
    */
    public String getRulePattern() {
        return this.rulePattern;
    }

    public boolean hasRulePattern() {
        return this.rulePattern != null;
    }

    private String rulePatternExclude;

    /**
    * The rule pattern exlude regex.
    */
    public String getRulePatternExclude() {
        return this.rulePatternExclude;
    }

    public boolean hasRulePatternExclude() {
        return this.rulePatternExclude != null;
    }

    private Boolean videoConference;

    /**
    * Is video conference required?
    */
    public boolean getVideoConference() {
        return this.videoConference.booleanValue();
    }

    public boolean hasVideoConference() {
        return this.videoConference != null;
    }

    private ScenarioInfoType[] scenarios;

    /**
    * The bound scenarios.
    */
    public ScenarioInfoType[] getScenarios() {
        return this.scenarios;
    }

    public boolean hasScenarios() {
        return this.scenarios != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The rule editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

}