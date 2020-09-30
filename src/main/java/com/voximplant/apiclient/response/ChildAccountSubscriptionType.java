package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [AddChildAccountSubscription] and [GetChildAccountSubscriptions]
* function result.
*/
public class ChildAccountSubscriptionType {

    private Long subscriptionId;

    /**
    * The subscription ID.
    */
    public long getSubscriptionId() {
        return this.subscriptionId.longValue();
    }

    public boolean hasSubscriptionId() {
        return this.subscriptionId != null;
    }

    private String subscriptionName;

    /**
    * The subscription name.
    */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public boolean hasSubscriptionName() {
        return this.subscriptionName != null;
    }

    private Long subscriptionTemplateId;

    /**
    * The subscription template ID.
    */
    public long getSubscriptionTemplateId() {
        return this.subscriptionTemplateId.longValue();
    }

    public boolean hasSubscriptionTemplateId() {
        return this.subscriptionTemplateId != null;
    }

    private Boolean autoCharge;

    /**
    * Is the subscription prolonged automatically?
    */
    public boolean getAutoCharge() {
        return this.autoCharge.booleanValue();
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date nextRenewal;

    /**
    * The next charge UTC date in format: YYYY-MM-DD.
    */
    public Date getNextRenewal() {
        return this.nextRenewal;
    }

    public boolean hasNextRenewal() {
        return this.nextRenewal != null;
    }

    private BigDecimal periodicPrice;

    /**
    * The periodic payment amount.
    */
    public BigDecimal getPeriodicPrice() {
        return this.periodicPrice;
    }

    public boolean hasPeriodicPrice() {
        return this.periodicPrice != null;
    }

    private Boolean active;

    /**
    * Is the subscription active?
    */
    public boolean getActive() {
        return this.active.booleanValue();
    }

    public boolean hasActive() {
        return this.active != null;
    }

}