package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The cloned scenario info.
*/
public class ClonedScenarioType {

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

}