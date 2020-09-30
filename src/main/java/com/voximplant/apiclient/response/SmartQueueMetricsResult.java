package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetSmartQueueRealtimeMetrics] function result.
*/
public class SmartQueueMetricsResult {

    private String reportType;

    /**
    * The report type(s).
    */
    public String getReportType() {
        return this.reportType;
    }

    public boolean hasReportType() {
        return this.reportType != null;
    }

    private SmartQueueMetricsGroups[] groups;

    /**
    * Grouping by **agent** or **queue**.
    */
    public SmartQueueMetricsGroups[] getGroups() {
        return this.groups;
    }

    public boolean hasGroups() {
        return this.groups != null;
    }

}