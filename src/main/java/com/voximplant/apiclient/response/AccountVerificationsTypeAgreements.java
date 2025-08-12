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
* Agreements list.
*/
public class AccountVerificationsTypeAgreements implements Alignable {

    private Long agreementId;

    /**
    * Agreement ID
    */
    public Long getAgreementId() {
        return this.agreementId;
    }

    public boolean hasAgreementId() {
        return this.agreementId != null;
    }

    private String type;

    /**
    * Agreement type
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private String status;

    /**
    * Agreement status. Possible values are: NEW, IN_PROCESS, VERIFIED,
    * REJECTED
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    private String agreementNumber;

    /**
    * Agreement number
    */
    public String getAgreementNumber() {
        return this.agreementNumber;
    }

    public boolean hasAgreementNumber() {
        return this.agreementNumber != null;
    }

    private String agreementDate;

    /**
    * Agreement signing date
    */
    public String getAgreementDate() {
        return this.agreementDate;
    }

    public boolean hasAgreementDate() {
        return this.agreementDate != null;
    }

    private String signingType;

    /**
    * Agreement signing date. Possible values are: MANUAL, ESIGNATURE
    */
    public String getSigningType() {
        return this.signingType;
    }

    public boolean hasSigningType() {
        return this.signingType != null;
    }

    private String comments;

    /**
    * Comments for the customer in case of agreement rejection
    */
    public String getComments() {
        return this.comments;
    }

    public boolean hasComments() {
        return this.comments != null;
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
        if (agreementId != null) {
            sb.append(aligned)
                .append("\"agreementId\": \"")
                .append(agreementId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (type != null) {
            sb.append(aligned)
                .append("\"type\": \"")
                .append(type)
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
        if (agreementNumber != null) {
            sb.append(aligned)
                .append("\"agreementNumber\": \"")
                .append(agreementNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (agreementDate != null) {
            sb.append(aligned)
                .append("\"agreementDate\": \"")
                .append(agreementDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (signingType != null) {
            sb.append(aligned)
                .append("\"signingType\": \"")
                .append(signingType)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}