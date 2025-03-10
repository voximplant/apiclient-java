package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The 'phone_categories' element of the [GetPhoneNumberCategories]
* function result.
*/
public class PhoneNumberCountryCategoryInfoType implements Alignable {

    private String phoneCategoryName;

    /**
    * The phone category name
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    private Boolean countryHasStates;

    /**
    * Whether the chosen phone number country has states
    */
    public Boolean getCountryHasStates() {
        return this.countryHasStates;
    }

    public boolean hasCountryHasStates() {
        return this.countryHasStates != null;
    }

    private String localizedCountryName;

    /**
    * The localized country name
    */
    public String getLocalizedCountryName() {
        return this.localizedCountryName;
    }

    public boolean hasLocalizedCountryName() {
        return this.localizedCountryName != null;
    }

    private String localizedPhoneCategoryName;

    /**
    * The localized phone category name
    */
    public String getLocalizedPhoneCategoryName() {
        return this.localizedPhoneCategoryName;
    }

    public boolean hasLocalizedPhoneCategoryName() {
        return this.localizedPhoneCategoryName != null;
    }

    private String localizedPhoneRegionName;

    /**
    * The localized phone region name
    */
    public String getLocalizedPhoneRegionName() {
        return this.localizedPhoneRegionName;
    }

    public boolean hasLocalizedPhoneRegionName() {
        return this.localizedPhoneRegionName != null;
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
        if (phoneCategoryName != null) {
            sb.append(aligned)
                .append("\"phoneCategoryName\": \"")
                .append(phoneCategoryName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (countryHasStates != null) {
            sb.append(aligned)
                .append("\"countryHasStates\": \"")
                .append(countryHasStates)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localizedCountryName != null) {
            sb.append(aligned)
                .append("\"localizedCountryName\": \"")
                .append(localizedCountryName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localizedPhoneCategoryName != null) {
            sb.append(aligned)
                .append("\"localizedPhoneCategoryName\": \"")
                .append(localizedPhoneCategoryName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localizedPhoneRegionName != null) {
            sb.append(aligned)
                .append("\"localizedPhoneRegionName\": \"")
                .append(localizedPhoneRegionName)
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