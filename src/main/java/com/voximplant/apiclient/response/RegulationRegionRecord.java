package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetRegions] function result.
*/
public class RegulationRegionRecord {

    private Long phoneRegionId;

    /**
    * The regulation address ID.
    */
    public long getPhoneRegionId() {
        return this.phoneRegionId.longValue();
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
    * The need to confirm the address
    */
    public boolean getIsNeedRegulationAddress() {
        return this.isNeedRegulationAddress.booleanValue();
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

}