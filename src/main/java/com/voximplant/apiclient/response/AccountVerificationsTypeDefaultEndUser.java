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
* Verification's default customer.
*/
public class AccountVerificationsTypeDefaultEndUser implements Alignable {

    private Long endUserUuid;

    /**
    * Customer's UUID
    */
    public Long getEndUserUuid() {
        return this.endUserUuid;
    }

    public boolean hasEndUserUuid() {
        return this.endUserUuid != null;
    }

    private Object credentials;

    /**
    * Customer's data
    */
    public Object getCredentials() {
        return this.credentials;
    }

    public boolean hasCredentials() {
        return this.credentials != null;
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
        if (endUserUuid != null) {
            sb.append(aligned)
                .append("\"endUserUuid\": \"")
                .append(endUserUuid)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (credentials != null) {
            sb.append(aligned)
                .append("\"credentials\": \"")
                .append(credentials)
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