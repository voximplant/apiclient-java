package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class PlanConfigCallback {

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

    private PlanPackageConfig[] packages;

    /**
    * The account plan package array.
    */
    public PlanPackageConfig[] getPackages() {
        return this.packages;
    }

    public boolean hasPackages() {
        return this.packages != null;
    }

}