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

public class BindDialogflowKeysRequest {
    private Long dialogflowKeyId;

    @RequestField(name="dialogflow_key_id")
    /**
    * The Dialogflow key's ID 
    */
    public long getDialogflowKeyId() {
        return this.dialogflowKeyId.longValue();
    }

    public boolean hasDialogflowKeyId() {
        return this.dialogflowKeyId != null;
    }

    /**
    * The Dialogflow key's ID 
    */
    public BindDialogflowKeysRequest setDialogflowKeyId(long d) {
        this.dialogflowKeyId = Long.valueOf(d);
        return this;
    }

    private MultiArgument<Long> applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public BindDialogflowKeysRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private Boolean bind;

    @RequestField(name="bind")
    /**
    * Set to false to unbind. Default value is true.
    */
    public boolean getBind() {
        return this.bind.booleanValue();
    }

    public boolean hasBind() {
        return this.bind != null;
    }

    /**
    * Set to false to unbind. Default value is true.
    */
    public BindDialogflowKeysRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
        return this;
    }

}