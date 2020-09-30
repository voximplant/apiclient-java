package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class AddApplicationResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public long getResult() {
        return this.result.longValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long applicationId;

    /**
    * The application ID
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private String applicationName;

    /**
    * The full application name
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    private Boolean secureRecordStorage;

    /**
    * This flag indicates whether a secure storage for logs and records is
    * enabled or not.
    */
    public boolean getSecureRecordStorage() {
        return this.secureRecordStorage.booleanValue();
    }

    public boolean hasSecureRecordStorage() {
        return this.secureRecordStorage != null;
    }

}