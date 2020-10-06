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
* The [HistoryReportType] calculated_data object if the
* [HistoryReportType] history_type parameter is set to 'calls'.
*/
public class CalculatedCallHistoryDataType implements Alignable {

    private Long sessionCount;

    /**
    * The session count in the report.
    */
    public Long getSessionCount() {
        return this.sessionCount;
    }

    public boolean hasSessionCount() {
        return this.sessionCount != null;
    }

    private Long totalSessionCount;

    /**
    * The total found filtered session count.
    */
    public Long getTotalSessionCount() {
        return this.totalSessionCount;
    }

    public boolean hasTotalSessionCount() {
        return this.totalSessionCount != null;
    }

    private String timezone;

    /**
    * The selected timezone.
    */
    public String getTimezone() {
        return this.timezone;
    }

    public boolean hasTimezone() {
        return this.timezone != null;
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
        if (sessionCount != null) {
            sb.append(aligned)
                .append("\"sessionCount\": \"")
                .append(sessionCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (totalSessionCount != null) {
            sb.append(aligned)
                .append("\"totalSessionCount\": \"")
                .append(totalSessionCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (timezone != null) {
            sb.append(aligned)
                .append("\"timezone\": \"")
                .append(timezone)
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