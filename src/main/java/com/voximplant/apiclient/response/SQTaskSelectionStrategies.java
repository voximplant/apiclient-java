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
* Task selection strategies for the [SQ_AddQueue] and [SQ_SetQueueInfo]
* functions.
*/
public class SQTaskSelectionStrategies implements Alignable {

    private String MAXPRIORITY;

    /**
    * Calls or messages with the highest priority are the first to
    * distribute to agents
    */
    public String getMAXPRIORITY() {
        return this.MAXPRIORITY;
    }

    public boolean hasMAXPRIORITY() {
        return this.MAXPRIORITY != null;
    }

    private String MAXWAITINGTIME;

    /**
    * Calls or messages with the longest waiting time are the first to
    * distribute to agents
    */
    public String getMAXWAITINGTIME() {
        return this.MAXWAITINGTIME;
    }

    public boolean hasMAXWAITINGTIME() {
        return this.MAXWAITINGTIME != null;
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
        if (MAXPRIORITY != null) {
            sb.append(aligned)
                .append("\"MAXPRIORITY\": \"")
                .append(MAXPRIORITY)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (MAXWAITINGTIME != null) {
            sb.append(aligned)
                .append("\"MAXWAITINGTIME\": \"")
                .append(MAXWAITINGTIME)
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