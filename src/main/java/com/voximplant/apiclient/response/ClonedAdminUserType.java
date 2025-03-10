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

/**
* The cloned admin user info.
*/
public class ClonedAdminUserType implements Alignable {

    private Long adminUserId;

    /**
    * The admin user ID
    */
    public Long getAdminUserId() {
        return this.adminUserId;
    }

    public boolean hasAdminUserId() {
        return this.adminUserId != null;
    }

    private String adminUserName;

    /**
    * The admin user name
    */
    public String getAdminUserName() {
        return this.adminUserName;
    }

    public boolean hasAdminUserName() {
        return this.adminUserName != null;
    }

    private String adminUserApiKey;

    /**
    * The API key of the admin user
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
        if (adminUserId != null) {
            sb.append(aligned)
                .append("\"adminUserId\": \"")
                .append(adminUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (adminUserName != null) {
            sb.append(aligned)
                .append("\"adminUserName\": \"")
                .append(adminUserName)
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