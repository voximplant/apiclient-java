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
    * The selected timezone or the 'auto' value (the account location)
    */
    public String getTimezone() {
        return this.timezone;
    }

    public boolean hasTimezone() {
        return this.timezone != null;
    }

    /**
    * The selected timezone or the 'auto' value (the account location)
    */
    public GetTransactionHistoryRequest setTimezone(String d) {
        this.timezone = d;
        return this;
    }

    private MultiArgument<Long> transactionId;

    @RequestField(name="transaction_id")
    /**
    * The transaction ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getTransactionId() {
        return this.transactionId;
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    /**
    * The transaction ID list separated by semicolons (;)
    */
    public GetTransactionHistoryRequest setTransactionId(MultiArgument<Long> d) {
        this.transactionId = d;
        return this;
    }

    private String paymentReference;

    @RequestField(name="payment_reference")
    /**
    * The external payment reference to filter
    */
    public String getPaymentReference() {
        return this.paymentReference;
    }

    public boolean hasPaymentReference() {
        return this.paymentReference != null;
    }

    /**
    * The external payment reference to filter
    */
    public GetTransactionHistoryRequest setPaymentReference(String d) {
        this.paymentReference = d;
        return this;
    }

    private MultiArgument<String> transactionType;

    @RequestField(name="transaction_type")
    /**
    * The transaction type list separated by semicolons (;). The following
    * values are possible: gift_revoke, resource_charge,
    * money_distribution, subscription_charge,
    * subscription_installation_charge, card_periodic_payment,
    * card_overrun_payment, card_payment, rub_card_periodic_payment,
    * rub_card_overrun_payment, rub_card_payment, robokassa_payment, gift,
    * promo, adjustment, wire_transfer, us_wire_transfer, refund, discount,
    * mgp_charge, mgp_startup, mgp_business, mgp_big_business,
    * mgp_enterprise, mgp_large_enterprise, techsupport_charge, tax_charge,
    * monthly_fee_charge, grace_credit_payment, grace_credit_provision,
    * mau_charge, mau_overrun, im_charge, im_overrun, fmc_charge,
    * sip_registration_charge, development_fee, money_transfer_to_child,
    * money_transfer_to_parent, money_acceptance_from_child,
    * money_acceptance_from_parent, phone_number_installation,
    * phone_number_charge, toll_free_phone_number_installation,
    * toll_free_phone_number_charge, services, user_money_transfer,
    * paypal_payment, paypal_overrun_payment, paypal_periodic_payment
    */
    public MultiArgument<String> getTransactionType() {
        return this.transactionType;
    }

    public boolean hasTransactionType() {
        return this.transactionType != null;
    }

    /**
    * The transaction type list separated by semicolons (;). The following
    * values are possible: gift_revoke, resource_charge,
    * money_distribution, subscription_charge,
    * subscription_installation_charge, card_periodic_payment,
    * card_overrun_payment, card_payment, rub_card_periodic_payment,
    * rub_card_overrun_payment, rub_card_payment, robokassa_payment, gift,
    * promo, adjustment, wire_transfer, us_wire_transfer, refund, discount,
    * mgp_charge, mgp_startup, mgp_business, mgp_big_business,
    * mgp_enterprise, mgp_large_enterprise, techsupport_charge, tax_charge,
    * monthly_fee_charge, grace_credit_payment, grace_credit_provision,
    * mau_charge, mau_overrun, im_charge, im_overrun, fmc_charge,
    * sip_registration_charge, development_fee, money_transfer_to_child,
    * money_transfer_to_parent, money_acceptance_from_child,
    * money_acceptance_from_parent, phone_number_installation,
    * phone_number_charge, toll_free_phone_number_installation,
    * toll_free_phone_number_charge, services, user_money_transfer,
    * paypal_payment, paypal_overrun_payment, paypal_periodic_payment
    */
    public GetTransactionHistoryRequest setTransactionType(MultiArgument<String> d) {
        this.transactionType = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by semicolons (;)
    */
    public GetTransactionHistoryRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID list separated by semicolons (;). Use the 'all'
    * value to select all child accounts
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID list separated by semicolons (;). Use the 'all'
    * value to select all child accounts
    */
    public GetTransactionHistoryRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private Boolean childrenTransactionsOnly;

    @RequestField(name="children_transactions_only")
    /**
    * Whether to get the children account transactions only
    */
    public Boolean getChildrenTransactionsOnly() {
        return this.childrenTransactionsOnly;
    }

    public boolean hasChildrenTransactionsOnly() {
        return this.childrenTransactionsOnly != null;
    }

    /**
    * Whether to get the children account transactions only
    */
    public GetTransactionHistoryRequest setChildrenTransactionsOnly(boolean d) {
        this.childrenTransactionsOnly = Boolean.valueOf(d);
        return this;
    }

    private Boolean usersTransactionsOnly;

    @RequestField(name="users_transactions_only")
    /**
    * Whether to get the users' transactions only
    */
    public Boolean getUsersTransactionsOnly() {
        return this.usersTransactionsOnly;
    }

    public boolean hasUsersTransactionsOnly() {
        return this.usersTransactionsOnly != null;
    }

    /**
    * Whether to get the users' transactions only
    */
    public GetTransactionHistoryRequest setUsersTransactionsOnly(boolean d) {
        this.usersTransactionsOnly = Boolean.valueOf(d);
        return this;
    }

    private Boolean descOrder;

    @RequestField(name="desc_order")
    /**
    * Whether to get records in the descent order
    */
    public Boolean getDescOrder() {
        return this.descOrder;
    }

    public boolean hasDescOrder() {
        return this.descOrder != null;
    }

    /**
    * Whether to get records in the descent order
    */
    public GetTransactionHistoryRequest setDescOrder(boolean d) {
        this.descOrder = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The number of returning records. In the synchronous mode, the maximum
    * value is 1000
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The number of returning records. In the synchronous mode, the maximum
    * value is 1000
    */
    public GetTransactionHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The number of records to skip in the output with a maximum value of
    * 10000
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The number of records to skip in the output with a maximum value of
    * 10000
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
    * Whether to get records in the asynchronous mode (for csv output
    * only). <b>Use this mode to download large amounts of data</b>. See
    * the [GetHistoryReports], [DownloadHistoryReport] functions for
    * details
    */
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public boolean hasIsAsync() {
        return this.isAsync != null;
    }

    /**
    * Whether to get records in the asynchronous mode (for csv output
    * only). <b>Use this mode to download large amounts of data</b>. See
    * the [GetHistoryReports], [DownloadHistoryReport] functions for
    * details
    */
    public GetTransactionHistoryRequest setIsAsync(boolean d) {
        this.isAsync = Boolean.valueOf(d);
        return this;
    }

    private Boolean isUncommitted;

    @RequestField(name="is_uncommitted")
    /**
    * Whether to get transactions on hold (transactions for which money is
    * reserved but not yet withdrawn from the account)
    */
    public Boolean getIsUncommitted() {
        return this.isUncommitted;
    }

    public boolean hasIsUncommitted() {
        return this.isUncommitted != null;
    }

    /**
    * Whether to get transactions on hold (transactions for which money is
    * reserved but not yet withdrawn from the account)
    */
    public GetTransactionHistoryRequest setIsUncommitted(boolean d) {
        this.isUncommitted = Boolean.valueOf(d);
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
        if (isUncommitted != null) {
            sb.append(aligned)
                .append("\"isUncommitted\": \"")
                .append(isUncommitted)
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