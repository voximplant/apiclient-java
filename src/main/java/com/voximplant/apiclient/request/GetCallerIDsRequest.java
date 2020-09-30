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

public class GetCallerIDsRequest {
    private Long calleridId;

    @RequestField(name="callerid_id")
    /**
    * The id of the callerID object to filter.
    */
    public long getCalleridId() {
        return this.calleridId.longValue();
    }

    public boolean hasCalleridId() {
        return this.calleridId != null;
    }

    /**
    * The id of the callerID object to filter.
    */
    public GetCallerIDsRequest setCalleridId(long d) {
        this.calleridId = Long.valueOf(d);
        return this;
    }

    private String calleridNumber;

    @RequestField(name="callerid_number")
    /**
    * The phone number to filter.
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    /**
    * The phone number to filter.
    */
    public GetCallerIDsRequest setCalleridNumber(String d) {
        this.calleridNumber = d;
        return this;
    }

    private Boolean active;

    @RequestField(name="active")
    /**
    * The active flag to filter.
    */
    public boolean getActive() {
        return this.active.booleanValue();
    }

    public boolean hasActive() {
        return this.active != null;
    }

    /**
    * The active flag to filter.
    */
    public GetCallerIDsRequest setActive(boolean d) {
        this.active = Boolean.valueOf(d);
        return this;
    }

    private String orderBy;

    @RequestField(name="order_by")
    /**
    * The following values are available: 'caller_number' (ascent order),
    * 'verified_until' (ascent order).
    */
    public String getOrderBy() {
        return this.orderBy;
    }

    public boolean hasOrderBy() {
        return this.orderBy != null;
    }

    /**
    * The following values are available: 'caller_number' (ascent order),
    * 'verified_until' (ascent order).
    */
    public GetCallerIDsRequest setOrderBy(String d) {
        this.orderBy = d;
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
    public GetCallerIDsRequest setCount(long d) {
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
    public GetCallerIDsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}