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

public class GetPhoneNumberRegionsRequest {
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
    public GetPhoneNumberRegionsRequest setCountryCode(String d) {
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
    public GetPhoneNumberRegionsRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private String countryState;

    @RequestField(name="country_state")
    /**
    * The country state code (example: AL, CA, ... ).
    */
    public String getCountryState() {
        return this.countryState;
    }

    public boolean hasCountryState() {
        return this.countryState != null;
    }

    /**
    * The country state code (example: AL, CA, ... ).
    */
    public GetPhoneNumberRegionsRequest setCountryState(String d) {
        this.countryState = d;
        return this;
    }

    private Boolean omitEmpty;

    @RequestField(name="omit_empty")
    /**
    * Set to 'false' to show all the regions (with and without phone
    * numbers in stock).
    */
    public boolean getOmitEmpty() {
        return this.omitEmpty.booleanValue();
    }

    public boolean hasOmitEmpty() {
        return this.omitEmpty != null;
    }

    /**
    * Set to 'false' to show all the regions (with and without phone
    * numbers in stock).
    */
    public GetPhoneNumberRegionsRequest setOmitEmpty(boolean d) {
        this.omitEmpty = Boolean.valueOf(d);
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
    public GetPhoneNumberRegionsRequest setPhoneRegionId(long d) {
        this.phoneRegionId = Long.valueOf(d);
        return this;
    }

    private String phoneRegionName;

    @RequestField(name="phone_region_name")
    /**
    * The phone region name to filter.
    */
    public String getPhoneRegionName() {
        return this.phoneRegionName;
    }

    public boolean hasPhoneRegionName() {
        return this.phoneRegionName != null;
    }

    /**
    * The phone region name to filter.
    */
    public GetPhoneNumberRegionsRequest setPhoneRegionName(String d) {
        this.phoneRegionName = d;
        return this;
    }

    private String phoneRegionCode;

    @RequestField(name="phone_region_code")
    /**
    * The region phone prefix to filter.
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    /**
    * The region phone prefix to filter.
    */
    public GetPhoneNumberRegionsRequest setPhoneRegionCode(String d) {
        this.phoneRegionCode = d;
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
    public GetPhoneNumberRegionsRequest setLocale(String d) {
        this.locale = d;
        return this;
    }

}