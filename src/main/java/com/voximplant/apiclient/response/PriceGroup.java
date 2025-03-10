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
* The resource price group.
*/
public class PriceGroup implements Alignable {

    private String priceGroupName;

    /**
    * The price group name. Example: Russia Mobile
    */
    public String getPriceGroupName() {
        return this.priceGroupName;
    }

    public boolean hasPriceGroupName() {
        return this.priceGroupName != null;
    }

    private Long priceGroupId;

    /**
    * The price group ID
    */
    public Long getPriceGroupId() {
        return this.priceGroupId;
    }

    public boolean hasPriceGroupId() {
        return this.priceGroupId != null;
    }

    private BigDecimal price;

    /**
    * The price for the 'num_resources_per_price' resource count
    */
    public BigDecimal getPrice() {
        return this.price;
    }

    public boolean hasPrice() {
        return this.price != null;
    }

    private Long numResourcesPerPrice;

    /**
    * The resource count per price
    */
    public Long getNumResourcesPerPrice() {
        return this.numResourcesPerPrice;
    }

    public boolean hasNumResourcesPerPrice() {
        return this.numResourcesPerPrice != null;
    }

    private Long quantum;

    /**
    * The resource rounding quantum
    */
    public Long getQuantum() {
        return this.quantum;
    }

    public boolean hasQuantum() {
        return this.quantum != null;
    }

    private ResourceParams params;

    /**
    * The available resource parameters
    */
    public ResourceParams getParams() {
        return this.params;
    }

    public boolean hasParams() {
        return this.params != null;
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
        if (priceGroupName != null) {
            sb.append(aligned)
                .append("\"priceGroupName\": \"")
                .append(priceGroupName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priceGroupId != null) {
            sb.append(aligned)
                .append("\"priceGroupId\": \"")
                .append(priceGroupId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (price != null) {
            sb.append(aligned)
                .append("\"price\": \"")
                .append(price)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (numResourcesPerPrice != null) {
            sb.append(aligned)
                .append("\"numResourcesPerPrice\": \"")
                .append(numResourcesPerPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (quantum != null) {
            sb.append(aligned)
                .append("\"quantum\": \"")
                .append(quantum)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (params != null) {
            sb.append(aligned)
                .append("\"params\": \"")
                .append(params)
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