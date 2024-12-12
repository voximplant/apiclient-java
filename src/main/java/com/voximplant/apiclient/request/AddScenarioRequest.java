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

public class AddScenarioRequest implements Alignable {
    private String scenarioName;

    @RequestField(name="scenario_name")
    /**
    * The scenario name. The length must be less than 30
    */
    public String getScenarioName() {
        return this.scenarioName;
    }

    public boolean hasScenarioName() {
        return this.scenarioName != null;
    }

    /**
    * The scenario name. The length must be less than 30
    */
    public AddScenarioRequest setScenarioName(String d) {
        this.scenarioName = d;
        return this;
    }

    private String scenarioScript;

    @RequestField(name="scenario_script")
    /**
    * The scenario text. Use the application/x-www-form-urlencoded content
    * type with UTF-8 encoding. The length must be less than 128 KB
    */
    public String getScenarioScript() {
        return this.scenarioScript;
    }

    public boolean hasScenarioScript() {
        return this.scenarioScript != null;
    }

    /**
    * The scenario text. Use the application/x-www-form-urlencoded content
    * type with UTF-8 encoding. The length must be less than 128 KB
    */
    public AddScenarioRequest setScenarioScript(String d) {
        this.scenarioScript = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID. The new scenario binds to the specified rule. Please
    * note, if you do not bind the scenario to any rule, you cannot execute
    * the scenario
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID. The new scenario binds to the specified rule. Please
    * note, if you do not bind the scenario to any rule, you cannot execute
    * the scenario
    */
    public AddScenarioRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name that can be used instead of <b>rule_id</b>
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name that can be used instead of <b>rule_id</b>
    */
    public AddScenarioRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private Boolean rewrite;

    @RequestField(name="rewrite")
    /**
    * Whether to rewrite the existing scenario
    */
    public Boolean getRewrite() {
        return this.rewrite;
    }

    public boolean hasRewrite() {
        return this.rewrite != null;
    }

    /**
    * Whether to rewrite the existing scenario
    */
    public AddScenarioRequest setRewrite(boolean d) {
        this.rewrite = Boolean.valueOf(d);
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * ID of the application to bind the scenario to
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * ID of the application to bind the scenario to
    */
    public AddScenarioRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Name of the application to bind the scenario to
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Name of the application to bind the scenario to
    */
    public AddScenarioRequest setApplicationName(String d) {
        this.applicationName = d;
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
        if (scenarioName != null) {
            sb.append(aligned)
                .append("\"scenarioName\": \"")
                .append(scenarioName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (scenarioScript != null) {
            sb.append(aligned)
                .append("\"scenarioScript\": \"")
                .append(scenarioScript)
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
        if (rewrite != null) {
            sb.append(aligned)
                .append("\"rewrite\": \"")
                .append(rewrite)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}