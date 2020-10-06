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
* The [GetPhoneNumberCountryStates] function result.
*/
public class PhoneNumberCountryStateInfoType implements Alignable {

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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (countryState != null) {
            sb.append(aligned)
                .append("\"countryState\": \"")
                .append(countryState)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (countryStateName != null) {
            sb.append(aligned)
                .append("\"countryStateName\": \"")
                .append(countryStateName)
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