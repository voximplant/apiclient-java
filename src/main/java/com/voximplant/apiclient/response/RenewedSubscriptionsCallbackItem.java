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
* The specific account callback details.
*/
public class RenewedSubscriptionsCallbackItem implements Alignable {

    private String type;

    /**
    * The subscription type, example: PHONE_NUM, SIP_REGISTRATION, PLAN
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private String name;

    /**
    * The subscription description (details). Example: the subscribed phone
    * number.
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

    private BigDecimal cost;

    /**
    * The subscription cost.
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date nextRenewal;

    /**
    * The next renewal date, format: YYYY-MM-DD
    */
    public Date getNextRenewal() {
        return this.nextRenewal;
    }

    public boolean hasNextRenewal() {
        return this.nextRenewal != null;
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
        if (type != null) {
            sb.append(aligned)
                .append("\"type\": \"")
                .append(type)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (name != null) {
            sb.append(aligned)
                .append("\"name\": \"")
                .append(name)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cost != null) {
            sb.append(aligned)
                .append("\"cost\": \"")
                .append(cost)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (nextRenewal != null) {
            sb.append(aligned)
                .append("\"nextRenewal\": \"")
                .append(nextRenewal)
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