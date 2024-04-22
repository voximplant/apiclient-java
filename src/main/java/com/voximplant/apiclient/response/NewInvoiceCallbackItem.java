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
* The specific account callback details.
*/
public class NewInvoiceCallbackItem implements Alignable {

    private String invoiceNumber;

    /**
    * The invoice unique number
    */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public boolean hasInvoiceNumber() {
        return this.invoiceNumber != null;
    }

    private String invoiceDate;

    /**
    * The invoice date
    */
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public boolean hasInvoiceDate() {
        return this.invoiceDate != null;
    }

    private Boolean prepayment;

    /**
    * Whether it is a prepayment
    */
    public Boolean getPrepayment() {
        return this.prepayment;
    }

    public boolean hasPrepayment() {
        return this.prepayment != null;
    }

    private String currency;

    /**
    * The invoice currency
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    private BigDecimal totalAmount;

    /**
    * The invoice's total amount including taxes
    */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public boolean hasTotalAmount() {
        return this.totalAmount != null;
    }

    private BigDecimal totalTaxAmount;

    /**
    * The total amount of taxes
    */
    public BigDecimal getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    public boolean hasTotalTaxAmount() {
        return this.totalTaxAmount != null;
    }

    private InvoiceUnits[] units;

    /**
    * Array with the services that were provided
    */
    public InvoiceUnits[] getUnits() {
        return this.units;
    }

    public boolean hasUnits() {
        return this.units != null;
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
        if (invoiceNumber != null) {
            sb.append(aligned)
                .append("\"invoiceNumber\": \"")
                .append(invoiceNumber)
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
        if (prepayment != null) {
            sb.append(aligned)
                .append("\"prepayment\": \"")
                .append(prepayment)
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
        if (totalAmount != null) {
            sb.append(aligned)
                .append("\"totalAmount\": \"")
                .append(totalAmount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (totalTaxAmount != null) {
            sb.append(aligned)
                .append("\"totalTaxAmount\": \"")
                .append(totalTaxAmount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (units != null) {
            sb.append(aligned)
                .append("\"InvoiceUnits\": ")
                .append(StringHelper.arrayToString(units, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}