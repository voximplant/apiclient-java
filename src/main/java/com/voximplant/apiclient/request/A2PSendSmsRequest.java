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

public class A2PSendSmsRequest implements Alignable {
    private String srcNumber;

    @RequestField(name="src_number")
    /**
    * The SenderID for outbound SMS. Please contact support for installing
    * a SenderID
    */
    public String getSrcNumber() {
        return this.srcNumber;
    }

    public boolean hasSrcNumber() {
        return this.srcNumber != null;
    }

    /**
    * The SenderID for outbound SMS. Please contact support for installing
    * a SenderID
    */
    public A2PSendSmsRequest setSrcNumber(String d) {
        this.srcNumber = d;
        return this;
    }

    private MultiArgument<String> dstNumbers;

    @RequestField(name="dst_numbers")
    /**
    * The destination phone numbers separated by semicolons (;). The
    * maximum number of these phone numbers is 100
    */
    public MultiArgument<String> getDstNumbers() {
        return this.dstNumbers;
    }

    public boolean hasDstNumbers() {
        return this.dstNumbers != null;
    }

    /**
    * The destination phone numbers separated by semicolons (;). The
    * maximum number of these phone numbers is 100
    */
    public A2PSendSmsRequest setDstNumbers(MultiArgument<String> d) {
        this.dstNumbers = d;
        return this;
    }

    private String text;

    @RequestField(name="text")
    /**
    * The message text, up to 1600 characters. We split long messages
    * greater than 160 GSM-7 characters or 70 UTF-16 characters into
    * multiple segments. Each segment is charged as one message
    */
    public String getText() {
        return this.text;
    }

    public boolean hasText() {
        return this.text != null;
    }

    /**
    * The message text, up to 1600 characters. We split long messages
    * greater than 160 GSM-7 characters or 70 UTF-16 characters into
    * multiple segments. Each segment is charged as one message
    */
    public A2PSendSmsRequest setText(String d) {
        this.text = d;
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
    public A2PSendSmsRequest setStoreBody(boolean d) {
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
        if (srcNumber != null) {
            sb.append(aligned)
                .append("\"srcNumber\": \"")
                .append(srcNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (dstNumbers != null) {
            sb.append(aligned)
                .append("\"dstNumbers\": \"")
                .append(dstNumbers)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (text != null) {
            sb.append(aligned)
                .append("\"text\": \"")
                .append(text)
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