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
* The [GetSmartQueueRealtimeMetrics] function result.
*/
public class SmartQueueMetricsResult implements Alignable {

    private String reportType;

    /**
    * The report type(s). Possible values are calls_blocked_percentage,
    * count_blocked_calls, average_abandonment_rate,
    * count_abandonment_calls, service_level, occupancy_rate,
    * sum_agents_online_time, sum_agents_ready_time,
    * sum_agents_dialing_time, sum_agents_in_service_time,
    * sum_agents_afterservice_time, sum_agents_dnd_time,
    * sum_agents_banned_time, min_time_in_queue,max_time_in_queue,
    * average_time_in_queue, min_answer_speed, max_answer_speed,
    * average_answer_speed, min_handle_time, max_handle_time,
    * average_handle_time, count_handled_calls, min_after_call_worktime,
    * max_after_call_worktime, average_after_call_worktime,
    * sum_agents_custom_1_time ... sum_agents_custom_10_time,
    * call_count_assigned_to_queue, im_count_assigned_to_queue
    */
    public String getReportType() {
        return this.reportType;
    }

    public boolean hasReportType() {
        return this.reportType != null;
    }

    private SmartQueueMetricsGroups[] groups;

    /**
    * Grouping by agent or queue
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