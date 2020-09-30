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

public class AddChildAccountSubscriptionRequest {
    private Long childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID.
    */
    public long getChildAccountId() {
        return this.childAccountId.longValue();
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID.
    */
    public AddChildAccountSubscriptionRequest setChildAccountId(long d) {
        this.childAccountId = Long.valueOf(d);
        return this;
    }

    private Long subscriptionTemplateId;

    @RequestField(name="subscription_template_id")
    /**
    * The subscription template ID.
    */
    public long getSubscriptionTemplateId() {
        return this.subscriptionTemplateId.longValue();
    }

    public boolean hasSubscriptionTemplateId() {
        return this.subscriptionTemplateId != null;
    }

    /**
    * The subscription template ID.
    */
    public AddChildAccountSubscriptionRequest setSubscriptionTemplateId(long d) {
        this.subscriptionTemplateId = Long.valueOf(d);
        return this;
    }

    private String subscriptionName;

    @RequestField(name="subscription_name")
    /**
    * The subscription name.
    */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public boolean hasSubscriptionName() {
        return this.subscriptionName != null;
    }

    /**
    * The subscription name.
    */
    public AddChildAccountSubscriptionRequest setSubscriptionName(String d) {
        this.subscriptionName = d;
        return this;
    }

}