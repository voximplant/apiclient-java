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
* The [GetCurrencyRate] function result.
*/
public class ExchangeRates implements Alignable {

    private BigDecimal RUR;

    /**
    * The RUR exchange rate
    */
    public BigDecimal getRUR() {
        return this.RUR;
    }

    public boolean hasRUR() {
        return this.RUR != null;
    }

    private BigDecimal EUR;

    /**
    * The EUR exchange rate
    */
    public BigDecimal getEUR() {
        return this.EUR;
    }

    public boolean hasEUR() {
        return this.EUR != null;
    }

    private BigDecimal USD;

    /**
    * The USD exchange rate. It's always equal to 1
    */
    public BigDecimal getUSD() {
        return this.USD;
    }

    public boolean hasUSD() {
        return this.USD != null;
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
        if (RUR != null) {
            sb.append(aligned)
                .append("\"RUR\": \"")
                .append(RUR)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (EUR != null) {
            sb.append(aligned)
                .append("\"EUR\": \"")
                .append(EUR)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (USD != null) {
            sb.append(aligned)
                .append("\"USD\": \"")
                .append(USD)
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