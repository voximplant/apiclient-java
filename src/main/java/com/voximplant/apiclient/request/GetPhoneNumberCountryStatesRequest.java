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

public class GetPhoneNumberCountryStatesRequest {
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
    public GetPhoneNumberCountryStatesRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String phoneCategoryName;

    @RequestField(name="phone_category_name")
    /**
    * The phone category name. See the GetPhoneNumberCategories function.
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    /**
    * The phone category name. See the GetPhoneNumberCategories function.
    */
    public GetPhoneNumberCountryStatesRequest setPhoneCategoryName(String d) {
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
    public GetPhoneNumberCountryStatesRequest setCountryState(String d) {
        this.countryState = d;
        return this;
    }

}