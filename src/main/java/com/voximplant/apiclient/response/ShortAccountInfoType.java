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
* The short account info.
*/
public class ShortAccountInfoType implements Alignable {

    private Long accountId;

    /**
    * The account's ID
    */
    public Long getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private Boolean frozen;

    /**
    * Is account blocked by Voximplant admins or not
    */
    public Boolean getFrozen() {
        return this.frozen;
    }

    public boolean hasFrozen() {
        return this.frozen != null;
    }

    private BigDecimal balance;

    /**
    * The account's money
    */
    public BigDecimal getBalance() {
        return this.balance;
    }

    public boolean hasBalance() {
        return this.balance != null;
    }

    private String currency;

    /**
    * The currency code (USD, RUR, EUR, ...)
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
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
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (frozen != null) {
            sb.append(aligned)
                .append("\"frozen\": \"")
                .append(frozen)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (balance != null) {
            sb.append(aligned)
                .append("\"balance\": \"")
                .append(balance)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}