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
* Received when an expiration date of the confirmation documents
* waiting period is changed. Received as part of the [AccountCallback]
* structure.
*/
public class RestoredAgreementStatusCallback implements Alignable {

    private Long documentId;

    /**
    * ID of the agreement document which status has been changed
    */
    public Long getDocumentId() {
        return this.documentId;
    }

    public boolean hasDocumentId() {
        return this.documentId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date expirationDate;

    /**
    * The new date of agreement expiration in format: YYYY-MM-DD
    */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null;
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
        if (documentId != null) {
            sb.append(aligned)
                .append("\"documentId\": \"")
                .append(documentId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expirationDate != null) {
            sb.append(aligned)
                .append("\"expirationDate\": \"")
                .append(expirationDate)
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