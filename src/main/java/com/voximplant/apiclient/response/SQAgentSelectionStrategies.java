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
* Agent selection strategies for the [SQ_AddQueue] and
* [SQ_SetQueueInfo] functions.
*/
public class SQAgentSelectionStrategies implements Alignable {

    private String RANDOM;

    /**
    * Random suitable agent
    */
    public String getRANDOM() {
        return this.RANDOM;
    }

    public boolean hasRANDOM() {
        return this.RANDOM != null;
    }

    private String MOSTQUALIFIED;

    /**
    * The most qualified agent
    */
    public String getMOSTQUALIFIED() {
        return this.MOSTQUALIFIED;
    }

    public boolean hasMOSTQUALIFIED() {
        return this.MOSTQUALIFIED != null;
    }

    private String LEASTQUALIFIED;

    /**
    * The least qualified agent
    */
    public String getLEASTQUALIFIED() {
        return this.LEASTQUALIFIED;
    }

    public boolean hasLEASTQUALIFIED() {
        return this.LEASTQUALIFIED != null;
    }

    private String MINCONTIME;

    /**
    * Agent with the lowest ratio of total talk time to total work time
    */
    public String getMINCONTIME() {
        return this.MINCONTIME;
    }

    public boolean hasMINCONTIME() {
        return this.MINCONTIME != null;
    }

    private String MINCONWORKRATIO;

    /**
    * Agent who has been free the longest since the end of the last call
    */
    public String getMINCONWORKRATIO() {
        return this.MINCONWORKRATIO;
    }

    public boolean hasMINCONWORKRATIO() {
        return this.MINCONWORKRATIO != null;
    }

    private String MAXWAITINGTIME;

    /**
    * Agent who has been free the longest since the end of the last call
    */
    public String getMAXWAITINGTIME() {
        return this.MAXWAITINGTIME;
    }

    public boolean hasMAXWAITINGTIME() {
        return this.MAXWAITINGTIME != null;
    }

    private String MOSTQUALIFIEDMINCONTIME;

    /**
    * Agent with the shortest total talk time among all agents with the
    * highest skill level
    */
    public String getMOSTQUALIFIEDMINCONTIME() {
        return this.MOSTQUALIFIEDMINCONTIME;
    }

    public boolean hasMOSTQUALIFIEDMINCONTIME() {
        return this.MOSTQUALIFIEDMINCONTIME != null;
    }

    private String MOSTQUALIFIEDMAXWAITINGTIME;

    /**
    * Agent who has been free the longest since the end of the last call
    * among all agents with the highest skill level
    */
    public String getMOSTQUALIFIEDMAXWAITINGTIME() {
        return this.MOSTQUALIFIEDMAXWAITINGTIME;
    }

    public boolean hasMOSTQUALIFIEDMAXWAITINGTIME() {
        return this.MOSTQUALIFIEDMAXWAITINGTIME != null;
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
        if (RANDOM != null) {
            sb.append(aligned)
                .append("\"RANDOM\": \"")
                .append(RANDOM)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (MOSTQUALIFIED != null) {
            sb.append(aligned)
                .append("\"MOSTQUALIFIED\": \"")
                .append(MOSTQUALIFIED)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (LEASTQUALIFIED != null) {
            sb.append(aligned)
                .append("\"LEASTQUALIFIED\": \"")
                .append(LEASTQUALIFIED)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (MINCONTIME != null) {
            sb.append(aligned)
                .append("\"MINCONTIME\": \"")
                .append(MINCONTIME)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (MINCONWORKRATIO != null) {
            sb.append(aligned)
                .append("\"MINCONWORKRATIO\": \"")
                .append(MINCONWORKRATIO)
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
        if (MOSTQUALIFIEDMINCONTIME != null) {
            sb.append(aligned)
                .append("\"MOSTQUALIFIEDMINCONTIME\": \"")
                .append(MOSTQUALIFIEDMINCONTIME)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (MOSTQUALIFIEDMAXWAITINGTIME != null) {
            sb.append(aligned)
                .append("\"MOSTQUALIFIEDMAXWAITINGTIME\": \"")
                .append(MOSTQUALIFIEDMAXWAITINGTIME)
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