package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetScenarios] function result.
*/
public class ScenarioInfoType {

    private Long scenarioId;

    /**
    * The scenario ID.
    */
    public long getScenarioId() {
        return this.scenarioId.longValue();
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    private String scenarioName;

    /**
    * The scenario name.
    */
    public String getScenarioName() {
        return this.scenarioName;
    }

    public boolean hasScenarioName() {
        return this.scenarioName != null;
    }

    private String scenarioScript;

    /**
    * The scenario text.
    */
    public String getScenarioScript() {
        return this.scenarioScript;
    }

    public boolean hasScenarioScript() {
        return this.scenarioScript != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The scenario editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

    private Boolean parent;

    /**
    * 'True' if the scenario belongs to the parent account, 'false' if the
    * scenario belongs to the current account.
    */
    public boolean getParent() {
        return this.parent.booleanValue();
    }

    public boolean hasParent() {
        return this.parent != null;
    }

}