package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetTransactionHistoryRequest implements Alignable {
    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The from date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * The from date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public GetTransactionHistoryRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The to date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * The to date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public GetTransactionHistoryRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private String timezone;

    @RequestField(name="timezone")
    /**
    * The selected timezone or the 'auto' value (the account location).
    */
    public String getTimezone() {
        return this.timezone;
    }

    public boolean hasTimezone() {
        return this.timezone != null;
    }

    /**
    * The selected timezone or the 'auto' value (the account location).
    */
    public GetTransactionHistoryRequest setTimezone(String d) {
        this.timezone = d;
        return this;
    }

    private MultiArgument<Long> transactionId;

    @RequestField(name="transaction_id")
    /**
    * The transaction ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getTransactionId() {
        return this.transactionId;
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    /**
    * The transaction ID list separated by the ';' symbol.
    */
    public GetTransactionHistoryRequest setTransactionId(MultiArgument<Long> d) {
        this.transactionId = d;
        return this;
    }

    private String paymentReference;

    @RequestField(name="payment_reference")
    /**
    * The external payment reference to filter.
    */
    public String getPaymentReference() {
        return this.paymentReference;
    }

    public boolean hasPaymentReference() {
        return this.paymentReference != null;
    }

    /**
    * The external payment reference to filter.
    */
    public GetTransactionHistoryRequest setPaymentReference(String d) {
        this.paymentReference = d;
        return this;
    }

    private MultiArgument<String> transactionType;

    @RequestField(name="transaction_type")
    /**
    * The transaction type list separated by the ';' symbol. The following
    * values are possible: periodic_charge, resource_charge,
    * money_distribution, subscription_charge,
    * subscription_installation_charge, card_periodic_payment,
    * card_overrun_payment, card_payment, robokassa_payment, gift,
    * add_money, subscription_cancel, adjustment, wire_transfer, refund.
    */
    public MultiArgument<String> getTransactionType() {
        return this.transactionType;
    }

    public boolean hasTransactionType() {
        return this.transactionType != null;
    }

    /**
    * The transaction type list separated by the ';' symbol. The following
    * values are possible: periodic_charge, resource_charge,
    * money_distribution, subscription_charge,
    * subscription_installation_charge, card_periodic_payment,
    * card_overrun_payment, card_payment, robokassa_payment, gift,
    * add_money, subscription_cancel, adjustment, wire_transfer, refund.
    */
    public GetTransactionHistoryRequest setTransactionType(MultiArgument<String> d) {
        this.transactionType = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by the ';' symbol.
    */
    public GetTransactionHistoryRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public GetTransactionHistoryRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private Boolean childrenTransactionsOnly;

    @RequestField(name="children_transactions_only")
    /**
    * Set true to get the children account transactions only.
    */
    public Boolean getChildrenTransactionsOnly() {
        return this.childrenTransactionsOnly;
    }

    public boolean hasChildrenTransactionsOnly() {
        return this.childrenTransactionsOnly != null;
    }

    /**
    * Set true to get the children account transactions only.
    */
    public GetTransactionHistoryRequest setChildrenTransactionsOnly(boolean d) {
        this.childrenTransactionsOnly = Boolean.valueOf(d);
        return this;
    }

    private Boolean usersTransactionsOnly;

    @RequestField(name="users_transactions_only")
    /**
    * Set true to get the users' transactions only.
    */
    public Boolean getUsersTransactionsOnly() {
        return this.usersTransactionsOnly;
    }

    public boolean hasUsersTransactionsOnly() {
        return this.usersTransactionsOnly != null;
    }

    /**
    * Set true to get the users' transactions only.
    */
    public GetTransactionHistoryRequest setUsersTransactionsOnly(boolean d) {
        this.usersTransactionsOnly = Boolean.valueOf(d);
        return this;
    }

    private Boolean descOrder;

    @RequestField(name="desc_order")
    /**
    * Set true to get records in the descent order.
    */
    public Boolean getDescOrder() {
        return this.descOrder;
    }

    public boolean hasDescOrder() {
        return this.descOrder != null;
    }

    /**
    * Set true to get records in the descent order.
    */
    public GetTransactionHistoryRequest setDescOrder(boolean d) {
        this.descOrder = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetTransactionHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetTransactionHistoryRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The following values available: json, csv
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The following values available: json, csv
    */
    public GetTransactionHistoryRequest setOutput(String d) {
        this.output = d;
        return this;
    }

    private Boolean isAsync;

    @RequestField(name="is_async")
    /**
    * Set true to get records in the asynchronous mode (for csv output
    * only). See the [GetHistoryReports], [DownloadHistoryReport]
    * functions.
    */
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public boolean hasIsAsync() {
        return this.isAsync != null;
    }

    /**
    * Set true to get records in the asynchronous mode (for csv output
    * only). See the [GetHistoryReports], [DownloadHistoryReport]
    * functions.
    */
    public GetTransactionHistoryRequest setIsAsync(boolean d) {
        this.isAsync = Boolean.valueOf(d);
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
        if (fromDate != null) {
            sb.append(aligned)
                .append("\"fromDate\": \"")
                .append(fromDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (toDate != null) {
            sb.append(aligned)
                .append("\"toDate\": \"")
                .append(toDate)
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
        if (transactionId != null) {
            sb.append(aligned)
                .append("\"transactionId\": \"")
                .append(transactionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (paymentReference != null) {
            sb.append(aligned)
                .append("\"paymentReference\": \"")
                .append(paymentReference)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transactionType != null) {
            sb.append(aligned)
                .append("\"transactionType\": \"")
                .append(transactionType)
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
        if (childAccountId != null) {
            sb.append(aligned)
                .append("\"childAccountId\": \"")
                .append(childAccountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childrenTransactionsOnly != null) {
            sb.append(aligned)
                .append("\"childrenTransactionsOnly\": \"")
                .append(childrenTransactionsOnly)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (usersTransactionsOnly != null) {
            sb.append(aligned)
                .append("\"usersTransactionsOnly\": \"")
                .append(usersTransactionsOnly)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (descOrder != null) {
            sb.append(aligned)
                .append("\"descOrder\": \"")
                .append(descOrder)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (output != null) {
            sb.append(aligned)
                .append("\"output\": \"")
                .append(output)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isAsync != null) {
            sb.append(aligned)
                .append("\"isAsync\": \"")
                .append(isAsync)
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