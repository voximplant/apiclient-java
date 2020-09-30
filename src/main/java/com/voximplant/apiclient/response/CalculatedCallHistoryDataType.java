package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [HistoryReportType] calculated_data object if the
* [HistoryReportType] history_type parameter is set to 'calls'.
*/
public class CalculatedCallHistoryDataType {

    private Long sessionCount;

    /**
    * The session count in the report.
    */
    public long getSessionCount() {
        return this.sessionCount.longValue();
    }

    public boolean hasSessionCount() {
        return this.sessionCount != null;
    }

    private Long totalSessionCount;

    /**
    * The total found filtered session count.
    */
    public long getTotalSessionCount() {
        return this.totalSessionCount.longValue();
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

}