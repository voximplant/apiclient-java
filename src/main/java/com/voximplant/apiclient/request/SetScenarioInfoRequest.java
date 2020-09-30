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

public class SetScenarioInfoRequest {
    private Long scenarioId;

    @RequestField(name="scenario_id")
    /**
    * The scenario ID.
    */
    public long getScenarioId() {
        return this.scenarioId.longValue();
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    /**
    * The scenario ID.
    */
    public SetScenarioInfoRequest setScenarioId(long d) {
        this.scenarioId = Long.valueOf(d);
        return this;
    }

    private String requiredScenarioName;

    @RequestField(name="required_scenario_name")
    /**
    * The name of the scenario to edit, can be used instead of
    * <b>scenario_id</b>.
    */
    public String getRequiredScenarioName() {
        return this.requiredScenarioName;
    }

    public boolean hasRequiredScenarioName() {
        return this.requiredScenarioName != null;
    }

    /**
    * The name of the scenario to edit, can be used instead of
    * <b>scenario_id</b>.
    */
    public SetScenarioInfoRequest setRequiredScenarioName(String d) {
        this.requiredScenarioName = d;
        return this;
    }

    private String scenarioName;

    @RequestField(name="scenario_name")
    /**
    * The new scenario name. The length must be less than 30
    */
    public String getScenarioName() {
        return this.scenarioName;
    }

    public boolean hasScenarioName() {
        return this.scenarioName != null;
    }

    /**
    * The new scenario name. The length must be less than 30
    */
    public SetScenarioInfoRequest setScenarioName(String d) {
        this.scenarioName = d;
        return this;
    }

    private String scenarioScript;

    @RequestField(name="scenario_script")
    /**
    * The new scenario text. The length must be less than 128 KB.
    */
    public String getScenarioScript() {
        return this.scenarioScript;
    }

    public boolean hasScenarioScript() {
        return this.scenarioScript != null;
    }

    /**
    * The new scenario text. The length must be less than 128 KB.
    */
    public SetScenarioInfoRequest setScenarioScript(String d) {
        this.scenarioScript = d;
        return this;
    }

}