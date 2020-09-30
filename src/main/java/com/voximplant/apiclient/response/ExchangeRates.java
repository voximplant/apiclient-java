package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetCurrencyRate] function result.
*/
public class ExchangeRates {

    private BigDecimal RUR;

    /**
    * The RUR exchange rate.
    */
    public BigDecimal getRUR() {
        return this.RUR;
    }

    public boolean hasRUR() {
        return this.RUR != null;
    }

    private BigDecimal EUR;

    /**
    * The EUR exchange rate.
    */
    public BigDecimal getEUR() {
        return this.EUR;
    }

    public boolean hasEUR() {
        return this.EUR != null;
    }

    private BigDecimal USD;

    /**
    * The USD exchange rate. It's always equal to 1.
    */
    public BigDecimal getUSD() {
        return this.USD;
    }

    public boolean hasUSD() {
        return this.USD != null;
    }

}