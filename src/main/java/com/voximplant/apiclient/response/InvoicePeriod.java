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
* Invoices period.
*/
public class InvoicePeriod implements Alignable {

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date from;

    /**
    * From date in format: YYYY-MM-DD
    */
    public Date getFrom() {
        return this.from;
    }

    public boolean hasFrom() {
        return this.from != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date to;

    /**
    * To date in format: YYYY-MM-DD
    */
    public Date getTo() {
        return this.to;
    }

    public boolean hasTo() {
        return this.to != null;
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
        if (from != null) {
            sb.append(aligned)
                .append("\"from\": \"")
                .append(from)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (to != null) {
            sb.append(aligned)
                .append("\"to\": \"")
                .append(to)
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