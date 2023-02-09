package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetPhoneNumberCategories] function result.
*/
public class PhoneNumberCountryInfoType implements Alignable {

    private String countryCode;

    /**
    * The country code
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    private String phonePrefix;

    /**
    * The country phone prefix
    */
    public String getPhonePrefix() {
        return this.phonePrefix;
    }

    public boolean hasPhonePrefix() {
        return this.phonePrefix != null;
    }

    private Boolean canListPhoneNumbers;

    /**
    * True if can list phone numbers
    */
    public Boolean getCanListPhoneNumbers() {
        return this.canListPhoneNumbers;
    }

    public boolean hasCanListPhoneNumbers() {
        return this.canListPhoneNumbers != null;
    }

    private PhoneNumberCountryCategoryInfoType[] phoneCategories;

    /**
    * The phone categories
    */
    public PhoneNumberCountryCategoryInfoType[] getPhoneCategories() {
        return this.phoneCategories;
    }

    public boolean hasPhoneCategories() {
        return this.phoneCategories != null;
    }

    private Boolean emergencyCallsToBeEnabled;

    /**
    * If <b>true</b>, you need to make a request to enable calls to
    * emergency numbers
    */
    public Boolean getEmergencyCallsToBeEnabled() {
        return this.emergencyCallsToBeEnabled;
    }

    public boolean hasEmergencyCallsToBeEnabled() {
        return this.emergencyCallsToBeEnabled != null;
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
        if (countryCode != null) {
            sb.append(aligned)
                .append("\"countryCode\": \"")
                .append(countryCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phonePrefix != null) {
            sb.append(aligned)
                .append("\"phonePrefix\": \"")
                .append(phonePrefix)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (canListPhoneNumbers != null) {
            sb.append(aligned)
                .append("\"canListPhoneNumbers\": \"")
                .append(canListPhoneNumbers)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneCategories != null) {
            sb.append(aligned)
                .append("\"PhoneNumberCountryCategoryInfoType\": ")
                .append(StringHelper.arrayToString(phoneCategories, alignment + 1))
                .append(System.lineSeparator());
        }
        if (emergencyCallsToBeEnabled != null) {
            sb.append(aligned)
                .append("\"emergencyCallsToBeEnabled\": \"")
                .append(emergencyCallsToBeEnabled)
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