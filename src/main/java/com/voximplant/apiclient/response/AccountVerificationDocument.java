package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The account verification document info. The [AccountVerificationType]
* field.
*/
public class AccountVerificationDocument {

    private Long accountDocumentId;

    /**
    * The account verification document ID.
    */
    public long getAccountDocumentId() {
        return this.accountDocumentId.longValue();
    }

    public boolean hasAccountDocumentId() {
        return this.accountDocumentId != null;
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

    private String accountDocumentStatus;

    /**
    * The account document status. The following values are possible:
    * ACCEPTED, REJECTED, IN_PROGRESS, INCOMPLETE_SET.
    */
    public String getAccountDocumentStatus() {
        return this.accountDocumentStatus;
    }

    public boolean hasAccountDocumentStatus() {
        return this.accountDocumentStatus != null;
    }

}