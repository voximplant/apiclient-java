package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAutochargeConfig] function result.
*/
public class GetAutochargeConfigResultType {

    private Boolean autoCharge;

    /**
    * Is auto charge enabled or not.
    */
    public boolean getAutoCharge() {
        return this.autoCharge.booleanValue();
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    private Long minBalance;

    /**
    * The auto charge threshold.
    */
    public long getMinBalance() {
        return this.minBalance.longValue();
    }

    public boolean hasMinBalance() {
        return this.minBalance != null;
    }

    private String cardOverrunValue;

    /**
    * The auto top-up amount in the account's currency.
    */
    public String getCardOverrunValue() {
        return this.cardOverrunValue;
    }

    public boolean hasCardOverrunValue() {
        return this.cardOverrunValue != null;
    }

    private String receiptEmail;

    /**
    * The email for receiving payment receipts.
    */
    public String getReceiptEmail() {
        return this.receiptEmail;
    }

    public boolean hasReceiptEmail() {
        return this.receiptEmail != null;
    }

}