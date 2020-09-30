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

public class GetScenariosRequest {
    private Long scenarioId;

    @RequestField(name="scenario_id")
    /**
    * The scenario ID to filter
    */
    public long getScenarioId() {
        return this.scenarioId.longValue();
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
    * names will be returned. The parameter is case insensitive.
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
    * names will be returned. The parameter is case insensitive.
    */
    public GetScenariosRequest setScenarioName(String d) {
        this.scenarioName = d;
        return this;
    }

    private Boolean withScript;

    @RequestField(name="with_script")
    /**
    * Set true to get the scenario text. You must specify the 'scenario_id'
    * too!
    */
    public boolean getWithScript() {
        return this.withScript.booleanValue();
    }

    public boolean hasWithScript() {
        return this.withScript != null;
    }

    /**
    * Set true to get the scenario text. You must specify the 'scenario_id'
    * too!
    */
    public GetScenariosRequest setWithScript(boolean d) {
        this.withScript = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetScenariosRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetScenariosRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}