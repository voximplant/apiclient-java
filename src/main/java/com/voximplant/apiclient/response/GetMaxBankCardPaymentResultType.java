package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetMaxBankCardPayment] function result.
*/
public class GetMaxBankCardPaymentResultType {

    private Long maxPayment;

    /**
    * The maximum payment for the specified card. It's always equal or less
    * than **new_max_payment**.
    */
    public long getMaxPayment() {
        return this.maxPayment.longValue();
    }

    public boolean hasMaxPayment() {
        return this.maxPayment != null;
    }

    private Long newMaxPayment;

    /**
    * The maximum payment available for any card. The values depends on
    * payment gateways, previous transactions during the last 24 hours,
    * etc.
    */
    public long getNewMaxPayment() {
        return this.newMaxPayment.longValue();
    }

    public boolean hasNewMaxPayment() {
        return this.newMaxPayment != null;
    }

    private String currency;

    /**
    * The currency code (USD, RUR, ...).
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

}