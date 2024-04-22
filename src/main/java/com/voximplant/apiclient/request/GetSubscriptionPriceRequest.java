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

public class GetSubscriptionPriceRequest implements Alignable {
    private MultiArgument<Long> subscriptionTemplateId;

    @RequestField(name="subscription_template_id")
    /**
    * The subscription template ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getSubscriptionTemplateId() {
        return this.subscriptionTemplateId;
    }

    public boolean hasSubscriptionTemplateId() {
        return this.subscriptionTemplateId != null;
    }

    /**
    * The subscription template ID list separated by semicolons (;)
    */
    public GetSubscriptionPriceRequest setSubscriptionTemplateId(MultiArgument<Long> d) {
        this.subscriptionTemplateId = d;
        return this;
    }

    private String subscriptionTemplateType;

    @RequestField(name="subscription_template_type")
    /**
    * The subscription template type. The following values are possible:
    * PHONE_NUM, SIP_REGISTRATION
    */
    public String getSubscriptionTemplateType() {
        return this.subscriptionTemplateType;
    }

    public boolean hasSubscriptionTemplateType() {
        return this.subscriptionTemplateType != null;
    }

    /**
    * The subscription template type. The following values are possible:
    * PHONE_NUM, SIP_REGISTRATION
    */
    public GetSubscriptionPriceRequest setSubscriptionTemplateType(String d) {
        this.subscriptionTemplateType = d;
        return this;
    }

    private String subscriptionTemplateName;

    @RequestField(name="subscription_template_name")
    /**
    * The subscription template name  (example: SIP registration, Phone GB,
    * Phone RU 495, ...)
    */
    public String getSubscriptionTemplateName() {
        return this.subscriptionTemplateName;
    }

    public boolean hasSubscriptionTemplateName() {
        return this.subscriptionTemplateName != null;
    }

    /**
    * The subscription template name  (example: SIP registration, Phone GB,
    * Phone RU 495, ...)
    */
    public GetSubscriptionPriceRequest setSubscriptionTemplateName(String d) {
        this.subscriptionTemplateName = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetSubscriptionPriceRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetSubscriptionPriceRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
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
        if (subscriptionTemplateId != null) {
            sb.append(aligned)
                .append("\"subscriptionTemplateId\": \"")
                .append(subscriptionTemplateId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionTemplateType != null) {
            sb.append(aligned)
                .append("\"subscriptionTemplateType\": \"")
                .append(subscriptionTemplateType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionTemplateName != null) {
            sb.append(aligned)
                .append("\"subscriptionTemplateName\": \"")
                .append(subscriptionTemplateName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
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