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

/**
* The available resource parameters.
*/
public class ResourceParams implements Alignable {

    private String[] allowed;

    /**
    * The allowed parameter prefixes. Example: 7495
    */
    public String[] getAllowed() {
        return this.allowed;
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    private String[] forbidden;

    /**
    * The forbidden parameter prefixes. Example: 7800
    */
    public String[] getForbidden() {
        return this.forbidden;
    }

    public boolean hasForbidden() {
        return this.forbidden != null;
    }

    private String[] requested;

    /**
    * The requested parameters. Example: 79263331122
    */
    public String[] getRequested() {
        return this.requested;
    }

    public boolean hasRequested() {
        return this.requested != null;
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
        if (allowed != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(allowed, alignment + 1))
                .append(System.lineSeparator());
        }
        if (forbidden != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(forbidden, alignment + 1))
                .append(System.lineSeparator());
        }
        if (requested != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(requested, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}