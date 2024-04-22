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
* The [GetContractorInvoices] result.
*/
public class ContractorInvoiceType implements Alignable {

    private String invoiceNumber;

    /**
    * The invoice number
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
    * Whether it is post payment
    */
    public Boolean getIsPostPayment() {
        return this.isPostPayment;
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
    * The total invoice amount (RUR)
    */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public boolean hasTotalAmount() {
        return this.totalAmount != null;
    }

    private BigDecimal paidAmount;

    /**
    * The paid amount (RUR)
    */
    public BigDecimal getPaidAmount() {
        return this.paidAmount;
    }

    public boolean hasPaidAmount() {
        return this.paidAmount != null;
    }

    private ContractorInvoiceServiceType services;

    /**
    * The service list
    */
    public ContractorInvoiceServiceType getServices() {
        return this.services;
    }

    public boolean hasServices() {
        return this.services != null;
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
        if (isPostPayment != null) {
            sb.append(aligned)
                .append("\"isPostPayment\": \"")
                .append(isPostPayment)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fromDate != null) {
            sb.append(aligned)
                .append("\"fromDate\": \"")
                .append(fromDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (toDate != null) {
            sb.append(aligned)
                .append("\"toDate\": \"")
                .append(toDate)
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
        if (paidAmount != null) {
            sb.append(aligned)
                .append("\"paidAmount\": \"")
                .append(paidAmount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (services != null) {
            sb.append(aligned)
                .append("\"services\": \"")
                .append(services)
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