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

public class GetActualPhoneNumberRegionRequest {
    private String countryCode;

    @RequestField(name="country_code")
    /**
    * The country code.
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code.
    */
    public GetActualPhoneNumberRegionRequest setCountryCode(String d) {
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
    public GetActualPhoneNumberRegionRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private Long phoneRegionId;

    @RequestField(name="phone_region_id")
    /**
    * The phone region ID to filter.
    */
    public long getPhoneRegionId() {
        return this.phoneRegionId.longValue();
    }

    public boolean hasPhoneRegionId() {
        return this.phoneRegionId != null;
    }

    /**
    * The phone region ID to filter.
    */
    public GetActualPhoneNumberRegionRequest setPhoneRegionId(long d) {
        this.phoneRegionId = Long.valueOf(d);
        return this;
    }

    private String locale;

    @RequestField(name="locale")
    /**
    * The 2-letter locale code. Supported values are EN, RU.
    */
    public String getLocale() {
        return this.locale;
    }

    public boolean hasLocale() {
        return this.locale != null;
    }

    /**
    * The 2-letter locale code. Supported values are EN, RU.
    */
    public GetActualPhoneNumberRegionRequest setLocale(String d) {
        this.locale = d;
        return this;
    }

}