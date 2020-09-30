package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class AccountDocumentVerifiedCallback {

    private Long accountDocumentId;

    /**
    * The uploaded document ID.
    */
    public long getAccountDocumentId() {
        return this.accountDocumentId.longValue();
    }

    public boolean hasAccountDocumentId() {
        return this.accountDocumentId != null;
    }

    private String accountDocumentStatus;

    /**
    * The document verification status. The following values are possible:
    * ACCEPTED, REJECTED
    */
    public String getAccountDocumentStatus() {
        return this.accountDocumentStatus;
    }

    public boolean hasAccountDocumentStatus() {
        return this.accountDocumentStatus != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date uploaded;

    /**
    * The UTC date of the document upload in format: YYYY-MM-DD HH::mm:ss
    */
    public Date getUploaded() {
        return this.uploaded;
    }

    public boolean hasUploaded() {
        return this.uploaded != null;
    }

    private Boolean isIndividual;

    /**
    * Is individual, isn't legal entity?
    */
    public boolean getIsIndividual() {
        return this.isIndividual.booleanValue();
    }

    public boolean hasIsIndividual() {
        return this.isIndividual != null;
    }

    private String comment;

    /**
    * The reviewer's comment.
    */
    public String getComment() {
        return this.comment;
    }

    public boolean hasComment() {
        return this.comment != null;
    }

    private String verificationName;

    /**
    * The verification name (type).
    */
    public String getVerificationName() {
        return this.verificationName;
    }

    public boolean hasVerificationName() {
        return this.verificationName != null;
    }

}