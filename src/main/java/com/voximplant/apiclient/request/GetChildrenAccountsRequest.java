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

public class GetChildrenAccountsRequest implements Alignable {
    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The account ID list separated by semicolons (;). You need to specify
    * at least one of the following parameters: `child_account_id`,
    * `child_account_name`, `child_account_email`
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The account ID list separated by semicolons (;). You need to specify
    * at least one of the following parameters: `child_account_id`,
    * `child_account_name`, `child_account_email`
    */
    public GetChildrenAccountsRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private String childAccountName;

    @RequestField(name="child_account_name")
    /**
    * The child account name to filter. You need to specify at least one of
    * the following parameters: `child_account_id`, `child_account_name`,
    * `child_account_email`
    */
    public String getChildAccountName() {
        return this.childAccountName;
    }

    public boolean hasChildAccountName() {
        return this.childAccountName != null;
    }

    /**
    * The child account name to filter. You need to specify at least one of
    * the following parameters: `child_account_id`, `child_account_name`,
    * `child_account_email`
    */
    public GetChildrenAccountsRequest setChildAccountName(String d) {
        this.childAccountName = d;
        return this;
    }

    private String childAccountEmail;

    @RequestField(name="child_account_email")
    /**
    * The child ccount email to filter. You need to specify at least one of
    * the following parameters: `child_account_id`, `child_account_name`,
    * `child_account_email`
    */
    public String getChildAccountEmail() {
        return this.childAccountEmail;
    }

    public boolean hasChildAccountEmail() {
        return this.childAccountEmail != null;
    }

    /**
    * The child ccount email to filter. You need to specify at least one of
    * the following parameters: `child_account_id`, `child_account_name`,
    * `child_account_email`
    */
    public GetChildrenAccountsRequest setChildAccountEmail(String d) {
        this.childAccountEmail = d;
        return this;
    }

    private Boolean active;

    @RequestField(name="active")
    /**
    * Whether the filter is active
    */
    public Boolean getActive() {
        return this.active;
    }

    public boolean hasActive() {
        return this.active != null;
    }

    /**
    * Whether the filter is active
    */
    public GetChildrenAccountsRequest setActive(boolean d) {
        this.active = Boolean.valueOf(d);
        return this;
    }

    private Boolean frozen;

    @RequestField(name="frozen")
    /**
    * Whether the filter is frozen
    */
    public Boolean getFrozen() {
        return this.frozen;
    }

    public boolean hasFrozen() {
        return this.frozen != null;
    }

    /**
    * Whether the filter is frozen
    */
    public GetChildrenAccountsRequest setFrozen(boolean d) {
        this.frozen = Boolean.valueOf(d);
        return this;
    }

    private Boolean ignoreInvalidAccounts;

    @RequestField(name="ignore_invalid_accounts")
    /**
    * Whether to ignore the invalid 'child_account_id' items
    */
    public Boolean getIgnoreInvalidAccounts() {
        return this.ignoreInvalidAccounts;
    }

    public boolean hasIgnoreInvalidAccounts() {
        return this.ignoreInvalidAccounts != null;
    }

    /**
    * Whether to ignore the invalid 'child_account_id' items
    */
    public GetChildrenAccountsRequest setIgnoreInvalidAccounts(boolean d) {
        this.ignoreInvalidAccounts = Boolean.valueOf(d);
        return this;
    }

    private Boolean briefOutput;

    @RequestField(name="brief_output")
    /**
    * Whether to output the account_id only
    */
    public Boolean getBriefOutput() {
        return this.briefOutput;
    }

    public boolean hasBriefOutput() {
        return this.briefOutput != null;
    }

    /**
    * Whether to output the account_id only
    */
    public GetChildrenAccountsRequest setBriefOutput(boolean d) {
        this.briefOutput = Boolean.valueOf(d);
        return this;
    }

    private Boolean mediumOutput;

    @RequestField(name="medium_output")
    /**
    * Whether to output the account_id, account_name, account_email only
    */
    public Boolean getMediumOutput() {
        return this.mediumOutput;
    }

    public boolean hasMediumOutput() {
        return this.mediumOutput != null;
    }

    /**
    * Whether to output the account_id, account_name, account_email only
    */
    public GetChildrenAccountsRequest setMediumOutput(boolean d) {
        this.mediumOutput = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetChildrenAccountsRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetChildrenAccountsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String orderBy;

    @RequestField(name="order_by")
    /**
    * The following values are available: 'child_account_id',
    * 'child_account_name' and 'child_account_email'
    */
    public String getOrderBy() {
        return this.orderBy;
    }

    public boolean hasOrderBy() {
        return this.orderBy != null;
    }

    /**
    * The following values are available: 'child_account_id',
    * 'child_account_name' and 'child_account_email'
    */
    public GetChildrenAccountsRequest setOrderBy(String d) {
        this.orderBy = d;
        return this;
    }

    private Boolean returnLiveBalance;

    @RequestField(name="return_live_balance")
    /**
    * Whether to get the user live balance
    */
    public Boolean getReturnLiveBalance() {
        return this.returnLiveBalance;
    }

    public boolean hasReturnLiveBalance() {
        return this.returnLiveBalance != null;
    }

    /**
    * Whether to get the user live balance
    */
    public GetChildrenAccountsRequest setReturnLiveBalance(boolean d) {
        this.returnLiveBalance = Boolean.valueOf(d);
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
        if (childAccountId != null) {
            sb.append(aligned)
                .append("\"childAccountId\": \"")
                .append(childAccountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childAccountName != null) {
            sb.append(aligned)
                .append("\"childAccountName\": \"")
                .append(childAccountName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (childAccountEmail != null) {
            sb.append(aligned)
                .append("\"childAccountEmail\": \"")
                .append(childAccountEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (active != null) {
            sb.append(aligned)
                .append("\"active\": \"")
                .append(active)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (frozen != null) {
            sb.append(aligned)
                .append("\"frozen\": \"")
                .append(frozen)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ignoreInvalidAccounts != null) {
            sb.append(aligned)
                .append("\"ignoreInvalidAccounts\": \"")
                .append(ignoreInvalidAccounts)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (briefOutput != null) {
            sb.append(aligned)
                .append("\"briefOutput\": \"")
                .append(briefOutput)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mediumOutput != null) {
            sb.append(aligned)
                .append("\"mediumOutput\": \"")
                .append(mediumOutput)
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
        if (orderBy != null) {
            sb.append(aligned)
                .append("\"orderBy\": \"")
                .append(orderBy)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (returnLiveBalance != null) {
            sb.append(aligned)
                .append("\"returnLiveBalance\": \"")
                .append(returnLiveBalance)
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