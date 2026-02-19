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

public class CancelCallListBatchRequest implements Alignable {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * Call list ID
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * Call list ID
    */
    public CancelCallListBatchRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

    private String listName;

    @RequestField(name="list_name")
    /**
    * The unique name of the call list. Can be used instead of
    * <b>list_id</b>
    */
    public String getListName() {
        return this.listName;
    }

    public boolean hasListName() {
        return this.listName != null;
    }

    /**
    * The unique name of the call list. Can be used instead of
    * <b>list_id</b>
    */
    public CancelCallListBatchRequest setListName(String d) {
        this.listName = d;
        return this;
    }

    private String batchIds;

    @RequestField(name="batch_ids")
    /**
    * Batch UUIDs of the tasks to cancel, separated by semicolon (;)
    */
    public String getBatchIds() {
        return this.batchIds;
    }

    public boolean hasBatchIds() {
        return this.batchIds != null;
    }

    /**
    * Batch UUIDs of the tasks to cancel, separated by semicolon (;)
    */
    public CancelCallListBatchRequest setBatchIds(String d) {
        this.batchIds = d;
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
        if (listName != null) {
            sb.append(aligned)
                .append("\"listName\": \"")
                .append(listName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (batchIds != null) {
            sb.append(aligned)
                .append("\"batchIds\": \"")
                .append(batchIds)
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