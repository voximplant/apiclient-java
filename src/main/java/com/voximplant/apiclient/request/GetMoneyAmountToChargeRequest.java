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

public class GetMoneyAmountToChargeRequest implements Alignable {
    private String currency;

    @RequestField(name="currency")
    /**
    * The currency name. Examples: USD, RUR, EUR
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    /**
    * The currency name. Examples: USD, RUR, EUR
    */
    public GetMoneyAmountToChargeRequest setCurrency(String d) {
        this.currency = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date chargeDate;

    @RequestField(name="charge_date")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * The next charge date, format: YYYY-MM-DD
    */
    public Date getChargeDate() {
        return this.chargeDate;
    }

    public boolean hasChargeDate() {
        return this.chargeDate != null;
    }

    /**
    * The next charge date, format: YYYY-MM-DD
    */
    public GetMoneyAmountToChargeRequest setChargeDate(Date d) {
        this.chargeDate = d;
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
        if (currency != null) {
            sb.append(aligned)
                .append("\"currency\": \"")
                .append(currency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (chargeDate != null) {
            sb.append(aligned)
                .append("\"chargeDate\": \"")
                .append(chargeDate)
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