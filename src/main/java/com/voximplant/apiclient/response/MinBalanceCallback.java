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
* Received when the minimum balance is reached. Received as part of the
* [AccountCallback] structure.
*/
public class MinBalanceCallback implements Alignable {

    private Boolean isMinCredit;

    /**
    * Whether the credit threshold exceeded. The credit threshold =
    * credit_limit - min_balance_to_notify, wherein min_balance_to_notify >
    * 0
    */
    public Boolean getIsMinCredit() {
        return this.isMinCredit;
    }

    public boolean hasIsMinCredit() {
        return this.isMinCredit != null;
    }

    private Boolean isRepeated;

    /**
    * Whether the callback is repeated
    */
    public Boolean getIsRepeated() {
        return this.isRepeated;
    }

    public boolean hasIsRepeated() {
        return this.isRepeated != null;
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
        if (isMinCredit != null) {
            sb.append(aligned)
                .append("\"isMinCredit\": \"")
                .append(isMinCredit)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isRepeated != null) {
            sb.append(aligned)
                .append("\"isRepeated\": \"")
                .append(isRepeated)
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