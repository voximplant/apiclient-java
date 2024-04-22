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
* The account verification info. The [AccountVerifications] field.
*/
public class AccountVerificationType implements Alignable {

    private String verificationName;

    /**
    * The verification name
    */
    public String getVerificationName() {
        return this.verificationName;
    }

    public boolean hasVerificationName() {
        return this.verificationName != null;
    }

    private String verificationStatus;

    /**
    * The account verification status. The following values are possible:
    * REQUIRED, IN_PROGRESS, VERIFIED, NOT_REQUIRED
    */
    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date unverifiedHoldUntil;

    /**
    * Unverified subscriptions hold until the date in format: YYYY-MM-DD
    * (if the account verification is required). Some subscriptions are
    * detached on that day automatically!
    */
    public Date getUnverifiedHoldUntil() {
        return this.unverifiedHoldUntil;
    }

    public boolean hasUnverifiedHoldUntil() {
        return this.unverifiedHoldUntil != null;
    }

    private AccountVerificationDocument[] documents;

    /**
    * The uploaded documents
    */
    public AccountVerificationDocument[] getDocuments() {
        return this.documents;
    }

    public boolean hasDocuments() {
        return this.documents != null;
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
        if (unverifiedHoldUntil != null) {
            sb.append(aligned)
                .append("\"unverifiedHoldUntil\": \"")
                .append(unverifiedHoldUntil)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (documents != null) {
            sb.append(aligned)
                .append("\"AccountVerificationDocument\": ")
                .append(StringHelper.arrayToString(documents, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}