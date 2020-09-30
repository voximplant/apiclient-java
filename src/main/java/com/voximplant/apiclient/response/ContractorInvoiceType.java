package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetContractorInvoices] result.
*/
public class ContractorInvoiceType {

    private String invoiceNumber;

    /**
    * The invoice number.
    */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public boolean hasInvoiceNumber() {
        return this.invoiceNumber != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date invoiceDate;

    /**
    * The invoice date in format: YYYY-MM-DD
    */
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public boolean hasInvoiceDate() {
        return this.invoiceDate != null;
    }

    private Boolean isPostPayment;

    /**
    * The post payment flag
    */
    public boolean getIsPostPayment() {
        return this.isPostPayment.booleanValue();
    }

    public boolean hasIsPostPayment() {
        return this.isPostPayment != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date fromDate;

    /**
    * The from date in format: YYYY-MM-DD
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date toDate;

    /**
    * The to date in format: YYYY-MM-DD
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    private BigDecimal totalAmount;

    /**
    * The total invoice amount (RUR).
    */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public boolean hasTotalAmount() {
        return this.totalAmount != null;
    }

    private BigDecimal paidAmount;

    /**
    * The paid amount (RUR).
    */
    public BigDecimal getPaidAmount() {
        return this.paidAmount;
    }

    public boolean hasPaidAmount() {
        return this.paidAmount != null;
    }

    private ContractorInvoiceServiceType services;

    /**
    * The service list.
    */
    public ContractorInvoiceServiceType getServices() {
        return this.services;
    }

    public boolean hasServices() {
        return this.services != null;
    }

}