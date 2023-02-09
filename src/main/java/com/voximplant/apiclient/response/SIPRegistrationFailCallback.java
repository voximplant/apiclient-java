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
* Received when one or several SIP registrations are failed. Received
* as part of the [AccountCallback] structure.
*/
public class SIPRegistrationFailCallback implements Alignable {

    private SIPRegistrationIsFailedCallbackItem[] sipRegistrations;

    /**
    * SIP registration array
    */
    public SIPRegistrationIsFailedCallbackItem[] getSipRegistrations() {
        return this.sipRegistrations;
    }

    public boolean hasSipRegistrations() {
        return this.sipRegistrations != null;
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
        if (sipRegistrations != null) {
            sb.append(aligned)
                .append("\"SIPRegistrationIsFailedCallbackItem\": ")
                .append(StringHelper.arrayToString(sipRegistrations, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}