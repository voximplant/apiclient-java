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

public class AddCallerIDRequest {
    private String calleridNumber;

    @RequestField(name="callerid_number")
    /**
    * The callerID number in E.164 format.
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    /**
    * The callerID number in E.164 format.
    */
    public AddCallerIDRequest setCalleridNumber(String d) {
        this.calleridNumber = d;
        return this;
    }

}