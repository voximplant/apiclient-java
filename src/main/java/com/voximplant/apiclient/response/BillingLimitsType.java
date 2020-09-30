package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The payments limits applicable to each payment method. Payments that
* are beyond limits are declined.
*/
public class BillingLimitsType {

    private BillingLimitInfoType robokassa;

    /**
    * The Robokassa limits.
    */
    public BillingLimitInfoType getRobokassa() {
        return this.robokassa;
    }

    public boolean hasRobokassa() {
        return this.robokassa != null;
    }

    private BankCardBillingLimitInfoType bankCard;

    /**
    * The bank card limits.
    */
    public BankCardBillingLimitInfoType getBankCard() {
        return this.bankCard;
    }

    public boolean hasBankCard() {
        return this.bankCard != null;
    }

    private BillingLimitInfoType invoice;

    /**
    * The invoice limits.
    */
    public BillingLimitInfoType getInvoice() {
        return this.invoice;
    }

    public boolean hasInvoice() {
        return this.invoice != null;
    }

}