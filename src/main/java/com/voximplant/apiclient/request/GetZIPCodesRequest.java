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

public class GetZIPCodesRequest {
    private String countryCode;

    @RequestField(name="country_code")
    /**
    * The country code according to the <b>ISO 3166-1 alpha-2</b>.
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code according to the <b>ISO 3166-1 alpha-2</b>.
    */
    public GetZIPCodesRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String phoneRegionCode;

    @RequestField(name="phone_region_code")
    /**
    * The phone region code
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    /**
    * The phone region code
    */
    public GetZIPCodesRequest setPhoneRegionCode(String d) {
        this.phoneRegionCode = d;
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
    public GetZIPCodesRequest setCount(long d) {
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
    public GetZIPCodesRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}