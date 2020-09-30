package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetChildAccountSubscriptionTemplates] function result.
*/
public class ChildAccountSubscriptionTemplateType {

    private Long subscriptionTemplateId;

    /**
    * The subscription template ID.
    */
    public long getSubscriptionTemplateId() {
        return this.subscriptionTemplateId.longValue();
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

}