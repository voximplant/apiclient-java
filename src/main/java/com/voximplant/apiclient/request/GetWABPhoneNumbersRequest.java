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

public class GetWABPhoneNumbersRequest implements Alignable {
    private String wabPhoneNumber;

    @RequestField(name="wab_phone_number")
    /**
    * WhatsApp Business phone number
    */
    public String getWabPhoneNumber() {
        return this.wabPhoneNumber;
    }

    public boolean hasWabPhoneNumber() {
        return this.wabPhoneNumber != null;
    }

    /**
    * WhatsApp Business phone number
    */
    public GetWABPhoneNumbersRequest setWabPhoneNumber(String d) {
        this.wabPhoneNumber = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Application ID that is bound to the WhatsApp Business phone number
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Application ID that is bound to the WhatsApp Business phone number
    */
    public GetWABPhoneNumbersRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Bound application name that can be used instead of
    * <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Bound application name that can be used instead of
    * <b>application_id</b>
    */
    public GetWABPhoneNumbersRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String countryCode;

    @RequestField(name="country_code")
    /**
    * Country code filter (2 symbols) for the WhatsApp Business phone number
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * Country code filter (2 symbols) for the WhatsApp Business phone number
    */
    public GetWABPhoneNumbersRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * Maximum returning records count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * Maximum returning records count
    */
    public GetWABPhoneNumbersRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * Number of records to be skipped in the result
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * Number of records to be skipped in the result
    */
    public GetWABPhoneNumbersRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
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
        if (wabPhoneNumber != null) {
            sb.append(aligned)
                .append("\"wabPhoneNumber\": \"")
                .append(wabPhoneNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
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
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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