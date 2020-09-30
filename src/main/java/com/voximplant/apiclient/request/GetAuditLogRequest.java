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

public class GetAuditLogRequest {
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
    public GetAuditLogRequest setFromDate(Date d) {
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
    public GetAuditLogRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private String timezone;

    @RequestField(name="timezone")
    /**
    * The selected timezone or the 'auto' value (the account location).
    */
    public String getTimezone() {
        return this.timezone;
    }

    public boolean hasTimezone() {
        return this.timezone != null;
    }

    /**
    * The selected timezone or the 'auto' value (the account location).
    */
    public GetAuditLogRequest setTimezone(String d) {
        this.timezone = d;
        return this;
    }

    private MultiArgument<Long> auditLogId;

    @RequestField(name="audit_log_id")
    /**
    * The audit history ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getAuditLogId() {
        return this.auditLogId;
    }

    public boolean hasAuditLogId() {
        return this.auditLogId != null;
    }

    /**
    * The audit history ID list separated by the ';' symbol.
    */
    public GetAuditLogRequest setAuditLogId(MultiArgument<Long> d) {
        this.auditLogId = d;
        return this;
    }

    private String filteredAdminUserId;

    @RequestField(name="filtered_admin_user_id")
    /**
    * The admin user ID to filter.
    */
    public String getFilteredAdminUserId() {
        return this.filteredAdminUserId;
    }

    public boolean hasFilteredAdminUserId() {
        return this.filteredAdminUserId != null;
    }

    /**
    * The admin user ID to filter.
    */
    public GetAuditLogRequest setFilteredAdminUserId(String d) {
        this.filteredAdminUserId = d;
        return this;
    }

    private MultiArgument<String> filteredIp;

    @RequestField(name="filtered_ip")
    /**
    * The IP list separated by the ';' symbol to filter.
    */
    public MultiArgument<String> getFilteredIp() {
        return this.filteredIp;
    }

    public boolean hasFilteredIp() {
        return this.filteredIp != null;
    }

    /**
    * The IP list separated by the ';' symbol to filter.
    */
    public GetAuditLogRequest setFilteredIp(MultiArgument<String> d) {
        this.filteredIp = d;
        return this;
    }

    private MultiArgument<String> filteredCmd;

    @RequestField(name="filtered_cmd")
    /**
    * The function list separated by the ';' symbol to filter.
    */
    public MultiArgument<String> getFilteredCmd() {
        return this.filteredCmd;
    }

    public boolean hasFilteredCmd() {
        return this.filteredCmd != null;
    }

    /**
    * The function list separated by the ';' symbol to filter.
    */
    public GetAuditLogRequest setFilteredCmd(MultiArgument<String> d) {
        this.filteredCmd = d;
        return this;
    }

    private String advancedFilters;

    @RequestField(name="advanced_filters")
    /**
    * A relation ID to filter (for example: a phone_number value, a user_id
    * value, an application_id value).
    */
    public String getAdvancedFilters() {
        return this.advancedFilters;
    }

    public boolean hasAdvancedFilters() {
        return this.advancedFilters != null;
    }

    /**
    * A relation ID to filter (for example: a phone_number value, a user_id
    * value, an application_id value).
    */
    public GetAuditLogRequest setAdvancedFilters(String d) {
        this.advancedFilters = d;
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
    public GetAuditLogRequest setWithHeader(boolean d) {
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
    public GetAuditLogRequest setDescOrder(boolean d) {
        this.descOrder = Boolean.valueOf(d);
        return this;
    }

    private Boolean withTotalCount;

    @RequestField(name="with_total_count")
    /**
    * Set false to omit the 'total_count' and increase performance.
    */
    public boolean getWithTotalCount() {
        return this.withTotalCount.booleanValue();
    }

    public boolean hasWithTotalCount() {
        return this.withTotalCount != null;
    }

    /**
    * Set false to omit the 'total_count' and increase performance.
    */
    public GetAuditLogRequest setWithTotalCount(boolean d) {
        this.withTotalCount = Boolean.valueOf(d);
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
    public GetAuditLogRequest setCount(long d) {
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
    public GetAuditLogRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The following values available: json, csv.
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The following values available: json, csv.
    */
    public GetAuditLogRequest setOutput(String d) {
        this.output = d;
        return this;
    }

    private Boolean isAsync;

    @RequestField(name="is_async")
    /**
    * Set true to get records in the asynchronous mode (for csv output
    * only). If it's true, the request is available via [GetHistoryReports]
    * and [DownloadHistoryReport] methods.
    */
    public boolean getIsAsync() {
        return this.isAsync.booleanValue();
    }

    public boolean hasIsAsync() {
        return this.isAsync != null;
    }

    /**
    * Set true to get records in the asynchronous mode (for csv output
    * only). If it's true, the request is available via [GetHistoryReports]
    * and [DownloadHistoryReport] methods.
    */
    public GetAuditLogRequest setIsAsync(boolean d) {
        this.isAsync = Boolean.valueOf(d);
        return this;
    }

}