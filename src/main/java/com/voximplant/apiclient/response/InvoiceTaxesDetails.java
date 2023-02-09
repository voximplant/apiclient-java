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
* Taxes in the invoice.
*/
public class InvoiceTaxesDetails implements Alignable {

    private BigDecimal taxableMeasure;

    /**
    * Taxable sum
    */
    public BigDecimal getTaxableMeasure() {
        return this.taxableMeasure;
    }

    public boolean hasTaxableMeasure() {
        return this.taxableMeasure != null;
    }

    private BigDecimal amount;

    /**
    * Paid amount
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private String level;

    /**
    * Tax type. Possible values: Federal, State, County, City,
    * Unincorporated
    */
    public String getLevel() {
        return this.level;
    }

    public boolean hasLevel() {
        return this.level != null;
    }

    private BigDecimal rate;

    /**
    * Tax rate
    */
    public BigDecimal getRate() {
        return this.rate;
    }

    public boolean hasRate() {
        return this.rate != null;
    }

    private String name;

    /**
    * Tax name
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

    private String currency;

    /**
    * Tax currency
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    private String category;

    /**
    * Tax category
    */
    public String getCategory() {
        return this.category;
    }

    public boolean hasCategory() {
        return this.category != null;
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
        if (taxableMeasure != null) {
            sb.append(aligned)
                .append("\"taxableMeasure\": \"")
                .append(taxableMeasure)
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
        if (level != null) {
            sb.append(aligned)
                .append("\"level\": \"")
                .append(level)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (rate != null) {
            sb.append(aligned)
                .append("\"rate\": \"")
                .append(rate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (name != null) {
            sb.append(aligned)
                .append("\"name\": \"")
                .append(name)
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
        if (category != null) {
            sb.append(aligned)
                .append("\"category\": \"")
                .append(category)
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