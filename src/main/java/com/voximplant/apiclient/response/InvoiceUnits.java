package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Info about services that were provided.
*/
public class InvoiceUnits {

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

}