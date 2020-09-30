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

public class AddDialogflowKeyRequest {
    private String applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID.
    */
    public String getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID.
    */
    public AddDialogflowKeyRequest setApplicationId(String d) {
        this.applicationId = d;
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name. Can be used instead of <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name. Can be used instead of <b>application_id</b>.
    */
    public AddDialogflowKeyRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String jsonCredentials;

    @RequestField(name="json_credentials")
    /**
    * Dialogflow credentials, provided by JWK (Json web key).
    */
    public String getJsonCredentials() {
        return this.jsonCredentials;
    }

    public boolean hasJsonCredentials() {
        return this.jsonCredentials != null;
    }

    /**
    * Dialogflow credentials, provided by JWK (Json web key).
    */
    public AddDialogflowKeyRequest setJsonCredentials(String d) {
        this.jsonCredentials = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * The Dialogflow keys's description.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * The Dialogflow keys's description.
    */
    public AddDialogflowKeyRequest setDescription(String d) {
        this.description = d;
        return this;
    }

}