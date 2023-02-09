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
* Received when A2P messages are activated. Received as part of the
* [AccountCallback] structure.
*/
public class A2PActivatedCallback implements Alignable {

    private Boolean a2pEnabled;

    /**
    * A2P messages are allowed
    */
    public Boolean getA2pEnabled() {
        return this.a2pEnabled;
    }

    public boolean hasA2pEnabled() {
        return this.a2pEnabled != null;
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
        if (a2pEnabled != null) {
            sb.append(aligned)
                .append("\"a2pEnabled\": \"")
                .append(a2pEnabled)
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