package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The plan package info.
*/
public class PlanPackageType {

    private long[] priceGroupId;

    /**
    * The price group IDs.
    */
    public long[] getPriceGroupId() {
        return this.priceGroupId;
    }

    public boolean hasPriceGroupId() {
        return this.priceGroupId != null;
    }

    private String packageName;

    /**
    * The package name.
    */
    public String getPackageName() {
        return this.packageName;
    }

    public boolean hasPackageName() {
        return this.packageName != null;
    }

    private Boolean mayOverrun;

    /**
    * Is overrun enabled?
    */
    public boolean getMayOverrun() {
        return this.mayOverrun.booleanValue();
    }

    public boolean hasMayOverrun() {
        return this.mayOverrun != null;
    }

    private BigDecimal overrunPrice;

    /**
    * The overrun amount.
    */
    public BigDecimal getOverrunPrice() {
        return this.overrunPrice;
    }

    public boolean hasOverrunPrice() {
        return this.overrunPrice != null;
    }

    private Long overrunResources;

    /**
    * The number of resources (e.g., messages) per overrun.
    */
    public long getOverrunResources() {
        return this.overrunResources.longValue();
    }

    public boolean hasOverrunResources() {
        return this.overrunResources != null;
    }

    private Long packageSize;

    /**
    * The package size.
    */
    public long getPackageSize() {
        return this.packageSize.longValue();
    }

    public boolean hasPackageSize() {
        return this.packageSize != null;
    }

}