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

public class GetAuthorizedAccountIPsRequest {
    private String authorizedIp;

    @RequestField(name="authorized_ip")
    /**
    * The authorized IP4 or network to filter.
    */
    public String getAuthorizedIp() {
        return this.authorizedIp;
    }

    public boolean hasAuthorizedIp() {
        return this.authorizedIp != null;
    }

    /**
    * The authorized IP4 or network to filter.
    */
    public GetAuthorizedAccountIPsRequest setAuthorizedIp(String d) {
        this.authorizedIp = d;
        return this;
    }

    private Boolean allowed;

    @RequestField(name="allowed")
    /**
    * The allowed flag to filter.
    */
    public boolean getAllowed() {
        return this.allowed.booleanValue();
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    /**
    * The allowed flag to filter.
    */
    public GetAuthorizedAccountIPsRequest setAllowed(boolean d) {
        this.allowed = Boolean.valueOf(d);
        return this;
    }

    private String containsIp;

    @RequestField(name="contains_ip")
    /**
    * Specify the parameter to filter the networks that contains the
    * particular IP4.
    */
    public String getContainsIp() {
        return this.containsIp;
    }

    public boolean hasContainsIp() {
        return this.containsIp != null;
    }

    /**
    * Specify the parameter to filter the networks that contains the
    * particular IP4.
    */
    public GetAuthorizedAccountIPsRequest setContainsIp(String d) {
        this.containsIp = d;
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
    public GetAuthorizedAccountIPsRequest setCount(long d) {
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
    public GetAuthorizedAccountIPsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}