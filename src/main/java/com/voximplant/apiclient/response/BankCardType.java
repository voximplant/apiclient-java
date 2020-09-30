package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The bank card info.
*/
public class BankCardType {

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
    public boolean getAutoCharge() {
        return this.autoCharge.booleanValue();
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
    public long getExpirationYear() {
        return this.expirationYear.longValue();
    }

    public boolean hasExpirationYear() {
        return this.expirationYear != null;
    }

    private Long expirationMonth;

    /**
    * The card expiration month.
    */
    public long getExpirationMonth() {
        return this.expirationMonth.longValue();
    }

    public boolean hasExpirationMonth() {
        return this.expirationMonth != null;
    }

    private Long acct;

    /**
    * The last card number digits.
    */
    public long getAcct() {
        return this.acct.longValue();
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

}