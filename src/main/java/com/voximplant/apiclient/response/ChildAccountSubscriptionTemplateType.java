package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetChildAccountSubscriptionTemplates] function result.
*/
public class ChildAccountSubscriptionTemplateType implements Alignable {

    private Long subscriptionTemplateId;

    /**
    * The subscription template ID.
    */
    public Long getSubscriptionTemplateId() {
        return this.subscriptionTemplateId;
    }

    public boolean hasSubscriptionTemplateId() {
        return this.subscriptionTemplateId != null;
    }

    private String subscriptionTemplateName;

    /**
    * The subscription template name.
    */
    public String getSubscriptionTemplateName() {
        return this.subscriptionTemplateName;
    }

    public boolean hasSubscriptionTemplateName() {
        return this.subscriptionTemplateName != null;
    }

    private BigDecimal installationPrice;

    /**
    * The subscription template installation price.
    */
    public BigDecimal getInstallationPrice() {
        return this.installationPrice;
    }

    public boolean hasInstallationPrice() {
        return this.installationPrice != null;
    }

    private BigDecimal periodicPrice;

    /**
    * The subscription template periodic price.
    */
    public BigDecimal getPeriodicPrice() {
        return this.periodicPrice;
    }

    public boolean hasPeriodicPrice() {
        return this.periodicPrice != null;
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
        if (subscriptionTemplateName != null) {
            sb.append(aligned)
                .append("\"subscriptionTemplateName\": \"")
                .append(subscriptionTemplateName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (installationPrice != null) {
            sb.append(aligned)
                .append("\"installationPrice\": \"")
                .append(installationPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (periodicPrice != null) {
            sb.append(aligned)
                .append("\"periodicPrice\": \"")
                .append(periodicPrice)
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