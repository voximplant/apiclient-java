package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class ActivateOutboundTestPhoneNumberRequest implements Alignable {
    private String verificationCode;

    @RequestField(name="verification_code")
    /**
    * The verification code, see the [VerifyOutboundTestPhoneNumber]
    * function
    */
    public String getVerificationCode() {
        return this.verificationCode;
    }

    public boolean hasVerificationCode() {
        return this.verificationCode != null;
    }

    /**
    * The verification code, see the [VerifyOutboundTestPhoneNumber]
    * function
    */
    public ActivateOutboundTestPhoneNumberRequest setVerificationCode(String d) {
        this.verificationCode = d;
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
        if (verificationCode != null) {
            sb.append(aligned)
                .append("\"verificationCode\": \"")
                .append(verificationCode)
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