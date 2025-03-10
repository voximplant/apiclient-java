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
* Received when a monthly invoice is sent. Received as part of the
* [AccountCallback] structure.
*/
public class InvoiceReceivedCallback implements Alignable {

    private Long invoiceId;

    /**
    * Invoice ID
    */
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public boolean hasInvoiceId() {
        return this.invoiceId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date invoiceDate;

    /**
    * Date when invoice is created
    */
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public boolean hasInvoiceDate() {
        return this.invoiceDate != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date receivalDate;

    /**
    * Date when invoice is received
    */
    public Date getReceivalDate() {
        return this.receivalDate;
    }

    public boolean hasReceivalDate() {
        return this.receivalDate != null;
    }

    private String amount;

    /**
    * Amount of money in the invoice (excluding taxes)
    */
    public String getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private String taxAmount;

    /**
    * Tax amount in the invoice
    */
    public String getTaxAmount() {
        return this.taxAmount;
    }

    public boolean hasTaxAmount() {
        return this.taxAmount != null;
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
        if (invoiceId != null) {
            sb.append(aligned)
                .append("\"invoiceId\": \"")
                .append(invoiceId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (invoiceDate != null) {
            sb.append(aligned)
                .append("\"invoiceDate\": \"")
                .append(invoiceDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (receivalDate != null) {
            sb.append(aligned)
                .append("\"receivalDate\": \"")
                .append(receivalDate)
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
        if (taxAmount != null) {
            sb.append(aligned)
                .append("\"taxAmount\": \"")
                .append(taxAmount)
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