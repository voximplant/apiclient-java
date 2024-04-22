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
* The [GetMoneyAmountToCharge] function result field.
*/
public class SubscriptionsToChargeType implements Alignable {

    private BigDecimal subscriptionAmount;

    /**
    * The money amount to charge in the specified currency
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
    * number
    */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    public boolean hasSubscriptionDescription() {
        return this.subscriptionDescription != null;
    }

    private Boolean subscriptionAutoCharge;

    /**
    * Whether the subscription charges automatically
    */
    public Boolean getSubscriptionAutoCharge() {
        return this.subscriptionAutoCharge;
    }

    public boolean hasSubscriptionAutoCharge() {
        return this.subscriptionAutoCharge != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date subscriptionNextRenewal;

    /**
    * The next renewal date, format: YYYY-MM-DD. Displayed for only
    * verified phone numbers
    */
    public Date getSubscriptionNextRenewal() {
        return this.subscriptionNextRenewal;
    }

    public boolean hasSubscriptionNextRenewal() {
        return this.subscriptionNextRenewal != null;
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
        if (subscriptionAmount != null) {
            sb.append(aligned)
                .append("\"subscriptionAmount\": \"")
                .append(subscriptionAmount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionType != null) {
            sb.append(aligned)
                .append("\"subscriptionType\": \"")
                .append(subscriptionType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionDescription != null) {
            sb.append(aligned)
                .append("\"subscriptionDescription\": \"")
                .append(subscriptionDescription)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionAutoCharge != null) {
            sb.append(aligned)
                .append("\"subscriptionAutoCharge\": \"")
                .append(subscriptionAutoCharge)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionNextRenewal != null) {
            sb.append(aligned)
                .append("\"subscriptionNextRenewal\": \"")
                .append(subscriptionNextRenewal)
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