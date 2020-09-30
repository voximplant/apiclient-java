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
public class RestoredAgreementStatusCallback {

    private Long documentId;

    /**
    * ID of the agreement document which status has been changed.
    */
    public long getDocumentId() {
        return this.documentId.longValue();
    }

    public boolean hasDocumentId() {
        return this.documentId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date expirationDate;

    /**
    * The new date of agreement expiration in format: YYYY-MM-DD.
    */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null;
    }

}