package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [HistoryReportType] calculated_data object if the
* [HistoryReportType] history_type parameter is set to 'transactions'.
*/
public class CalculatedTransactionHistoryDataType {

    private Long transactionCount;

    /**
    * The transaction count in the report.
    */
    public long getTransactionCount() {
        return this.transactionCount.longValue();
    }

    public boolean hasTransactionCount() {
        return this.transactionCount != null;
    }

    private Long totalTransactionCount;

    /**
    * The total found filtered transaction count.
    */
    public long getTotalTransactionCount() {
        return this.totalTransactionCount.longValue();
    }

    public boolean hasTotalTransactionCount() {
        return this.totalTransactionCount != null;
    }

    private String startBalance;

    /**
    * The start account/user balance with currency. Example: 2.3 USD
    */
    public String getStartBalance() {
        return this.startBalance;
    }

    public boolean hasStartBalance() {
        return this.startBalance != null;
    }

    private String endBalance;

    /**
    * The end account/user balance with currency. Example: 12.5 RUR
    */
    public String getEndBalance() {
        return this.endBalance;
    }

    public boolean hasEndBalance() {
        return this.endBalance != null;
    }

    private Long accountId;

    /**
    * The account ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private Long userId;

    /**
    * The user ID.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private Long userName;

    /**
    * The user name.
    */
    public long getUserName() {
        return this.userName.longValue();
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private Boolean isChecked;

    /**
    * true if balance&transactions are valid.
    */
    public boolean getIsChecked() {
        return this.isChecked.booleanValue();
    }

    public boolean hasIsChecked() {
        return this.isChecked != null;
    }

    private String timezone;

    /**
    * The selected timezone.
    */
    public String getTimezone() {
        return this.timezone;
    }

    public boolean hasTimezone() {
        return this.timezone != null;
    }

}