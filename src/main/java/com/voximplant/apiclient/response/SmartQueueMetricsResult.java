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
* The [GetSmartQueueRealtimeMetrics] function result.
*/
public class SmartQueueMetricsResult implements Alignable {

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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (reportType != null) {
            sb.append(aligned)
                .append("\"reportType\": \"")
                .append(reportType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (groups != null) {
            sb.append(aligned)
                .append("\"SmartQueueMetricsGroups\": ")
                .append(StringHelper.arrayToString(groups, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}