package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class DelScenarioRequest implements Alignable {
    private MultiArgument<Long> scenarioId;

    @RequestField(name="scenario_id")
    /**
    * The scenario ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getScenarioId() {
        return this.scenarioId;
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    /**
    * The scenario ID list separated by the ';' symbol or the 'all' value.
    */
    public DelScenarioRequest setScenarioId(MultiArgument<Long> d) {
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
    public DelScenarioRequest setScenarioName(MultiArgument<String> d) {
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