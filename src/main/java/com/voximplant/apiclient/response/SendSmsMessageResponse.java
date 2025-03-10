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

public class SendSmsMessageResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

        public Long getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long messageId;

    /**
    * Message ID
    */
    public Long getMessageId() {
        return this.messageId;
    }

    public boolean hasMessageId() {
        return this.messageId != null;
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
                .append("\"result\": \"")
                .append(result)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (messageId != null) {
            sb.append(aligned)
                .append("\"messageId\": \"")
                .append(messageId)
                .append('"')
                .append(',')
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