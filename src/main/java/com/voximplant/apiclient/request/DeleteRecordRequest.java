package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
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

public class DeleteRecordRequest implements Alignable {
    private String recordUrl;

    @RequestField(name="record_url")
    /**
    * The record URL to remove. You can retrieve the record URL via the <a
    * href="https://voximplant.com/docs/references/httpapi/structure/callsessioninfotype#records">CallSessionInfoType.records</a>
    * method
    */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public boolean hasRecordUrl() {
        return this.recordUrl != null;
    }

    /**
    * The record URL to remove. You can retrieve the record URL via the <a
    * href="https://voximplant.com/docs/references/httpapi/structure/callsessioninfotype#records">CallSessionInfoType.records</a>
    * method
    */
    public DeleteRecordRequest setRecordUrl(String d) {
        this.recordUrl = d;
        return this;
    }

    private Long recordId;

    @RequestField(name="record_id")
    /**
    * The record ID to remove. You can retrieve the record ID via the <a
    * href="https://voximplant.com/docs/references/httpapi/structure/callsessioninfotype#records">CallSessionInfoType.records</a>
    * method
    */
    public Long getRecordId() {
        return this.recordId;
    }

    public boolean hasRecordId() {
        return this.recordId != null;
    }

    /**
    * The record ID to remove. You can retrieve the record ID via the <a
    * href="https://voximplant.com/docs/references/httpapi/structure/callsessioninfotype#records">CallSessionInfoType.records</a>
    * method
    */
    public DeleteRecordRequest setRecordId(long d) {
        this.recordId = Long.valueOf(d);
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
        if (recordUrl != null) {
            sb.append(aligned)
                .append("\"recordUrl\": \"")
                .append(recordUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (recordId != null) {
            sb.append(aligned)
                .append("\"recordId\": \"")
                .append(recordId)
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