package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The short account info.
*/
public class ShortAccountInfoType {

    private Long accountId;

    /**
    * The account's ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private Boolean frozen;

    /**
    * Is account blocked by Voximplant admins or not.
    */
    public boolean getFrozen() {
        return this.frozen.booleanValue();
    }

    public boolean hasFrozen() {
        return this.frozen != null;
    }

    private BigDecimal balance;

    /**
    * The account's money.
    */
    public BigDecimal getBalance() {
        return this.balance;
    }

    public boolean hasBalance() {
        return this.balance != null;
    }

    private String currency;

    /**
    * The currency code (USD, RUR, EUR, ...).
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

}