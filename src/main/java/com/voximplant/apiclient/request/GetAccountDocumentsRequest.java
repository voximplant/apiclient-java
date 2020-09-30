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

public class GetAccountDocumentsRequest {
    private Boolean withDetails;

    @RequestField(name="with_details")
    /**
    * Set true to view the uploaded document statuses. (The flag is ignored
    * with the child_account_id=all)
    */
    public boolean getWithDetails() {
        return this.withDetails.booleanValue();
    }

    public boolean hasWithDetails() {
        return this.withDetails != null;
    }

    /**
    * Set true to view the uploaded document statuses. (The flag is ignored
    * with the child_account_id=all)
    */
    public GetAccountDocumentsRequest setWithDetails(boolean d) {
        this.withDetails = Boolean.valueOf(d);
        return this;
    }

    private String verificationName;

    @RequestField(name="verification_name")
    /**
    * The required account verification name to filter.
    */
    public String getVerificationName() {
        return this.verificationName;
    }

    public boolean hasVerificationName() {
        return this.verificationName != null;
    }

    /**
    * The required account verification name to filter.
    */
    public GetAccountDocumentsRequest setVerificationName(String d) {
        this.verificationName = d;
        return this;
    }

    private MultiArgument<String> verificationStatus;

    @RequestField(name="verification_status")
    /**
    * The account verification status list separated by the ';' symbol. The
    * following values are possible: REQUIRED, IN_PROGRESS, VERIFIED
    */
    public MultiArgument<String> getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null;
    }

    /**
    * The account verification status list separated by the ';' symbol. The
    * following values are possible: REQUIRED, IN_PROGRESS, VERIFIED
    */
    public GetAccountDocumentsRequest setVerificationStatus(MultiArgument<String> d) {
        this.verificationStatus = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date fromUnverifiedHoldUntil;

    @RequestField(name="from_unverified_hold_until")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * Unverified subscriptions hold until the date (from ...) in format:
    * YYYY-MM-DD
    */
    public Date getFromUnverifiedHoldUntil() {
        return this.fromUnverifiedHoldUntil;
    }

    public boolean hasFromUnverifiedHoldUntil() {
        return this.fromUnverifiedHoldUntil != null;
    }

    /**
    * Unverified subscriptions hold until the date (from ...) in format:
    * YYYY-MM-DD
    */
    public GetAccountDocumentsRequest setFromUnverifiedHoldUntil(Date d) {
        this.fromUnverifiedHoldUntil = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date toUnverifiedHoldUntil;

    @RequestField(name="to_unverified_hold_until")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * Unverified subscriptions hold until the date (... to) in format:
    * YYYY-MM-DD
    */
    public Date getToUnverifiedHoldUntil() {
        return this.toUnverifiedHoldUntil;
    }

    public boolean hasToUnverifiedHoldUntil() {
        return this.toUnverifiedHoldUntil != null;
    }

    /**
    * Unverified subscriptions hold until the date (... to) in format:
    * YYYY-MM-DD
    */
    public GetAccountDocumentsRequest setToUnverifiedHoldUntil(Date d) {
        this.toUnverifiedHoldUntil = d;
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
    public GetAccountDocumentsRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private Boolean childrenVerificationsOnly;

    @RequestField(name="children_verifications_only")
    /**
    * Set true to get the children account verifications only.
    */
    public boolean getChildrenVerificationsOnly() {
        return this.childrenVerificationsOnly.booleanValue();
    }

    public boolean hasChildrenVerificationsOnly() {
        return this.childrenVerificationsOnly != null;
    }

    /**
    * Set true to get the children account verifications only.
    */
    public GetAccountDocumentsRequest setChildrenVerificationsOnly(boolean d) {
        this.childrenVerificationsOnly = Boolean.valueOf(d);
        return this;
    }

}