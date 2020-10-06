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
* The newAlfaBankPayment function result.
*/
public class AllocateAlfaBankPaymentResultType implements Alignable {

    private String formUrl;

    /**
    * The URL to redirect.
    */
    public String getFormUrl() {
        return this.formUrl;
    }

    public boolean hasFormUrl() {
        return this.formUrl != null;
    }

    private String paymentId ;

    /**
    * The payment ID.
    */
    public String getPaymentId () {
        return this.paymentId ;
    }

    public boolean hasPaymentId () {
        return this.paymentId  != null;
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
        if (formUrl != null) {
            sb.append(aligned)
                .append("\"formUrl\": \"")
                .append(formUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (paymentId  != null) {
            sb.append(aligned)
                .append("\"paymentId \": \"")
                .append(paymentId )
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