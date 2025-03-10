package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetNewPhoneNumbers] function result item.
*/
public class NewPhoneInfoType implements Alignable {

    private Long phoneId;

    /**
    * The phone ID
    */
    public Long getPhoneId() {
        return this.phoneId;
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    private String phoneNumber;

    /**
    * The phone number
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    private BigDecimal phonePrice;

    /**
    * The phone monthly charge
    */
    public BigDecimal getPhonePrice() {
        return this.phonePrice;
    }

    public boolean hasPhonePrice() {
        return this.phonePrice != null;
    }

    private BigDecimal phoneInstallationPrice;

    /**
    * The phone installation price (without the first monthly fee)
    */
    public BigDecimal getPhoneInstallationPrice() {
        return this.phoneInstallationPrice;
    }

    public boolean hasPhoneInstallationPrice() {
        return this.phoneInstallationPrice != null;
    }

    private String phoneCountryCode;

    /**
    * The phone country code (2 symbols)
    */
    public String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public boolean hasPhoneCountryCode() {
        return this.phoneCountryCode != null;
    }

    private String phonePeriod;

    /**
    * The charge period in 24-h format: Y-M-D H:m:s. Example: 0-1-0 0:0:0
    * is 1 month
    */
    public String getPhonePeriod() {
        return this.phonePeriod;
    }

    public boolean hasPhonePeriod() {
        return this.phonePeriod != null;
    }

    private String phoneCategoryName;

    /**
    * The phone category name (MOBILE, GEOGRAPHIC, TOLLFREE, MOSCOW495)
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    private String phoneRegionName;

    /**
    * The phone region name
    */
    public String getPhoneRegionName() {
        return this.phoneRegionName;
    }

    public boolean hasPhoneRegionName() {
        return this.phoneRegionName != null;
    }

    private Long phoneInstallationTaxReserve;

    /**
    * The phone number installation tax reserve
    */
    public Long getPhoneInstallationTaxReserve() {
        return this.phoneInstallationTaxReserve;
    }

    public boolean hasPhoneInstallationTaxReserve() {
        return this.phoneInstallationTaxReserve != null;
    }

    private Long phoneTaxReserve;

    /**
    * The phone number tax reserve
    */
    public Long getPhoneTaxReserve() {
        return this.phoneTaxReserve;
    }

    public boolean hasPhoneTaxReserve() {
        return this.phoneTaxReserve != null;
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
        if (phoneInstallationPrice != null) {
            sb.append(aligned)
                .append("\"phoneInstallationPrice\": \"")
                .append(phoneInstallationPrice)
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
        if (phonePeriod != null) {
            sb.append(aligned)
                .append("\"phonePeriod\": \"")
                .append(phonePeriod)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneCategoryName != null) {
            sb.append(aligned)
                .append("\"phoneCategoryName\": \"")
                .append(phoneCategoryName)
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
        if (phoneInstallationTaxReserve != null) {
            sb.append(aligned)
                .append("\"phoneInstallationTaxReserve\": \"")
                .append(phoneInstallationTaxReserve)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneTaxReserve != null) {
            sb.append(aligned)
                .append("\"phoneTaxReserve\": \"")
                .append(phoneTaxReserve)
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