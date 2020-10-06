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
* The account plan package info.
*/
public class AccountPlanPackageType implements Alignable {

    private Long[] priceGroupId;

    /**
    * The price group IDs.
    */
    public Long[] getPriceGroupId() {
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
    public Boolean getMayOverrun() {
        return this.mayOverrun;
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
    public Long getOverrunResources() {
        return this.overrunResources;
    }

    public boolean hasOverrunResources() {
        return this.overrunResources != null;
    }

    private Long resourceLeft;

    /**
    * The resource left in the package.
    */
    public Long getResourceLeft() {
        return this.resourceLeft;
    }

    public boolean hasResourceLeft() {
        return this.resourceLeft != null;
    }

    private Long packageSize;

    /**
    * The current package size (including overrun).
    */
    public Long getPackageSize() {
        return this.packageSize;
    }

    public boolean hasPackageSize() {
        return this.packageSize != null;
    }

    private Long origPackageSize;

    /**
    * The original package size (excluding overrun).
    */
    public Long getOrigPackageSize() {
        return this.origPackageSize;
    }

    public boolean hasOrigPackageSize() {
        return this.origPackageSize != null;
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
        if (priceGroupId != null) {
            sb.append(aligned)
                .append("\"number\": ")
                .append(StringHelper.arrayToString(priceGroupId, alignment + 1))
                .append(System.lineSeparator());
        }
        if (packageName != null) {
            sb.append(aligned)
                .append("\"packageName\": \"")
                .append(packageName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mayOverrun != null) {
            sb.append(aligned)
                .append("\"mayOverrun\": \"")
                .append(mayOverrun)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (overrunPrice != null) {
            sb.append(aligned)
                .append("\"overrunPrice\": \"")
                .append(overrunPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (overrunResources != null) {
            sb.append(aligned)
                .append("\"overrunResources\": \"")
                .append(overrunResources)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (resourceLeft != null) {
            sb.append(aligned)
                .append("\"resourceLeft\": \"")
                .append(resourceLeft)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (packageSize != null) {
            sb.append(aligned)
                .append("\"packageSize\": \"")
                .append(packageSize)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (origPackageSize != null) {
            sb.append(aligned)
                .append("\"origPackageSize\": \"")
                .append(origPackageSize)
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