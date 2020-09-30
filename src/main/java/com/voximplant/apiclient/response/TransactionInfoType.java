package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetTransactionHistory] function result item.
*/
public class TransactionInfoType {

    private Long transactionId;

    /**
    * The transaction ID.
    */
    public long getTransactionId() {
        return this.transactionId.longValue();
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private String accountId;

    /**
    * The account ID.
    */
    public String getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date performedAt;

    /**
    * The transaction date in the selected timezone in 24-h format:
    * YYYY-MM-DD HH:mm:ss
    */
    public Date getPerformedAt() {
        return this.performedAt;
    }

    public boolean hasPerformedAt() {
        return this.performedAt != null;
    }

    private BigDecimal amount;

    /**
    * The transaction amount, $.
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private String currency;

    /**
    * The amount currency (USD, RUR, EUR, ...). 
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    private String transactionType;

    /**
    * The transaction type. The following values are possible:
    * periodic_charge, resource_charge, money_distribution,
    * subscription_charge, subscription_installation_charge,
    * card_periodic_payment, card_overrun_payment, card_payment,
    * robokassa_payment, gift, add_money, subscription_cancel, adjustment,
    * wire_transfer, refund.
    */
    public String getTransactionType() {
        return this.transactionType;
    }

    public boolean hasTransactionType() {
        return this.transactionType != null;
    }

    private String transactionDescription;

    /**
    * The transaction description.
    */
    public String getTransactionDescription() {
        return this.transactionDescription;
    }

    public boolean hasTransactionDescription() {
        return this.transactionDescription != null;
    }

    private String paymentReference;

    /**
    * The external payment reference. See the [TransferMoneyToChildAccount]
    * function.
    */
    public String getPaymentReference() {
        return this.paymentReference;
    }

    public boolean hasPaymentReference() {
        return this.paymentReference != null;
    }

}