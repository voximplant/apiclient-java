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
* The [ChargeAccount] function result.
*/
public class ChargeAccountResult implements Alignable {

    private BigDecimal chargedAmount;

    /**
    * The charged money amount.
    */
    public BigDecimal getChargedAmount() {
        return this.chargedAmount;
    }

    public boolean hasChargedAmount() {
        return this.chargedAmount != null;
    }

    private ChargedPhoneType[] phones;

    /**
    * The charged phone list.
    */
    public ChargedPhoneType[] getPhones() {
        return this.phones;
    }

    public boolean hasPhones() {
        return this.phones != null;
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
        if (chargedAmount != null) {
            sb.append(aligned)
                .append("\"chargedAmount\": \"")
                .append(chargedAmount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phones != null) {
            sb.append(aligned)
                .append("\"ChargedPhoneType\": ")
                .append(StringHelper.arrayToString(phones, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}