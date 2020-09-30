package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetCallerIDs] function result.
*/
public class CallerIDInfoType {

    private Long calleridId;

    /**
    * The callerID id.
    */
    public long getCalleridId() {
        return this.calleridId.longValue();
    }

    public boolean hasCalleridId() {
        return this.calleridId != null;
    }

    private String calleridNumber;

    /**
    * The callerID number.
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    private Boolean active;

    /**
    * The active flag.
    */
    public boolean getActive() {
        return this.active.booleanValue();
    }

    public boolean hasActive() {
        return this.active != null;
    }

    private Long codeEnteringAttemptsLeft;

    /**
    * The code entering attempts left for the unverified callerID.
    */
    public long getCodeEnteringAttemptsLeft() {
        return this.codeEnteringAttemptsLeft.longValue();
    }

    public boolean hasCodeEnteringAttemptsLeft() {
        return this.codeEnteringAttemptsLeft != null;
    }

    private Long verificationCallAttemptsLeft;

    /**
    * The verification call attempts left for the unverified callerID.
    */
    public long getVerificationCallAttemptsLeft() {
        return this.verificationCallAttemptsLeft.longValue();
    }

    public boolean hasVerificationCallAttemptsLeft() {
        return this.verificationCallAttemptsLeft != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date verifiedUntil;

    /**
    * The verification ending date in format: YYYY-MM-DD (for the verified
    * callerID).
    */
    public Date getVerifiedUntil() {
        return this.verifiedUntil;
    }

    public boolean hasVerifiedUntil() {
        return this.verifiedUntil != null;
    }

}