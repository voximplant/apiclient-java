package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The subscription template info.
*/
public class SubscriptionTemplateType {

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

    private BigDecimal installationPrice;

    /**
    * The subscription installation price (without the first monthly fee).
    */
    public BigDecimal getInstallationPrice() {
        return this.installationPrice;
    }

    public boolean hasInstallationPrice() {
        return this.installationPrice != null;
    }

    private String price;

    /**
    * The subscription monthly fee, including taxes and discounts.
    */
    public String getPrice() {
        return this.price;
    }

    public boolean hasPrice() {
        return this.price != null;
    }

    private String period;

    /**
    * The charge period in 24-h format: Y-M-D H:m:s. Example: 0-1-0 0:0:0
    * is 1 month.
    */
    public String getPeriod() {
        return this.period;
    }

    public boolean hasPeriod() {
        return this.period != null;
    }

    private String subscriptionTemplateType;

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

    private String subscriptionTemplateName;

    /**
    * The subscription template name (example: SIP registration, Phone GB,
    * Phone RU 495, ...).
    */
    public String getSubscriptionTemplateName() {
        return this.subscriptionTemplateName;
    }

    public boolean hasSubscriptionTemplateName() {
        return this.subscriptionTemplateName != null;
    }

    private String requiredVerification;

    /**
    * The name of the required verification.
    */
    public String getRequiredVerification() {
        return this.requiredVerification;
    }

    public boolean hasRequiredVerification() {
        return this.requiredVerification != null;
    }

    private String verificationStatus;

    /**
    * The verification status. Possible values are: REQUIRED, IN_PROGRESS,
    * VERIFIED, NOT_REQUIRED.
    */
    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null;
    }

}