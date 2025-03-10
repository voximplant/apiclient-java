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
* The [GetContractorInfo] function result.
*/
public class ContractorInfoType implements Alignable {

    private String inn;

    /**
    * Russian-specific ID for tax purposes
    */
    public String getInn() {
        return this.inn;
    }

    public boolean hasInn() {
        return this.inn != null;
    }

    private String kpp;

    /**
    * Additional Russian-specific ID for tax purposes for businesses; there
    * is no KPP for individual entrepreneurs
    */
    public String getKpp() {
        return this.kpp;
    }

    public boolean hasKpp() {
        return this.kpp != null;
    }

    private String companyName;

    /**
    * The full company name
    */
    public String getCompanyName() {
        return this.companyName;
    }

    public boolean hasCompanyName() {
        return this.companyName != null;
    }

    private String companyAddress;

    /**
    * The full company address with a postcode
    */
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public boolean hasCompanyAddress() {
        return this.companyAddress != null;
    }

    private String companyPhone;

    /**
    * The company phone
    */
    public String getCompanyPhone() {
        return this.companyPhone;
    }

    public boolean hasCompanyPhone() {
        return this.companyPhone != null;
    }

    private String correspondenceAddress;

    /**
    * The correspondence address
    */
    public String getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    public boolean hasCorrespondenceAddress() {
        return this.correspondenceAddress != null;
    }

    private String correspondenceEmail;

    /**
    * The correspondence email
    */
    public String getCorrespondenceEmail() {
        return this.correspondenceEmail;
    }

    public boolean hasCorrespondenceEmail() {
        return this.correspondenceEmail != null;
    }

    private String correspondenceTo;

    /**
    * The correspondence to
    */
    public String getCorrespondenceTo() {
        return this.correspondenceTo;
    }

    public boolean hasCorrespondenceTo() {
        return this.correspondenceTo != null;
    }

    private ContractInfoType contract;

    /**
    * The contract info
    */
    public ContractInfoType getContract() {
        return this.contract;
    }

    public boolean hasContract() {
        return this.contract != null;
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
        if (inn != null) {
            sb.append(aligned)
                .append("\"inn\": \"")
                .append(inn)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (kpp != null) {
            sb.append(aligned)
                .append("\"kpp\": \"")
                .append(kpp)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (companyName != null) {
            sb.append(aligned)
                .append("\"companyName\": \"")
                .append(companyName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (companyAddress != null) {
            sb.append(aligned)
                .append("\"companyAddress\": \"")
                .append(companyAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (companyPhone != null) {
            sb.append(aligned)
                .append("\"companyPhone\": \"")
                .append(companyPhone)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (correspondenceAddress != null) {
            sb.append(aligned)
                .append("\"correspondenceAddress\": \"")
                .append(correspondenceAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (correspondenceEmail != null) {
            sb.append(aligned)
                .append("\"correspondenceEmail\": \"")
                .append(correspondenceEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (correspondenceTo != null) {
            sb.append(aligned)
                .append("\"correspondenceTo\": \"")
                .append(correspondenceTo)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (contract != null) {
            sb.append(aligned)
                .append("\"contract\": \"")
                .append(contract)
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