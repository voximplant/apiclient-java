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
* The [GetRegions] function result.
*/
public class RegulationRegionRecord implements Alignable {

    private Long phoneRegionId;

    /**
    * The regulation address ID
    */
    public Long getPhoneRegionId() {
        return this.phoneRegionId;
    }

    public boolean hasPhoneRegionId() {
        return this.phoneRegionId != null;
    }

    private String phoneRegionName;

    /**
    * The region name
    */
    public String getPhoneRegionName() {
        return this.phoneRegionName;
    }

    public boolean hasPhoneRegionName() {
        return this.phoneRegionName != null;
    }

    private String phoneRegionCode;

    /**
    * The phone region code 
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    private Boolean isNeedRegulationAddress;

    /**
    * Whether need to confirm the address
    */
    public Boolean getIsNeedRegulationAddress() {
        return this.isNeedRegulationAddress;
    }

    public boolean hasIsNeedRegulationAddress() {
        return this.isNeedRegulationAddress != null;
    }

    private String regulationAddressType;

    /**
    * The regulation address type. Available: LOCAL, NATIONAL, WORLDWIDE
    */
    public String getRegulationAddressType() {
        return this.regulationAddressType;
    }

    public boolean hasRegulationAddressType() {
        return this.regulationAddressType != null;
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
        if (phoneRegionId != null) {
            sb.append(aligned)
                .append("\"phoneRegionId\": \"")
                .append(phoneRegionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionName != null) {
            sb.append(aligned)
                .append("\"phoneRegionName\": \"")
                .append(phoneRegionName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionCode != null) {
            sb.append(aligned)
                .append("\"phoneRegionCode\": \"")
                .append(phoneRegionCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isNeedRegulationAddress != null) {
            sb.append(aligned)
                .append("\"isNeedRegulationAddress\": \"")
                .append(isNeedRegulationAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressType != null) {
            sb.append(aligned)
                .append("\"regulationAddressType\": \"")
                .append(regulationAddressType)
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