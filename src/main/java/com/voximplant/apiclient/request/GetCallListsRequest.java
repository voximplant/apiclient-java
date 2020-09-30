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

public class GetCallListsRequest {
    private MultiArgument<Long> listId;

    @RequestField(name="list_id")
    /**
    * The list ID to filter. Can be a list separated by the ';' symbol or
    * the 'all' value.
    */
    public MultiArgument<Long> getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * The list ID to filter. Can be a list separated by the ';' symbol or
    * the 'all' value.
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
    * Find only active call lists
    */
    public boolean getIsActive() {
        return this.isActive.booleanValue();
    }

    public boolean hasIsActive() {
        return this.isActive != null;
    }

    /**
    * Find only active call lists
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
    * The type of the call list. The possible values are: AUTOMATIC and
    * MANUAL
    */
    public String getTypeList() {
        return this.typeList;
    }

    public boolean hasTypeList() {
        return this.typeList != null;
    }

    /**
    * The type of the call list. The possible values are: AUTOMATIC and
    * MANUAL
    */
    public GetCallListsRequest setTypeList(String d) {
        this.typeList = d;
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
    public GetCallListsRequest setCount(long d) {
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
    public GetCallListsRequest setOffset(long d) {
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
    public GetCallListsRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

}