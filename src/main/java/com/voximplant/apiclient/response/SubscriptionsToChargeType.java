package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetMoneyAmountToCharge] function result field.
*/
public class SubscriptionsToChargeType {

    private BigDecimal subscriptionAmount;

    /**
    * The money amount to charge in the specified currency.
    */
    public BigDecimal getSubscriptionAmount() {
        return this.subscriptionAmount;
    }

    public boolean hasSubscriptionAmount() {
        return this.subscriptionAmount != null;
    }

    private String subscriptionType;

    /**
    * The subscription type, example: PHONE_NUM, SIP_REGISTRATION
    */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public boolean hasSubscriptionType() {
        return this.subscriptionType != null;
    }

    private String subscriptionDescription;

    /**
    * The subscription description (details). Example: the subscribed phone
    * number.
    */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    public boolean hasSubscriptionDescription() {
        return this.subscriptionDescription != null;
    }

    private Boolean subscriptionAutoCharge;

    /**
    * The auto charge flag.
    */
    public boolean getSubscriptionAutoCharge() {
        return this.subscriptionAutoCharge.booleanValue();
    }

    public boolean hasSubscriptionAutoCharge() {
        return this.subscriptionAutoCharge != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date subscriptionNextRenewal;

    /**
    * The next renewal date, format: YYYY-MM-DD. Displayed for only
    * verified phone numbers.
    */
    public Date getSubscriptionNextRenewal() {
        return this.subscriptionNextRenewal;
    }

    public boolean hasSubscriptionNextRenewal() {
        return this.subscriptionNextRenewal != null;
    }

}