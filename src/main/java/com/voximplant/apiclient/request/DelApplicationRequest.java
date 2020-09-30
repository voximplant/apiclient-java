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

public class DelApplicationRequest {
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
    public DelApplicationRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private MultiArgument<String> applicationName;

    @RequestField(name="application_name")
    /**
    * The application name list separated by the ';' symbol. Can be used
    * instead of <b>appliction_id</b>.
    */
    public MultiArgument<String> getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name list separated by the ';' symbol. Can be used
    * instead of <b>appliction_id</b>.
    */
    public DelApplicationRequest setApplicationName(MultiArgument<String> d) {
        this.applicationName = d;
        return this;
    }

}