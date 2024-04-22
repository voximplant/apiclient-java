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

public class GetACDHistoryRequest implements Alignable {
    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The UTC 'from' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * The UTC 'from' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public GetACDHistoryRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The UTC 'to' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * The UTC 'to' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public GetACDHistoryRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private MultiArgument<Long> acdSessionHistoryId;

    @RequestField(name="acd_session_history_id")
    /**
    * The ACD session history ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getAcdSessionHistoryId() {
        return this.acdSessionHistoryId;
    }

    public boolean hasAcdSessionHistoryId() {
        return this.acdSessionHistoryId != null;
    }

    /**
    * The ACD session history ID list separated by semicolons (;)
    */
    public GetACDHistoryRequest setAcdSessionHistoryId(MultiArgument<Long> d) {
        this.acdSessionHistoryId = d;
        return this;
    }

    private MultiArgument<String> acdRequestId;

    @RequestField(name="acd_request_id")
    /**
    * The ACD request ID list separated by semicolons (;)
    */
    public MultiArgument<String> getAcdRequestId() {
        return this.acdRequestId;
    }

    public boolean hasAcdRequestId() {
        return this.acdRequestId != null;
    }

    /**
    * The ACD request ID list separated by semicolons (;)
    */
    public GetACDHistoryRequest setAcdRequestId(MultiArgument<String> d) {
        this.acdRequestId = d;
        return this;
    }

    private MultiArgument<Long> acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID list to filter separated by semicolons (;)
    */
    public MultiArgument<Long> getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID list to filter separated by semicolons (;)
    */
    public GetACDHistoryRequest setAcdQueueId(MultiArgument<Long> d) {
        this.acdQueueId = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list to filter separated by semicolons (;)
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list to filter separated by semicolons (;)
    */
    public GetACDHistoryRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private Boolean operatorHangup;

    @RequestField(name="operator_hangup")
    /**
    * Whether to get the calls terminated by the operator
    */
    public Boolean getOperatorHangup() {
        return this.operatorHangup;
    }

    public boolean hasOperatorHangup() {
        return this.operatorHangup != null;
    }

    /**
    * Whether to get the calls terminated by the operator
    */
    public GetACDHistoryRequest setOperatorHangup(boolean d) {
        this.operatorHangup = Boolean.valueOf(d);
        return this;
    }

    private Boolean unserviced;

    @RequestField(name="unserviced")
    /**
    * Whether the call is unserviced by the operator
    */
    public Boolean getUnserviced() {
        return this.unserviced;
    }

    public boolean hasUnserviced() {
        return this.unserviced != null;
    }

    /**
    * Whether the call is unserviced by the operator
    */
    public GetACDHistoryRequest setUnserviced(boolean d) {
        this.unserviced = Boolean.valueOf(d);
        return this;
    }

    private Long minWaitingTime;

    @RequestField(name="min_waiting_time")
    /**
    * The min waiting time filter
    */
    public Long getMinWaitingTime() {
        return this.minWaitingTime;
    }

    public boolean hasMinWaitingTime() {
        return this.minWaitingTime != null;
    }

    /**
    * The min waiting time filter
    */
    public GetACDHistoryRequest setMinWaitingTime(long d) {
        this.minWaitingTime = Long.valueOf(d);
        return this;
    }

    private Boolean rejected;

    @RequestField(name="rejected")
    /**
    * Whether the call is rejected calls by the 'max_queue_size',
    * 'max_waiting_time' threshold
    */
    public Boolean getRejected() {
        return this.rejected;
    }

    public boolean hasRejected() {
        return this.rejected != null;
    }

    /**
    * Whether the call is rejected calls by the 'max_queue_size',
    * 'max_waiting_time' threshold
    */
    public GetACDHistoryRequest setRejected(boolean d) {
        this.rejected = Boolean.valueOf(d);
        return this;
    }

    private Boolean withEvents;

    @RequestField(name="with_events")
    /**
    * Whether to get the bound events
    */
    public Boolean getWithEvents() {
        return this.withEvents;
    }

    public boolean hasWithEvents() {
        return this.withEvents != null;
    }

    /**
    * Whether to get the bound events
    */
    public GetACDHistoryRequest setWithEvents(boolean d) {
        this.withEvents = Boolean.valueOf(d);
        return this;
    }

    private Boolean withHeader;

    @RequestField(name="with_header")
    /**
    * Whether to get a CSV file with the column names if the output=csv
    */
    public Boolean getWithHeader() {
        return this.withHeader;
    }

    public boolean hasWithHeader() {
        return this.withHeader != null;
    }

    /**
    * Whether to get a CSV file with the column names if the output=csv
    */
    public GetACDHistoryRequest setWithHeader(boolean d) {
        this.withHeader = Boolean.valueOf(d);
        return this;
    }

    private Boolean descOrder;

    @RequestField(name="desc_order")
    /**
    * Whether to get records in the descent order
    */
    public Boolean getDescOrder() {
        return this.descOrder;
    }

    public boolean hasDescOrder() {
        return this.descOrder != null;
    }

    /**
    * Whether to get records in the descent order
    */
    public GetACDHistoryRequest setDescOrder(boolean d) {
        this.descOrder = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetACDHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetACDHistoryRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The following values available: json, csv
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The following values available: json, csv
    */
    public GetACDHistoryRequest setOutput(String d) {
        this.output = d;
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
        if (acdSessionHistoryId != null) {
            sb.append(aligned)
                .append("\"acdSessionHistoryId\": \"")
                .append(acdSessionHistoryId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdRequestId != null) {
            sb.append(aligned)
                .append("\"acdRequestId\": \"")
                .append(acdRequestId)
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
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (operatorHangup != null) {
            sb.append(aligned)
                .append("\"operatorHangup\": \"")
                .append(operatorHangup)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (unserviced != null) {
            sb.append(aligned)
                .append("\"unserviced\": \"")
                .append(unserviced)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (minWaitingTime != null) {
            sb.append(aligned)
                .append("\"minWaitingTime\": \"")
                .append(minWaitingTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (rejected != null) {
            sb.append(aligned)
                .append("\"rejected\": \"")
                .append(rejected)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withEvents != null) {
            sb.append(aligned)
                .append("\"withEvents\": \"")
                .append(withEvents)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withHeader != null) {
            sb.append(aligned)
                .append("\"withHeader\": \"")
                .append(withHeader)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (descOrder != null) {
            sb.append(aligned)
                .append("\"descOrder\": \"")
                .append(descOrder)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (output != null) {
            sb.append(aligned)
                .append("\"output\": \"")
                .append(output)
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