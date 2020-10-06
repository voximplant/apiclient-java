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
* The part of the [A2PSendSms] function result.
*/
public class FailedSms implements Alignable {

    private String destinationNumber;

    /**
    * The SMS destination number.
    */
    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    private String errorDescription;

    /**
    * The error description.
    */
    public String getErrorDescription() {
        return this.errorDescription;
    }

    public boolean hasErrorDescription() {
        return this.errorDescription != null;
    }

    private Long errorCode;

    /**
    * The error code.
    */
    public Long getErrorCode() {
        return this.errorCode;
    }

    public boolean hasErrorCode() {
        return this.errorCode != null;
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
        if (destinationNumber != null) {
            sb.append(aligned)
                .append("\"destinationNumber\": \"")
                .append(destinationNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (errorDescription != null) {
            sb.append(aligned)
                .append("\"errorDescription\": \"")
                .append(errorDescription)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (errorCode != null) {
            sb.append(aligned)
                .append("\"errorCode\": \"")
                .append(errorCode)
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