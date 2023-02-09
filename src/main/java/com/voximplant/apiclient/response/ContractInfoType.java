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
* The contract info (the ContractorInfoType field).
*/
public class ContractInfoType implements Alignable {

    private String agreementNumber;

    /**
    * The agreement number
    */
    public String getAgreementNumber() {
        return this.agreementNumber;
    }

    public boolean hasAgreementNumber() {
        return this.agreementNumber != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date agreementDate;

    /**
    * The agreement date in format: YYYY-MM-DD
    */
    public Date getAgreementDate() {
        return this.agreementDate;
    }

    public boolean hasAgreementDate() {
        return this.agreementDate != null;
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}