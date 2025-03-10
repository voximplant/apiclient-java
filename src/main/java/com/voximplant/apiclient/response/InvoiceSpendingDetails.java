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
* Each spending details.
*/
public class InvoiceSpendingDetails implements Alignable {

    private InvoiceTotalDetails amount;

    /**
    * Paid amount
    */
    public InvoiceTotalDetails getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private String serviceName;

    /**
    * Service name
    */
    public String getServiceName() {
        return this.serviceName;
    }

    public boolean hasServiceName() {
        return this.serviceName != null;
    }

    private InvoiceTaxesDetails taxes;

    /**
    * Array of taxes
    */
    public InvoiceTaxesDetails getTaxes() {
        return this.taxes;
    }

    public boolean hasTaxes() {
        return this.taxes != null;
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
        if (amount != null) {
            sb.append(aligned)
                .append("\"amount\": \"")
                .append(amount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serviceName != null) {
            sb.append(aligned)
                .append("\"serviceName\": \"")
                .append(serviceName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (taxes != null) {
            sb.append(aligned)
                .append("\"taxes\": \"")
                .append(taxes)
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