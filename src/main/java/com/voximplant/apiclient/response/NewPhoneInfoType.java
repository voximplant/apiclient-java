package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetNewPhoneNumbers] function result item.
*/
public class NewPhoneInfoType {

    private Long phoneId;

    /**
    * The phone ID.
    */
    public long getPhoneId() {
        return this.phoneId.longValue();
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

}