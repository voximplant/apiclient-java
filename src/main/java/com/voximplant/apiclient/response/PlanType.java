package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAvailablePlans] function result item.
*/
public class PlanType {

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

    private PlanPackageType[] packages;

    /**
    * The account package array.
    */
    public PlanPackageType[] getPackages() {
        return this.packages;
    }

    public boolean hasPackages() {
        return this.packages != null;
    }

}