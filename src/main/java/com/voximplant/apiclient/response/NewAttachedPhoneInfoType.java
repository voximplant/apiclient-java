package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [AttachPhoneNumber] function result.
*/
public class NewAttachedPhoneInfoType {

    private Long phoneId;

    /**
    * The phone ID.
    */
    public long getPhoneId() {
        return this.phoneId.longValue();
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    private String phoneNumber;

    /**
    * The phone number.
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    private String requiredVerification;

    /**
    * The required account verification name.
    */
    public String getRequiredVerification() {
        return this.requiredVerification;
    }

    public boolean hasRequiredVerification() {
        return this.requiredVerification != null;
    }

    private String verificationStatus;

    /**
    * The account verification status. The following values are possible:
    * REQUIRED, IN_PROGRESS, VERIFIED
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
    * Unverified phone hold until the date in format: YYYY-MM-DD (if the
    * account verification is required). The number will be detached on
    * that day automatically!
    */
    public Date getUnverifiedHoldUntil() {
        return this.unverifiedHoldUntil;
    }

    public boolean hasUnverifiedHoldUntil() {
        return this.unverifiedHoldUntil != null;
    }

}