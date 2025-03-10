package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The specific account callback details.
*/
public class PlanPackageConfig implements Alignable {

    private Long[] priceGroupId;

    /**
    * The price group IDs
    */
    public Long[] getPriceGroupId() {
        return this.priceGroupId;
    }

    public boolean hasPriceGroupId() {
        return this.priceGroupId != null;
    }

    private String packageName;

    /**
    * The package name
    */
    public String getPackageName() {
        return this.packageName;
    }

    public boolean hasPackageName() {
        return this.packageName != null;
    }

    private String packageUuid;

    /**
    * The package UUID
    */
    public String getPackageUuid() {
        return this.packageUuid;
    }

    public boolean hasPackageUuid() {
        return this.packageUuid != null;
    }

    private Boolean mayOverrun;

    /**
    * Whether overrun is enabled
    */
    public Boolean getMayOverrun() {
        return this.mayOverrun;
    }

    public boolean hasMayOverrun() {
        return this.mayOverrun != null;
    }

    private Long packageSize;

    /**
    * The current package size (including overrun)
    */
    public Long getPackageSize() {
        return this.packageSize;
    }

    public boolean hasPackageSize() {
        return this.packageSize != null;
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
        if (packageUuid != null) {
            sb.append(aligned)
                .append("\"packageUuid\": \"")
                .append(packageUuid)
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
        if (packageSize != null) {
            sb.append(aligned)
                .append("\"packageSize\": \"")
                .append(packageSize)
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