package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class SetPstnBlackListItemRequest implements Alignable {
    private Long pstnBlacklistId;

    @RequestField(name="pstn_blacklist_id")
    /**
    * The PSTN black list item ID
    */
    public Long getPstnBlacklistId() {
        return this.pstnBlacklistId;
    }

    public boolean hasPstnBlacklistId() {
        return this.pstnBlacklistId != null;
    }

    /**
    * The PSTN black list item ID
    */
    public SetPstnBlackListItemRequest setPstnBlacklistId(long d) {
        this.pstnBlacklistId = Long.valueOf(d);
        return this;
    }

    private String pstnBlacklistPhone;

    @RequestField(name="pstn_blacklist_phone")
    /**
    * The new phone number in format e164
    */
    public String getPstnBlacklistPhone() {
        return this.pstnBlacklistPhone;
    }

    public boolean hasPstnBlacklistPhone() {
        return this.pstnBlacklistPhone != null;
    }

    /**
    * The new phone number in format e164
    */
    public SetPstnBlackListItemRequest setPstnBlacklistPhone(String d) {
        this.pstnBlacklistPhone = d;
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
        if (pstnBlacklistId != null) {
            sb.append(aligned)
                .append("\"pstnBlacklistId\": \"")
                .append(pstnBlacklistId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (pstnBlacklistPhone != null) {
            sb.append(aligned)
                .append("\"pstnBlacklistPhone\": \"")
                .append(pstnBlacklistPhone)
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