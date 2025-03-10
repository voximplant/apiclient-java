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

public class SetPhoneNumberInfoRequest implements Alignable {
    private MultiArgument<Long> phoneId;

    @RequestField(name="phone_id")
    /**
    * The phone ID list separated by semicolons (;). Use the 'all' value to
    * select all phone ids
    */
    public MultiArgument<Long> getPhoneId() {
        return this.phoneId;
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    /**
    * The phone ID list separated by semicolons (;). Use the 'all' value to
    * select all phone ids
    */
    public SetPhoneNumberInfoRequest setPhoneId(MultiArgument<Long> d) {
        this.phoneId = d;
        return this;
    }

    private MultiArgument<String> phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone number list separated by semicolons (;) that can be used
    * instead of <b>phone_id</b>
    */
    public MultiArgument<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone number list separated by semicolons (;) that can be used
    * instead of <b>phone_id</b>
    */
    public SetPhoneNumberInfoRequest setPhoneNumber(MultiArgument<String> d) {
        this.phoneNumber = d;
        return this;
    }

    private String incomingSmsCallbackUrl;

    @RequestField(name="incoming_sms_callback_url")
    /**
    * If set, the callback of an incoming SMS is sent to this url,
    * otherwise, it is sent to the general account URL
    */
    public String getIncomingSmsCallbackUrl() {
        return this.incomingSmsCallbackUrl;
    }

    public boolean hasIncomingSmsCallbackUrl() {
        return this.incomingSmsCallbackUrl != null;
    }

    /**
    * If set, the callback of an incoming SMS is sent to this url,
    * otherwise, it is sent to the general account URL
    */
    public SetPhoneNumberInfoRequest setIncomingSmsCallbackUrl(String d) {
        this.incomingSmsCallbackUrl = d;
        return this;
    }

    private Boolean autoCharge;

    @RequestField(name="auto_charge")
    /**
    * Whether to enable the auto charging
    */
    public Boolean getAutoCharge() {
        return this.autoCharge;
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    /**
    * Whether to enable the auto charging
    */
    public SetPhoneNumberInfoRequest setAutoCharge(boolean d) {
        this.autoCharge = Boolean.valueOf(d);
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
        if (phoneId != null) {
            sb.append(aligned)
                .append("\"phoneId\": \"")
                .append(phoneId)
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
        if (incomingSmsCallbackUrl != null) {
            sb.append(aligned)
                .append("\"incomingSmsCallbackUrl\": \"")
                .append(incomingSmsCallbackUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (autoCharge != null) {
            sb.append(aligned)
                .append("\"autoCharge\": \"")
                .append(autoCharge)
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