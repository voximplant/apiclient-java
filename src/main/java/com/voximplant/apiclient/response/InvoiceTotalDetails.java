package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* Invoice total amount details.
*/
public class InvoiceTotalDetails implements Alignable {

    private BigDecimal taxAmount;

    /**
    * Total amount of taxes
    */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    public boolean hasTaxAmount() {
        return this.taxAmount != null;
    }

    private BigDecimal totalAmount;

    /**
    * Invoice total amount including taxes
    */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public boolean hasTotalAmount() {
        return this.totalAmount != null;
    }

    private BigDecimal amountToPay;

    /**
    * Discounted amount to pay
    */
    public BigDecimal getAmountToPay() {
        return this.amountToPay;
    }

    public boolean hasAmountToPay() {
        return this.amountToPay != null;
    }

    private BigDecimal discountAmount;

    /**
    * Discount
    */
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    public boolean hasDiscountAmount() {
        return this.discountAmount != null;
    }

    private String currency;

    /**
    * Invoice currency
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
        if (taxAmount != null) {
            sb.append(aligned)
                .append("\"taxAmount\": \"")
                .append(taxAmount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (totalAmount != null) {
            sb.append(aligned)
                .append("\"totalAmount\": \"")
                .append(totalAmount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (amountToPay != null) {
            sb.append(aligned)
                .append("\"amountToPay\": \"")
                .append(amountToPay)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (discountAmount != null) {
            sb.append(aligned)
                .append("\"discountAmount\": \"")
                .append(discountAmount)
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