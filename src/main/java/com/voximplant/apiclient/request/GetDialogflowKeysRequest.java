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

public class GetDialogflowKeysRequest {
    private Long dialogflowKeyId;

    @RequestField(name="dialogflow_key_id")
    /**
    * The Dialogflow key's ID.
    */
    public long getDialogflowKeyId() {
        return this.dialogflowKeyId.longValue();
    }

    public boolean hasDialogflowKeyId() {
        return this.dialogflowKeyId != null;
    }

    /**
    * The Dialogflow key's ID.
    */
    public GetDialogflowKeysRequest setDialogflowKeyId(long d) {
        this.dialogflowKeyId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The name of the bound application.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The name of the bound application.
    */
    public GetDialogflowKeysRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The id of the bound application.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The id of the bound application.
    */
    public GetDialogflowKeysRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private Boolean withSecretInfo;

    @RequestField(name="with_secret_info")
    /**
    * Set true to get the json web key.
    */
    public boolean getWithSecretInfo() {
        return this.withSecretInfo.booleanValue();
    }

    public boolean hasWithSecretInfo() {
        return this.withSecretInfo != null;
    }

    /**
    * Set true to get the json web key.
    */
    public GetDialogflowKeysRequest setWithSecretInfo(boolean d) {
        this.withSecretInfo = Boolean.valueOf(d);
        return this;
    }

}