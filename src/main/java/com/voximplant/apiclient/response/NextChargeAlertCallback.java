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
* Received when a plan is to be renewed in 3 days, but there is not
* enough money. Received as part of the [AccountCallback] structure.
*/
public class NextChargeAlertCallback implements Alignable {

    private Long requiredMoney;

    /**
    * The price (in the account currency) of all subscription plans to be
    * renewed on the 1st day of the month
    */
    public Long getRequiredMoney() {
        return this.requiredMoney;
    }

    public boolean hasRequiredMoney() {
        return this.requiredMoney != null;
    }

    private Long insufficientFundsAmount;

    /**
    * The amount of money in the account currency required to renew the
    * subscription plans
    */
    public Long getInsufficientFundsAmount() {
        return this.insufficientFundsAmount;
    }

    public boolean hasInsufficientFundsAmount() {
        return this.insufficientFundsAmount != null;
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
        if (requiredMoney != null) {
            sb.append(aligned)
                .append("\"requiredMoney\": \"")
                .append(requiredMoney)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (insufficientFundsAmount != null) {
            sb.append(aligned)
                .append("\"insufficientFundsAmount\": \"")
                .append(insufficientFundsAmount)
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