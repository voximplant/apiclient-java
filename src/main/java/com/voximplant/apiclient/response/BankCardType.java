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
* The bank card info.
*/
public class BankCardType implements Alignable {

    private String bankCardProvider;

    /**
    * The payment system. The possible values are: ALFABANK, BRAINTREE.
    */
    public String getBankCardProvider() {
        return this.bankCardProvider;
    }

    public boolean hasBankCardProvider() {
        return this.bankCardProvider != null;
    }

    private Boolean autoCharge;

    /**
    * The auto_charge flag.
    */
    public Boolean getAutoCharge() {
        return this.autoCharge;
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    private BigDecimal minBalance ;

    /**
    * The min account balance to trigger the auto charging.
    */
    public BigDecimal getMinBalance () {
        return this.minBalance ;
    }

    public boolean hasMinBalance () {
        return this.minBalance  != null;
    }

    private BigDecimal cardOverrunValue;

    /**
    * The card overrun value in the account currency.
    */
    public BigDecimal getCardOverrunValue() {
        return this.cardOverrunValue;
    }

    public boolean hasCardOverrunValue() {
        return this.cardOverrunValue != null;
    }

    private Long expirationYear;

    /**
    * The card expiration year.
    */
    public Long getExpirationYear() {
        return this.expirationYear;
    }

    public boolean hasExpirationYear() {
        return this.expirationYear != null;
    }

    private Long expirationMonth;

    /**
    * The card expiration month.
    */
    public Long getExpirationMonth() {
        return this.expirationMonth;
    }

    public boolean hasExpirationMonth() {
        return this.expirationMonth != null;
    }

    private Long acct;

    /**
    * The last card number digits.
    */
    public Long getAcct() {
        return this.acct;
    }

    public boolean hasAcct() {
        return this.acct != null;
    }

    private BankCardErrorType lastError;

    /**
    * The last card error.
    */
    public BankCardErrorType getLastError() {
        return this.lastError;
    }

    public boolean hasLastError() {
        return this.lastError != null;
    }

    private String cardHolder;

    /**
    * The cardholder’s first name and last name.
    */
    public String getCardHolder() {
        return this.cardHolder;
    }

    public boolean hasCardHolder() {
        return this.cardHolder != null;
    }

    private String cardType;

    /**
    * The card's payment system. The possible values are: VISA, MASTER CARD.
    */
    public String getCardType() {
        return this.cardType;
    }

    public boolean hasCardType() {
        return this.cardType != null;
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
        if (bankCardProvider != null) {
            sb.append(aligned)
                .append("\"bankCardProvider\": \"")
                .append(bankCardProvider)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (autoCharge != null) {
            sb.append(aligned)
                .append("\"autoCharge\": \"")
                .append(autoCharge)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (minBalance  != null) {
            sb.append(aligned)
                .append("\"minBalance \": \"")
                .append(minBalance )
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
        if (expirationYear != null) {
            sb.append(aligned)
                .append("\"expirationYear\": \"")
                .append(expirationYear)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expirationMonth != null) {
            sb.append(aligned)
                .append("\"expirationMonth\": \"")
                .append(expirationMonth)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acct != null) {
            sb.append(aligned)
                .append("\"acct\": \"")
                .append(acct)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lastError != null) {
            sb.append(aligned)
                .append("\"lastError\": \"")
                .append(lastError)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cardHolder != null) {
            sb.append(aligned)
                .append("\"cardHolder\": \"")
                .append(cardHolder)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cardType != null) {
            sb.append(aligned)
                .append("\"cardType\": \"")
                .append(cardType)
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