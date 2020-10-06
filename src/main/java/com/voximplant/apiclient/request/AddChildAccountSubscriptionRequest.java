package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class AddChildAccountSubscriptionRequest implements Alignable {
    private Long childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID.
    */
    public Long getChildAccountId() {
        return this.childAccountId;
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
    public Long getSubscriptionTemplateId() {
        return this.subscriptionTemplateId;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (childAccountId != null) {
            sb.append(aligned)
                .append("\"childAccountId\": \"")
                .append(childAccountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionTemplateId != null) {
            sb.append(aligned)
                .append("\"subscriptionTemplateId\": \"")
                .append(subscriptionTemplateId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionName != null) {
            sb.append(aligned)
                .append("\"subscriptionName\": \"")
                .append(subscriptionName)
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