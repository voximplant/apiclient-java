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
* The account callbacks body. See <a
* href='/docs/guides/managementapi/callbacks'>this article</a> for
* details.
*/
public class AccountCallbacks implements Alignable {

    private AccountCallback[] callbacks;

    /**
    * The account callback array
    */
    public AccountCallback[] getCallbacks() {
        return this.callbacks;
    }

    public boolean hasCallbacks() {
        return this.callbacks != null;
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
        if (callbacks != null) {
            sb.append(aligned)
                .append("\"AccountCallback\": ")
                .append(StringHelper.arrayToString(callbacks, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}