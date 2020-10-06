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

public class GetCurrencyRateRequest implements Alignable {
    private MultiArgument<String> currency;

    @RequestField(name="currency")
    /**
    * The currency code list separated by the ';' symbol. Examples: RUR,
    * EUR, USD
    */
    public MultiArgument<String> getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    /**
    * The currency code list separated by the ';' symbol. Examples: RUR,
    * EUR, USD
    */
    public GetCurrencyRateRequest setCurrency(MultiArgument<String> d) {
        this.currency = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date date;

    @RequestField(name="date")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * The date, format: YYYY-MM-DD
    */
    public Date getDate() {
        return this.date;
    }

    public boolean hasDate() {
        return this.date != null;
    }

    /**
    * The date, format: YYYY-MM-DD
    */
    public GetCurrencyRateRequest setDate(Date d) {
        this.date = d;
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
        if (date != null) {
            sb.append(aligned)
                .append("\"date\": \"")
                .append(date)
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