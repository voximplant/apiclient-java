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
* Received when a new invoice is generated. Received as part of the
* [AccountCallback] structure.
*/
public class NewInvoiceCallback implements Alignable {

    private NewInvoiceCallbackItem newInvoice;

    /**
    * The invoice info
    */
    public NewInvoiceCallbackItem getNewInvoice() {
        return this.newInvoice;
    }

    public boolean hasNewInvoice() {
        return this.newInvoice != null;
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
        if (newInvoice != null) {
            sb.append(aligned)
                .append("\"newInvoice\": \"")
                .append(newInvoice)
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