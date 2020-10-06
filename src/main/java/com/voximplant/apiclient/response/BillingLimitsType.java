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
* The payments limits applicable to each payment method. Payments that
* are beyond limits are declined.
*/
public class BillingLimitsType implements Alignable {

    private BillingLimitInfoType robokassa;

    /**
    * The Robokassa limits.
    */
    public BillingLimitInfoType getRobokassa() {
        return this.robokassa;
    }

    public boolean hasRobokassa() {
        return this.robokassa != null;
    }

    private BankCardBillingLimitInfoType bankCard;

    /**
    * The bank card limits.
    */
    public BankCardBillingLimitInfoType getBankCard() {
        return this.bankCard;
    }

    public boolean hasBankCard() {
        return this.bankCard != null;
    }

    private BillingLimitInfoType invoice;

    /**
    * The invoice limits.
    */
    public BillingLimitInfoType getInvoice() {
        return this.invoice;
    }

    public boolean hasInvoice() {
        return this.invoice != null;
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
        if (robokassa != null) {
            sb.append(aligned)
                .append("\"robokassa\": \"")
                .append(robokassa)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bankCard != null) {
            sb.append(aligned)
                .append("\"bankCard\": \"")
                .append(bankCard)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (invoice != null) {
            sb.append(aligned)
                .append("\"invoice\": \"")
                .append(invoice)
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