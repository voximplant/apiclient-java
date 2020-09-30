package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The bank card error info.
*/
public class BankCardErrorType {

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date date;

    /**
    * The error date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getDate() {
        return this.date;
    }

    public boolean hasDate() {
        return this.date != null;
    }

    private String msg;

    /**
    * The error message.
    */
    public String getMsg() {
        return this.msg;
    }

    public boolean hasMsg() {
        return this.msg != null;
    }

    private BigDecimal amount;

    /**
    * The amount in the payment currency.
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private String currency;

    /**
    * The payment currency.
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

}