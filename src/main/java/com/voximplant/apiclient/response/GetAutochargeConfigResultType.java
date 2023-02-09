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
* The [GetAutochargeConfig] function result.
*/
public class GetAutochargeConfigResultType implements Alignable {

    private Boolean autoCharge;

    /**
    * Is auto charge enabled or not
    */
    public Boolean getAutoCharge() {
        return this.autoCharge;
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    private Long minBalance;

    /**
    * The auto charge threshold
    */
    public Long getMinBalance() {
        return this.minBalance;
    }

    public boolean hasMinBalance() {
        return this.minBalance != null;
    }

    private String cardOverrunValue;

    /**
    * The auto top-up amount in the account's currency
    */
    public String getCardOverrunValue() {
        return this.cardOverrunValue;
    }

    public boolean hasCardOverrunValue() {
        return this.cardOverrunValue != null;
    }

    private String receiptEmail;

    /**
    * The email for receiving payment receipts
    */
    public String getReceiptEmail() {
        return this.receiptEmail;
    }

    public boolean hasReceiptEmail() {
        return this.receiptEmail != null;
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
        if (autoCharge != null) {
            sb.append(aligned)
                .append("\"autoCharge\": \"")
                .append(autoCharge)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (minBalance != null) {
            sb.append(aligned)
                .append("\"minBalance\": \"")
                .append(minBalance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cardOverrunValue != null) {
            sb.append(aligned)
                .append("\"cardOverrunValue\": \"")
                .append(cardOverrunValue)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (receiptEmail != null) {
            sb.append(aligned)
                .append("\"receiptEmail\": \"")
                .append(receiptEmail)
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