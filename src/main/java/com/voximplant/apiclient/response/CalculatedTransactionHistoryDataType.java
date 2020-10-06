package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [HistoryReportType] calculated_data object if the
* [HistoryReportType] history_type parameter is set to 'transactions'.
*/
public class CalculatedTransactionHistoryDataType implements Alignable {

    private Long transactionCount;

    /**
    * The transaction count in the report.
    */
    public Long getTransactionCount() {
        return this.transactionCount;
    }

    public boolean hasTransactionCount() {
        return this.transactionCount != null;
    }

    private Long totalTransactionCount;

    /**
    * The total found filtered transaction count.
    */
    public Long getTotalTransactionCount() {
        return this.totalTransactionCount;
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
    public Long getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private Long userId;

    /**
    * The user ID.
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private Long userName;

    /**
    * The user name.
    */
    public Long getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private Boolean isChecked;

    /**
    * true if balance&transactions are valid.
    */
    public Boolean getIsChecked() {
        return this.isChecked;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (transactionCount != null) {
            sb.append(aligned)
                .append("\"transactionCount\": \"")
                .append(transactionCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (totalTransactionCount != null) {
            sb.append(aligned)
                .append("\"totalTransactionCount\": \"")
                .append(totalTransactionCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (startBalance != null) {
            sb.append(aligned)
                .append("\"startBalance\": \"")
                .append(startBalance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (endBalance != null) {
            sb.append(aligned)
                .append("\"endBalance\": \"")
                .append(endBalance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isChecked != null) {
            sb.append(aligned)
                .append("\"isChecked\": \"")
                .append(isChecked)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (timezone != null) {
            sb.append(aligned)
                .append("\"timezone\": \"")
                .append(timezone)
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