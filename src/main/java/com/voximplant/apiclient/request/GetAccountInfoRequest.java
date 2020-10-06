package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetAccountInfoRequest implements Alignable {
    private Boolean returnLiveBalance;

    @RequestField(name="return_live_balance")
    /**
    * Set true to get the account's live balance.
    */
    public Boolean getReturnLiveBalance() {
        return this.returnLiveBalance;
    }

    public boolean hasReturnLiveBalance() {
        return this.returnLiveBalance != null;
    }

    /**
    * Set true to get the account's live balance.
    */
    public GetAccountInfoRequest setReturnLiveBalance(boolean d) {
        this.returnLiveBalance = Boolean.valueOf(d);
        return this;
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
        if (returnLiveBalance != null) {
            sb.append(aligned)
                .append("\"returnLiveBalance\": \"")
                .append(returnLiveBalance)
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