package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetScenarios] function result.
*/
public class ScenarioInfoType implements Alignable {

    private Long scenarioId;

    /**
    * The scenario ID
    */
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public boolean hasScenarioId() {
        return this.scenarioId != null;
    }

    private String scenarioName;

    /**
    * The scenario name
    */
    public String getScenarioName() {
        return this.scenarioName;
    }

    public boolean hasScenarioName() {
        return this.scenarioName != null;
    }

    private String scenarioScript;

    /**
    * The scenario text
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
    * scenario belongs to the current account
    */
    public Boolean getParent() {
        return this.parent;
    }

    public boolean hasParent() {
        return this.parent != null;
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
        if (scenarioScript != null) {
            sb.append(aligned)
                .append("\"scenarioScript\": \"")
                .append(scenarioScript)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (parent != null) {
            sb.append(aligned)
                .append("\"parent\": \"")
                .append(parent)
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