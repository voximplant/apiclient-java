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
* The [GetSipWhiteList] function result item.
*/
public class SipWhiteListInfoType implements Alignable {

    private Long sipWhitelistId;

    /**
    * The SIP white list item ID.
    */
    public Long getSipWhitelistId() {
        return this.sipWhitelistId;
    }

    public boolean hasSipWhitelistId() {
        return this.sipWhitelistId != null;
    }

    private String sipWhitelistNetwork;

    /**
    * The network address in format A.B.C.D/L
    */
    public String getSipWhitelistNetwork() {
        return this.sipWhitelistNetwork;
    }

    public boolean hasSipWhitelistNetwork() {
        return this.sipWhitelistNetwork != null;
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
        if (sipWhitelistId != null) {
            sb.append(aligned)
                .append("\"sipWhitelistId\": \"")
                .append(sipWhitelistId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sipWhitelistNetwork != null) {
            sb.append(aligned)
                .append("\"sipWhitelistNetwork\": \"")
                .append(sipWhitelistNetwork)
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