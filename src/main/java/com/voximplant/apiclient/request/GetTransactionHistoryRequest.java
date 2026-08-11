package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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
    * HH:mm:ss. If both dates are omitted and is_uncommitted is false, a
    * server-configured default interval is used (default is one month)
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * The from date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss. If both dates are omitted and is_uncommitted is false, a
    * server-configured default interval is used (default is one month)
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
    * HH:mm:ss. If both dates are omitted and is_uncommitted is false, a
    * server-configured default interval is used (default is one month)
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * The to date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss. If both dates are omitted and is_uncommitted is false, a
    * server-configured default interval is used (default is one month)
    */
    public GetTransactionHistoryRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID to filter. Can be used together with or instead of
    * the <b>application_name</b> parameter
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID to filter. Can be used together with or instead of
    * the <b>application_name</b> parameter
    */
    public GetTransactionHistoryRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name to filter. Can be used instead of the
    * <b>application_id</b> parameter
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name to filter. Can be used instead of the
    * <b>application_id</b> parameter
    */
    public GetTransactionHistoryRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> subscriptionId;

    @RequestField(name="subscription_id")
    /**
    * The subscription ID list separated by semicolons (;) to filter
    */
    public MultiArgument<Long> getSubscriptionId() {
        return this.subscriptionId;
    }

    public boolean hasSubscriptionId() {
        return this.subscriptionId != null;
    }

    /**
    * The subscription ID list separated by semicolons (;) to filter
    */
    public GetTransactionHistoryRequest setSubscriptionId(MultiArgument<Long> d) {
        this.subscriptionId = d;
        return this;
    }

    private MultiArgument<String> subscriptionName;

    @RequestField(name="subscription_name")
    /**
    * The subscription name list separated by semicolons (;) to filter
    */
    public MultiArgument<String> getSubscriptionName() {
        return this.subscriptionName;
    }

    public boolean hasSubscriptionName() {
        return this.subscriptionName != null;
    }

    /**
    * The subscription name list separated by semicolons (;) to filter
    */
    public GetTransactionHistoryRequest setSubscriptionName(MultiArgument<String> d) {
        this.subscriptionName = d;
        return this;
    }

    private MultiArgument<String> resourceType;

    @RequestField(name="resource_type")
    /**
    * The resource type list separated by semicolons (;) to filter
    */
    public MultiArgument<String> getResourceType() {
        return this.resourceType;
    }

    public boolean hasResourceType() {
        return this.resourceType != null;
    }

    /**
    * The resource type list separated by semicolons (;) to filter
    */
    public GetTransactionHistoryRequest setResourceType(MultiArgument<String> d) {
        this.resourceType = d;
        return this;
    }

    private MultiArgument<String> priceGroupName;

    @RequestField(name="price_group_name")
    /**
    * The price group name list separated by semicolons (;) to filter
    */
    public MultiArgument<String> getPriceGroupName() {
        return this.priceGroupName;
    }

    public boolean hasPriceGroupName() {
        return this.priceGroupName != null;
    }

    /**
    * The price group name list separated by semicolons (;) to filter
    */
    public GetTransactionHistoryRequest setPriceGroupName(MultiArgument<String> d) {
        this.priceGroupName = d;
        return this;
    }

    private Boolean useAccountingDates;

    @RequestField(name="use_accounting_dates")
    /**
    * Whether to filter by the accounting dates instead of the
    * transaction's `performed_at` timestamps
    */
    public Boolean getUseAccountingDates() {
        return this.useAccountingDates;
    }

    public boolean hasUseAccountingDates() {
        return this.useAccountingDates != null;
    }

    /**
    * Whether to filter by the accounting dates instead of the
    * transaction's `performed_at` timestamps
    */
    public GetTransactionHistoryRequest setUseAccountingDates(boolean d) {
        this.useAccountingDates = Boolean.valueOf(d);
        return this;
    }

    private Boolean withExtendedInfo;

    @RequestField(name="with_extended_info")
    /**
    * Whether to include the extended transaction fields, such as the
    * application, subscription, resource type and price group, in the
    * response
    */
    public Boolean getWithExtendedInfo() {
        return this.withExtendedInfo;
    }

    public boolean hasWithExtendedInfo() {
        return this.withExtendedInfo != null;
    }

    /**
    * Whether to include the extended transaction fields, such as the
    * application, subscription, resource type and price group, in the
    * response
    */
    public GetTransactionHistoryRequest setWithExtendedInfo(boolean d) {
        this.withExtendedInfo = Boolean.valueOf(d);
        return this;
    }

    private Boolean isAsync;

    @RequestField(name="is_async")
    /**
    * Whether to create an asynchronous history report instead of returning
    * the data immediately. Has the same effect as calling
    * `GetTransactionHistoryAsync` and requires the output=csv
    */
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public boolean hasIsAsync() {
        return this.isAsync != null;
    }

    /**
    * Whether to create an asynchronous history report instead of returning
    * the data immediately. Has the same effect as calling
    * `GetTransactionHistoryAsync` and requires the output=csv
    */
    public GetTransactionHistoryRequest setIsAsync(boolean d) {
        this.isAsync = Boolean.valueOf(d);
        return this;
    }

    private Boolean withHeader;

    @RequestField(name="with_header")
    /**
    * Whether to get a CSV file with the column names if the output=csv
    */
    public Boolean getWithHeader() {
        return this.withHeader;
    }

    public boolean hasWithHeader() {
        return this.withHeader != null;
    }

    /**
    * Whether to get a CSV file with the column names if the output=csv
    */
    public GetTransactionHistoryRequest setWithHeader(boolean d) {
        this.withHeader = Boolean.valueOf(d);
        return this;
    }

    private String decimalSeparator;

    @RequestField(name="decimal_separator")
    /**
    * The decimal mark for the CSV numbers if the output=csv. If omitted,
    * the account locale setting is used
    */
    public String getDecimalSeparator() {
        return this.decimalSeparator;
    }

    public boolean hasDecimalSeparator() {
        return this.decimalSeparator != null;
    }

    /**
    * The decimal mark for the CSV numbers if the output=csv. If omitted,
    * the account locale setting is used
    */
    public GetTransactionHistoryRequest setDecimalSeparator(String d) {
        this.decimalSeparator = d;
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

    private Boolean withTotalCount;

    @RequestField(name="with_total_count")
    /**
    * Whether to include the 'total_count' and increase performance
    */
    public Boolean getWithTotalCount() {
        return this.withTotalCount;
    }

    public boolean hasWithTotalCount() {
        return this.withTotalCount != null;
    }

    /**
    * Whether to include the 'total_count' and increase performance
    */
    public GetTransactionHistoryRequest setWithTotalCount(boolean d) {
        this.withTotalCount = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The number of returning records. The maximum value is 1000
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The number of returning records. The maximum value is 1000
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
        if (subscriptionId != null) {
            sb.append(aligned)
                .append("\"subscriptionId\": \"")
                .append(subscriptionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionName != null) {
            sb.append(aligned)
                .append("\"subscriptionName\": \"")
                .append(subscriptionName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (resourceType != null) {
            sb.append(aligned)
                .append("\"resourceType\": \"")
                .append(resourceType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priceGroupName != null) {
            sb.append(aligned)
                .append("\"priceGroupName\": \"")
                .append(priceGroupName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (useAccountingDates != null) {
            sb.append(aligned)
                .append("\"useAccountingDates\": \"")
                .append(useAccountingDates)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withExtendedInfo != null) {
            sb.append(aligned)
                .append("\"withExtendedInfo\": \"")
                .append(withExtendedInfo)
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
        if (withHeader != null) {
            sb.append(aligned)
                .append("\"withHeader\": \"")
                .append(withHeader)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (decimalSeparator != null) {
            sb.append(aligned)
                .append("\"decimalSeparator\": \"")
                .append(decimalSeparator)
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
        if (withTotalCount != null) {
            sb.append(aligned)
                .append("\"withTotalCount\": \"")
                .append(withTotalCount)
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