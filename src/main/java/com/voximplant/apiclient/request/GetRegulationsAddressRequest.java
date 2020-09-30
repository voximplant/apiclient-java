package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetRegulationsAddressRequest {
    private String countryCode;

    @RequestField(name="country_code")
    /**
    * The country code according to the <b>ISO 3166-1 alpha-2</b>.
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code according to the <b>ISO 3166-1 alpha-2</b>.
    */
    public GetRegulationsAddressRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String phoneCategoryName;

    @RequestField(name="phone_category_name")
    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    */
    public GetRegulationsAddressRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private String phoneRegionCode;

    @RequestField(name="phone_region_code")
    /**
    * The phone region code. See the [GetRegions] method.
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    /**
    * The phone region code. See the [GetRegions] method.
    */
    public GetRegulationsAddressRequest setPhoneRegionCode(String d) {
        this.phoneRegionCode = d;
        return this;
    }

    private Long regulationAddressId;

    @RequestField(name="regulation_address_id")
    /**
    * The regulation address ID.
    */
    public long getRegulationAddressId() {
        return this.regulationAddressId.longValue();
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    /**
    * The regulation address ID.
    */
    public GetRegulationsAddressRequest setRegulationAddressId(long d) {
        this.regulationAddressId = Long.valueOf(d);
        return this;
    }

    private Long verificationId;

    @RequestField(name="verification_id")
    /**
    * The regulation address type ID.
    */
    public long getVerificationId() {
        return this.verificationId.longValue();
    }

    public boolean hasVerificationId() {
        return this.verificationId != null;
    }

    /**
    * The regulation address type ID.
    */
    public GetRegulationsAddressRequest setVerificationId(long d) {
        this.verificationId = Long.valueOf(d);
        return this;
    }

    private Boolean verified;

    @RequestField(name="verified")
    /**
    * Show only verified regulation address.
    */
    public boolean getVerified() {
        return this.verified.booleanValue();
    }

    public boolean hasVerified() {
        return this.verified != null;
    }

    /**
    * Show only verified regulation address.
    */
    public GetRegulationsAddressRequest setVerified(boolean d) {
        this.verified = Boolean.valueOf(d);
        return this;
    }

    private Boolean inProgress;

    @RequestField(name="in_progress")
    /**
    * Show only in progress regulation address.
    */
    public boolean getInProgress() {
        return this.inProgress.booleanValue();
    }

    public boolean hasInProgress() {
        return this.inProgress != null;
    }

    /**
    * Show only in progress regulation address.
    */
    public GetRegulationsAddressRequest setInProgress(boolean d) {
        this.inProgress = Boolean.valueOf(d);
        return this;
    }

    private Boolean withRegionCode;

    @RequestField(name="with_region_code")
    /**
    * Return with phone_region_code parameters
    */
    public boolean getWithRegionCode() {
        return this.withRegionCode.booleanValue();
    }

    public boolean hasWithRegionCode() {
        return this.withRegionCode != null;
    }

    /**
    * Return with phone_region_code parameters
    */
    public GetRegulationsAddressRequest setWithRegionCode(boolean d) {
        this.withRegionCode = Boolean.valueOf(d);
        return this;
    }

}