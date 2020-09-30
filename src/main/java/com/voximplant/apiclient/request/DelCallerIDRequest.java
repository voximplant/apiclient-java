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

public class DelCallerIDRequest {
    private Long calleridId;

    @RequestField(name="callerid_id")
    /**
    * The id of the callerID object.
    */
    public long getCalleridId() {
        return this.calleridId.longValue();
    }

    public boolean hasCalleridId() {
        return this.calleridId != null;
    }

    /**
    * The id of the callerID object.
    */
    public DelCallerIDRequest setCalleridId(long d) {
        this.calleridId = Long.valueOf(d);
        return this;
    }

    private String calleridNumber;

    @RequestField(name="callerid_number")
    /**
    * The callerID number that can be used instead of <b>callerid_id</b>.
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    /**
    * The callerID number that can be used instead of <b>callerid_id</b>.
    */
    public DelCallerIDRequest setCalleridNumber(String d) {
        this.calleridNumber = d;
        return this;
    }

}