package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The details of the [InboundSmsCallback].
*/
public class InboundSmsCallbackItem implements Alignable {

    private String sourceNumber;

    /**
    * The source phone number
    */
    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private String destinationNumber;

    /**
    * The destination phone number
    */
    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    private String smsBody;

    /**
    * The message
    */
    public String getSmsBody() {
        return this.smsBody;
    }

    public boolean hasSmsBody() {
        return this.smsBody != null;
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
        if (sourceNumber != null) {
            sb.append(aligned)
                .append("\"sourceNumber\": \"")
                .append(sourceNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (destinationNumber != null) {
            sb.append(aligned)
                .append("\"destinationNumber\": \"")
                .append(destinationNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (smsBody != null) {
            sb.append(aligned)
                .append("\"smsBody\": \"")
                .append(smsBody)
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