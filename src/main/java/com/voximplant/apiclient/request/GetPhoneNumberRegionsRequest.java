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

public class GetPhoneNumberRegionsRequest implements Alignable {
    private String countryCode;

    @RequestField(name="country_code")
    /**
    * The country code
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code
    */
    public GetPhoneNumberRegionsRequest setCountryCode(String d) {
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
    public GetPhoneNumberRegionsRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private String countryState;

    @RequestField(name="country_state")
    /**
    * The country state code (example: AL, CA, ... )
    */
    public String getCountryState() {
        return this.countryState;
    }

    public boolean hasCountryState() {
        return this.countryState != null;
    }

    /**
    * The country state code (example: AL, CA, ... )
    */
    public GetPhoneNumberRegionsRequest setCountryState(String d) {
        this.countryState = d;
        return this;
    }

    private Boolean omitEmpty;

    @RequestField(name="omit_empty")
    /**
    * Whether not to show all the regions (with and without phone numbers
    * in stock)
    */
    public Boolean getOmitEmpty() {
        return this.omitEmpty;
    }

    public boolean hasOmitEmpty() {
        return this.omitEmpty != null;
    }

    /**
    * Whether not to show all the regions (with and without phone numbers
    * in stock)
    */
    public GetPhoneNumberRegionsRequest setOmitEmpty(boolean d) {
        this.omitEmpty = Boolean.valueOf(d);
        return this;
    }

    private Long phoneRegionId;

    @RequestField(name="phone_region_id")
    /**
    * The phone region ID to filter
    */
    public Long getPhoneRegionId() {
        return this.phoneRegionId;
    }

    public boolean hasPhoneRegionId() {
        return this.phoneRegionId != null;
    }

    /**
    * The phone region ID to filter
    */
    public GetPhoneNumberRegionsRequest setPhoneRegionId(long d) {
        this.phoneRegionId = Long.valueOf(d);
        return this;
    }

    private String phoneRegionName;

    @RequestField(name="phone_region_name")
    /**
    * The phone region name to filter
    */
    public String getPhoneRegionName() {
        return this.phoneRegionName;
    }

    public boolean hasPhoneRegionName() {
        return this.phoneRegionName != null;
    }

    /**
    * The phone region name to filter
    */
    public GetPhoneNumberRegionsRequest setPhoneRegionName(String d) {
        this.phoneRegionName = d;
        return this;
    }

    private String phoneRegionCode;

    @RequestField(name="phone_region_code")
    /**
    * The region phone prefix to filter
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    /**
    * The region phone prefix to filter
    */
    public GetPhoneNumberRegionsRequest setPhoneRegionCode(String d) {
        this.phoneRegionCode = d;
        return this;
    }

    private String locale;

    @RequestField(name="locale")
    /**
    * The 2-letter locale code. Supported values are EN, RU
    */
    public String getLocale() {
        return this.locale;
    }

    public boolean hasLocale() {
        return this.locale != null;
    }

    /**
    * The 2-letter locale code. Supported values are EN, RU
    */
    public GetPhoneNumberRegionsRequest setLocale(String d) {
        this.locale = d;
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
        if (countryState != null) {
            sb.append(aligned)
                .append("\"countryState\": \"")
                .append(countryState)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (omitEmpty != null) {
            sb.append(aligned)
                .append("\"omitEmpty\": \"")
                .append(omitEmpty)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionId != null) {
            sb.append(aligned)
                .append("\"phoneRegionId\": \"")
                .append(phoneRegionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionName != null) {
            sb.append(aligned)
                .append("\"phoneRegionName\": \"")
                .append(phoneRegionName)
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
        if (locale != null) {
            sb.append(aligned)
                .append("\"locale\": \"")
                .append(locale)
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