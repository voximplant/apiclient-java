package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class AttachPhoneNumberRequest implements Alignable {
    private Long phoneCount;

    @RequestField(name="phone_count")
    /**
    * Quantity of phone numbers you want to attach. If neither this
    * parameter nor <b>phone_number</b> is specified, one phone number is
    * attached from the catalog
    */
    public Long getPhoneCount() {
        return this.phoneCount;
    }

    public boolean hasPhoneCount() {
        return this.phoneCount != null;
    }

    /**
    * Quantity of phone numbers you want to attach. If neither this
    * parameter nor <b>phone_number</b> is specified, one phone number is
    * attached from the catalog
    */
    public AttachPhoneNumberRequest setPhoneCount(long d) {
        this.phoneCount = Long.valueOf(d);
        return this;
    }

    private MultiArgument<String> phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone numbers to attach, separated by semicolons (;). See the
    * [GetNewPhoneNumbers] method. If neither this parameter nor
    * <b>phone_count</b> is specified, one phone number is attached from
    * the catalog
    */
    public MultiArgument<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone numbers to attach, separated by semicolons (;). See the
    * [GetNewPhoneNumbers] method. If neither this parameter nor
    * <b>phone_count</b> is specified, one phone number is attached from
    * the catalog
    */
    public AttachPhoneNumberRequest setPhoneNumber(MultiArgument<String> d) {
        this.phoneNumber = d;
        return this;
    }

    private String countryCode;

    @RequestField(name="country_code")
    /**
    * The country code. <b>Required</b> together with
    * <b>phone_category_name</b> and <b>phone_region_id</b> to purchase
    * from the catalog; not needed when attaching a specific phone number
    * via <b>phone_number</b>
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code. <b>Required</b> together with
    * <b>phone_category_name</b> and <b>phone_region_id</b> to purchase
    * from the catalog; not needed when attaching a specific phone number
    * via <b>phone_number</b>
    */
    public AttachPhoneNumberRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String phoneCategoryName;

    @RequestField(name="phone_category_name")
    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    * <b>Required</b> together with <b>country_code</b> and
    * <b>phone_region_id</b> to purchase from the catalog; not needed when
    * attaching a specific phone number via <b>phone_number</b>
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    * <b>Required</b> together with <b>country_code</b> and
    * <b>phone_region_id</b> to purchase from the catalog; not needed when
    * attaching a specific phone number via <b>phone_number</b>
    */
    public AttachPhoneNumberRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private String countryState;

    @RequestField(name="country_state")
    /**
    * The country state. See the [GetPhoneNumberCategories] and
    * [GetPhoneNumberCountryStates] methods
    */
    public String getCountryState() {
        return this.countryState;
    }

    public boolean hasCountryState() {
        return this.countryState != null;
    }

    /**
    * The country state. See the [GetPhoneNumberCategories] and
    * [GetPhoneNumberCountryStates] methods
    */
    public AttachPhoneNumberRequest setCountryState(String d) {
        this.countryState = d;
        return this;
    }

    private Long phoneRegionId;

    @RequestField(name="phone_region_id")
    /**
    * The phone region ID. See the [GetPhoneNumberRegions] method.
    * <b>Required</b> together with <b>country_code</b> and
    * <b>phone_category_name</b> to purchase from the catalog; not needed
    * when attaching a specific phone number via <b>phone_number</b>
    */
    public Long getPhoneRegionId() {
        return this.phoneRegionId;
    }

    public boolean hasPhoneRegionId() {
        return this.phoneRegionId != null;
    }

    /**
    * The phone region ID. See the [GetPhoneNumberRegions] method.
    * <b>Required</b> together with <b>country_code</b> and
    * <b>phone_category_name</b> to purchase from the catalog; not needed
    * when attaching a specific phone number via <b>phone_number</b>
    */
    public AttachPhoneNumberRequest setPhoneRegionId(long d) {
        this.phoneRegionId = Long.valueOf(d);
        return this;
    }

    private Long regulationAddressId;

    @RequestField(name="regulation_address_id")
    /**
    * The phone regulation address ID
    */
    public Long getRegulationAddressId() {
        return this.regulationAddressId;
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    /**
    * The phone regulation address ID
    */
    public AttachPhoneNumberRequest setRegulationAddressId(long d) {
        this.regulationAddressId = Long.valueOf(d);
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
        if (phoneCount != null) {
            sb.append(aligned)
                .append("\"phoneCount\": \"")
                .append(phoneCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneNumber != null) {
            sb.append(aligned)
                .append("\"phoneNumber\": \"")
                .append(phoneNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
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
        if (phoneRegionId != null) {
            sb.append(aligned)
                .append("\"phoneRegionId\": \"")
                .append(phoneRegionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressId != null) {
            sb.append(aligned)
                .append("\"regulationAddressId\": \"")
                .append(regulationAddressId)
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