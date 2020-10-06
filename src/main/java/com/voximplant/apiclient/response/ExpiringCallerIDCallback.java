package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The specific account callback details.
*/
public class ExpiringCallerIDCallback implements Alignable {

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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (callerids != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(callerids, alignment + 1))
                .append(System.lineSeparator());
        }
        if (expirationDate != null) {
            sb.append(aligned)
                .append("\"expirationDate\": \"")
                .append(expirationDate)
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