package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The account verification info. The [AccountVerifications] field.
*/
public class AccountVerificationType {

    private String verificationName;

    /**
    * The verification name.
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
    * (if the account verification is required). Some subscriptions will be
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
    * The uploaded documents.
    */
    public AccountVerificationDocument[] getDocuments() {
        return this.documents;
    }

    public boolean hasDocuments() {
        return this.documents != null;
    }

}