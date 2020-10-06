package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetPhoneNumberCategoriesRequest implements Alignable {
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
    public GetPhoneNumberCategoriesRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String sandbox;

    @RequestField(name="sandbox")
    /**
    * Flag allows you to display phone number categories only of the
    * sandbox, real or all .The following values are possible: 'all',
    * 'true', 'false'.
    */
    public String getSandbox() {
        return this.sandbox;
    }

    public boolean hasSandbox() {
        return this.sandbox != null;
    }

    /**
    * Flag allows you to display phone number categories only of the
    * sandbox, real or all .The following values are possible: 'all',
    * 'true', 'false'.
    */
    public GetPhoneNumberCategoriesRequest setSandbox(String d) {
        this.sandbox = d;
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
    public GetPhoneNumberCategoriesRequest setLocale(String d) {
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
        if (sandbox != null) {
            sb.append(aligned)
                .append("\"sandbox\": \"")
                .append(sandbox)
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