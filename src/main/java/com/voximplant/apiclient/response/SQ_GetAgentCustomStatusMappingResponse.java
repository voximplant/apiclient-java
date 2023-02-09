package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

public class SQ_GetAgentCustomStatusMappingResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private String sqStatusName;

    /**
    * Status name
    */
    public String getSqStatusName() {
        return this.sqStatusName;
    }

    public boolean hasSqStatusName() {
        return this.sqStatusName != null;
    }

    private String customStatusName;

    /**
    * Custom status name
    */
    public String getCustomStatusName() {
        return this.customStatusName;
    }

    public boolean hasCustomStatusName() {
        return this.customStatusName != null;
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
        if (customStatusName != null) {
            sb.append(aligned)
                .append("\"customStatusName\": \"")
                .append(customStatusName)
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