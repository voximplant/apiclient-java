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
public class ExpiredCallerIDCallback {

    private String[] callerids;

    /**
    * The list of the expired Caller IDs.
    */
    public String[] getCallerids() {
        return this.callerids;
    }

    public boolean hasCallerids() {
        return this.callerids != null;
    }

}