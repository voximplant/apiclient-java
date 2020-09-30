package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetPhoneNumberCategories] function result.
*/
public class PhoneNumberCountryInfoType {

    private String countryCode;

    /**
    * The country code.
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    private String phonePrefix;

    /**
    * The country phone prefix.
    */
    public String getPhonePrefix() {
        return this.phonePrefix;
    }

    public boolean hasPhonePrefix() {
        return this.phonePrefix != null;
    }

    private Boolean canListPhoneNumbers;

    /**
    * True if can list phone numbers.
    */
    public boolean getCanListPhoneNumbers() {
        return this.canListPhoneNumbers.booleanValue();
    }

    public boolean hasCanListPhoneNumbers() {
        return this.canListPhoneNumbers != null;
    }

    private PhoneNumberCountryCategoryInfoType[] phoneCategories;

    /**
    * The phone categories.
    */
    public PhoneNumberCountryCategoryInfoType[] getPhoneCategories() {
        return this.phoneCategories;
    }

    public boolean hasPhoneCategories() {
        return this.phoneCategories != null;
    }

}