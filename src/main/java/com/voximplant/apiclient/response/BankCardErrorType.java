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
* The bank card error info.
*/
public class BankCardErrorType implements Alignable {

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
    * The error message
    */
    public String getMsg() {
        return this.msg;
    }

    public boolean hasMsg() {
        return this.msg != null;
    }

    private BigDecimal amount;

    /**
    * The amount in the payment currency
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private String currency;

    /**
    * The payment currency
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
        if (date != null) {
            sb.append(aligned)
                .append("\"date\": \"")
                .append(date)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (msg != null) {
            sb.append(aligned)
                .append("\"msg\": \"")
                .append(msg)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (amount != null) {
            sb.append(aligned)
                .append("\"amount\": \"")
                .append(amount)
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