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

public class A2PSendSmsResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private SmsTransaction[] result;

        public SmsTransaction[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private FailedSms[] failed;

        public FailedSms[] getFailed() {
        return this.failed;
    }

    public boolean hasFailed() {
        return this.failed != null;
    }

    private Long fragmentsCount;

    /**
    * The number of fragments the message is divided into
    */
    public Long getFragmentsCount() {
        return this.fragmentsCount;
    }

    public boolean hasFragmentsCount() {
        return this.fragmentsCount != null;
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
                .append("\"SmsTransaction\": ")
                .append(StringHelper.arrayToString(result, alignment + 1))
                .append(System.lineSeparator());
        }
        if (failed != null) {
            sb.append(aligned)
                .append("\"FailedSms\": ")
                .append(StringHelper.arrayToString(failed, alignment + 1))
                .append(System.lineSeparator());
        }
        if (fragmentsCount != null) {
            sb.append(aligned)
                .append("\"fragmentsCount\": \"")
                .append(fragmentsCount)
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