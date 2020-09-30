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

public class AddApplicationRequest {
    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The short application name in format \[a-z\]\[a-z0-9-\]{1,64}
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The short application name in format \[a-z\]\[a-z0-9-\]{1,64}
    */
    public AddApplicationRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Boolean secureRecordStorage;

    @RequestField(name="secure_record_storage")
    /**
    * Enable secure storage for all logs and records of the application
    */
    public boolean getSecureRecordStorage() {
        return this.secureRecordStorage.booleanValue();
    }

    public boolean hasSecureRecordStorage() {
        return this.secureRecordStorage != null;
    }

    /**
    * Enable secure storage for all logs and records of the application
    */
    public AddApplicationRequest setSecureRecordStorage(boolean d) {
        this.secureRecordStorage = Boolean.valueOf(d);
        return this;
    }

}