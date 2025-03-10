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

public class GetAuditLogAsyncRequest implements Alignable {
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
    public GetAuditLogAsyncRequest setFromDate(Date d) {
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
    public GetAuditLogAsyncRequest setToDate(Date d) {
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
    public GetAuditLogAsyncRequest setTimezone(String d) {
        this.timezone = d;
        return this;
    }

    private MultiArgument<Long> auditLogId;

    @RequestField(name="audit_log_id")
    /**
    * The audit history ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getAuditLogId() {
        return this.auditLogId;
    }

    public boolean hasAuditLogId() {
        return this.auditLogId != null;
    }

    /**
    * The audit history ID list separated by semicolons (;)
    */
    public GetAuditLogAsyncRequest setAuditLogId(MultiArgument<Long> d) {
        this.auditLogId = d;
        return this;
    }

    private String filteredAdminUserId;

    @RequestField(name="filtered_admin_user_id")
    /**
    * The admin user ID to filter
    */
    public String getFilteredAdminUserId() {
        return this.filteredAdminUserId;
    }

    public boolean hasFilteredAdminUserId() {
        return this.filteredAdminUserId != null;
    }

    /**
    * The admin user ID to filter
    */
    public GetAuditLogAsyncRequest setFilteredAdminUserId(String d) {
        this.filteredAdminUserId = d;
        return this;
    }

    private MultiArgument<String> filteredIp;

    @RequestField(name="filtered_ip")
    /**
    * The IP list separated by semicolons (;) to filter
    */
    public MultiArgument<String> getFilteredIp() {
        return this.filteredIp;
    }

    public boolean hasFilteredIp() {
        return this.filteredIp != null;
    }

    /**
    * The IP list separated by semicolons (;) to filter
    */
    public GetAuditLogAsyncRequest setFilteredIp(MultiArgument<String> d) {
        this.filteredIp = d;
        return this;
    }

    private MultiArgument<String> filteredCmd;

    @RequestField(name="filtered_cmd")
    /**
    * The function list separated by semicolons (;) to filter
    */
    public MultiArgument<String> getFilteredCmd() {
        return this.filteredCmd;
    }

    public boolean hasFilteredCmd() {
        return this.filteredCmd != null;
    }

    /**
    * The function list separated by semicolons (;) to filter
    */
    public GetAuditLogAsyncRequest setFilteredCmd(MultiArgument<String> d) {
        this.filteredCmd = d;
        return this;
    }

    private String advancedFilters;

    @RequestField(name="advanced_filters")
    /**
    * A relation ID to filter (for example: a phone_number value, a user_id
    * value, an application_id value)
    */
    public String getAdvancedFilters() {
        return this.advancedFilters;
    }

    public boolean hasAdvancedFilters() {
        return this.advancedFilters != null;
    }

    /**
    * A relation ID to filter (for example: a phone_number value, a user_id
    * value, an application_id value)
    */
    public GetAuditLogAsyncRequest setAdvancedFilters(String d) {
        this.advancedFilters = d;
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
    public GetAuditLogAsyncRequest setDescOrder(boolean d) {
        this.descOrder = Boolean.valueOf(d);
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
    public GetAuditLogAsyncRequest setWithHeader(boolean d) {
        this.withHeader = Boolean.valueOf(d);
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The following values available: **csv**. The
    * default value is **csv**
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The following values available: **csv**. The
    * default value is **csv**
    */
    public GetAuditLogAsyncRequest setOutput(String d) {
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
        if (descOrder != null) {
            sb.append(aligned)
                .append("\"descOrder\": \"")
                .append(descOrder)
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