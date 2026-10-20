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

public class GetCallListsRequest implements Alignable {
    private MultiArgument<Long> listId;

    @RequestField(name="list_id")
    /**
    * The list ID to filter. Can be a list separated by semicolons (;). Use
    * the 'all' value to select all lists
    */
    public MultiArgument<Long> getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * The list ID to filter. Can be a list separated by semicolons (;). Use
    * the 'all' value to select all lists
    */
    public GetCallListsRequest setListId(MultiArgument<Long> d) {
        this.listId = d;
        return this;
    }

    private String name;

    @RequestField(name="name")
    /**
    * Find call lists by name
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

    /**
    * Find call lists by name
    */
    public GetCallListsRequest setName(String d) {
        this.name = d;
        return this;
    }

    private Boolean isActive;

    @RequestField(name="is_active")
    /**
    * Whether to find only active call lists
    */
    public Boolean getIsActive() {
        return this.isActive;
    }

    public boolean hasIsActive() {
        return this.isActive != null;
    }

    /**
    * Whether to find only active call lists
    */
    public GetCallListsRequest setIsActive(boolean d) {
        this.isActive = Boolean.valueOf(d);
        return this;
    }

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
    public GetCallListsRequest setFromDate(Date d) {
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
    public GetCallListsRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private String typeList;

    @RequestField(name="type_list")
    /**
    * The type of the call list. The possible values are AUTOMATIC and
    * MANUAL
    */
    public String getTypeList() {
        return this.typeList;
    }

    public boolean hasTypeList() {
        return this.typeList != null;
    }

    /**
    * The type of the call list. The possible values are AUTOMATIC and
    * MANUAL
    */
    public GetCallListsRequest setTypeList(String d) {
        this.typeList = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The maximum returning record count. The maximum value is 1000
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The maximum returning record count. The maximum value is 1000
    */
    public GetCallListsRequest setCount(long d) {
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
    public GetCallListsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private MultiArgument<Long> applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID to filter. Can be a list separated by semicolons
    * (;). Use the 'all' value to select all applications. Can be used
    * instead of the <b>application_name</b> parameter
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID to filter. Can be a list separated by semicolons
    * (;). Use the 'all' value to select all applications. Can be used
    * instead of the <b>application_name</b> parameter
    */
    public GetCallListsRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private MultiArgument<String> applicationName;

    @RequestField(name="application_name")
    /**
    * The application name list separated by semicolons (;). Can be used
    * instead of the <b>application_id</b> parameter
    */
    public MultiArgument<String> getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name list separated by semicolons (;). Can be used
    * instead of the <b>application_id</b> parameter
    */
    public GetCallListsRequest setApplicationName(MultiArgument<String> d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID to filter. Can be a list separated by semicolons (;). Use
    * the 'all' value to select all rules. Can be used instead of the
    * <b>rule_name</b> parameter
    */
    public MultiArgument<Long> getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID to filter. Can be a list separated by semicolons (;). Use
    * the 'all' value to select all rules. Can be used instead of the
    * <b>rule_name</b> parameter
    */
    public GetCallListsRequest setRuleId(MultiArgument<Long> d) {
        this.ruleId = d;
        return this;
    }

    private MultiArgument<String> ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name list separated by semicolons (;). Can be used instead
    * of the <b>rule_id</b> parameter
    */
    public MultiArgument<String> getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name list separated by semicolons (;). Can be used instead
    * of the <b>rule_id</b> parameter
    */
    public GetCallListsRequest setRuleName(MultiArgument<String> d) {
        this.ruleName = d;
        return this;
    }

    private String status;

    @RequestField(name="status")
    /**
    * The call list status to filter. The possible values are: In progress,
    * Canceled, Completed, Suspended
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    /**
    * The call list status to filter. The possible values are: In progress,
    * Canceled, Completed, Suspended
    */
    public GetCallListsRequest setStatus(String d) {
        this.status = d;
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
        if (listId != null) {
            sb.append(aligned)
                .append("\"listId\": \"")
                .append(listId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (name != null) {
            sb.append(aligned)
                .append("\"name\": \"")
                .append(name)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isActive != null) {
            sb.append(aligned)
                .append("\"isActive\": \"")
                .append(isActive)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
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
        if (typeList != null) {
            sb.append(aligned)
                .append("\"typeList\": \"")
                .append(typeList)
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
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
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
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
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