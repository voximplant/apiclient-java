package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAccountPlans] function result item.
*/
public class AccountPlanType {

    private Long planSubscriptionTemplateId;

    /**
    * The current plan ID.
    */
    public long getPlanSubscriptionTemplateId() {
        return this.planSubscriptionTemplateId.longValue();
    }

    public boolean hasPlanSubscriptionTemplateId() {
        return this.planSubscriptionTemplateId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date nextCharge;

    /**
    * The next charge date, format: YYYY-MM-DD
    */
    public Date getNextCharge() {
        return this.nextCharge;
    }

    public boolean hasNextCharge() {
        return this.nextCharge != null;
    }

    private String planType;

    /**
    * The plan type. The possible values are: IM, MAU.
    */
    public String getPlanType() {
        return this.planType;
    }

    public boolean hasPlanType() {
        return this.planType != null;
    }

    private String planName;

    /**
    * The plan name.
    */
    public String getPlanName() {
        return this.planName;
    }

    public boolean hasPlanName() {
        return this.planName != null;
    }

    private BigDecimal periodicCharge;

    /**
    * The plan monthly charge.
    */
    public BigDecimal getPeriodicCharge() {
        return this.periodicCharge;
    }

    public boolean hasPeriodicCharge() {
        return this.periodicCharge != null;
    }

    private AccountPlanPackageType[] packages;

    /**
    * The account plan package array.
    */
    public AccountPlanPackageType[] getPackages() {
        return this.packages;
    }

    public boolean hasPackages() {
        return this.packages != null;
    }

}