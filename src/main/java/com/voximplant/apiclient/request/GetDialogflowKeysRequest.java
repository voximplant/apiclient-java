package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class GetDialogflowKeysRequest implements Alignable {
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
    public GetDialogflowKeysRequest setDialogflowKeyId(long d) {
        this.dialogflowKeyId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The name of the bound application
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The name of the bound application
    */
    public GetDialogflowKeysRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The id of the bound application
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The id of the bound application
    */
    public GetDialogflowKeysRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private Boolean withSecretInfo;

    @RequestField(name="with_secret_info")
    /**
    * Whether to get the json web key
    */
    public Boolean getWithSecretInfo() {
        return this.withSecretInfo;
    }

    public boolean hasWithSecretInfo() {
        return this.withSecretInfo != null;
    }

    /**
    * Whether to get the json web key
    */
    public GetDialogflowKeysRequest setWithSecretInfo(boolean d) {
        this.withSecretInfo = Boolean.valueOf(d);
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
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
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
        if (withSecretInfo != null) {
            sb.append(aligned)
                .append("\"withSecretInfo\": \"")
                .append(withSecretInfo)
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