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

public class AddCallerIDRequest implements Alignable {
    private String calleridNumber;

    @RequestField(name="callerid_number")
    /**
    * The callerID number in E.164 format
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    /**
    * The callerID number in E.164 format
    */
    public AddCallerIDRequest setCalleridNumber(String d) {
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