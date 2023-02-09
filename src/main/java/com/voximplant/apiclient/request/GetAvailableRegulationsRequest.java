package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetAvailableRegulationsRequest implements Alignable {
    private String countryCode;

    @RequestField(name="country_code")
    /**
    * The country code according to the <b>ISO 3166-1 alpha-2</b>
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code according to the <b>ISO 3166-1 alpha-2</b>
    */
    public GetAvailableRegulationsRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String phoneCategoryName;

    @RequestField(name="phone_category_name")
    /**
    * The phone category name. See the [GetPhoneNumberCategories] method
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    /**
    * The phone category name. See the [GetPhoneNumberCategories] method
    */
    public GetAvailableRegulationsRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private String phoneRegionCode;

    @RequestField(name="phone_region_code")
    /**
    * The phone region code. See the [GetRegions] method
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    /**
    * The phone region code. See the [GetRegions] method
    */
    public GetAvailableRegulationsRequest setPhoneRegionCode(String d) {
        this.phoneRegionCode = d;
        return this;
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
        if (phoneCategoryName != null) {
            sb.append(aligned)
                .append("\"phoneCategoryName\": \"")
                .append(phoneCategoryName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionCode != null) {
            sb.append(aligned)
                .append("\"phoneRegionCode\": \"")
                .append(phoneRegionCode)
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