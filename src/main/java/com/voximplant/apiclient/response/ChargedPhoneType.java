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
* The charged phone info.
*/
public class ChargedPhoneType implements Alignable {

    private Long phoneId;

    /**
    * The phone ID.
    */
    public Long getPhoneId() {
        return this.phoneId;
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    private String phoneNumber;

    /**
    * The phone number.
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    private Boolean deactivated;

    /**
    * Is subscription frozen?
    */
    public Boolean getDeactivated() {
        return this.deactivated;
    }

    public boolean hasDeactivated() {
        return this.deactivated != null;
    }

    private Boolean isCharged;

    /**
    * Has phone been charged?
    */
    public Boolean getIsCharged() {
        return this.isCharged;
    }

    public boolean hasIsCharged() {
        return this.isCharged != null;
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
        if (phoneId != null) {
            sb.append(aligned)
                .append("\"phoneId\": \"")
                .append(phoneId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneNumber != null) {
            sb.append(aligned)
                .append("\"phoneNumber\": \"")
                .append(phoneNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (deactivated != null) {
            sb.append(aligned)
                .append("\"deactivated\": \"")
                .append(deactivated)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isCharged != null) {
            sb.append(aligned)
                .append("\"isCharged\": \"")
                .append(isCharged)
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