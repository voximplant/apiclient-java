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

public class DeleteRecordRequest {
    private String recordUrl;

    @RequestField(name="record_url")
    /**
    * Url to remove.
    */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public boolean hasRecordUrl() {
        return this.recordUrl != null;
    }

    /**
    * Url to remove.
    */
    public DeleteRecordRequest setRecordUrl(String d) {
        this.recordUrl = d;
        return this;
    }

    private Long recordId;

    @RequestField(name="record_id")
    /**
    * The record id for remove.
    */
    public long getRecordId() {
        return this.recordId.longValue();
    }

    public boolean hasRecordId() {
        return this.recordId != null;
    }

    /**
    * The record id for remove.
    */
    public DeleteRecordRequest setRecordId(long d) {
        this.recordId = Long.valueOf(d);
        return this;
    }

}