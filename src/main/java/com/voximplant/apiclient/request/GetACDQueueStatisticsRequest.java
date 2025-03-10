package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class GetACDQueueStatisticsRequest implements Alignable {
    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'
    */
    public GetACDQueueStatisticsRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'
    */
    public GetACDQueueStatisticsRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private Boolean abbreviation;

    @RequestField(name="abbreviation")
    /**
    * Whether key names in returned JSON are abbreviated to reduce response
    * byte size. The abbreviations are: 'WT' for 'WaitingTime', 'SA' for
    * 'SpeedOfAnswer', 'AT' is for 'AbandonmentTime', 'HT' is for
    * 'HandlingTime', 'TT' is for 'TalkTime', 'ACW' is for 'AfterCallWork',
    * 'QL' is for 'QueueLength', 'TC' is for 'TotalCalls', 'AC' is for
    * 'AnsweredCalls', 'UAC' is for 'UnansweredCalls', 'RC' is for
    * 'RejectedCalls', 'SL' is for 'ServiceLevel', 'TWT' is for
    * 'TotalWaitingTime', 'TST' is for 'TotalSubmissionTime', 'TAT' is for
    * 'TotalAbandonmentTime', 'THT' is for 'TotalHandlingTime', 'TTT' is
    * for 'TotalTalkTime', 'TACW' is for 'TotalAfterCallWork'
    */
    public Boolean getAbbreviation() {
        return this.abbreviation;
    }

    public boolean hasAbbreviation() {
        return this.abbreviation != null;
    }

    /**
    * Whether key names in returned JSON are abbreviated to reduce response
    * byte size. The abbreviations are: 'WT' for 'WaitingTime', 'SA' for
    * 'SpeedOfAnswer', 'AT' is for 'AbandonmentTime', 'HT' is for
    * 'HandlingTime', 'TT' is for 'TalkTime', 'ACW' is for 'AfterCallWork',
    * 'QL' is for 'QueueLength', 'TC' is for 'TotalCalls', 'AC' is for
    * 'AnsweredCalls', 'UAC' is for 'UnansweredCalls', 'RC' is for
    * 'RejectedCalls', 'SL' is for 'ServiceLevel', 'TWT' is for
    * 'TotalWaitingTime', 'TST' is for 'TotalSubmissionTime', 'TAT' is for
    * 'TotalAbandonmentTime', 'THT' is for 'TotalHandlingTime', 'TTT' is
    * for 'TotalTalkTime', 'TACW' is for 'TotalAfterCallWork'
    */
    public GetACDQueueStatisticsRequest setAbbreviation(boolean d) {
        this.abbreviation = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID list separated by semicolons (;). Use the 'all'
    * value to select all ACD queues
    */
    public MultiArgument<Long> getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID list separated by semicolons (;). Use the 'all'
    * value to select all ACD queues
    */
    public GetACDQueueStatisticsRequest setAcdQueueId(MultiArgument<Long> d) {
        this.acdQueueId = d;
        return this;
    }

    private MultiArgument<String> report;

    @RequestField(name="report")
    /**
    * List of item names abbreviations separated by semicolons (;).
    * Returned JSON includes keys only for the selected items. Special
    * 'all' value defines all possible items, see [ACDQueueStatisticsType]
    * for a complete list. See 'abbreviation' description for complete
    * abbreviation list
    */
    public MultiArgument<String> getReport() {
        return this.report;
    }

    public boolean hasReport() {
        return this.report != null;
    }

    /**
    * List of item names abbreviations separated by semicolons (;).
    * Returned JSON includes keys only for the selected items. Special
    * 'all' value defines all possible items, see [ACDQueueStatisticsType]
    * for a complete list. See 'abbreviation' description for complete
    * abbreviation list
    */
    public GetACDQueueStatisticsRequest setReport(MultiArgument<String> d) {
        this.report = d;
        return this;
    }

    private String aggregation;

    @RequestField(name="aggregation")
    /**
    * Specifies how records are grouped by date and time. If set to 'day',
    * the criteria is a day number. If set to 'hour_of_day', the criteria
    * is a 60-minute interval within a day. If set to 'hour', the criteria
    * is both day number and 60-minute interval within that day. If set to
    * 'none', records are not grouped by date and time
    */
    public String getAggregation() {
        return this.aggregation;
    }

    public boolean hasAggregation() {
        return this.aggregation != null;
    }

    /**
    * Specifies how records are grouped by date and time. If set to 'day',
    * the criteria is a day number. If set to 'hour_of_day', the criteria
    * is a 60-minute interval within a day. If set to 'hour', the criteria
    * is both day number and 60-minute interval within that day. If set to
    * 'none', records are not grouped by date and time
    */
    public GetACDQueueStatisticsRequest setAggregation(String d) {
        this.aggregation = d;
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
        if (abbreviation != null) {
            sb.append(aligned)
                .append("\"abbreviation\": \"")
                .append(abbreviation)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (report != null) {
            sb.append(aligned)
                .append("\"report\": \"")
                .append(report)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (aggregation != null) {
            sb.append(aligned)
                .append("\"aggregation\": \"")
                .append(aggregation)
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