package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [ChargeAccount] function result.
*/
public class ChargeAccountResult {

    private BigDecimal chargedAmount;

    /**
    * The charged money amount.
    */
    public BigDecimal getChargedAmount() {
        return this.chargedAmount;
    }

    public boolean hasChargedAmount() {
        return this.chargedAmount != null;
    }

    private ChargedPhoneType[] phones;

    /**
    * The charged phone list.
    */
    public ChargedPhoneType[] getPhones() {
        return this.phones;
    }

    public boolean hasPhones() {
        return this.phones != null;
    }

}