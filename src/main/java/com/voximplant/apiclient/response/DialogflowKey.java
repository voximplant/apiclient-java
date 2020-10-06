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
* The [Dialogflow](/docs/references/httpapi/dialogflowcredentials)
* key's content
*/
public class DialogflowKey implements Alignable {

    private String projectId;

    /**
    * The project ID from Json Web Key.
    */
    public String getProjectId() {
        return this.projectId;
    }

    public boolean hasProjectId() {
        return this.projectId != null;
    }

    private String jsonFile;

    /**
    * The content of json file encoded with BASE64
    */
    public String getJsonFile() {
        return this.jsonFile;
    }

    public boolean hasJsonFile() {
        return this.jsonFile != null;
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
        if (projectId != null) {
            sb.append(aligned)
                .append("\"projectId\": \"")
                .append(projectId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (jsonFile != null) {
            sb.append(aligned)
                .append("\"jsonFile\": \"")
                .append(jsonFile)
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