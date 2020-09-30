package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The resource price group.
*/
public class PriceGroup {

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
    * The price group ID.
    */
    public long getPriceGroupId() {
        return this.priceGroupId.longValue();
    }

    public boolean hasPriceGroupId() {
        return this.priceGroupId != null;
    }

    private BigDecimal price;

    /**
    * The price for the 'num_resources_per_price' resource count.
    */
    public BigDecimal getPrice() {
        return this.price;
    }

    public boolean hasPrice() {
        return this.price != null;
    }

    private Long numResourcesPerPrice;

    /**
    * The resource count per price.
    */
    public long getNumResourcesPerPrice() {
        return this.numResourcesPerPrice.longValue();
    }

    public boolean hasNumResourcesPerPrice() {
        return this.numResourcesPerPrice != null;
    }

    private Long quantum;

    /**
    * The resource rounding quantum.
    */
    public long getQuantum() {
        return this.quantum.longValue();
    }

    public boolean hasQuantum() {
        return this.quantum != null;
    }

    private ResourceParams params;

    /**
    * The available resource parameters.
    */
    public ResourceParams getParams() {
        return this.params;
    }

    public boolean hasParams() {
        return this.params != null;
    }

}