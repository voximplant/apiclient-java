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
public class PlanPackageConfig {

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

    private String packageUuid;

    /**
    * The package UUID.
    */
    public String getPackageUuid() {
        return this.packageUuid;
    }

    public boolean hasPackageUuid() {
        return this.packageUuid != null;
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

    private Long packageSize;

    /**
    * The current package size (including overrun).
    */
    public long getPackageSize() {
        return this.packageSize.longValue();
    }

    public boolean hasPackageSize() {
        return this.packageSize != null;
    }

}