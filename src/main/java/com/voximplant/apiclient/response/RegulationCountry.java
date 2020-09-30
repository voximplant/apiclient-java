package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The country record.
*/
public class RegulationCountry {

    private String countryCode;

    /**
    * The country code A2
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    private String countryName;

    /**
    * The country name
    */
    public String getCountryName() {
        return this.countryName;
    }

    public boolean hasCountryName() {
        return this.countryName != null;
    }

}