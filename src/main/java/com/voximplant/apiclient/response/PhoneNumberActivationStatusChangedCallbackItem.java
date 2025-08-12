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
* The details of the [PhoneNumberActivationStatusChangedCallback].
*/
public class PhoneNumberActivationStatusChangedCallbackItem implements Alignable {

    private String phoneNumber;

    /**
    * Phone number that changed the status
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    private String activationStatus;

    /**
    * New verification status
    */
    public String getActivationStatus() {
        return this.activationStatus;
    }

    public boolean hasActivationStatus() {
        return this.activationStatus != null;
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
        if (phoneNumber != null) {
            sb.append(aligned)
                .append("\"phoneNumber\": \"")
                .append(phoneNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (activationStatus != null) {
            sb.append(aligned)
                .append("\"activationStatus\": \"")
                .append(activationStatus)
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