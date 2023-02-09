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
* Received when proof of address is uploaded. Received as part of the
* [AccountCallback] structure.
*/
public class RegulationAddressUploadedCallback implements Alignable {

    private Long regulationAddressId;

    /**
    * The uploaded document ID. See GetRegulationsAddress
    */
    public Long getRegulationAddressId() {
        return this.regulationAddressId;
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
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
    * Account belongs to an individual
    */
    public Boolean getIsIndividual() {
        return this.isIndividual;
    }

    public boolean hasIsIndividual() {
        return this.isIndividual != null;
    }

    private String regulationAddressName;

    /**
    * The regulation address name
    */
    public String getRegulationAddressName() {
        return this.regulationAddressName;
    }

    public boolean hasRegulationAddressName() {
        return this.regulationAddressName != null;
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
        if (uploaded != null) {
            sb.append(aligned)
                .append("\"uploaded\": \"")
                .append(uploaded)
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
        if (regulationAddressName != null) {
            sb.append(aligned)
                .append("\"regulationAddressName\": \"")
                .append(regulationAddressName)
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