package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class SendSmsMessageRequest {
    private String source;

    @RequestField(name="source")
    /**
    * The source phone number.
    */
    public String getSource() {
        return this.source;
    }

    public boolean hasSource() {
        return this.source != null;
    }

    /**
    * The source phone number.
    */
    public SendSmsMessageRequest setSource(String d) {
        this.source = d;
        return this;
    }

    private String destination;

    @RequestField(name="destination")
    /**
    * The destination phone number.
    */
    public String getDestination() {
        return this.destination;
    }

    public boolean hasDestination() {
        return this.destination != null;
    }

    /**
    * The destination phone number.
    */
    public SendSmsMessageRequest setDestination(String d) {
        this.destination = d;
        return this;
    }

    private String smsBody;

    @RequestField(name="sms_body")
    /**
    * The message text, up to 70 characters. The message of 71-140
    * characters is billed like 2 messages; the message of 141-210
    * characters is billed like 3 messages and so on.
    */
    public String getSmsBody() {
        return this.smsBody;
    }

    public boolean hasSmsBody() {
        return this.smsBody != null;
    }

    /**
    * The message text, up to 70 characters. The message of 71-140
    * characters is billed like 2 messages; the message of 141-210
    * characters is billed like 3 messages and so on.
    */
    public SendSmsMessageRequest setSmsBody(String d) {
        this.smsBody = d;
        return this;
    }

}