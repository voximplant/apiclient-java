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
* Individual service level description used in the
* [ACDQueueStatisticsType].
*/
public class ACDQueueStatisticsServiceLevelType implements Alignable {

    private Long acceptableWaitingTime;

    /**
    * Maximum time, is seconds, user is waiting operator for a given
    * service level
    */
    public Long getAcceptableWaitingTime() {
        return this.acceptableWaitingTime;
    }

    public boolean hasAcceptableWaitingTime() {
        return this.acceptableWaitingTime != null;
    }

    private Long callCount;

    /**
    * Number of calls for a given service level
    */
    public Long getCallCount() {
        return this.callCount;
    }

    public boolean hasCallCount() {
        return this.callCount != null;
    }

    private Long serviceLevel;

    /**
    * Percentage of calls for a given service level, from 0 (non-inclusive)
    * up to 1 (all calls)
    */
    public Long getServiceLevel() {
        return this.serviceLevel;
    }

    public boolean hasServiceLevel() {
        return this.serviceLevel != null;
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
        if (acceptableWaitingTime != null) {
            sb.append(aligned)
                .append("\"acceptableWaitingTime\": \"")
                .append(acceptableWaitingTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callCount != null) {
            sb.append(aligned)
                .append("\"callCount\": \"")
                .append(callCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serviceLevel != null) {
            sb.append(aligned)
                .append("\"serviceLevel\": \"")
                .append(serviceLevel)
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