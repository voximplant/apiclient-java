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
* The subscription template info.
*/
public class SubscriptionTemplateType implements Alignable {

    private Long subscriptionTemplateId;

    /**
    * The subscription template ID
    */
    public Long getSubscriptionTemplateId() {
        return this.subscriptionTemplateId;
    }

    public boolean hasSubscriptionTemplateId() {
        return this.subscriptionTemplateId != null;
    }

    private Long currencyId;

    /**
    * ID of the original currency
    */
    public Long getCurrencyId() {
        return this.currencyId;
    }

    public boolean hasCurrencyId() {
        return this.currencyId != null;
    }

    private BigDecimal installationPrice;

    /**
    * The subscription installation price (without the first monthly fee)
    */
    public BigDecimal getInstallationPrice() {
        return this.installationPrice;
    }

    public boolean hasInstallationPrice() {
        return this.installationPrice != null;
    }

    private Long installationPriceInCurrency;

    /**
    * The subscription installation price in the original currency
    */
    public Long getInstallationPriceInCurrency() {
        return this.installationPriceInCurrency;
    }

    public boolean hasInstallationPriceInCurrency() {
        return this.installationPriceInCurrency != null;
    }

    private Long price;

    /**
    * The subscription monthly fee, including taxes and discounts
    */
    public Long getPrice() {
        return this.price;
    }

    public boolean hasPrice() {
        return this.price != null;
    }

    private Long priceInCurrency;

    /**
    * The subscription monthly fee in the original currency
    */
    public Long getPriceInCurrency() {
        return this.priceInCurrency;
    }

    public boolean hasPriceInCurrency() {
        return this.priceInCurrency != null;
    }

    private String period;

    /**
    * The charge period in 24-h format: Y-M-D H:m:s. Example: 0-1-0 0:0:0
    * is 1 month
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
    * PHONE_NUM, SIP_REGISTRATION
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
    * Phone RU 495, ...)
    */
    public String getSubscriptionTemplateName() {
        return this.subscriptionTemplateName;
    }

    public boolean hasSubscriptionTemplateName() {
        return this.subscriptionTemplateName != null;
    }

    private Boolean requiredVerification;

    /**
    * Verification is required for the account
    */
    public Boolean getRequiredVerification() {
        return this.requiredVerification;
    }

    public boolean hasRequiredVerification() {
        return this.requiredVerification != null;
    }

    private String verificationStatus;

    /**
    * The verification status. Possible values are REQUIRED, IN_PROGRESS,
    * VERIFIED, NOT_REQUIRED
    */
    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null;
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
        if (currencyId != null) {
            sb.append(aligned)
                .append("\"currencyId\": \"")
                .append(currencyId)
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
        if (installationPriceInCurrency != null) {
            sb.append(aligned)
                .append("\"installationPriceInCurrency\": \"")
                .append(installationPriceInCurrency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (price != null) {
            sb.append(aligned)
                .append("\"price\": \"")
                .append(price)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priceInCurrency != null) {
            sb.append(aligned)
                .append("\"priceInCurrency\": \"")
                .append(priceInCurrency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (period != null) {
            sb.append(aligned)
                .append("\"period\": \"")
                .append(period)
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
        if (requiredVerification != null) {
            sb.append(aligned)
                .append("\"requiredVerification\": \"")
                .append(requiredVerification)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (verificationStatus != null) {
            sb.append(aligned)
                .append("\"verificationStatus\": \"")
                .append(verificationStatus)
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