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

public class GetScenariosRequest implements Alignable {
    private Long scenarioId;

    @RequestField(name="scenario_id")
    /**
    * The scenario ID to filter
    */
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    /**
    * The scenario ID to filter
    */
    public GetScenariosRequest setScenarioId(long d) {
        this.scenarioId = Long.valueOf(d);
        return this;
    }

    private String scenarioName;

    @RequestField(name="scenario_name")
    /**
    * The scenario name to filter. Can be used instead of
    * <b>scenario_id</b>. All scenarios containing this param in their
    * names are returned. The parameter is case insensitive
    */
    public String getScenarioName() {
        return this.scenarioName;
    }

    public boolean hasScenarioName() {
        return this.scenarioName != null;
    }

    /**
    * The scenario name to filter. Can be used instead of
    * <b>scenario_id</b>. All scenarios containing this param in their
    * names are returned. The parameter is case insensitive
    */
    public GetScenariosRequest setScenarioName(String d) {
        this.scenarioName = d;
        return this;
    }

    private Boolean withScript;

    @RequestField(name="with_script")
    /**
    * Whether to get the scenario text. You must specify the 'scenario_id'
    * too!
    */
    public Boolean getWithScript() {
        return this.withScript;
    }

    public boolean hasWithScript() {
        return this.withScript != null;
    }

    /**
    * Whether to get the scenario text. You must specify the 'scenario_id'
    * too!
    */
    public GetScenariosRequest setWithScript(boolean d) {
        this.withScript = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetScenariosRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetScenariosRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * ID of the scenario's application
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * ID of the scenario's application
    */
    public GetScenariosRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Name of the scenario's application
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Name of the scenario's application
    */
    public GetScenariosRequest setApplicationName(String d) {
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
        if (withScript != null) {
            sb.append(aligned)
                .append("\"withScript\": \"")
                .append(withScript)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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