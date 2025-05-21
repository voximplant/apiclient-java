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

public class GetCallerIDsRequest implements Alignable {
    private Long calleridId;

    @RequestField(name="callerid_id")
    /**
    * ID of the callerID object to filter
    */
    public Long getCalleridId() {
        return this.calleridId;
    }

    public boolean hasCalleridId() {
        return this.calleridId != null;
    }

    /**
    * ID of the callerID object to filter
    */
    public GetCallerIDsRequest setCalleridId(long d) {
        this.calleridId = Long.valueOf(d);
        return this;
    }

    private String calleridNumber;

    @RequestField(name="callerid_number")
    /**
    * The phone number to filter
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    /**
    * The phone number to filter
    */
    public GetCallerIDsRequest setCalleridNumber(String d) {
        this.calleridNumber = d;
        return this;
    }

    private Boolean active;

    @RequestField(name="active")
    /**
    * Whether the account is active to filter
    */
    public Boolean getActive() {
        return this.active;
    }

    public boolean hasActive() {
        return this.active != null;
    }

    /**
    * Whether the account is active to filter
    */
    public GetCallerIDsRequest setActive(boolean d) {
        this.active = Boolean.valueOf(d);
        return this;
    }

    private String orderBy;

    @RequestField(name="order_by")
    /**
    * The following values are available: 'caller_number' (ascent order),
    * 'verified_until' (ascent order)
    */
    public String getOrderBy() {
        return this.orderBy;
    }

    public boolean hasOrderBy() {
        return this.orderBy != null;
    }

    /**
    * The following values are available: 'caller_number' (ascent order),
    * 'verified_until' (ascent order)
    */
    public GetCallerIDsRequest setOrderBy(String d) {
        this.orderBy = d;
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
    public GetCallerIDsRequest setCount(long d) {
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
    public GetCallerIDsRequest setOffset(long d) {
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
        if (calleridId != null) {
            sb.append(aligned)
                .append("\"calleridId\": \"")
                .append(calleridId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (calleridNumber != null) {
            sb.append(aligned)
                .append("\"calleridNumber\": \"")
                .append(calleridNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (active != null) {
            sb.append(aligned)
                .append("\"active\": \"")
                .append(active)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (orderBy != null) {
            sb.append(aligned)
                .append("\"orderBy\": \"")
                .append(orderBy)
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