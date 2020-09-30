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
public class MinBalanceCallback {

    private Boolean isMinCredit;

    /**
    * True if the credit threshold exceeded. The credit threshold =
    * credit_limit - min_balance_to_notify, wherein min_balance_to_notify >
    * 0.
    */
    public boolean getIsMinCredit() {
        return this.isMinCredit.booleanValue();
    }

    public boolean hasIsMinCredit() {
        return this.isMinCredit != null;
    }

    private Boolean isRepeated;

    /**
    * True if the callback is repeated.
    */
    public boolean getIsRepeated() {
        return this.isRepeated.booleanValue();
    }

    public boolean hasIsRepeated() {
        return this.isRepeated != null;
    }

}