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
* Received when the verification status is updated. Received as part of
* the [AccountCallback] structure.
*/
public class AccountDocumentStatusUpdatedCallback implements Alignable {

    private Long accountDocumentId;

    /**
    * Uploaded document ID
    */
    public Long getAccountDocumentId() {
        return this.accountDocumentId;
    }

    public boolean hasAccountDocumentId() {
        return this.accountDocumentId != null;
    }

    private String previousAccountDocumentStatus;

    /**
    * Previous document verification status. The following values are
    * possible: WAITING_CONFIRMATION_DOCS, VERIFIED, REJECTED
    */
    public String getPreviousAccountDocumentStatus() {
        return this.previousAccountDocumentStatus;
    }

    public boolean hasPreviousAccountDocumentStatus() {
        return this.previousAccountDocumentStatus != null;
    }

    private String accountDocumentStatus;

    /**
    * Document verification status. The following values are possible:
    * WAITING_CONFIRMATION_DOCS, VERIFIED, REJECTED
    */
    public String getAccountDocumentStatus() {
        return this.accountDocumentStatus;
    }

    public boolean hasAccountDocumentStatus() {
        return this.accountDocumentStatus != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date updateTime;

    /**
    * UTC time when the status is updated
    */
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public boolean hasUpdateTime() {
        return this.updateTime != null;
    }

    private String comment;

    /**
    * Reviewer's comment
    */
    public String getComment() {
        return this.comment;
    }

    public boolean hasComment() {
        return this.comment != null;
    }

    private String legalStatus;

    /**
    * Status of the user in the context of entrepreneurial activity.
    * Possible values are 'individual', 'entrepreneur', 'legal entity'
    */
    public String getLegalStatus() {
        return this.legalStatus;
    }

    public boolean hasLegalStatus() {
        return this.legalStatus != null;
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
        if (previousAccountDocumentStatus != null) {
            sb.append(aligned)
                .append("\"previousAccountDocumentStatus\": \"")
                .append(previousAccountDocumentStatus)
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
        if (updateTime != null) {
            sb.append(aligned)
                .append("\"updateTime\": \"")
                .append(updateTime)
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
        if (legalStatus != null) {
            sb.append(aligned)
                .append("\"legalStatus\": \"")
                .append(legalStatus)
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