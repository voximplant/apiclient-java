package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetACDHistoryRequest {
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
    * The ACD session history ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getAcdSessionHistoryId() {
        return this.acdSessionHistoryId;
    }

    public boolean hasAcdSessionHistoryId() {
        return this.acdSessionHistoryId != null;
    }

    /**
    * The ACD session history ID list separated by the ';' symbol.
    */
    public GetACDHistoryRequest setAcdSessionHistoryId(MultiArgument<Long> d) {
        this.acdSessionHistoryId = d;
        return this;
    }

    private MultiArgument<String> acdRequestId;

    @RequestField(name="acd_request_id")
    /**
    * The ACD request ID list separated by the ';' symbol.
    */
    public MultiArgument<String> getAcdRequestId() {
        return this.acdRequestId;
    }

    public boolean hasAcdRequestId() {
        return this.acdRequestId != null;
    }

    /**
    * The ACD request ID list separated by the ';' symbol.
    */
    public GetACDHistoryRequest setAcdRequestId(MultiArgument<String> d) {
        this.acdRequestId = d;
        return this;
    }

    private MultiArgument<Long> acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID list to filter separated by the ';' symbol.
    */
    public MultiArgument<Long> getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID list to filter separated by the ';' symbol.
    */
    public GetACDHistoryRequest setAcdQueueId(MultiArgument<Long> d) {
        this.acdQueueId = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list to filter separated by the ';' symbol.
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list to filter separated by the ';' symbol.
    */
    public GetACDHistoryRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private Boolean operatorHangup;

    @RequestField(name="operator_hangup")
    /**
    * Set true to get the calls terminated by the operator.
    */
    public boolean getOperatorHangup() {
        return this.operatorHangup.booleanValue();
    }

    public boolean hasOperatorHangup() {
        return this.operatorHangup != null;
    }

    /**
    * Set true to get the calls terminated by the operator.
    */
    public GetACDHistoryRequest setOperatorHangup(boolean d) {
        this.operatorHangup = Boolean.valueOf(d);
        return this;
    }

    private Boolean unserviced;

    @RequestField(name="unserviced")
    /**
    * The unserviced calls by the operator.
    */
    public boolean getUnserviced() {
        return this.unserviced.booleanValue();
    }

    public boolean hasUnserviced() {
        return this.unserviced != null;
    }

    /**
    * The unserviced calls by the operator.
    */
    public GetACDHistoryRequest setUnserviced(boolean d) {
        this.unserviced = Boolean.valueOf(d);
        return this;
    }

    private Long minWaitingTime;

    @RequestField(name="min_waiting_time")
    /**
    * The min waiting time filter.
    */
    public long getMinWaitingTime() {
        return this.minWaitingTime.longValue();
    }

    public boolean hasMinWaitingTime() {
        return this.minWaitingTime != null;
    }

    /**
    * The min waiting time filter.
    */
    public GetACDHistoryRequest setMinWaitingTime(long d) {
        this.minWaitingTime = Long.valueOf(d);
        return this;
    }

    private Boolean rejected;

    @RequestField(name="rejected")
    /**
    * The rejected calls by the 'max_queue_size', 'max_waiting_time'
    * threshold.
    */
    public boolean getRejected() {
        return this.rejected.booleanValue();
    }

    public boolean hasRejected() {
        return this.rejected != null;
    }

    /**
    * The rejected calls by the 'max_queue_size', 'max_waiting_time'
    * threshold.
    */
    public GetACDHistoryRequest setRejected(boolean d) {
        this.rejected = Boolean.valueOf(d);
        return this;
    }

    private Boolean withEvents;

    @RequestField(name="with_events")
    /**
    * Set true to get the bound events.
    */
    public boolean getWithEvents() {
        return this.withEvents.booleanValue();
    }

    public boolean hasWithEvents() {
        return this.withEvents != null;
    }

    /**
    * Set true to get the bound events.
    */
    public GetACDHistoryRequest setWithEvents(boolean d) {
        this.withEvents = Boolean.valueOf(d);
        return this;
    }

    private Boolean withHeader;

    @RequestField(name="with_header")
    /**
    * Set false to get a CSV file without the column names if the output=csv
    */
    public boolean getWithHeader() {
        return this.withHeader.booleanValue();
    }

    public boolean hasWithHeader() {
        return this.withHeader != null;
    }

    /**
    * Set false to get a CSV file without the column names if the output=csv
    */
    public GetACDHistoryRequest setWithHeader(boolean d) {
        this.withHeader = Boolean.valueOf(d);
        return this;
    }

    private Boolean descOrder;

    @RequestField(name="desc_order")
    /**
    * Set true to get records in the descent order.
    */
    public boolean getDescOrder() {
        return this.descOrder.booleanValue();
    }

    public boolean hasDescOrder() {
        return this.descOrder != null;
    }

    /**
    * Set true to get records in the descent order.
    */
    public GetACDHistoryRequest setDescOrder(boolean d) {
        this.descOrder = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetACDHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
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

}