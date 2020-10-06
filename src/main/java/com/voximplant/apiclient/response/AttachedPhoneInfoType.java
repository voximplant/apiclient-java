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
* The [GetPhoneNumbers] function result item.
*/
public class AttachedPhoneInfoType implements Alignable {

    private Long phoneId;

    /**
    * The phone ID.
    */
    public Long getPhoneId() {
        return this.phoneId;
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    private String phoneNumber;

    /**
    * The phone number.
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
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

    private String phoneCountryCode;

    /**
    * The phone country code (2 symbols).
    */
    public String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public boolean hasPhoneCountryCode() {
        return this.phoneCountryCode != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date phoneNextRenewal;

    /**
    * The next renewal date in format: YYYY-MM-DD
    */
    public Date getPhoneNextRenewal() {
        return this.phoneNextRenewal;
    }

    public boolean hasPhoneNextRenewal() {
        return this.phoneNextRenewal != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date phonePurchaseDate;

    /**
    * The purchase date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getPhonePurchaseDate() {
        return this.phonePurchaseDate;
    }

    public boolean hasPhonePurchaseDate() {
        return this.phonePurchaseDate != null;
    }

    private Boolean deactivated;

    /**
    * The flag of the frozen subscription.
    */
    public Boolean getDeactivated() {
        return this.deactivated;
    }

    public boolean hasDeactivated() {
        return this.deactivated != null;
    }

    private Boolean canceled;

    /**
    * The flag of the deleted subscription.
    */
    public Boolean getCanceled() {
        return this.canceled;
    }

    public boolean hasCanceled() {
        return this.canceled != null;
    }

    private Boolean autoCharge;

    /**
    * The auto_charge flag.
    */
    public Boolean getAutoCharge() {
        return this.autoCharge;
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    private Long applicationId;

    /**
    * The id of the bound application.
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private String applicationName;

    /**
    * The name of the bound application.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    private Long ruleId;

    /**
    * The id of the bound rule.
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    private String ruleName;

    /**
    * The name of the bound rule.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    private String categoryName;

    /**
    * The phone category name (MOBILE, GEOGRAPHIC, TOLLFREE, MOSCOW495)
    */
    public String getCategoryName() {
        return this.categoryName;
    }

    public boolean hasCategoryName() {
        return this.categoryName != null;
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

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date unverifiedHoldUntil;

    /**
    * Unverified phone hold until the date in format: YYYY-MM-DD (if the
    * account verification is required). The number will be detached on
    * that day automatically!
    */
    public Date getUnverifiedHoldUntil() {
        return this.unverifiedHoldUntil;
    }

    public boolean hasUnverifiedHoldUntil() {
        return this.unverifiedHoldUntil != null;
    }

    private Boolean canBeUsed;

    /**
    * Can the unverified account use the phone?
    */
    public Boolean getCanBeUsed() {
        return this.canBeUsed;
    }

    public boolean hasCanBeUsed() {
        return this.canBeUsed != null;
    }

    private Boolean isSmsSupported;

    /**
    * If <b>true</b>, SMS is supported for this phone number. SMS needs to
    * be explicitly enabled via the [ControlSms] HTTP API before sending or
    * receiving SMS. If SMS is supported and enabled, SMS can be sent from
    * this phone number using the [SendSmsMessage] HTTP API and received
    * using the [InboundSmsCallback] property of the HTTP callback. See <a
    * href='/docs/howtos/integration/httpapi/callbacks'>this article</a>
    * for HTTP callback details.
    */
    public Boolean getIsSmsSupported() {
        return this.isSmsSupported;
    }

    public boolean hasIsSmsSupported() {
        return this.isSmsSupported != null;
    }

    private Boolean isSmsEnabled;

    /**
    * If <b>true</b>, SMS sending and receiving is enabled for this phone
    * number via the [ControlSms] HTTP API.
    */
    public Boolean getIsSmsEnabled() {
        return this.isSmsEnabled;
    }

    public boolean hasIsSmsEnabled() {
        return this.isSmsEnabled != null;
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
        if (phoneId != null) {
            sb.append(aligned)
                .append("\"phoneId\": \"")
                .append(phoneId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneNumber != null) {
            sb.append(aligned)
                .append("\"phoneNumber\": \"")
                .append(phoneNumber)
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
        if (phoneCountryCode != null) {
            sb.append(aligned)
                .append("\"phoneCountryCode\": \"")
                .append(phoneCountryCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneNextRenewal != null) {
            sb.append(aligned)
                .append("\"phoneNextRenewal\": \"")
                .append(phoneNextRenewal)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phonePurchaseDate != null) {
            sb.append(aligned)
                .append("\"phonePurchaseDate\": \"")
                .append(phonePurchaseDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (deactivated != null) {
            sb.append(aligned)
                .append("\"deactivated\": \"")
                .append(deactivated)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (canceled != null) {
            sb.append(aligned)
                .append("\"canceled\": \"")
                .append(canceled)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (autoCharge != null) {
            sb.append(aligned)
                .append("\"autoCharge\": \"")
                .append(autoCharge)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleName != null) {
            sb.append(aligned)
                .append("\"ruleName\": \"")
                .append(ruleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (categoryName != null) {
            sb.append(aligned)
                .append("\"categoryName\": \"")
                .append(categoryName)
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
        if (unverifiedHoldUntil != null) {
            sb.append(aligned)
                .append("\"unverifiedHoldUntil\": \"")
                .append(unverifiedHoldUntil)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (canBeUsed != null) {
            sb.append(aligned)
                .append("\"canBeUsed\": \"")
                .append(canBeUsed)
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
        if (isSmsEnabled != null) {
            sb.append(aligned)
                .append("\"isSmsEnabled\": \"")
                .append(isSmsEnabled)
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