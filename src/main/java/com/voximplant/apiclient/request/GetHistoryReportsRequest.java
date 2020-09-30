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

public class GetHistoryReportsRequest {
    private Long historyReportId;

    @RequestField(name="history_report_id")
    /**
    * The history report ID to filter
    */
    public long getHistoryReportId() {
        return this.historyReportId.longValue();
    }

    public boolean hasHistoryReportId() {
        return this.historyReportId != null;
    }

    /**
    * The history report ID to filter
    */
    public GetHistoryReportsRequest setHistoryReportId(long d) {
        this.historyReportId = Long.valueOf(d);
        return this;
    }

    private MultiArgument<String> historyType;

    @RequestField(name="history_type")
    /**
    * The history report type list separated by the ';' symbol or the 'all'
    * value. The following values are possible: calls, transactions, audit,
    * call_list.
    */
    public MultiArgument<String> getHistoryType() {
        return this.historyType;
    }

    public boolean hasHistoryType() {
        return this.historyType != null;
    }

    /**
    * The history report type list separated by the ';' symbol or the 'all'
    * value. The following values are possible: calls, transactions, audit,
    * call_list.
    */
    public GetHistoryReportsRequest setHistoryType(MultiArgument<String> d) {
        this.historyType = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date createdFrom;

    @RequestField(name="created_from")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The UTC creation from date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreatedFrom() {
        return this.createdFrom;
    }

    public boolean hasCreatedFrom() {
        return this.createdFrom != null;
    }

    /**
    * The UTC creation from date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public GetHistoryReportsRequest setCreatedFrom(Date d) {
        this.createdFrom = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date createdTo;

    @RequestField(name="created_to")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The UTC creation to date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreatedTo() {
        return this.createdTo;
    }

    public boolean hasCreatedTo() {
        return this.createdTo != null;
    }

    /**
    * The UTC creation to date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public GetHistoryReportsRequest setCreatedTo(Date d) {
        this.createdTo = d;
        return this;
    }

    private Boolean isCompleted;

    @RequestField(name="is_completed")
    /**
    * Is report completed?
    */
    public boolean getIsCompleted() {
        return this.isCompleted.booleanValue();
    }

    public boolean hasIsCompleted() {
        return this.isCompleted != null;
    }

    /**
    * Is report completed?
    */
    public GetHistoryReportsRequest setIsCompleted(boolean d) {
        this.isCompleted = Boolean.valueOf(d);
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
    public GetHistoryReportsRequest setDescOrder(boolean d) {
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
    public GetHistoryReportsRequest setCount(long d) {
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
    public GetHistoryReportsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private MultiArgument<Long> applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID to filter. Can be a list separated by the ';'
    * symbol or the 'all' value.
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID to filter. Can be a list separated by the ';'
    * symbol or the 'all' value.
    */
    public GetHistoryReportsRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

}