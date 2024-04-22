package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
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

public class BindDialogflowKeysRequest implements Alignable {
    private Long dialogflowKeyId;

    @RequestField(name="dialogflow_key_id")
    /**
    * The Dialogflow key's ID 
    */
    public Long getDialogflowKeyId() {
        return this.dialogflowKeyId;
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
    * The application ID list separated by semicolons (;). Use the 'all'
    * value to select all applications
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID list separated by semicolons (;). Use the 'all'
    * value to select all applications
    */
    public BindDialogflowKeysRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private Boolean bind;

    @RequestField(name="bind")
    /**
    * Whether to bind or unbind (set true or false respectively)
    */
    public Boolean getBind() {
        return this.bind;
    }

    public boolean hasBind() {
        return this.bind != null;
    }

    /**
    * Whether to bind or unbind (set true or false respectively)
    */
    public BindDialogflowKeysRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
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
        if (dialogflowKeyId != null) {
            sb.append(aligned)
                .append("\"dialogflowKeyId\": \"")
                .append(dialogflowKeyId)
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
        if (bind != null) {
            sb.append(aligned)
                .append("\"bind\": \"")
                .append(bind)
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