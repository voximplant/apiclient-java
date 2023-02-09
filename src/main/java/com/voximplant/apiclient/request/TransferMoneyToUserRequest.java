package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class TransferMoneyToUserRequest implements Alignable {
    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by semicolon (;). Use the 'all' value to
    * select all users
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by semicolon (;). Use the 'all' value to
    * select all users
    */
    public TransferMoneyToUserRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * The user name list separated by semicolon (;) that can be used
    * instead of <b>user_id</b>
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name list separated by semicolon (;) that can be used
    * instead of <b>user_id</b>
    */
    public TransferMoneyToUserRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private BigDecimal amount;

    @RequestField(name="amount")
    /**
    * The money amount, $. The absolute amount value must be equal or
    * greater than 0.01
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    /**
    * The money amount, $. The absolute amount value must be equal or
    * greater than 0.01
    */
    public TransferMoneyToUserRequest setAmount(BigDecimal d) {
        this.amount = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID. It is required if the <b>user_name</b> is
    * specified
    */
    public TransferMoneyToUserRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of <b>application_id</b>
    */
    public TransferMoneyToUserRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String currency;

    @RequestField(name="currency")
    /**
    * The amount currency. Examples: RUR, EUR, USD
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    /**
    * The amount currency. Examples: RUR, EUR, USD
    */
    public TransferMoneyToUserRequest setCurrency(String d) {
        this.currency = d;
        return this;
    }

    private Boolean strictMode;

    @RequestField(name="strict_mode")
    /**
    * Returns error if strict_mode is true and a user or the account hasn't
    * enough money
    */
    public Boolean getStrictMode() {
        return this.strictMode;
    }

    public boolean hasStrictMode() {
        return this.strictMode != null;
    }

    /**
    * Returns error if strict_mode is true and a user or the account hasn't
    * enough money
    */
    public TransferMoneyToUserRequest setStrictMode(boolean d) {
        this.strictMode = Boolean.valueOf(d);
        return this;
    }

    private String userTransactionDescription;

    @RequestField(name="user_transaction_description")
    /**
    * The user transaction description
    */
    public String getUserTransactionDescription() {
        return this.userTransactionDescription;
    }

    public boolean hasUserTransactionDescription() {
        return this.userTransactionDescription != null;
    }

    /**
    * The user transaction description
    */
    public TransferMoneyToUserRequest setUserTransactionDescription(String d) {
        this.userTransactionDescription = d;
        return this;
    }

    private String accountTransactionDescription;

    @RequestField(name="account_transaction_description")
    /**
    * The account transaction description. The following macro available:
    * ${user_id}, ${user_name}
    */
    public String getAccountTransactionDescription() {
        return this.accountTransactionDescription;
    }

    public boolean hasAccountTransactionDescription() {
        return this.accountTransactionDescription != null;
    }

    /**
    * The account transaction description. The following macro available:
    * ${user_id}, ${user_name}
    */
    public TransferMoneyToUserRequest setAccountTransactionDescription(String d) {
        this.accountTransactionDescription = d;
        return this;
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
        if (amount != null) {
            sb.append(aligned)
                .append("\"amount\": \"")
                .append(amount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (currency != null) {
            sb.append(aligned)
                .append("\"currency\": \"")
                .append(currency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (strictMode != null) {
            sb.append(aligned)
                .append("\"strictMode\": \"")
                .append(strictMode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userTransactionDescription != null) {
            sb.append(aligned)
                .append("\"userTransactionDescription\": \"")
                .append(userTransactionDescription)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountTransactionDescription != null) {
            sb.append(aligned)
                .append("\"accountTransactionDescription\": \"")
                .append(accountTransactionDescription)
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