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

public class GetCallHistoryRequest {
    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The from date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * The from date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public GetCallHistoryRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The to date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * The to date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public GetCallHistoryRequest setToDate(Date d) {
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
    public GetCallHistoryRequest setTimezone(String d) {
        this.timezone = d;
        return this;
    }

    private MultiArgument<Long> callSessionHistoryId;

    @RequestField(name="call_session_history_id")
    /**
    * The call session history ID list separated by the ';' symbol. The
    * sessions IDs can be accessed in JS scenario via the <b>sessionID</b>
    * property of the <a
    * href='//voximplant.com/docs/references/voxengine/appevents#started'>AppEvents.Started</a>
    * event
    */
    public MultiArgument<Long> getCallSessionHistoryId() {
        return this.callSessionHistoryId;
    }

    public boolean hasCallSessionHistoryId() {
        return this.callSessionHistoryId != null;
    }

    /**
    * The call session history ID list separated by the ';' symbol. The
    * sessions IDs can be accessed in JS scenario via the <b>sessionID</b>
    * property of the <a
    * href='//voximplant.com/docs/references/voxengine/appevents#started'>AppEvents.Started</a>
    * event
    */
    public GetCallHistoryRequest setCallSessionHistoryId(MultiArgument<Long> d) {
        this.callSessionHistoryId = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID.
    */
    public GetCallHistoryRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name, can be used instead of <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name, can be used instead of <b>application_id</b>.
    */
    public GetCallHistoryRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by the ';' symbol. If it's specified, the
    * output will contain the calls from the listed users only.
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by the ';' symbol. If it's specified, the
    * output will contain the calls from the listed users only.
    */
    public GetCallHistoryRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name to filter.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name to filter.
    */
    public GetCallHistoryRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private MultiArgument<String> remoteNumber;

    @RequestField(name="remote_number")
    /**
    * The remote number list separated by the ';' symbol.
    */
    public MultiArgument<String> getRemoteNumber() {
        return this.remoteNumber;
    }

    public boolean hasRemoteNumber() {
        return this.remoteNumber != null;
    }

    /**
    * The remote number list separated by the ';' symbol.
    */
    public GetCallHistoryRequest setRemoteNumber(MultiArgument<String> d) {
        this.remoteNumber = d;
        return this;
    }

    private MultiArgument<String> localNumber;

    @RequestField(name="local_number")
    /**
    * The local number list separated by the ';' symbol.
    */
    public MultiArgument<String> getLocalNumber() {
        return this.localNumber;
    }

    public boolean hasLocalNumber() {
        return this.localNumber != null;
    }

    /**
    * The local number list separated by the ';' symbol.
    */
    public GetCallHistoryRequest setLocalNumber(MultiArgument<String> d) {
        this.localNumber = d;
        return this;
    }

    private String callSessionHistoryCustomData;

    @RequestField(name="call_session_history_custom_data")
    /**
    * The custom_data to filter sessions.
    */
    public String getCallSessionHistoryCustomData() {
        return this.callSessionHistoryCustomData;
    }

    public boolean hasCallSessionHistoryCustomData() {
        return this.callSessionHistoryCustomData != null;
    }

    /**
    * The custom_data to filter sessions.
    */
    public GetCallHistoryRequest setCallSessionHistoryCustomData(String d) {
        this.callSessionHistoryCustomData = d;
        return this;
    }

    private Boolean withCalls;

    @RequestField(name="with_calls")
    /**
    * Set true to get the bound calls.
    */
    public boolean getWithCalls() {
        return this.withCalls.booleanValue();
    }

    public boolean hasWithCalls() {
        return this.withCalls != null;
    }

    /**
    * Set true to get the bound calls.
    */
    public GetCallHistoryRequest setWithCalls(boolean d) {
        this.withCalls = Boolean.valueOf(d);
        return this;
    }

    private Boolean withRecords;

    @RequestField(name="with_records")
    /**
    * Set true to get the bound records.
    */
    public boolean getWithRecords() {
        return this.withRecords.booleanValue();
    }

    public boolean hasWithRecords() {
        return this.withRecords != null;
    }

    /**
    * Set true to get the bound records.
    */
    public GetCallHistoryRequest setWithRecords(boolean d) {
        this.withRecords = Boolean.valueOf(d);
        return this;
    }

    private Boolean withOtherResources;

    @RequestField(name="with_other_resources")
    /**
    * Set true to get other resources usage (see [ResourceUsageType]).
    */
    public boolean getWithOtherResources() {
        return this.withOtherResources.booleanValue();
    }

    public boolean hasWithOtherResources() {
        return this.withOtherResources != null;
    }

    /**
    * Set true to get other resources usage (see [ResourceUsageType]).
    */
    public GetCallHistoryRequest setWithOtherResources(boolean d) {
        this.withOtherResources = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public GetCallHistoryRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private Boolean childrenCallsOnly;

    @RequestField(name="children_calls_only")
    /**
    * Set true to get the children account calls only.
    */
    public boolean getChildrenCallsOnly() {
        return this.childrenCallsOnly.booleanValue();
    }

    public boolean hasChildrenCallsOnly() {
        return this.childrenCallsOnly != null;
    }

    /**
    * Set true to get the children account calls only.
    */
    public GetCallHistoryRequest setChildrenCallsOnly(boolean d) {
        this.childrenCallsOnly = Boolean.valueOf(d);
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
    public GetCallHistoryRequest setWithHeader(boolean d) {
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
    public GetCallHistoryRequest setDescOrder(boolean d) {
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
    public GetCallHistoryRequest setWithTotalCount(boolean d) {
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
    public GetCallHistoryRequest setCount(long d) {
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
    public GetCallHistoryRequest setOffset(long d) {
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
    public GetCallHistoryRequest setOutput(String d) {
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
    public GetCallHistoryRequest setIsAsync(boolean d) {
        this.isAsync = Boolean.valueOf(d);
        return this;
    }

}