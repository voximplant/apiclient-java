package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetAuditLogRequest implements Alignable {
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
    public Boolean getWithHeader() {
        return this.withHeader;
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
    public Boolean getDescOrder() {
        return this.descOrder;
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
    public Boolean getWithTotalCount() {
        return this.withTotalCount;
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
    public Long getCount() {
        return this.count;
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
    public Long getOffset() {
        return this.offset;
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
    public Boolean getIsAsync() {
        return this.isAsync;
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
        if (timezone != null) {
            sb.append(aligned)
                .append("\"timezone\": \"")
                .append(timezone)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (auditLogId != null) {
            sb.append(aligned)
                .append("\"auditLogId\": \"")
                .append(auditLogId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (filteredAdminUserId != null) {
            sb.append(aligned)
                .append("\"filteredAdminUserId\": \"")
                .append(filteredAdminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (filteredIp != null) {
            sb.append(aligned)
                .append("\"filteredIp\": \"")
                .append(filteredIp)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (filteredCmd != null) {
            sb.append(aligned)
                .append("\"filteredCmd\": \"")
                .append(filteredCmd)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (advancedFilters != null) {
            sb.append(aligned)
                .append("\"advancedFilters\": \"")
                .append(advancedFilters)
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
        if (withTotalCount != null) {
            sb.append(aligned)
                .append("\"withTotalCount\": \"")
                .append(withTotalCount)
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
        if (isAsync != null) {
            sb.append(aligned)
                .append("\"isAsync\": \"")
                .append(isAsync)
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