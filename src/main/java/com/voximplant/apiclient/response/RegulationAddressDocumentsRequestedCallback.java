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
* Received when the verification status of regulation address is
* changed to PENDING. Received as part of the [AccountCallback]
* structure.
*/
public class RegulationAddressDocumentsRequestedCallback implements Alignable {

    private Long regulationAddressId;

    /**
    * Uploaded document ID
    */
    public Long getRegulationAddressId() {
        return this.regulationAddressId;
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    private String regulationAddressName;

    /**
    * Uploaded document name
    */
    public String getRegulationAddressName() {
        return this.regulationAddressName;
    }

    public boolean hasRegulationAddressName() {
        return this.regulationAddressName != null;
    }

    private String regulationAddressStatus;

    /**
    * Document verification status. The following values are possible:
    * IN_PROGRESS, VERIFIED, DECLINED, PENDING
    */
    public String getRegulationAddressStatus() {
        return this.regulationAddressStatus;
    }

    public boolean hasRegulationAddressStatus() {
        return this.regulationAddressStatus != null;
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

    private Boolean isIndividual;

    /**
    * Whether the account belongs to an individual
    */
    public Boolean getIsIndividual() {
        return this.isIndividual;
    }

    public boolean hasIsIndividual() {
        return this.isIndividual != null;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (regulationAddressId != null) {
            sb.append(aligned)
                .append("\"regulationAddressId\": \"")
                .append(regulationAddressId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressName != null) {
            sb.append(aligned)
                .append("\"regulationAddressName\": \"")
                .append(regulationAddressName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressStatus != null) {
            sb.append(aligned)
                .append("\"regulationAddressStatus\": \"")
                .append(regulationAddressStatus)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}