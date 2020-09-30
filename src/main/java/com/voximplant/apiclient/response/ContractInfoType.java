package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The contract info (the ContractorInfoType field).
*/
public class ContractInfoType {

    private String agreementNumber;

    /**
    * The agreement number.
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

}