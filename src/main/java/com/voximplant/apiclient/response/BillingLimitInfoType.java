package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The payment limit info.
*/
public class BillingLimitInfoType {

    private Long minAmount;

    /**
    * The minimum amount.
    */
    public long getMinAmount() {
        return this.minAmount.longValue();
    }

    public boolean hasMinAmount() {
        return this.minAmount != null;
    }

    private String currency;

    /**
    * The currency.
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

}