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

public class AddAdminRoleResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public Long getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long adminRoleId;

    /**
    * The new admin role ID.
    */
    public Long getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
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
        if (result != null) {
            sb.append(aligned)
                .append("\"result\": \"")
                .append(result)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminRoleId != null) {
            sb.append(aligned)
                .append("\"adminRoleId\": \"")
                .append(adminRoleId)
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