package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
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

public class GetAvailablePlansRequest implements Alignable {
    private MultiArgument<String> planType;

    @RequestField(name="plan_type")
    /**
    * The plan type list separated by semicolons (;). The possible values
    * are IM, MAU
    */
    public MultiArgument<String> getPlanType() {
        return this.planType;
    }

    public boolean hasPlanType() {
        return this.planType != null;
    }

    /**
    * The plan type list separated by semicolons (;). The possible values
    * are IM, MAU
    */
    public GetAvailablePlansRequest setPlanType(MultiArgument<String> d) {
        this.planType = d;
        return this;
    }

    private MultiArgument<Long> planSubscriptionTemplateId;

    @RequestField(name="plan_subscription_template_id")
    /**
    * The plan ID list separated by semicolons (;)
    */
    public MultiArgument<Long> getPlanSubscriptionTemplateId() {
        return this.planSubscriptionTemplateId;
    }

    public boolean hasPlanSubscriptionTemplateId() {
        return this.planSubscriptionTemplateId != null;
    }

    /**
    * The plan ID list separated by semicolons (;)
    */
    public GetAvailablePlansRequest setPlanSubscriptionTemplateId(MultiArgument<Long> d) {
        this.planSubscriptionTemplateId = d;
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
        if (planType != null) {
            sb.append(aligned)
                .append("\"planType\": \"")
                .append(planType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (planSubscriptionTemplateId != null) {
            sb.append(aligned)
                .append("\"planSubscriptionTemplateId\": \"")
                .append(planSubscriptionTemplateId)
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