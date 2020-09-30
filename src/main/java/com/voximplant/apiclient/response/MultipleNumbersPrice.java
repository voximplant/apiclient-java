package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Info about multiple numbers subscription for the child accounts.
*/
public class MultipleNumbersPrice {

    private Long count;

    /**
    * The number of subscriptions which must be purchased simultaneously to
    * enable a multiple numbers subscription.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private BigDecimal price;

    /**
    * The subscription price for one number, i.e., the total multiple
    * numbers subscription price divided by the __count__ value.
    */
    public BigDecimal getPrice() {
        return this.price;
    }

    public boolean hasPrice() {
        return this.price != null;
    }

    private BigDecimal installationPrice;

    /**
    * The installation price for one number, i.e., the total multiple
    * numbers installation price divided by the __count__ value.
    */
    public BigDecimal getInstallationPrice() {
        return this.installationPrice;
    }

    public boolean hasInstallationPrice() {
        return this.installationPrice != null;
    }

}