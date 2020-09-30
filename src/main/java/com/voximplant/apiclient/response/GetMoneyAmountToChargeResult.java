package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetMoneyAmountToCharge] function result.
*/
public class GetMoneyAmountToChargeResult {

    private BigDecimal amount;

    /**
    * The money amount of the subscriptions + plan + negative_balance in
    * the specified currency.
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private BigDecimal minAmount;

    /**
    * The 'amount' value minus the positive account balance in the
    * specified currency.
    */
    public BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public boolean hasMinAmount() {
        return this.minAmount != null;
    }

    private BigDecimal bankCardAmountUsd;

    /**
    * Exists if bank card payments are allowed. It's the maximum of the
    * 'amount' in USD and the min_card_payment (10$).
    */
    public BigDecimal getBankCardAmountUsd() {
        return this.bankCardAmountUsd;
    }

    public boolean hasBankCardAmountUsd() {
        return this.bankCardAmountUsd != null;
    }

    private BigDecimal minBankCardAmountUsd;

    /**
    * Exists if bank card payments are allowed. It's the maximum of the
    * 'min_amount' in USD and the min_card_payment (10$).
    */
    public BigDecimal getMinBankCardAmountUsd() {
        return this.minBankCardAmountUsd;
    }

    public boolean hasMinBankCardAmountUsd() {
        return this.minBankCardAmountUsd != null;
    }

    private BigDecimal robokassaAmountRub;

    /**
    * Exists if robokassa payments are allowed. It's the maximum of the
    * 'min_amount' in RUR and the min_robokassa_payment (500 RUR).
    */
    public BigDecimal getRobokassaAmountRub() {
        return this.robokassaAmountRub;
    }

    public boolean hasRobokassaAmountRub() {
        return this.robokassaAmountRub != null;
    }

    private BigDecimal minRobokassaAmountRub;

    /**
    * Exists if robokassa payments are allowed. It's the maximum of the
    * 'min_amount' in RUR and the min_robokassa_payment (500 RUR).
    */
    public BigDecimal getMinRobokassaAmountRub() {
        return this.minRobokassaAmountRub;
    }

    public boolean hasMinRobokassaAmountRub() {
        return this.minRobokassaAmountRub != null;
    }

    private SubscriptionsToChargeType[] subscriptions;

    /**
    * The subscriptions to charge.
    */
    public SubscriptionsToChargeType[] getSubscriptions() {
        return this.subscriptions;
    }

    public boolean hasSubscriptions() {
        return this.subscriptions != null;
    }

}