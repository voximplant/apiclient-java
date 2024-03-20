package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetSmartQueueRealtimeMetricsRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID to search by
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID to search by
    */
    public GetSmartQueueRealtimeMetricsRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name to search by. Can be used instead of the
    * <b>application_id</b> parameter
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name to search by. Can be used instead of the
    * <b>application_id</b> parameter
    */
    public GetSmartQueueRealtimeMetricsRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list with a maximum of 5 values separated by semicolons
    * (;). Use the 'all' value to select all users. Can operate as a filter
    * for the **occupancy_rate**, **sum_agents_online_time**,
    * **sum_agents_ready_time**, **sum_agents_dialing_time**,
    * **sum_agents_in_service_time**, **sum_agents_afterservice_time**,
    * **sum_agents_dnd_time**, **sum_agents_banned_time**,
    * **min_handle_time**, **max_handle_time**, **average_handle_time**,
    * **count_handled_calls**, **min_after_call_worktime**,
    * **max_after_call_worktime**, **average_after_call_worktime** report
    * types
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list with a maximum of 5 values separated by semicolons
    * (;). Use the 'all' value to select all users. Can operate as a filter
    * for the **occupancy_rate**, **sum_agents_online_time**,
    * **sum_agents_ready_time**, **sum_agents_dialing_time**,
    * **sum_agents_in_service_time**, **sum_agents_afterservice_time**,
    * **sum_agents_dnd_time**, **sum_agents_banned_time**,
    * **min_handle_time**, **max_handle_time**, **average_handle_time**,
    * **count_handled_calls**, **min_after_call_worktime**,
    * **max_after_call_worktime**, **average_after_call_worktime** report
    * types
    */
    public GetSmartQueueRealtimeMetricsRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * The user name list separated by semicolons (;). <b>user_name</b> can
    * be used instead of <b>user_id</b>
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name list separated by semicolons (;). <b>user_name</b> can
    * be used instead of <b>user_id</b>
    */
    public GetSmartQueueRealtimeMetricsRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private MultiArgument<Long> sqQueueId;

    @RequestField(name="sq_queue_id")
    /**
    * The SmartQueue ID list with a maximum of 5 values separated by
    * semicolons (;). Can operate as filter for the
    * **calls_blocked_percentage**, **count_blocked_calls**,
    * **average_abandonment_rate**, **count_abandonment_calls**,
    * **service_level**, **occupancy_rate**, **min_time_in_queue**,
    * **max_time_in_queue**, **average_time_in_queue**,
    * **min_answer_speed**, **max_answer_speed**, **average_answer_speed**,
    * **min_handle_time**, **max_handle_time**, **average_handle_time**,
    * **count_handled_calls**, **min_after_call_worktime**,
    * **max_after_call_worktime**, **average_after_call_worktime** report
    * types
    */
    public MultiArgument<Long> getSqQueueId() {
        return this.sqQueueId;
    }

    public boolean hasSqQueueId() {
        return this.sqQueueId != null;
    }

    /**
    * The SmartQueue ID list with a maximum of 5 values separated by
    * semicolons (;). Can operate as filter for the
    * **calls_blocked_percentage**, **count_blocked_calls**,
    * **average_abandonment_rate**, **count_abandonment_calls**,
    * **service_level**, **occupancy_rate**, **min_time_in_queue**,
    * **max_time_in_queue**, **average_time_in_queue**,
    * **min_answer_speed**, **max_answer_speed**, **average_answer_speed**,
    * **min_handle_time**, **max_handle_time**, **average_handle_time**,
    * **count_handled_calls**, **min_after_call_worktime**,
    * **max_after_call_worktime**, **average_after_call_worktime** report
    * types
    */
    public GetSmartQueueRealtimeMetricsRequest setSqQueueId(MultiArgument<Long> d) {
        this.sqQueueId = d;
        return this;
    }

    private MultiArgument<String> sqQueueName;

    @RequestField(name="sq_queue_name")
    /**
    * The SmartQueue name list separated by semicolons (;). Can be used
    * instead of <b>sq_queue_id</b>
    */
    public MultiArgument<String> getSqQueueName() {
        return this.sqQueueName;
    }

    public boolean hasSqQueueName() {
        return this.sqQueueName != null;
    }

    /**
    * The SmartQueue name list separated by semicolons (;). Can be used
    * instead of <b>sq_queue_id</b>
    */
    public GetSmartQueueRealtimeMetricsRequest setSqQueueName(MultiArgument<String> d) {
        this.sqQueueName = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The from date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss. Default is the current time minus 30 minutes
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * The from date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss. Default is the current time minus 30 minutes
    */
    public GetSmartQueueRealtimeMetricsRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The to date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss. Default is the current time
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * The to date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss. Default is the current time
    */
    public GetSmartQueueRealtimeMetricsRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private String timezone;

    @RequestField(name="timezone")
    /**
    * The selected timezone or the 'auto' value (the account location)
    */
    public String getTimezone() {
        return this.timezone;
    }

    public boolean hasTimezone() {
        return this.timezone != null;
    }

    /**
    * The selected timezone or the 'auto' value (the account location)
    */
    public GetSmartQueueRealtimeMetricsRequest setTimezone(String d) {
        this.timezone = d;
        return this;
    }

    private String interval;

    @RequestField(name="interval")
    /**
    * Interval format: YYYY-MM-DD HH:mm:ss. Default is 30 minutes
    */
    public String getInterval() {
        return this.interval;
    }

    public boolean hasInterval() {
        return this.interval != null;
    }

    /**
    * Interval format: YYYY-MM-DD HH:mm:ss. Default is 30 minutes
    */
    public GetSmartQueueRealtimeMetricsRequest setInterval(String d) {
        this.interval = d;
        return this;
    }

    private MultiArgument<String> reportType;

    @RequestField(name="report_type")
    /**
    * The report type. Possible values are: calls_blocked_percentage,
    * count_blocked_calls, im_blocked_chats_percentage,
    * im_count_blocked_chats, im_answered_chats_rate,
    * average_abandonment_rate, count_abandonment_calls, service_level,
    * im_service_level, occupancy_rate, im_agent_occupancy_rate,
    * agent_utilization_rate, im_agent_utilization_rate,
    * sum_agents_online_time, sum_agents_ready_time,
    * sum_agents_dialing_time, sum_agents_in_service_time,
    * sum_agents_in_service_incoming_time,
    * sum_agents_in_service_outcoming_time, sum_agents_afterservice_time,
    * sum_agents_dnd_time, sum_agents_custom_1_time,
    * sum_agents_custom_2_time, sum_agents_custom_3_time,
    * sum_agents_custom_4_time, sum_agents_custom_5_time,
    * sum_agents_custom_6_time, sum_agents_custom_7_time,
    * sum_agents_custom_8_time, sum_agents_custom_9_time,
    * sum_agents_custom_10_time, sum_agents_banned_time,
    * im_sum_agents_online_time, im_sum_agents_ready_time,
    * im_sum_agents_in_service_time, im_sum_agents_dnd_time,
    * im_sum_agents_custom_1_time, im_sum_agents_custom_2_time,
    * im_sum_agents_custom_3_time, im_sum_agents_custom_4_time,
    * im_sum_agents_custom_5_time, im_sum_agents_custom_6_time,
    * im_sum_agents_custom_7_time, im_sum_agents_custom_8_time,
    * im_sum_agents_custom_9_time, im_sum_agents_custom_10_time,
    * im_sum_agents_banned_time, average_agents_idle_time,
    * max_agents_idle_time, min_agents_idle_time,
    * percentile_0_25_agents_idle_time, percentile_0_50_agents_idle_time,
    * percentile_0_75_agents_idle_time, min_time_in_queue,
    * max_time_in_queue, average_time_in_queue, min_answer_speed,
    * max_answer_speed, average_answer_speed, im_min_answer_speed,
    * im_max_answer_speed, im_average_answer_speed, min_handle_time,
    * max_handle_time, average_handle_time, count_handled_calls,
    * min_after_call_worktime, max_after_call_worktime,
    * average_after_call_worktime, count_agent_unanswered_calls,
    * im_count_agent_unanswered_chats, min_reaction_time,
    * max_reaction_time, average_reaction_time, im_min_reaction_time,
    * im_max_reaction_time, im_average_reaction_time,
    * im_count_abandonment_chats, im_count_lost_chats, im_lost_chats_rate
    */
    public MultiArgument<String> getReportType() {
        return this.reportType;
    }

    public boolean hasReportType() {
        return this.reportType != null;
    }

    /**
    * The report type. Possible values are: calls_blocked_percentage,
    * count_blocked_calls, im_blocked_chats_percentage,
    * im_count_blocked_chats, im_answered_chats_rate,
    * average_abandonment_rate, count_abandonment_calls, service_level,
    * im_service_level, occupancy_rate, im_agent_occupancy_rate,
    * agent_utilization_rate, im_agent_utilization_rate,
    * sum_agents_online_time, sum_agents_ready_time,
    * sum_agents_dialing_time, sum_agents_in_service_time,
    * sum_agents_in_service_incoming_time,
    * sum_agents_in_service_outcoming_time, sum_agents_afterservice_time,
    * sum_agents_dnd_time, sum_agents_custom_1_time,
    * sum_agents_custom_2_time, sum_agents_custom_3_time,
    * sum_agents_custom_4_time, sum_agents_custom_5_time,
    * sum_agents_custom_6_time, sum_agents_custom_7_time,
    * sum_agents_custom_8_time, sum_agents_custom_9_time,
    * sum_agents_custom_10_time, sum_agents_banned_time,
    * im_sum_agents_online_time, im_sum_agents_ready_time,
    * im_sum_agents_in_service_time, im_sum_agents_dnd_time,
    * im_sum_agents_custom_1_time, im_sum_agents_custom_2_time,
    * im_sum_agents_custom_3_time, im_sum_agents_custom_4_time,
    * im_sum_agents_custom_5_time, im_sum_agents_custom_6_time,
    * im_sum_agents_custom_7_time, im_sum_agents_custom_8_time,
    * im_sum_agents_custom_9_time, im_sum_agents_custom_10_time,
    * im_sum_agents_banned_time, average_agents_idle_time,
    * max_agents_idle_time, min_agents_idle_time,
    * percentile_0_25_agents_idle_time, percentile_0_50_agents_idle_time,
    * percentile_0_75_agents_idle_time, min_time_in_queue,
    * max_time_in_queue, average_time_in_queue, min_answer_speed,
    * max_answer_speed, average_answer_speed, im_min_answer_speed,
    * im_max_answer_speed, im_average_answer_speed, min_handle_time,
    * max_handle_time, average_handle_time, count_handled_calls,
    * min_after_call_worktime, max_after_call_worktime,
    * average_after_call_worktime, count_agent_unanswered_calls,
    * im_count_agent_unanswered_chats, min_reaction_time,
    * max_reaction_time, average_reaction_time, im_min_reaction_time,
    * im_max_reaction_time, im_average_reaction_time,
    * im_count_abandonment_chats, im_count_lost_chats, im_lost_chats_rate
    */
    public GetSmartQueueRealtimeMetricsRequest setReportType(MultiArgument<String> d) {
        this.reportType = d;
        return this;
    }

    private String groupBy;

    @RequestField(name="group_by")
    /**
    * Group the result by **agent** or *queue*. The **agent** grouping is
    * allowed for 1 queue and for the occupancy_rate,
    * sum_agents_online_time, sum_agents_ready_time,
    * sum_agents_dialing_time, sum_agents_in_service_time,
    * sum_agents_afterservice_time, sum_agents_dnd_time,
    * sum_agents_banned_time, min_handle_time, max_handle_time,
    * average_handle_time, count_handled_calls, min_after_call_worktime,
    * max_after_call_worktime, average_after_call_worktime report types.
    * The **queue** grouping allowed for the calls_blocked_percentage,
    * count_blocked_calls, average_abandonment_rate,
    * count_abandonment_calls, service_level, occupancy_rate,
    * min_time_in_queue, max_time_in_queue, average_time_in_queue,
    * min_answer_speed, max_answer_speed, average_answer_speed,
    * min_handle_time, max_handle_time, average_handle_time,
    * count_handled_calls, min_after_call_worktime,
    * max_after_call_worktime, average_after_call_worktime report types
    */
    public String getGroupBy() {
        return this.groupBy;
    }

    public boolean hasGroupBy() {
        return this.groupBy != null;
    }

    /**
    * Group the result by **agent** or *queue*. The **agent** grouping is
    * allowed for 1 queue and for the occupancy_rate,
    * sum_agents_online_time, sum_agents_ready_time,
    * sum_agents_dialing_time, sum_agents_in_service_time,
    * sum_agents_afterservice_time, sum_agents_dnd_time,
    * sum_agents_banned_time, min_handle_time, max_handle_time,
    * average_handle_time, count_handled_calls, min_after_call_worktime,
    * max_after_call_worktime, average_after_call_worktime report types.
    * The **queue** grouping allowed for the calls_blocked_percentage,
    * count_blocked_calls, average_abandonment_rate,
    * count_abandonment_calls, service_level, occupancy_rate,
    * min_time_in_queue, max_time_in_queue, average_time_in_queue,
    * min_answer_speed, max_answer_speed, average_answer_speed,
    * min_handle_time, max_handle_time, average_handle_time,
    * count_handled_calls, min_after_call_worktime,
    * max_after_call_worktime, average_after_call_worktime report types
    */
    public GetSmartQueueRealtimeMetricsRequest setGroupBy(String d) {
        this.groupBy = d;
        return this;
    }

    private Long maxWaitingSec;

    @RequestField(name="max_waiting_sec")
    /**
    * Maximum waiting time. Required for the **service_level** report type
    */
    public Long getMaxWaitingSec() {
        return this.maxWaitingSec;
    }

    public boolean hasMaxWaitingSec() {
        return this.maxWaitingSec != null;
    }

    /**
    * Maximum waiting time. Required for the **service_level** report type
    */
    public GetSmartQueueRealtimeMetricsRequest setMaxWaitingSec(long d) {
        this.maxWaitingSec = Long.valueOf(d);
        return this;
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
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sqQueueId != null) {
            sb.append(aligned)
                .append("\"sqQueueId\": \"")
                .append(sqQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sqQueueName != null) {
            sb.append(aligned)
                .append("\"sqQueueName\": \"")
                .append(sqQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fromDate != null) {
            sb.append(aligned)
                .append("\"fromDate\": \"")
                .append(fromDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (toDate != null) {
            sb.append(aligned)
                .append("\"toDate\": \"")
                .append(toDate)
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
        if (interval != null) {
            sb.append(aligned)
                .append("\"interval\": \"")
                .append(interval)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (reportType != null) {
            sb.append(aligned)
                .append("\"reportType\": \"")
                .append(reportType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (groupBy != null) {
            sb.append(aligned)
                .append("\"groupBy\": \"")
                .append(groupBy)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxWaitingSec != null) {
            sb.append(aligned)
                .append("\"maxWaitingSec\": \"")
                .append(maxWaitingSec)
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