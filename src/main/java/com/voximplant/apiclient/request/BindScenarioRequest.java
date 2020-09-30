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

public class BindScenarioRequest {
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
    public BindScenarioRequest setScenarioId(MultiArgument<Long> d) {
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
    public BindScenarioRequest setScenarioName(MultiArgument<String> d) {
        this.scenarioName = d;
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
    public BindScenarioRequest setRuleId(long d) {
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
    public BindScenarioRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

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
    public BindScenarioRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public BindScenarioRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Boolean bind;

    @RequestField(name="bind")
    /**
    * Bind or unbind?
    */
    public boolean getBind() {
        return this.bind.booleanValue();
    }

    public boolean hasBind() {
        return this.bind != null;
    }

    /**
    * Bind or unbind?
    */
    public BindScenarioRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
        return this;
    }

}