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
* Rented phone number verification status change. Received as a part of
* the [AccountCallback] structure.
*/
public class PhoneNumberActivationStatusChangedCallback implements Alignable {

    private PhoneNumberActivationStatusChangedCallbackItem phoneNumberActivationStatusChanged;

    /**
    * Rented phone number verification status
    */
    public PhoneNumberActivationStatusChangedCallbackItem getPhoneNumberActivationStatusChanged() {
        return this.phoneNumberActivationStatusChanged;
    }

    public boolean hasPhoneNumberActivationStatusChanged() {
        return this.phoneNumberActivationStatusChanged != null;
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
        if (phoneNumberActivationStatusChanged != null) {
            sb.append(aligned)
                .append("\"phoneNumberActivationStatusChanged\": \"")
                .append(phoneNumberActivationStatusChanged)
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