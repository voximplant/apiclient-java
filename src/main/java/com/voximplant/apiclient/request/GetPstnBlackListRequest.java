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

public class GetPstnBlackListRequest implements Alignable {
    private Long pstnBlacklistId;

    @RequestField(name="pstn_blacklist_id")
    /**
    * The PSTN black list item ID for filter
    */
    public Long getPstnBlacklistId() {
        return this.pstnBlacklistId;
    }

    public boolean hasPstnBlacklistId() {
        return this.pstnBlacklistId != null;
    }

    /**
    * The PSTN black list item ID for filter
    */
    public GetPstnBlackListRequest setPstnBlacklistId(long d) {
        this.pstnBlacklistId = Long.valueOf(d);
        return this;
    }

    private String pstnBlacklistPhone;

    @RequestField(name="pstn_blacklist_phone")
    /**
    * The phone number in format e164 for filter
    */
    public String getPstnBlacklistPhone() {
        return this.pstnBlacklistPhone;
    }

    public boolean hasPstnBlacklistPhone() {
        return this.pstnBlacklistPhone != null;
    }

    /**
    * The phone number in format e164 for filter
    */
    public GetPstnBlackListRequest setPstnBlacklistPhone(String d) {
        this.pstnBlacklistPhone = d;
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
    public GetPstnBlackListRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetPstnBlackListRequest setOffset(long d) {
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