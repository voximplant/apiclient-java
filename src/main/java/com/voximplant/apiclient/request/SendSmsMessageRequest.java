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

public class SendSmsMessageRequest implements Alignable {
    private String source;

    @RequestField(name="source")
    /**
    * The source phone number
    */
    public String getSource() {
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null;
    }

    /**
    * The source phone number
    */
    public SendSmsMessageRequest setSource(String d) {
        this.source = d;
        return this;
    }

    private String destination;

    @RequestField(name="destination")
    /**
    * The destination phone number
    */
    public String getDestination() {
        return this.destination;
    }

    public boolean hasDestination() {
        return this.destination != null;
    }

    /**
    * The destination phone number
    */
    public SendSmsMessageRequest setDestination(String d) {
        this.destination = d;
        return this;
    }

    private String smsBody;

    @RequestField(name="sms_body")
    /**
    * The message text, up to 765 characters. We split long messages
    * greater than 160 GSM-7 characters or 70 UTF-16 characters into
    * multiple segments. Each segment is charged as one message
    */
    public String getSmsBody() {
        return this.smsBody;
    }

    public boolean hasSmsBody() {
        return this.smsBody != null;
    }

    /**
    * The message text, up to 765 characters. We split long messages
    * greater than 160 GSM-7 characters or 70 UTF-16 characters into
    * multiple segments. Each segment is charged as one message
    */
    public SendSmsMessageRequest setSmsBody(String d) {
        this.smsBody = d;
        return this;
    }

    private Boolean storeBody;

    @RequestField(name="store_body")
    /**
    * Set to true to store outbound message texts. Default value is false
    */
    public Boolean getStoreBody() {
        return this.storeBody;
    }

    public boolean hasStoreBody() {
        return this.storeBody != null;
    }

    /**
    * Set to true to store outbound message texts. Default value is false
    */
    public SendSmsMessageRequest setStoreBody(boolean d) {
        this.storeBody = Boolean.valueOf(d);
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
        if (source != null) {
            sb.append(aligned)
                .append("\"source\": \"")
                .append(source)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (destination != null) {
            sb.append(aligned)
                .append("\"destination\": \"")
                .append(destination)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (smsBody != null) {
            sb.append(aligned)
                .append("\"smsBody\": \"")
                .append(smsBody)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (storeBody != null) {
            sb.append(aligned)
                .append("\"storeBody\": \"")
                .append(storeBody)
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