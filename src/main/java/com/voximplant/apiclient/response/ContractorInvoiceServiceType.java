package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The invoice service info. The [ContractorInvoiceType] field.
*/
public class ContractorInvoiceServiceType {

    private String serviceName;

    /**
    * The service name.
    */
    public String getServiceName() {
        return this.serviceName;
    }

    public boolean hasServiceName() {
        return this.serviceName != null;
    }

    private BigDecimal serviceCost;

    /**
    * The service cost (RUR).
    */
    public BigDecimal getServiceCost() {
        return this.serviceCost;
    }

    public boolean hasServiceCost() {
        return this.serviceCost != null;
    }

}