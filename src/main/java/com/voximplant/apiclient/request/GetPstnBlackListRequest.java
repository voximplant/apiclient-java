package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetPstnBlackListRequest {
    private Long pstnBlacklistId;

    @RequestField(name="pstn_blacklist_id")
    /**
    * The PSTN black list item ID for filter.
    */
    public long getPstnBlacklistId() {
        return this.pstnBlacklistId.longValue();
    }

    public boolean hasPstnBlacklistId() {
        return this.pstnBlacklistId != null;
    }

    /**
    * The PSTN black list item ID for filter.
    */
    public GetPstnBlackListRequest setPstnBlacklistId(long d) {
        this.pstnBlacklistId = Long.valueOf(d);
        return this;
    }

    private String pstnBlacklistPhone;

    @RequestField(name="pstn_blacklist_phone")
    /**
    * The phone number in format e164 for filter.
    */
    public String getPstnBlacklistPhone() {
        return this.pstnBlacklistPhone;
    }

    public boolean hasPstnBlacklistPhone() {
        return this.pstnBlacklistPhone != null;
    }

    /**
    * The phone number in format e164 for filter.
    */
    public GetPstnBlackListRequest setPstnBlacklistPhone(String d) {
        this.pstnBlacklistPhone = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetPstnBlackListRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetPstnBlackListRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}