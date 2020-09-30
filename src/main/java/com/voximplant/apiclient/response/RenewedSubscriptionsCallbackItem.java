package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details.
*/
public class RenewedSubscriptionsCallbackItem {

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

}