package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class AddPstnBlackListItemRequest implements Alignable {
    private String pstnBlacklistPhone;

    @RequestField(name="pstn_blacklist_phone")
    /**
    * The phone number in format e164 or regex pattern
    */
    public String getPstnBlacklistPhone() {
        return this.pstnBlacklistPhone;
    }

    public boolean hasPstnBlacklistPhone() {
        return this.pstnBlacklistPhone != null;
    }

    /**
    * The phone number in format e164 or regex pattern
    */
    public AddPstnBlackListItemRequest setPstnBlacklistPhone(String d) {
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