package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* Account verifications.
*/
public class AccountVerificationsType implements Alignable {

    private Long verificationId;

    /**
    * Verification ID
    */
    public Long getVerificationId() {
        return this.verificationId;
    }

    public boolean hasVerificationId() {
        return this.verificationId != null;
    }

    private String status;

    /**
    * Verification status. Possible values are:
    * AWAITING_DOCUMENTS_UPLOADING, AWAITING_AGREEMENT_UPLOADING,
    * AWAITING_VERIFICATION, WAITING_FOR_CONFIRMATION_DOCUMENTS, VERIFIED,
    * REJECTED, WAITING_PERIOD_EXPIRED
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    private String statusScheme;

    /**
    * Status scheme name
    */
    public String getStatusScheme() {
        return this.statusScheme;
    }

    public boolean hasStatusScheme() {
        return this.statusScheme != null;
    }

    private String creationType;

    /**
    * Verification creation type. Possible values are: MANUAL, GOSUSLUGI,
    * TRANSFER_RIGHTS
    */
    public String getCreationType() {
        return this.creationType;
    }

    public boolean hasCreationType() {
        return this.creationType != null;
    }

    private String created;

    /**
    * Date created in the following format: 2022-07-12 07:06:05
    */
    public String getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    private Long comments;

    /**
    * Comments for the customer in case of verification rejection
    */
    public Long getComments() {
        return this.comments;
    }

    public boolean hasComments() {
        return this.comments != null;
    }

    private AccountVerificationsTypeCredentials[] credentials;

    /**
    * Person or company who takes the verification
    */
    public AccountVerificationsTypeCredentials[] getCredentials() {
        return this.credentials;
    }

    public boolean hasCredentials() {
        return this.credentials != null;
    }

    private AccountVerificationsTypeDefaultEndUser[] defaultEndUser;

    /**
    * Verification's default customer
    */
    public AccountVerificationsTypeDefaultEndUser[] getDefaultEndUser() {
        return this.defaultEndUser;
    }

    public boolean hasDefaultEndUser() {
        return this.defaultEndUser != null;
    }

    private AccountVerificationsTypeAgreements[] agreements;

    /**
    * Agreements list
    */
    public AccountVerificationsTypeAgreements[] getAgreements() {
        return this.agreements;
    }

    public boolean hasAgreements() {
        return this.agreements != null;
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
        if (verificationId != null) {
            sb.append(aligned)
                .append("\"verificationId\": \"")
                .append(verificationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (statusScheme != null) {
            sb.append(aligned)
                .append("\"statusScheme\": \"")
                .append(statusScheme)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (creationType != null) {
            sb.append(aligned)
                .append("\"creationType\": \"")
                .append(creationType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (comments != null) {
            sb.append(aligned)
                .append("\"comments\": \"")
                .append(comments)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (credentials != null) {
            sb.append(aligned)
                .append("\"AccountVerificationsTypeCredentials\": ")
                .append(StringHelper.arrayToString(credentials, alignment + 1))
                .append(System.lineSeparator());
        }
        if (defaultEndUser != null) {
            sb.append(aligned)
                .append("\"AccountVerificationsTypeDefaultEndUser\": ")
                .append(StringHelper.arrayToString(defaultEndUser, alignment + 1))
                .append(System.lineSeparator());
        }
        if (agreements != null) {
            sb.append(aligned)
                .append("\"AccountVerificationsTypeAgreements\": ")
                .append(StringHelper.arrayToString(agreements, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}