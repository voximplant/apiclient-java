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

public class GetSubscriptionPriceRequest {
    private MultiArgument<Long> subscriptionTemplateId;

    @RequestField(name="subscription_template_id")
    /**
    * The subscription template ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getSubscriptionTemplateId() {
        return this.subscriptionTemplateId;
    }

    public boolean hasSubscriptionTemplateId() {
        return this.subscriptionTemplateId != null;
    }

    /**
    * The subscription template ID list separated by the ';' symbol.
    */
    public GetSubscriptionPriceRequest setSubscriptionTemplateId(MultiArgument<Long> d) {
        this.subscriptionTemplateId = d;
        return this;
    }

    private String subscriptionTemplateType;

    @RequestField(name="subscription_template_type")
    /**
    * The subscription template type. The following values are possible:
    * PHONE_NUM, SIP_REGISTRATION.
    */
    public String getSubscriptionTemplateType() {
        return this.subscriptionTemplateType;
    }

    public boolean hasSubscriptionTemplateType() {
        return this.subscriptionTemplateType != null;
    }

    /**
    * The subscription template type. The following values are possible:
    * PHONE_NUM, SIP_REGISTRATION.
    */
    public GetSubscriptionPriceRequest setSubscriptionTemplateType(String d) {
        this.subscriptionTemplateType = d;
        return this;
    }

    private String subscriptionTemplateName;

    @RequestField(name="subscription_template_name")
    /**
    * The subscription template name  (example: SIP registration, Phone GB,
    * Phone RU 495, ...).
    */
    public String getSubscriptionTemplateName() {
        return this.subscriptionTemplateName;
    }

    public boolean hasSubscriptionTemplateName() {
        return this.subscriptionTemplateName != null;
    }

    /**
    * The subscription template name  (example: SIP registration, Phone GB,
    * Phone RU 495, ...).
    */
    public GetSubscriptionPriceRequest setSubscriptionTemplateName(String d) {
        this.subscriptionTemplateName = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetSubscriptionPriceRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetSubscriptionPriceRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}