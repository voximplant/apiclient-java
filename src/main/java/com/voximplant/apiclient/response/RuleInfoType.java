package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetRules] function result item.
*/
public class RuleInfoType implements Alignable {

    private Long ruleId;

    /**
    * The rule ID
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    private Long applicationId;

    /**
    * The application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private String ruleName;

    /**
    * The rule name
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    private String rulePattern;

    /**
    * The rule pattern regex
    */
    public String getRulePattern() {
        return this.rulePattern;
    }

    public boolean hasRulePattern() {
        return this.rulePattern != null;
    }

    private String rulePatternExclude;

    /**
    * The rule pattern excluding regex
    */
    public String getRulePatternExclude() {
        return this.rulePatternExclude;
    }

    public boolean hasRulePatternExclude() {
        return this.rulePatternExclude != null;
    }

    private Boolean videoConference;

    /**
    * Whether video conference is required
    */
    public Boolean getVideoConference() {
        return this.videoConference;
    }

    public boolean hasVideoConference() {
        return this.videoConference != null;
    }

    private ScenarioInfoType[] scenarios;

    /**
    * The bound scenarios
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
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
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
        if (scenarios != null) {
            sb.append(aligned)
                .append("\"ScenarioInfoType\": ")
                .append(StringHelper.arrayToString(scenarios, alignment + 1))
                .append(System.lineSeparator());
        }
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
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