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
* Info about services that were provided.
*/
public class ClassificationUnit implements Alignable {

    private String type;

    /**
    * The classification type.
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private String info;

    /**
    * The classification info.
    */
    public String getInfo() {
        return this.info;
    }

    public boolean hasInfo() {
        return this.info != null;
    }

    private String errorCode;

    /**
    * Classification error code (if any).
    */
    public String getErrorCode() {
        return this.errorCode;
    }

    public boolean hasErrorCode() {
        return this.errorCode != null;
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
        if (type != null) {
            sb.append(aligned)
                .append("\"type\": \"")
                .append(type)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (info != null) {
            sb.append(aligned)
                .append("\"info\": \"")
                .append(info)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (errorCode != null) {
            sb.append(aligned)
                .append("\"errorCode\": \"")
                .append(errorCode)
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