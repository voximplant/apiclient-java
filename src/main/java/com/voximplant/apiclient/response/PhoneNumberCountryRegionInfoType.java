package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetPhoneNumberRegions] function result.
*/
public class PhoneNumberCountryRegionInfoType {

    private Long phoneRegionId;

    /**
    * The region ID.
    */
    public long getPhoneRegionId() {
        return this.phoneRegionId.longValue();
    }

    public boolean hasPhoneRegionId() {
        return this.phoneRegionId != null;
    }

    private String phoneRegionName;

    /**
    * The full region name.
    */
    public String getPhoneRegionName() {
        return this.phoneRegionName;
    }

    public boolean hasPhoneRegionName() {
        return this.phoneRegionName != null;
    }

    private String phoneRegionCode;

    /**
    * The region phone prefix.
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    private Long phoneCount;

    /**
    * The phone number count in stock for the region.
    */
    public long getPhoneCount() {
        return this.phoneCount.longValue();
    }

    public boolean hasPhoneCount() {
        return this.phoneCount != null;
    }

    private String verificationStatus;

    /**
    * The account verification status. The following values are possible:
    * REQUIRED, IN_PROGRESS, VERIFIED
    */
    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null;
    }

    private String requiredVerification;

    /**
    * The required account verification name.
    */
    public String getRequiredVerification() {
        return this.requiredVerification;
    }

    public boolean hasRequiredVerification() {
        return this.requiredVerification != null;
    }

    private BigDecimal phonePrice;

    /**
    * The phone monthly charge.
    */
    public BigDecimal getPhonePrice() {
        return this.phonePrice;
    }

    public boolean hasPhonePrice() {
        return this.phonePrice != null;
    }

    private BigDecimal phoneInstallationPrice;

    /**
    * The phone installation price (without the first monthly fee).
    */
    public BigDecimal getPhoneInstallationPrice() {
        return this.phoneInstallationPrice;
    }

    public boolean hasPhoneInstallationPrice() {
        return this.phoneInstallationPrice != null;
    }

    private String phonePeriod;

    /**
    * The charge period in 24-h format: Y-M-D H:m:s. Example: 0-1-0 0:0:0
    * is 1 month.
    */
    public String getPhonePeriod() {
        return this.phonePeriod;
    }

    public boolean hasPhonePeriod() {
        return this.phonePeriod != null;
    }

    private Boolean isNeedRegulationAddress;

    /**
    * The flag of the need proof of address.
    */
    public boolean getIsNeedRegulationAddress() {
        return this.isNeedRegulationAddress.booleanValue();
    }

    public boolean hasIsNeedRegulationAddress() {
        return this.isNeedRegulationAddress != null;
    }

    private String regulationAddressType;

    /**
    * The type of regulation address. The possible values are: LOCAL,
    * NATIONAL, WORLDWIDE.
    */
    public String getRegulationAddressType() {
        return this.regulationAddressType;
    }

    public boolean hasRegulationAddressType() {
        return this.regulationAddressType != null;
    }

    private Boolean isSmsSupported;

    /**
    * If <b>true</b>, SMS is supported for phone numbers in this region.
    * SMS needs to be explicitly enabled for a phone number via the
    * [ControlSms] HTTP API before sending or receiving SMS. If SMS is
    * supported and enabled, SMS can be sent from a phone number using the
    * [SendSmsMessage] HTTP API and received using the [InboundSmsCallback]
    * property of the HTTP callback. See <a
    * href='/docs/howtos/integration/httpapi/callbacks'>this article</a>
    * for HTTP callback details.
    */
    public boolean getIsSmsSupported() {
        return this.isSmsSupported.booleanValue();
    }

    public boolean hasIsSmsSupported() {
        return this.isSmsSupported != null;
    }

    private MultipleNumbersPrice[] multipleNumbersPrice;

    /**
    * [Array](MultipleNumbersPrice) with info about multiple numbers
    * subscription for the child accounts.
    */
    public MultipleNumbersPrice[] getMultipleNumbersPrice() {
        return this.multipleNumbersPrice;
    }

    public boolean hasMultipleNumbersPrice() {
        return this.multipleNumbersPrice != null;
    }

    private String localizedCountryName;

    /**
    * The localized country name.
    */
    public String getLocalizedCountryName() {
        return this.localizedCountryName;
    }

    public boolean hasLocalizedCountryName() {
        return this.localizedCountryName != null;
    }

    private String localizedPhoneCategoryName;

    /**
    * The localized phone category name.
    */
    public String getLocalizedPhoneCategoryName() {
        return this.localizedPhoneCategoryName;
    }

    public boolean hasLocalizedPhoneCategoryName() {
        return this.localizedPhoneCategoryName != null;
    }

    private String localizedPhoneRegionName;

    /**
    * The localized phone region name.
    */
    public String getLocalizedPhoneRegionName() {
        return this.localizedPhoneRegionName;
    }

    public boolean hasLocalizedPhoneRegionName() {
        return this.localizedPhoneRegionName != null;
    }

}