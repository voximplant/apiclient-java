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
* The [GetAvailablePlans] function result item.
*/
public class PlanType implements Alignable {

    private Long planSubscriptionTemplateId;

    /**
    * The current plan ID
    */
    public Long getPlanSubscriptionTemplateId() {
        return this.planSubscriptionTemplateId;
    }

    public boolean hasPlanSubscriptionTemplateId() {
        return this.planSubscriptionTemplateId != null;
    }

    private String planType;

    /**
    * The plan type. The possible values are IM, MAU
    */
    public String getPlanType() {
        return this.planType;
    }

    public boolean hasPlanType() {
        return this.planType != null;
    }

    private String planName;

    /**
    * The plan name
    */
    public String getPlanName() {
        return this.planName;
    }

    public boolean hasPlanName() {
        return this.planName != null;
    }

    private BigDecimal periodicCharge;

    /**
    * The plan monthly charge
    */
    public BigDecimal getPeriodicCharge() {
        return this.periodicCharge;
    }

    public boolean hasPeriodicCharge() {
        return this.periodicCharge != null;
    }

    private PlanPackageType[] packages;

    /**
    * The account package array
    */
    public PlanPackageType[] getPackages() {
        return this.packages;
    }

    public boolean hasPackages() {
        return this.packages != null;
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
        if (planSubscriptionTemplateId != null) {
            sb.append(aligned)
                .append("\"planSubscriptionTemplateId\": \"")
                .append(planSubscriptionTemplateId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (planType != null) {
            sb.append(aligned)
                .append("\"planType\": \"")
                .append(planType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (planName != null) {
            sb.append(aligned)
                .append("\"planName\": \"")
                .append(planName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (periodicCharge != null) {
            sb.append(aligned)
                .append("\"periodicCharge\": \"")
                .append(periodicCharge)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (packages != null) {
            sb.append(aligned)
                .append("\"PlanPackageType\": ")
                .append(StringHelper.arrayToString(packages, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}