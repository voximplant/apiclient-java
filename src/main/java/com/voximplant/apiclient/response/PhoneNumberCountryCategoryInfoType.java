package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The 'phone_categories' element of the [GetPhoneNumberCategories]
* function result.
*/
public class PhoneNumberCountryCategoryInfoType {

    private String phoneCategoryName;

    /**
    * The phone category name.
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    private Boolean countryHasStates;

    /**
    * True if a country state is used to choose the phone with the category.
    */
    public boolean getCountryHasStates() {
        return this.countryHasStates.booleanValue();
    }

    public boolean hasCountryHasStates() {
        return this.countryHasStates != null;
    }

    private String localizedCountryName;

    /**
    * The localized country name.
    */
    public String getLocalizedCountryName() {
        return this.localizedCountryName;
    }

    public boolean hasLocalizedCountryName() {
        return this.localizedCountryName != null;
    }

    private String localizedPhoneCategoryName;

    /**
    * The localized phone category name.
    */
    public String getLocalizedPhoneCategoryName() {
        return this.localizedPhoneCategoryName;
    }

    public boolean hasLocalizedPhoneCategoryName() {
        return this.localizedPhoneCategoryName != null;
    }

    private String localizedPhoneRegionName;

    /**
    * The localized phone region name.
    */
    public String getLocalizedPhoneRegionName() {
        return this.localizedPhoneRegionName;
    }

    public boolean hasLocalizedPhoneRegionName() {
        return this.localizedPhoneRegionName != null;
    }

}