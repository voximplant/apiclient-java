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

public class DelCallerIDRequest implements Alignable {
    private Long calleridId;

    @RequestField(name="callerid_id")
    /**
    * The id of the callerID object
    */
    public Long getCalleridId() {
        return this.calleridId;
    }

    public boolean hasCalleridId() {
        return this.calleridId != null;
    }

    /**
    * The id of the callerID object
    */
    public DelCallerIDRequest setCalleridId(long d) {
        this.calleridId = Long.valueOf(d);
        return this;
    }

    private String calleridNumber;

    @RequestField(name="callerid_number")
    /**
    * The callerID number that can be used instead of <b>callerid_id</b>
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    /**
    * The callerID number that can be used instead of <b>callerid_id</b>
    */
    public DelCallerIDRequest setCalleridNumber(String d) {
        this.calleridNumber = d;
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
        if (calleridId != null) {
            sb.append(aligned)
                .append("\"calleridId\": \"")
                .append(calleridId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (calleridNumber != null) {
            sb.append(aligned)
                .append("\"calleridNumber\": \"")
                .append(calleridNumber)
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