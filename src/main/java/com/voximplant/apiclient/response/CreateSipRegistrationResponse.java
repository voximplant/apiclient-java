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

public class CreateSipRegistrationResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public Long getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long sipRegistrationId;

    /**
    * The sip registration id
    */
    public Long getSipRegistrationId() {
        return this.sipRegistrationId;
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    private ShortAccountInfoType accountInfo;

    /**
    * The current account state
    */
    public ShortAccountInfoType getAccountInfo() {
        return this.accountInfo;
    }

    public boolean hasAccountInfo() {
        return this.accountInfo != null;
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
        if (result != null) {
            sb.append(aligned)
                .append("\"result\": \"")
                .append(result)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sipRegistrationId != null) {
            sb.append(aligned)
                .append("\"sipRegistrationId\": \"")
                .append(sipRegistrationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountInfo != null) {
            sb.append(aligned)
                .append("\"accountInfo\": \"")
                .append(accountInfo)
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