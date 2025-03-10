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
* GetAccountInvoices function result.
*/
public class AccountInvoice implements Alignable {

    private InvoicePeriod period;

    /**
    * Invoice period
    */
    public InvoicePeriod getPeriod() {
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null;
    }

    private InvoiceTotalDetails amount;

    /**
    * Info on all money spent in the invoice
    */
    public InvoiceTotalDetails getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private Long invoiceId;

    /**
    * Invoice id
    */
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public boolean hasInvoiceId() {
        return this.invoiceId != null;
    }

    private InvoiceSpendingDetails rows;

    /**
    * Detailed info on each spending
    */
    public InvoiceSpendingDetails getRows() {
        return this.rows;
    }

    public boolean hasRows() {
        return this.rows != null;
    }

    private String invoiceNumber;

    /**
    * Unique invoice number
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
    * Date when the invoice is created in format: YYYY-MM-DD
    */
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public boolean hasInvoiceDate() {
        return this.invoiceDate != null;
    }

    private String status;

    /**
    * Invoice status
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
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
        if (period != null) {
            sb.append(aligned)
                .append("\"period\": \"")
                .append(period)
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
        if (invoiceId != null) {
            sb.append(aligned)
                .append("\"invoiceId\": \"")
                .append(invoiceId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (rows != null) {
            sb.append(aligned)
                .append("\"rows\": \"")
                .append(rows)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
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
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
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