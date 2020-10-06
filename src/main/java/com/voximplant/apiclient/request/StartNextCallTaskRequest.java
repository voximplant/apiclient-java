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

public class StartNextCallTaskRequest implements Alignable {
    private MultiArgument<Long> listId;

    @RequestField(name="list_id")
    /**
    * The list of the call list IDs separated by the ';' symbol.
    */
    public MultiArgument<Long> getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * The list of the call list IDs separated by the ';' symbol.
    */
    public StartNextCallTaskRequest setListId(MultiArgument<Long> d) {
        this.listId = d;
        return this;
    }

    private String customParams;

    @RequestField(name="custom_params")
    /**
    * The custom param to pass the call initiator parameters to the
    * scenario.
    */
    public String getCustomParams() {
        return this.customParams;
    }

    public boolean hasCustomParams() {
        return this.customParams != null;
    }

    /**
    * The custom param to pass the call initiator parameters to the
    * scenario.
    */
    public StartNextCallTaskRequest setCustomParams(String d) {
        this.customParams = d;
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
        if (customParams != null) {
            sb.append(aligned)
                .append("\"customParams\": \"")
                .append(customParams)
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