package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class SetScenarioInfoRequest implements Alignable {
    private Long scenarioId;

    @RequestField(name="scenario_id")
    /**
    * The scenario ID
    */
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    /**
    * The scenario ID
    */
    public SetScenarioInfoRequest setScenarioId(long d) {
        this.scenarioId = Long.valueOf(d);
        return this;
    }

    private String requiredScenarioName;

    @RequestField(name="required_scenario_name")
    /**
    * The name of the scenario to edit, can be used instead of
    * <b>scenario_id</b>
    */
    public String getRequiredScenarioName() {
        return this.requiredScenarioName;
    }

    public boolean hasRequiredScenarioName() {
        return this.requiredScenarioName != null;
    }

    /**
    * The name of the scenario to edit, can be used instead of
    * <b>scenario_id</b>
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
    * The new scenario text. Use the application/x-www-form-urlencoded
    * content type with UTF-8 encoding. The length must be less than 128 KB
    */
    public String getScenarioScript() {
        return this.scenarioScript;
    }

    public boolean hasScenarioScript() {
        return this.scenarioScript != null;
    }

    /**
    * The new scenario text. Use the application/x-www-form-urlencoded
    * content type with UTF-8 encoding. The length must be less than 128 KB
    */
    public SetScenarioInfoRequest setScenarioScript(String d) {
        this.scenarioScript = d;
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
        if (scenarioId != null) {
            sb.append(aligned)
                .append("\"scenarioId\": \"")
                .append(scenarioId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (requiredScenarioName != null) {
            sb.append(aligned)
                .append("\"requiredScenarioName\": \"")
                .append(requiredScenarioName)
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
        if (scenarioScript != null) {
            sb.append(aligned)
                .append("\"scenarioScript\": \"")
                .append(scenarioScript)
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