package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetChildrenAccountsRequest {
    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The account ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The account ID list separated by the ';' symbol or the 'all' value.
    */
    public GetChildrenAccountsRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private String childAccountName;

    @RequestField(name="child_account_name")
    /**
    * The child account name part to filter.
    */
    public String getChildAccountName() {
        return this.childAccountName;
    }

    public boolean hasChildAccountName() {
        return this.childAccountName != null;
    }

    /**
    * The child account name part to filter.
    */
    public GetChildrenAccountsRequest setChildAccountName(String d) {
        this.childAccountName = d;
        return this;
    }

    private String childAccountEmail;

    @RequestField(name="child_account_email")
    /**
    * The child ccount email to filter.
    */
    public String getChildAccountEmail() {
        return this.childAccountEmail;
    }

    public boolean hasChildAccountEmail() {
        return this.childAccountEmail != null;
    }

    /**
    * The child ccount email to filter.
    */
    public GetChildrenAccountsRequest setChildAccountEmail(String d) {
        this.childAccountEmail = d;
        return this;
    }

    private Boolean active;

    @RequestField(name="active")
    /**
    * The active flag to filter.
    */
    public boolean getActive() {
        return this.active.booleanValue();
    }

    public boolean hasActive() {
        return this.active != null;
    }

    /**
    * The active flag to filter.
    */
    public GetChildrenAccountsRequest setActive(boolean d) {
        this.active = Boolean.valueOf(d);
        return this;
    }

    private Boolean frozen;

    @RequestField(name="frozen")
    /**
    * The frozen flag to filter.
    */
    public boolean getFrozen() {
        return this.frozen.booleanValue();
    }

    public boolean hasFrozen() {
        return this.frozen != null;
    }

    /**
    * The frozen flag to filter.
    */
    public GetChildrenAccountsRequest setFrozen(boolean d) {
        this.frozen = Boolean.valueOf(d);
        return this;
    }

    private Boolean ignoreInvalidAccounts;

    @RequestField(name="ignore_invalid_accounts")
    /**
    * Set true to ignore the invalid 'child_account_id' items.
    */
    public boolean getIgnoreInvalidAccounts() {
        return this.ignoreInvalidAccounts.booleanValue();
    }

    public boolean hasIgnoreInvalidAccounts() {
        return this.ignoreInvalidAccounts != null;
    }

    /**
    * Set true to ignore the invalid 'child_account_id' items.
    */
    public GetChildrenAccountsRequest setIgnoreInvalidAccounts(boolean d) {
        this.ignoreInvalidAccounts = Boolean.valueOf(d);
        return this;
    }

    private Boolean briefOutput;

    @RequestField(name="brief_output")
    /**
    * Set true to output the account_id only.
    */
    public boolean getBriefOutput() {
        return this.briefOutput.booleanValue();
    }

    public boolean hasBriefOutput() {
        return this.briefOutput != null;
    }

    /**
    * Set true to output the account_id only.
    */
    public GetChildrenAccountsRequest setBriefOutput(boolean d) {
        this.briefOutput = Boolean.valueOf(d);
        return this;
    }

    private Boolean mediumOutput;

    @RequestField(name="medium_output")
    /**
    * Set true to output the account_id, account_name, account_email only.
    */
    public boolean getMediumOutput() {
        return this.mediumOutput.booleanValue();
    }

    public boolean hasMediumOutput() {
        return this.mediumOutput != null;
    }

    /**
    * Set true to output the account_id, account_name, account_email only.
    */
    public GetChildrenAccountsRequest setMediumOutput(boolean d) {
        this.mediumOutput = Boolean.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetChildrenAccountsRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetChildrenAccountsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String orderBy;

    @RequestField(name="order_by")
    /**
    * The following values are available: 'child_account_id',
    * 'child_account_name' and 'child_account_email'.
    */
    public String getOrderBy() {
        return this.orderBy;
    }

    public boolean hasOrderBy() {
        return this.orderBy != null;
    }

    /**
    * The following values are available: 'child_account_id',
    * 'child_account_name' and 'child_account_email'.
    */
    public GetChildrenAccountsRequest setOrderBy(String d) {
        this.orderBy = d;
        return this;
    }

    private Boolean returnLiveBalance;

    @RequestField(name="return_live_balance")
    /**
    * Set true to get the user live balance.
    */
    public boolean getReturnLiveBalance() {
        return this.returnLiveBalance.booleanValue();
    }

    public boolean hasReturnLiveBalance() {
        return this.returnLiveBalance != null;
    }

    /**
    * Set true to get the user live balance.
    */
    public GetChildrenAccountsRequest setReturnLiveBalance(boolean d) {
        this.returnLiveBalance = Boolean.valueOf(d);
        return this;
    }

}