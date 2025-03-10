package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

public class AddAdminUserResponse implements Alignable {
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

    private Long adminUserId;

    /**
    * The new admin user ID
    */
    public Long getAdminUserId() {
        return this.adminUserId;
    }

    public boolean hasAdminUserId() {
        return this.adminUserId != null;
    }

    private String adminUserApiKey;

    /**
    * The admin user API key
    */
    public String getAdminUserApiKey() {
        return this.adminUserApiKey;
    }

    public boolean hasAdminUserApiKey() {
        return this.adminUserApiKey != null;
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
        if (adminUserId != null) {
            sb.append(aligned)
                .append("\"adminUserId\": \"")
                .append(adminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminUserApiKey != null) {
            sb.append(aligned)
                .append("\"adminUserApiKey\": \"")
                .append(adminUserApiKey)
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