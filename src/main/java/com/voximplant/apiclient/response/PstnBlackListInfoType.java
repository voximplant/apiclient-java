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
* The PSTN black list item info.
*/
public class PstnBlackListInfoType implements Alignable {

    private Long pstnBlacklistId;

    /**
    * The black list item ID
    */
    public Long getPstnBlacklistId() {
        return this.pstnBlacklistId;
    }

    public boolean hasPstnBlacklistId() {
        return this.pstnBlacklistId != null;
    }

    private String pstnBlacklistPhone ;

    /**
    * The phone number
    */
    public String getPstnBlacklistPhone () {
        return this.pstnBlacklistPhone ;
    }

    public boolean hasPstnBlacklistPhone () {
        return this.pstnBlacklistPhone  != null;
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
        if (pstnBlacklistId != null) {
            sb.append(aligned)
                .append("\"pstnBlacklistId\": \"")
                .append(pstnBlacklistId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (pstnBlacklistPhone  != null) {
            sb.append(aligned)
                .append("\"pstnBlacklistPhone \": \"")
                .append(pstnBlacklistPhone )
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