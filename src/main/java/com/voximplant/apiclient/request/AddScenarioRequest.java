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

public class AddScenarioRequest {
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
    * The scenario text. The length must be less than 128 KB.
    */
    public String getScenarioScript() {
        return this.scenarioScript;
    }

    public boolean hasScenarioScript() {
        return this.scenarioScript != null;
    }

    /**
    * The scenario text. The length must be less than 128 KB.
    */
    public AddScenarioRequest setScenarioScript(String d) {
        this.scenarioScript = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID.
    */
    public long getRuleId() {
        return this.ruleId.longValue();
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID.
    */
    public AddScenarioRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name that can be used instead of <b>rule_id</b>.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name that can be used instead of <b>rule_id</b>.
    */
    public AddScenarioRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private Boolean rewrite;

    @RequestField(name="rewrite")
    /**
    * Is the existing scenario rewrite?
    */
    public boolean getRewrite() {
        return this.rewrite.booleanValue();
    }

    public boolean hasRewrite() {
        return this.rewrite != null;
    }

    /**
    * Is the existing scenario rewrite?
    */
    public AddScenarioRequest setRewrite(boolean d) {
        this.rewrite = Boolean.valueOf(d);
        return this;
    }

}