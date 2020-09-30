package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [Dialogflow](/docs/references/httpapi/dialogflowcredentials)
* key's content
*/
public class DialogflowKey {

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

}