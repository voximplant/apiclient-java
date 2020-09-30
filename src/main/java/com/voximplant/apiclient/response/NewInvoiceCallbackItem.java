package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details.
*/
public class NewInvoiceCallbackItem {

    private String invoiceNumber;

    /**
    * The invoice unique number.
    */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public boolean hasInvoiceNumber() {
        return this.invoiceNumber != null;
    }

    private String invoiceDate;

    /**
    * The invoice date.
    */
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public boolean hasInvoiceDate() {
        return this.invoiceDate != null;
    }

    private Boolean prepayment;

    /**
    * Is it a prepayment?
    */
    public boolean getPrepayment() {
        return this.prepayment.booleanValue();
    }

    public boolean hasPrepayment() {
        return this.prepayment != null;
    }

    private String currency;

    /**
    * The invoice currency.
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    private BigDecimal totalAmount;

    /**
    * The invoice's total amount including taxes.
    */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public boolean hasTotalAmount() {
        return this.totalAmount != null;
    }

    private BigDecimal totalTaxAmount;

    /**
    * The total amount of taxes.
    */
    public BigDecimal getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    public boolean hasTotalTaxAmount() {
        return this.totalTaxAmount != null;
    }

    private InvoiceUnits[] units;

    /**
    * Array with the services that were provided.
    */
    public InvoiceUnits[] getUnits() {
        return this.units;
    }

    public boolean hasUnits() {
        return this.units != null;
    }

}