package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetPhoneNumberCountryStates] function result.
*/
public class PhoneNumberCountryStateInfoType {

    private String countryState;

    /**
    * The country state code.
    */
    public String getCountryState() {
        return this.countryState;
    }

    public boolean hasCountryState() {
        return this.countryState != null;
    }

    private String countryStateName;

    /**
    * The full country state name.
    */
    public String getCountryStateName() {
        return this.countryStateName;
    }

    public boolean hasCountryStateName() {
        return this.countryStateName != null;
    }

}