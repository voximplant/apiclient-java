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
* The account verification document info. The [AccountVerificationType]
* field.
*/
public class AccountVerificationDocument implements Alignable {

    private Long accountDocumentId;

    /**
    * The account verification document ID.
    */
    public Long getAccountDocumentId() {
        return this.accountDocumentId;
    }

    public boolean hasAccountDocumentId() {
        return this.accountDocumentId != null;
    }

    private Boolean isIndividual;

    /**
    * Is individual, isn't legal entity?
    */
    public Boolean getIsIndividual() {
        return this.isIndividual;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (accountDocumentId != null) {
            sb.append(aligned)
                .append("\"accountDocumentId\": \"")
                .append(accountDocumentId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isIndividual != null) {
            sb.append(aligned)
                .append("\"isIndividual\": \"")
                .append(isIndividual)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (comment != null) {
            sb.append(aligned)
                .append("\"comment\": \"")
                .append(comment)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (uploaded != null) {
            sb.append(aligned)
                .append("\"uploaded\": \"")
                .append(uploaded)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountDocumentStatus != null) {
            sb.append(aligned)
                .append("\"accountDocumentStatus\": \"")
                .append(accountDocumentStatus)
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