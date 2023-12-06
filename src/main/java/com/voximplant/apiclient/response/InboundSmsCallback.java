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
* The incoming SMS callback. Received as a part of the
* [AccountCallback] structure. If the
* <b>incoming_sms_notification_url</b> parameter is set, the
* notification of an incoming SMS is sent to this url, otherwise, it is
* sent to the general account URL.
*/
public class InboundSmsCallback implements Alignable {

    private InboundSmsCallbackItem smsInbound;

    /**
    * The incoming SMS info
    */
    public InboundSmsCallbackItem getSmsInbound() {
        return this.smsInbound;
    }

    public boolean hasSmsInbound() {
        return this.smsInbound != null;
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
        if (smsInbound != null) {
            sb.append(aligned)
                .append("\"smsInbound\": \"")
                .append(smsInbound)
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