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

public class GetCallHistoryRequest implements Alignable {
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
    public GetCallHistoryRequest setTimezone(String d) {
        this.timezone = d;
        return this;
    }

    private MultiArgument<Long> callSessionHistoryId;

    @RequestField(name="call_session_history_id")
    /**
    * To get the call history for the specific sessions, pass the session
    * IDs to this parameter separated by a semicolon (;). You can find the
    * session ID in the <a
    * href='/docs/references/voxengine/appevents#started'>AppEvents.Started</a>
    * event's <b>sessionID</b> property in a scenario, or retrieve it from
    * the <b>call_session_history_id</b> value returned from the <a
    * href='https://voximplant.com/docs/references/httpapi/scenarios#reorderscenarios'>StartScenarios</a>
    * or <a
    * href='https://voximplant.com/docs/references/httpapi/scenarios#startconference'>StartConference</a>
    * methods
    */
    public MultiArgument<Long> getCallSessionHistoryId() {
        return this.callSessionHistoryId;
    }

    public boolean hasCallSessionHistoryId() {
        return this.callSessionHistoryId != null;
    }

    /**
    * To get the call history for the specific sessions, pass the session
    * IDs to this parameter separated by a semicolon (;). You can find the
    * session ID in the <a
    * href='/docs/references/voxengine/appevents#started'>AppEvents.Started</a>
    * event's <b>sessionID</b> property in a scenario, or retrieve it from
    * the <b>call_session_history_id</b> value returned from the <a
    * href='https://voximplant.com/docs/references/httpapi/scenarios#reorderscenarios'>StartScenarios</a>
    * or <a
    * href='https://voximplant.com/docs/references/httpapi/scenarios#startconference'>StartConference</a>
    * methods
    */
    public GetCallHistoryRequest setCallSessionHistoryId(MultiArgument<Long> d) {
        this.callSessionHistoryId = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * To receive the call history for a specific application, pass the
    * application ID to this parameter
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * To receive the call history for a specific application, pass the
    * application ID to this parameter
    */
    public GetCallHistoryRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name, can be used instead of <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name, can be used instead of <b>application_id</b>
    */
    public GetCallHistoryRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * To receive the call history for a specific users, pass the user ID
    * list separated by semicolons (;). If it is specified, the output
    * contains the calls from the listed users only
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * To receive the call history for a specific users, pass the user ID
    * list separated by semicolons (;). If it is specified, the output
    * contains the calls from the listed users only
    */
    public GetCallHistoryRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * To receive the call history for a specific routing rule, pass the
    * rule name to this parameter. Applies only if you set application_id
    * or application_name
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * To receive the call history for a specific routing rule, pass the
    * rule name to this parameter. Applies only if you set application_id
    * or application_name
    */
    public GetCallHistoryRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private MultiArgument<String> remoteNumber;

    @RequestField(name="remote_number")
    /**
    * To receive a call history for a specific remote numbers, pass the
    * number list separated by semicolons (;). A remote number is a number
    * on the client side. Ignored if the `remote_number_list` parameter is
    * not empty
    */
    public MultiArgument<String> getRemoteNumber() {
        return this.remoteNumber;
    }

    public boolean hasRemoteNumber() {
        return this.remoteNumber != null;
    }

    /**
    * To receive a call history for a specific remote numbers, pass the
    * number list separated by semicolons (;). A remote number is a number
    * on the client side. Ignored if the `remote_number_list` parameter is
    * not empty
    */
    public GetCallHistoryRequest setRemoteNumber(MultiArgument<String> d) {
        this.remoteNumber = d;
        return this;
    }

    private Map<String, Object> remoteNumberList;

    @RequestField(name="remote_number_list")
    /**
    * A JS array of strings of specific remote phone numbers to sort the
    * call history. Has higher priority than the `remote_number` parameter.
    * If the array is empty, the `remote_number` parameter is used instead
    */
    public Map<String, Object> getRemoteNumberList() {
        return this.remoteNumberList;
    }

    public boolean hasRemoteNumberList() {
        return this.remoteNumberList != null;
    }

    /**
    * A JS array of strings of specific remote phone numbers to sort the
    * call history. Has higher priority than the `remote_number` parameter.
    * If the array is empty, the `remote_number` parameter is used instead
    */
    public GetCallHistoryRequest setRemoteNumberList(Map<String, Object> d) {
        this.remoteNumberList = d;
        return this;
    }

    private MultiArgument<String> localNumber;

    @RequestField(name="local_number")
    /**
    * To receive a call history for a specific local numbers, pass the
    * number list separated by semicolons (;). A local number is a number
    * on the platform side
    */
    public MultiArgument<String> getLocalNumber() {
        return this.localNumber;
    }

    public boolean hasLocalNumber() {
        return this.localNumber != null;
    }

    /**
    * To receive a call history for a specific local numbers, pass the
    * number list separated by semicolons (;). A local number is a number
    * on the platform side
    */
    public GetCallHistoryRequest setLocalNumber(MultiArgument<String> d) {
        this.localNumber = d;
        return this;
    }

    private String callSessionHistoryCustomData;

    @RequestField(name="call_session_history_custom_data")
    /**
    * To filter the call history by the custom_data passed to the call
    * sessions, pass the custom data to this parameter
    */
    public String getCallSessionHistoryCustomData() {
        return this.callSessionHistoryCustomData;
    }

    public boolean hasCallSessionHistoryCustomData() {
        return this.callSessionHistoryCustomData != null;
    }

    /**
    * To filter the call history by the custom_data passed to the call
    * sessions, pass the custom data to this parameter
    */
    public GetCallHistoryRequest setCallSessionHistoryCustomData(String d) {
        this.callSessionHistoryCustomData = d;
        return this;
    }

    private Boolean withCalls;

    @RequestField(name="with_calls")
    /**
    * Whether to receive a list of sessions with all calls within the
    * sessions, including phone numbers, call cost and other information
    */
    public Boolean getWithCalls() {
        return this.withCalls;
    }

    public boolean hasWithCalls() {
        return this.withCalls != null;
    }

    /**
    * Whether to receive a list of sessions with all calls within the
    * sessions, including phone numbers, call cost and other information
    */
    public GetCallHistoryRequest setWithCalls(boolean d) {
        this.withCalls = Boolean.valueOf(d);
        return this;
    }

    private Boolean withRecords;

    @RequestField(name="with_records")
    /**
    * Whether to get the calls' records
    */
    public Boolean getWithRecords() {
        return this.withRecords;
    }

    public boolean hasWithRecords() {
        return this.withRecords != null;
    }

    /**
    * Whether to get the calls' records
    */
    public GetCallHistoryRequest setWithRecords(boolean d) {
        this.withRecords = Boolean.valueOf(d);
        return this;
    }

    private Boolean withOtherResources;

    @RequestField(name="with_other_resources")
    /**
    * Whether to get other resources usage (see [ResourceUsageType])
    */
    public Boolean getWithOtherResources() {
        return this.withOtherResources;
    }

    public boolean hasWithOtherResources() {
        return this.withOtherResources != null;
    }

    /**
    * Whether to get other resources usage (see [ResourceUsageType])
    */
    public GetCallHistoryRequest setWithOtherResources(boolean d) {
        this.withOtherResources = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID list separated by semicolons (;)
    */
    public GetCallHistoryRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private Boolean childrenCallsOnly;

    @RequestField(name="children_calls_only")
    /**
    * Whether to get the children account calls only
    */
    public Boolean getChildrenCallsOnly() {
        return this.childrenCallsOnly;
    }

    public boolean hasChildrenCallsOnly() {
        return this.childrenCallsOnly != null;
    }

    /**
    * Whether to get the children account calls only
    */
    public GetCallHistoryRequest setChildrenCallsOnly(boolean d) {
        this.childrenCallsOnly = Boolean.valueOf(d);
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
    public GetCallHistoryRequest setDescOrder(boolean d) {
        this.descOrder = Boolean.valueOf(d);
        return this;
    }

    private Boolean withTotalCount;

    @RequestField(name="with_total_count")
    /**
    * Whether to include the 'total_count' and increase performance
    */
    public Boolean getWithTotalCount() {
        return this.withTotalCount;
    }

    public boolean hasWithTotalCount() {
        return this.withTotalCount != null;
    }

    /**
    * Whether to include the 'total_count' and increase performance
    */
    public GetCallHistoryRequest setWithTotalCount(boolean d) {
        this.withTotalCount = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The number of returning records. The maximum value is 1000
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The number of returning records. The maximum value is 1000
    */
    public GetCallHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The number of records to skip in the output. The maximum value of
    * 10000
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The number of records to skip in the output. The maximum value of
    * 10000
    */
    public GetCallHistoryRequest setOffset(long d) {
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
        if (callSessionHistoryId != null) {
            sb.append(aligned)
                .append("\"callSessionHistoryId\": \"")
                .append(callSessionHistoryId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
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
        if (ruleName != null) {
            sb.append(aligned)
                .append("\"ruleName\": \"")
                .append(ruleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (remoteNumber != null) {
            sb.append(aligned)
                .append("\"remoteNumber\": \"")
                .append(remoteNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (remoteNumberList != null) {
            sb.append(aligned)
                .append("\"remoteNumberList\": \"")
                .append(remoteNumberList)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localNumber != null) {
            sb.append(aligned)
                .append("\"localNumber\": \"")
                .append(localNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callSessionHistoryCustomData != null) {
            sb.append(aligned)
                .append("\"callSessionHistoryCustomData\": \"")
                .append(callSessionHistoryCustomData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withCalls != null) {
            sb.append(aligned)
                .append("\"withCalls\": \"")
                .append(withCalls)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withRecords != null) {
            sb.append(aligned)
                .append("\"withRecords\": \"")
                .append(withRecords)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withOtherResources != null) {
            sb.append(aligned)
                .append("\"withOtherResources\": \"")
                .append(withOtherResources)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childAccountId != null) {
            sb.append(aligned)
                .append("\"childAccountId\": \"")
                .append(childAccountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childrenCallsOnly != null) {
            sb.append(aligned)
                .append("\"childrenCallsOnly\": \"")
                .append(childrenCallsOnly)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}