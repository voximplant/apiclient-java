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

public class SQ_DeleteAgentCustomStatusMappingRequest implements Alignable {
    private String sqStatusName;

    @RequestField(name="sq_status_name")
    /**
    * Status name
    */
    public String getSqStatusName() {
        return this.sqStatusName;
    }

    public boolean hasSqStatusName() {
        return this.sqStatusName != null;
    }

    /**
    * Status name
    */
    public SQ_DeleteAgentCustomStatusMappingRequest setSqStatusName(String d) {
        this.sqStatusName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Application ID
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Application ID
    */
    public SQ_DeleteAgentCustomStatusMappingRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
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
        if (sqStatusName != null) {
            sb.append(aligned)
                .append("\"sqStatusName\": \"")
                .append(sqStatusName)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}