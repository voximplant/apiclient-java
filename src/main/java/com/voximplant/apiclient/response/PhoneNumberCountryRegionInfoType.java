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
* The [GetPhoneNumberRegions] function result.
*/
public class PhoneNumberCountryRegionInfoType implements Alignable {

    private Long phoneRegionId;

    /**
    * The region ID.
    */
    public Long getPhoneRegionId() {
        return this.phoneRegionId;
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
    public Long getPhoneCount() {
        return this.phoneCount;
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
    public Boolean getIsNeedRegulationAddress() {
        return this.isNeedRegulationAddress;
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
    public Boolean getIsSmsSupported() {
        return this.isSmsSupported;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (phoneRegionId != null) {
            sb.append(aligned)
                .append("\"phoneRegionId\": \"")
                .append(phoneRegionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionName != null) {
            sb.append(aligned)
                .append("\"phoneRegionName\": \"")
                .append(phoneRegionName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionCode != null) {
            sb.append(aligned)
                .append("\"phoneRegionCode\": \"")
                .append(phoneRegionCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneCount != null) {
            sb.append(aligned)
                .append("\"phoneCount\": \"")
                .append(phoneCount)
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
        if (requiredVerification != null) {
            sb.append(aligned)
                .append("\"requiredVerification\": \"")
                .append(requiredVerification)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phonePrice != null) {
            sb.append(aligned)
                .append("\"phonePrice\": \"")
                .append(phonePrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneInstallationPrice != null) {
            sb.append(aligned)
                .append("\"phoneInstallationPrice\": \"")
                .append(phoneInstallationPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phonePeriod != null) {
            sb.append(aligned)
                .append("\"phonePeriod\": \"")
                .append(phonePeriod)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isNeedRegulationAddress != null) {
            sb.append(aligned)
                .append("\"isNeedRegulationAddress\": \"")
                .append(isNeedRegulationAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressType != null) {
            sb.append(aligned)
                .append("\"regulationAddressType\": \"")
                .append(regulationAddressType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isSmsSupported != null) {
            sb.append(aligned)
                .append("\"isSmsSupported\": \"")
                .append(isSmsSupported)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (multipleNumbersPrice != null) {
            sb.append(aligned)
                .append("\"MultipleNumbersPrice\": ")
                .append(StringHelper.arrayToString(multipleNumbersPrice, alignment + 1))
                .append(System.lineSeparator());
        }
        if (localizedCountryName != null) {
            sb.append(aligned)
                .append("\"localizedCountryName\": \"")
                .append(localizedCountryName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localizedPhoneCategoryName != null) {
            sb.append(aligned)
                .append("\"localizedPhoneCategoryName\": \"")
                .append(localizedPhoneCategoryName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localizedPhoneRegionName != null) {
            sb.append(aligned)
                .append("\"localizedPhoneRegionName\": \"")
                .append(localizedPhoneRegionName)
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