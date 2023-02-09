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
* Information about the phone numbers or sip registrations that the
* subscription is attached to.
*/
public class SubscriptionCallbackDetails implements Alignable {

    private String type;

    /**
    * Type that the subscription is attached to. Possible values are PHONE
    * and SIP_REGISTRATION
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private SubscriptionCallbackDetailsPhoneNumbers[] phoneNumbers;

    /**
    * Object containing the subscription's phone numbers and their ids if
    * type = PHONE
    */
    public SubscriptionCallbackDetailsPhoneNumbers[] getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public boolean hasPhoneNumbers() {
        return this.phoneNumbers != null;
    }

    private SubscriptionCallbackDetailsSipRegistrations[] sipRegistrations;

    /**
    * Object containing the subscription's sip registrations ids if type =
    * SIP_REGISTRATION
    */
    public SubscriptionCallbackDetailsSipRegistrations[] getSipRegistrations() {
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
        if (type != null) {
            sb.append(aligned)
                .append("\"type\": \"")
                .append(type)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneNumbers != null) {
            sb.append(aligned)
                .append("\"SubscriptionCallbackDetailsPhoneNumbers\": ")
                .append(StringHelper.arrayToString(phoneNumbers, alignment + 1))
                .append(System.lineSeparator());
        }
        if (sipRegistrations != null) {
            sb.append(aligned)
                .append("\"SubscriptionCallbackDetailsSipRegistrations\": ")
                .append(StringHelper.arrayToString(sipRegistrations, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}