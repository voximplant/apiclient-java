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
* The A2P SMS delivery status callback.
*/
public class A2PSmsDeliveryCallback implements Alignable {

    private Long id;

    /**
    * The SMS delivery ID.
    */
    public Long getId() {
        return this.id;
    }

    public boolean hasId() {
        return this.id != null;
    }

    private String sourceNumber;

    /**
    * The source number.
    */
    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private String status;

    /**
    * The SMS delivery status.
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    private String destinationNumbers;

    /**
    * The destination number(s).
    */
    public String getDestinationNumbers() {
        return this.destinationNumbers;
    }

    public boolean hasDestinationNumbers() {
        return this.destinationNumbers != null;
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
        if (id != null) {
            sb.append(aligned)
                .append("\"id\": \"")
                .append(id)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sourceNumber != null) {
            sb.append(aligned)
                .append("\"sourceNumber\": \"")
                .append(sourceNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (destinationNumbers != null) {
            sb.append(aligned)
                .append("\"destinationNumbers\": \"")
                .append(destinationNumbers)
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