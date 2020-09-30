package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The ZipCode record.
*/
public class ZipCode {

    private String city;

    /**
    * The city name
    */
    public String getCity() {
        return this.city;
    }

    public boolean hasCity() {
        return this.city != null;
    }

    private String zipCode;

    /**
    * The zip code
    */
    public String getZipCode() {
        return this.zipCode;
    }

    public boolean hasZipCode() {
        return this.zipCode != null;
    }

}