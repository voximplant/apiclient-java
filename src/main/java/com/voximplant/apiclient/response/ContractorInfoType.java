package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetContractorInfo] function result.
*/
public class ContractorInfoType {

    private String inn;

    /**
    * Russian-specific ID for tax purposes.
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
    * is no KPP for individual entrepreneurs.
    */
    public String getKpp() {
        return this.kpp;
    }

    public boolean hasKpp() {
        return this.kpp != null;
    }

    private String companyName;

    /**
    * The full company name.
    */
    public String getCompanyName() {
        return this.companyName;
    }

    public boolean hasCompanyName() {
        return this.companyName != null;
    }

    private String companyAddress;

    /**
    * The full company address with a postcode.
    */
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public boolean hasCompanyAddress() {
        return this.companyAddress != null;
    }

    private String companyPhone;

    /**
    * The company phone.
    */
    public String getCompanyPhone() {
        return this.companyPhone;
    }

    public boolean hasCompanyPhone() {
        return this.companyPhone != null;
    }

    private String correspondenceAddress;

    /**
    * The correspondence address.
    */
    public String getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    public boolean hasCorrespondenceAddress() {
        return this.correspondenceAddress != null;
    }

    private String correspondenceEmail;

    /**
    * The correspondence email.
    */
    public String getCorrespondenceEmail() {
        return this.correspondenceEmail;
    }

    public boolean hasCorrespondenceEmail() {
        return this.correspondenceEmail != null;
    }

    private String correspondenceTo;

    /**
    * The correspondence to.
    */
    public String getCorrespondenceTo() {
        return this.correspondenceTo;
    }

    public boolean hasCorrespondenceTo() {
        return this.correspondenceTo != null;
    }

    private ContractInfoType contract;

    /**
    * The contract info.
    */
    public ContractInfoType getContract() {
        return this.contract;
    }

    public boolean hasContract() {
        return this.contract != null;
    }

}