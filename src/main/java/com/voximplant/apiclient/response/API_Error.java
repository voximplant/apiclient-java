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
* The API error.
*/
public class API_Error implements Alignable {

    private Long code;

    /**
    * The error code
    */
    public Long getCode() {
        return this.code;
    }

    public boolean hasCode() {
        return this.code != null;
    }

    private String msg;

    /**
    * The error description
    */
    public String getMsg() {
        return this.msg;
    }

    public boolean hasMsg() {
        return this.msg != null;
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
        if (code != null) {
            sb.append(aligned)
                .append("\"code\": \"")
                .append(code)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (msg != null) {
            sb.append(aligned)
                .append("\"msg\": \"")
                .append(msg)
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