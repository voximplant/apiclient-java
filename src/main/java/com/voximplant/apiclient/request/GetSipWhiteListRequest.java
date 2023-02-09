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

public class GetSipWhiteListRequest implements Alignable {
    private Long sipWhitelistId;

    @RequestField(name="sip_whitelist_id")
    /**
    * The SIP white list item ID to filter
    */
    public Long getSipWhitelistId() {
        return this.sipWhitelistId;
    }

    public boolean hasSipWhitelistId() {
        return this.sipWhitelistId != null;
    }

    /**
    * The SIP white list item ID to filter
    */
    public GetSipWhiteListRequest setSipWhitelistId(long d) {
        this.sipWhitelistId = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetSipWhiteListRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output
    */
    public GetSipWhiteListRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
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
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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