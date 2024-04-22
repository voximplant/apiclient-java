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
* The [AddChildAccountSubscription] and [GetChildAccountSubscriptions]
* function result.
*/
public class ChildAccountSubscriptionType implements Alignable {

    private Long subscriptionId;

    /**
    * The subscription ID
    */
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public boolean hasSubscriptionId() {
        return this.subscriptionId != null;
    }

    private String subscriptionName;

    /**
    * The subscription name
    */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public boolean hasSubscriptionName() {
        return this.subscriptionName != null;
    }

    private Long subscriptionTemplateId;

    /**
    * The subscription template ID
    */
    public Long getSubscriptionTemplateId() {
        return this.subscriptionTemplateId;
    }

    public boolean hasSubscriptionTemplateId() {
        return this.subscriptionTemplateId != null;
    }

    private Boolean autoCharge;

    /**
    * Whether the subscription is prolonged automatically
    */
    public Boolean getAutoCharge() {
        return this.autoCharge;
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date nextRenewal;

    /**
    * The next charge UTC date in format: YYYY-MM-DD
    */
    public Date getNextRenewal() {
        return this.nextRenewal;
    }

    public boolean hasNextRenewal() {
        return this.nextRenewal != null;
    }

    private BigDecimal periodicPrice;

    /**
    * The periodic payment amount
    */
    public BigDecimal getPeriodicPrice() {
        return this.periodicPrice;
    }

    public boolean hasPeriodicPrice() {
        return this.periodicPrice != null;
    }

    private Boolean active;

    /**
    * Whether the subscription is active
    */
    public Boolean getActive() {
        return this.active;
    }

    public boolean hasActive() {
        return this.active != null;
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
        if (subscriptionId != null) {
            sb.append(aligned)
                .append("\"subscriptionId\": \"")
                .append(subscriptionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionName != null) {
            sb.append(aligned)
                .append("\"subscriptionName\": \"")
                .append(subscriptionName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionTemplateId != null) {
            sb.append(aligned)
                .append("\"subscriptionTemplateId\": \"")
                .append(subscriptionTemplateId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (autoCharge != null) {
            sb.append(aligned)
                .append("\"autoCharge\": \"")
                .append(autoCharge)
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
        if (periodicPrice != null) {
            sb.append(aligned)
                .append("\"periodicPrice\": \"")
                .append(periodicPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (active != null) {
            sb.append(aligned)
                .append("\"active\": \"")
                .append(active)
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