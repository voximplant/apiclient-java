package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details.
*/
public class ExpiringCallerIDCallback {

    private String[] callerids;

    /**
    * The list of expiring Caller IDs.
    */
    public String[] getCallerids() {
        return this.callerids;
    }

    public boolean hasCallerids() {
        return this.callerids != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date expirationDate;

    /**
    * The Caller IDs expiration date in YYYY-MM-DD format.
    */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null;
    }

}