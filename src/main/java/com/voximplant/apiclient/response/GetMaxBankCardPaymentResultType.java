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
* The [GetMaxBankCardPayment] function result.
*/
public class GetMaxBankCardPaymentResultType implements Alignable {

    private Long maxPayment;

    /**
    * The maximum payment for the specified card. It always equals or less
    * than **new_max_payment**
    */
    public Long getMaxPayment() {
        return this.maxPayment;
    }

    public boolean hasMaxPayment() {
        return this.maxPayment != null;
    }

    private Long newMaxPayment;

    /**
    * The maximum payment available for any card. The values depends on
    * payment gateways, previous transactions during the last 24 hours, etc
    */
    public Long getNewMaxPayment() {
        return this.newMaxPayment;
    }

    public boolean hasNewMaxPayment() {
        return this.newMaxPayment != null;
    }

    private String currency;

    /**
    * The currency code (USD, RUR, ...)
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
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
        if (maxPayment != null) {
            sb.append(aligned)
                .append("\"maxPayment\": \"")
                .append(maxPayment)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newMaxPayment != null) {
            sb.append(aligned)
                .append("\"newMaxPayment\": \"")
                .append(newMaxPayment)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (currency != null) {
            sb.append(aligned)
                .append("\"currency\": \"")
                .append(currency)
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