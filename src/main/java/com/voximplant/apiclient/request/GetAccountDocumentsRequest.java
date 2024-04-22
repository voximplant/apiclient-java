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

public class GetAccountDocumentsRequest implements Alignable {
    private Boolean withDetails;

    @RequestField(name="with_details")
    /**
    * Whether to view the uploaded document statuses. (The flag is ignored
    * with the child_account_id=all)
    */
    public Boolean getWithDetails() {
        return this.withDetails;
    }

    public boolean hasWithDetails() {
        return this.withDetails != null;
    }

    /**
    * Whether to view the uploaded document statuses. (The flag is ignored
    * with the child_account_id=all)
    */
    public GetAccountDocumentsRequest setWithDetails(boolean d) {
        this.withDetails = Boolean.valueOf(d);
        return this;
    }

    private String verificationName;

    @RequestField(name="verification_name")
    /**
    * The required account verification name to filter
    */
    public String getVerificationName() {
        return this.verificationName;
    }

    public boolean hasVerificationName() {
        return this.verificationName != null;
    }

    /**
    * The required account verification name to filter
    */
    public GetAccountDocumentsRequest setVerificationName(String d) {
        this.verificationName = d;
        return this;
    }

    private MultiArgument<String> verificationStatus;

    @RequestField(name="verification_status")
    /**
    * The account verification status list separated by semicolons (;). The
    * following values are possible: REQUIRED, IN_PROGRESS, VERIFIED
    */
    public MultiArgument<String> getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null;
    }

    /**
    * The account verification status list separated by semicolons (;). The
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
    public GetAccountDocumentsRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private Boolean childrenVerificationsOnly;

    @RequestField(name="children_verifications_only")
    /**
    * Whether to get the children account verifications only
    */
    public Boolean getChildrenVerificationsOnly() {
        return this.childrenVerificationsOnly;
    }

    public boolean hasChildrenVerificationsOnly() {
        return this.childrenVerificationsOnly != null;
    }

    /**
    * Whether to get the children account verifications only
    */
    public GetAccountDocumentsRequest setChildrenVerificationsOnly(boolean d) {
        this.childrenVerificationsOnly = Boolean.valueOf(d);
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
        if (withDetails != null) {
            sb.append(aligned)
                .append("\"withDetails\": \"")
                .append(withDetails)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (verificationName != null) {
            sb.append(aligned)
                .append("\"verificationName\": \"")
                .append(verificationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (verificationStatus != null) {
            sb.append(aligned)
                .append("\"verificationStatus\": \"")
                .append(verificationStatus)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fromUnverifiedHoldUntil != null) {
            sb.append(aligned)
                .append("\"fromUnverifiedHoldUntil\": \"")
                .append(fromUnverifiedHoldUntil)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (toUnverifiedHoldUntil != null) {
            sb.append(aligned)
                .append("\"toUnverifiedHoldUntil\": \"")
                .append(toUnverifiedHoldUntil)
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
        if (childrenVerificationsOnly != null) {
            sb.append(aligned)
                .append("\"childrenVerificationsOnly\": \"")
                .append(childrenVerificationsOnly)
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