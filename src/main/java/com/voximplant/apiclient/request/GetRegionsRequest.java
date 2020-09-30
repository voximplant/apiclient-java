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

public class GetRegionsRequest {
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
    public GetRegionsRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String phoneCategoryName;

    @RequestField(name="phone_category_name")
    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    */
    public GetRegionsRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private String cityName;

    @RequestField(name="city_name")
    /**
    * The pattern of city's name
    */
    public String getCityName() {
        return this.cityName;
    }

    public boolean hasCityName() {
        return this.cityName != null;
    }

    /**
    * The pattern of city's name
    */
    public GetRegionsRequest setCityName(String d) {
        this.cityName = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The returned regions count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The returned regions count.
    */
    public GetRegionsRequest setCount(long d) {
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
    public GetRegionsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}