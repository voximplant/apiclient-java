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
* Info about services that were provided.
*/
public class InvoiceUnits implements Alignable {

    private String description;

    /**
    * The service name.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    private BigDecimal amount;

    /**
    * The service fee (excluding taxes).
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private BigDecimal vatRate;

    /**
    * The tax rate in the range of [0 ... 1].
    */
    public BigDecimal getVatRate() {
        return this.vatRate;
    }

    public boolean hasVatRate() {
        return this.vatRate != null;
    }

    private BigDecimal taxAmount;

    /**
    * The tax amount.
    */
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    public boolean hasTaxAmount() {
        return this.taxAmount != null;
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
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (amount != null) {
            sb.append(aligned)
                .append("\"amount\": \"")
                .append(amount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (vatRate != null) {
            sb.append(aligned)
                .append("\"vatRate\": \"")
                .append(vatRate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (taxAmount != null) {
            sb.append(aligned)
                .append("\"taxAmount\": \"")
                .append(taxAmount)
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