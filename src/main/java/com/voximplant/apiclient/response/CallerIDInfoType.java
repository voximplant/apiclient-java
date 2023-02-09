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
* The [GetCallerIDs] function result.
*/
public class CallerIDInfoType implements Alignable {

    private Long calleridId;

    /**
    * The callerID id
    */
    public Long getCalleridId() {
        return this.calleridId;
    }

    public boolean hasCalleridId() {
        return this.calleridId != null;
    }

    private String calleridNumber;

    /**
    * The callerID number
    */
    public String getCalleridNumber() {
        return this.calleridNumber;
    }

    public boolean hasCalleridNumber() {
        return this.calleridNumber != null;
    }

    private Boolean active;

    /**
    * The active flag
    */
    public Boolean getActive() {
        return this.active;
    }

    public boolean hasActive() {
        return this.active != null;
    }

    private Long codeEnteringAttemptsLeft;

    /**
    * The code entering attempts left for the unverified callerID
    */
    public Long getCodeEnteringAttemptsLeft() {
        return this.codeEnteringAttemptsLeft;
    }

    public boolean hasCodeEnteringAttemptsLeft() {
        return this.codeEnteringAttemptsLeft != null;
    }

    private Long verificationCallAttemptsLeft;

    /**
    * The verification call attempts left for the unverified callerID
    */
    public Long getVerificationCallAttemptsLeft() {
        return this.verificationCallAttemptsLeft;
    }

    public boolean hasVerificationCallAttemptsLeft() {
        return this.verificationCallAttemptsLeft != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date verifiedUntil;

    /**
    * The verification ending date in format: YYYY-MM-DD (for the verified
    * callerID)
    */
    public Date getVerifiedUntil() {
        return this.verifiedUntil;
    }

    public boolean hasVerifiedUntil() {
        return this.verifiedUntil != null;
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
        if (calleridId != null) {
            sb.append(aligned)
                .append("\"calleridId\": \"")
                .append(calleridId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (calleridNumber != null) {
            sb.append(aligned)
                .append("\"calleridNumber\": \"")
                .append(calleridNumber)
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
        if (codeEnteringAttemptsLeft != null) {
            sb.append(aligned)
                .append("\"codeEnteringAttemptsLeft\": \"")
                .append(codeEnteringAttemptsLeft)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (verificationCallAttemptsLeft != null) {
            sb.append(aligned)
                .append("\"verificationCallAttemptsLeft\": \"")
                .append(verificationCallAttemptsLeft)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (verifiedUntil != null) {
            sb.append(aligned)
                .append("\"verifiedUntil\": \"")
                .append(verifiedUntil)
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