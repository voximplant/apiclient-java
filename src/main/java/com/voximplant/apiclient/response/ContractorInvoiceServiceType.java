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
* The invoice service info. The [ContractorInvoiceType] field.
*/
public class ContractorInvoiceServiceType implements Alignable {

    private String serviceName;

    /**
    * The service name
    */
    public String getServiceName() {
        return this.serviceName;
    }

    public boolean hasServiceName() {
        return this.serviceName != null;
    }

    private BigDecimal serviceCost;

    /**
    * The service cost (RUR)
    */
    public BigDecimal getServiceCost() {
        return this.serviceCost;
    }

    public boolean hasServiceCost() {
        return this.serviceCost != null;
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
        if (serviceName != null) {
            sb.append(aligned)
                .append("\"serviceName\": \"")
                .append(serviceName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serviceCost != null) {
            sb.append(aligned)
                .append("\"serviceCost\": \"")
                .append(serviceCost)
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