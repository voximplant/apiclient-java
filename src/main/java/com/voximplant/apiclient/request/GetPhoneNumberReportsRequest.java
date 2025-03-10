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

public class GetPhoneNumberReportsRequest implements Alignable {
    private Long reportId;

    @RequestField(name="report_id")
    /**
    * The phone number report ID to filter
    */
    public Long getReportId() {
        return this.reportId;
    }

    public boolean hasReportId() {
        return this.reportId != null;
    }

    /**
    * The phone number report ID to filter
    */
    public GetPhoneNumberReportsRequest setReportId(long d) {
        this.reportId = Long.valueOf(d);
        return this;
    }

    private MultiArgument<String> reportType;

    @RequestField(name="report_type")
    /**
    * The phone number report type list separated by semicolons (;). Use
    * the 'all' value to select all history report types. The following
    * values are possible: calls, calls_brief, transactions, audit,
    * call_list, transactions_on_hold
    */
    public MultiArgument<String> getReportType() {
        return this.reportType;
    }

    public boolean hasReportType() {
        return this.reportType != null;
    }

    /**
    * The phone number report type list separated by semicolons (;). Use
    * the 'all' value to select all history report types. The following
    * values are possible: calls, calls_brief, transactions, audit,
    * call_list, transactions_on_hold
    */
    public GetPhoneNumberReportsRequest setReportType(MultiArgument<String> d) {
        this.reportType = d;
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
    public GetPhoneNumberReportsRequest setCreatedFrom(Date d) {
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
    public GetPhoneNumberReportsRequest setCreatedTo(Date d) {
        this.createdTo = d;
        return this;
    }

    private Boolean isCompleted;

    @RequestField(name="is_completed")
    /**
    * Whether the report is completed
    */
    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public boolean hasIsCompleted() {
        return this.isCompleted != null;
    }

    /**
    * Whether the report is completed
    */
    public GetPhoneNumberReportsRequest setIsCompleted(boolean d) {
        this.isCompleted = Boolean.valueOf(d);
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
    public GetPhoneNumberReportsRequest setDescOrder(boolean d) {
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
    public GetPhoneNumberReportsRequest setCount(long d) {
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
    public GetPhoneNumberReportsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
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
        if (reportId != null) {
            sb.append(aligned)
                .append("\"reportId\": \"")
                .append(reportId)
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
        if (createdFrom != null) {
            sb.append(aligned)
                .append("\"createdFrom\": \"")
                .append(createdFrom)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (createdTo != null) {
            sb.append(aligned)
                .append("\"createdTo\": \"")
                .append(createdTo)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isCompleted != null) {
            sb.append(aligned)
                .append("\"isCompleted\": \"")
                .append(isCompleted)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}