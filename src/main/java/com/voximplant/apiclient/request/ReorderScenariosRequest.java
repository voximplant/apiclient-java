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

public class ReorderScenariosRequest {
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
    public ReorderScenariosRequest setRuleId(long d) {
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
    public ReorderScenariosRequest setRuleName(String d) {
        this.ruleName = d;
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
    public ReorderScenariosRequest setScenarioId(MultiArgument<Long> d) {
        this.scenarioId = d;
        return this;
    }

}