package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
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

public class DelSipWhiteListItemRequest implements Alignable {
    private Long sipWhitelistId;

    @RequestField(name="sip_whitelist_id")
    /**
    * The SIP white list item ID to delete
    */
    public Long getSipWhitelistId() {
        return this.sipWhitelistId;
    }

    public boolean hasSipWhitelistId() {
        return this.sipWhitelistId != null;
    }

    /**
    * The SIP white list item ID to delete
    */
    public DelSipWhiteListItemRequest setSipWhitelistId(long d) {
        this.sipWhitelistId = Long.valueOf(d);
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
        if (sipWhitelistId != null) {
            sb.append(aligned)
                .append("\"sipWhitelistId\": \"")
                .append(sipWhitelistId)
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