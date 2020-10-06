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

public class LinkregulationAddressRequest implements Alignable {
    private Long regulationAddressId;

    @RequestField(name="regulation_address_id")
    /**
    * The regulation address ID
    */
    public Long getRegulationAddressId() {
        return this.regulationAddressId;
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    /**
    * The regulation address ID
    */
    public LinkregulationAddressRequest setRegulationAddressId(long d) {
        this.regulationAddressId = Long.valueOf(d);
        return this;
    }

    private Long phoneId;

    @RequestField(name="phone_id")
    /**
    * The phone ID for link
    */
    public Long getPhoneId() {
        return this.phoneId;
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    /**
    * The phone ID for link
    */
    public LinkregulationAddressRequest setPhoneId(long d) {
        this.phoneId = Long.valueOf(d);
        return this;
    }

    private String phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone number for link
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone number for link
    */
    public LinkregulationAddressRequest setPhoneNumber(String d) {
        this.phoneNumber = d;
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
        if (regulationAddressId != null) {
            sb.append(aligned)
                .append("\"regulationAddressId\": \"")
                .append(regulationAddressId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}