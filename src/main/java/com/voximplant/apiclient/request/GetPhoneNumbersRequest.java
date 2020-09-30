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

public class GetPhoneNumbersRequest {
    private Long phoneId;

    @RequestField(name="phone_id")
    /**
    * The particular phone ID to filter
    */
    public long getPhoneId() {
        return this.phoneId.longValue();
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    /**
    * The particular phone ID to filter
    */
    public GetPhoneNumbersRequest setPhoneId(long d) {
        this.phoneId = Long.valueOf(d);
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID.
    */
    public GetPhoneNumbersRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public GetPhoneNumbersRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Boolean isBoundToApplication;

    @RequestField(name="is_bound_to_application")
    /**
    * Is a phone bound to an application.
    */
    public boolean getIsBoundToApplication() {
        return this.isBoundToApplication.booleanValue();
    }

    public boolean hasIsBoundToApplication() {
        return this.isBoundToApplication != null;
    }

    /**
    * Is a phone bound to an application.
    */
    public GetPhoneNumbersRequest setIsBoundToApplication(boolean d) {
        this.isBoundToApplication = Boolean.valueOf(d);
        return this;
    }

    private String phoneTemplate;

    @RequestField(name="phone_template")
    /**
    * The phone number start to filter
    */
    public String getPhoneTemplate() {
        return this.phoneTemplate;
    }

    public boolean hasPhoneTemplate() {
        return this.phoneTemplate != null;
    }

    /**
    * The phone number start to filter
    */
    public GetPhoneNumbersRequest setPhoneTemplate(String d) {
        this.phoneTemplate = d;
        return this;
    }

    private MultiArgument<String> countryCode;

    @RequestField(name="country_code")
    /**
    * The country code list separated by the ';' symbol.
    */
    public MultiArgument<String> getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code list separated by the ';' symbol.
    */
    public GetPhoneNumbersRequest setCountryCode(MultiArgument<String> d) {
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
    public GetPhoneNumbersRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private Boolean canceled;

    @RequestField(name="canceled")
    /**
    * The flag of the canceled (deleted) subscription to filter.
    */
    public boolean getCanceled() {
        return this.canceled.booleanValue();
    }

    public boolean hasCanceled() {
        return this.canceled != null;
    }

    /**
    * The flag of the canceled (deleted) subscription to filter.
    */
    public GetPhoneNumbersRequest setCanceled(boolean d) {
        this.canceled = Boolean.valueOf(d);
        return this;
    }

    private Boolean deactivated;

    @RequestField(name="deactivated")
    /**
    * The flag of the deactivated (frozen) subscription to filter.
    */
    public boolean getDeactivated() {
        return this.deactivated.booleanValue();
    }

    public boolean hasDeactivated() {
        return this.deactivated != null;
    }

    /**
    * The flag of the deactivated (frozen) subscription to filter.
    */
    public GetPhoneNumbersRequest setDeactivated(boolean d) {
        this.deactivated = Boolean.valueOf(d);
        return this;
    }

    private Boolean autoCharge;

    @RequestField(name="auto_charge")
    /**
    * The auto_charge flag to filter.
    */
    public boolean getAutoCharge() {
        return this.autoCharge.booleanValue();
    }

    public boolean hasAutoCharge() {
        return this.autoCharge != null;
    }

    /**
    * The auto_charge flag to filter.
    */
    public GetPhoneNumbersRequest setAutoCharge(boolean d) {
        this.autoCharge = Boolean.valueOf(d);
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date fromPhoneNextRenewal;

    @RequestField(name="from_phone_next_renewal")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * The UTC 'from' date filter in format: YYYY-MM-DD
    */
    public Date getFromPhoneNextRenewal() {
        return this.fromPhoneNextRenewal;
    }

    public boolean hasFromPhoneNextRenewal() {
        return this.fromPhoneNextRenewal != null;
    }

    /**
    * The UTC 'from' date filter in format: YYYY-MM-DD
    */
    public GetPhoneNumbersRequest setFromPhoneNextRenewal(Date d) {
        this.fromPhoneNextRenewal = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date toPhoneNextRenewal;

    @RequestField(name="to_phone_next_renewal")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * The UTC 'to' date filter in format: YYYY-MM-DD
    */
    public Date getToPhoneNextRenewal() {
        return this.toPhoneNextRenewal;
    }

    public boolean hasToPhoneNextRenewal() {
        return this.toPhoneNextRenewal != null;
    }

    /**
    * The UTC 'to' date filter in format: YYYY-MM-DD
    */
    public GetPhoneNumbersRequest setToPhoneNextRenewal(Date d) {
        this.toPhoneNextRenewal = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromPhonePurchaseDate;

    @RequestField(name="from_phone_purchase_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The UTC 'from' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getFromPhonePurchaseDate() {
        return this.fromPhonePurchaseDate;
    }

    public boolean hasFromPhonePurchaseDate() {
        return this.fromPhonePurchaseDate != null;
    }

    /**
    * The UTC 'from' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public GetPhoneNumbersRequest setFromPhonePurchaseDate(Date d) {
        this.fromPhonePurchaseDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toPhonePurchaseDate;

    @RequestField(name="to_phone_purchase_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The UTC 'to' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getToPhonePurchaseDate() {
        return this.toPhonePurchaseDate;
    }

    public boolean hasToPhonePurchaseDate() {
        return this.toPhonePurchaseDate != null;
    }

    /**
    * The UTC 'to' date filter in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public GetPhoneNumbersRequest setToPhonePurchaseDate(Date d) {
        this.toPhonePurchaseDate = d;
        return this;
    }

    private MultiArgument<Long> childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public MultiArgument<Long> getChildAccountId() {
        return this.childAccountId;
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public GetPhoneNumbersRequest setChildAccountId(MultiArgument<Long> d) {
        this.childAccountId = d;
        return this;
    }

    private Boolean childrenPhonesOnly;

    @RequestField(name="children_phones_only")
    /**
    * Set true to get the children phones only.
    */
    public boolean getChildrenPhonesOnly() {
        return this.childrenPhonesOnly.booleanValue();
    }

    public boolean hasChildrenPhonesOnly() {
        return this.childrenPhonesOnly != null;
    }

    /**
    * Set true to get the children phones only.
    */
    public GetPhoneNumbersRequest setChildrenPhonesOnly(boolean d) {
        this.childrenPhonesOnly = Boolean.valueOf(d);
        return this;
    }

    private String verificationName;

    @RequestField(name="verification_name")
    /**
    * The required account verification name to filter.
    */
    public String getVerificationName() {
        return this.verificationName;
    }

    public boolean hasVerificationName() {
        return this.verificationName != null;
    }

    /**
    * The required account verification name to filter.
    */
    public GetPhoneNumbersRequest setVerificationName(String d) {
        this.verificationName = d;
        return this;
    }

    private MultiArgument<String> verificationStatus;

    @RequestField(name="verification_status")
    /**
    * The account verification status list separated by the ';' symbol. The
    * following values are possible: REQUIRED, IN_PROGRESS, VERIFIED
    */
    public MultiArgument<String> getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean hasVerificationStatus() {
        return this.verificationStatus != null;
    }

    /**
    * The account verification status list separated by the ';' symbol. The
    * following values are possible: REQUIRED, IN_PROGRESS, VERIFIED
    */
    public GetPhoneNumbersRequest setVerificationStatus(MultiArgument<String> d) {
        this.verificationStatus = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date fromUnverifiedHoldUntil;

    @RequestField(name="from_unverified_hold_until")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * Unverified phone hold until the date (from ...) in format: YYYY-MM-DD
    */
    public Date getFromUnverifiedHoldUntil() {
        return this.fromUnverifiedHoldUntil;
    }

    public boolean hasFromUnverifiedHoldUntil() {
        return this.fromUnverifiedHoldUntil != null;
    }

    /**
    * Unverified phone hold until the date (from ...) in format: YYYY-MM-DD
    */
    public GetPhoneNumbersRequest setFromUnverifiedHoldUntil(Date d) {
        this.fromUnverifiedHoldUntil = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date toUnverifiedHoldUntil;

    @RequestField(name="to_unverified_hold_until")
    @SerializeUsing(serializer = DateSerializer.class)
    /**
    * Unverified phone hold until the date (... to) in format: YYYY-MM-DD
    */
    public Date getToUnverifiedHoldUntil() {
        return this.toUnverifiedHoldUntil;
    }

    public boolean hasToUnverifiedHoldUntil() {
        return this.toUnverifiedHoldUntil != null;
    }

    /**
    * Unverified phone hold until the date (... to) in format: YYYY-MM-DD
    */
    public GetPhoneNumbersRequest setToUnverifiedHoldUntil(Date d) {
        this.toUnverifiedHoldUntil = d;
        return this;
    }

    private Boolean canBeUsed;

    @RequestField(name="can_be_used")
    /**
    * Can the unverified account use the phone?
    */
    public boolean getCanBeUsed() {
        return this.canBeUsed.booleanValue();
    }

    public boolean hasCanBeUsed() {
        return this.canBeUsed != null;
    }

    /**
    * Can the unverified account use the phone?
    */
    public GetPhoneNumbersRequest setCanBeUsed(boolean d) {
        this.canBeUsed = Boolean.valueOf(d);
        return this;
    }

    private String orderBy;

    @RequestField(name="order_by")
    /**
    * The following values are available: 'phone_number' (ascent order),
    * 'phone_price' (ascent order), 'phone_country_code' (ascent order),
    * 'deactivated' (deactivated first, active last), 'purchase_date'
    * (descent order), 'phone_next_renewal' (ascent order),
    * 'verification_status', 'unverified_hold_until' (ascent order),
    * 'verification_name'.
    */
    public String getOrderBy() {
        return this.orderBy;
    }

    public boolean hasOrderBy() {
        return this.orderBy != null;
    }

    /**
    * The following values are available: 'phone_number' (ascent order),
    * 'phone_price' (ascent order), 'phone_country_code' (ascent order),
    * 'deactivated' (deactivated first, active last), 'purchase_date'
    * (descent order), 'phone_next_renewal' (ascent order),
    * 'verification_status', 'unverified_hold_until' (ascent order),
    * 'verification_name'.
    */
    public GetPhoneNumbersRequest setOrderBy(String d) {
        this.orderBy = d;
        return this;
    }

    private String sandbox;

    @RequestField(name="sandbox")
    /**
    * Flag allows you to display only the numbers of the sandbox, real
    * numbers, or all numbers. The following values are possible: 'all',
    * 'true', 'false'.
    */
    public String getSandbox() {
        return this.sandbox;
    }

    public boolean hasSandbox() {
        return this.sandbox != null;
    }

    /**
    * Flag allows you to display only the numbers of the sandbox, real
    * numbers, or all numbers. The following values are possible: 'all',
    * 'true', 'false'.
    */
    public GetPhoneNumbersRequest setSandbox(String d) {
        this.sandbox = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetPhoneNumbersRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetPhoneNumbersRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private Boolean smsSupported;

    @RequestField(name="sms_supported")
    /**
    * The flag of the SMS support.
    */
    public boolean getSmsSupported() {
        return this.smsSupported.booleanValue();
    }

    public boolean hasSmsSupported() {
        return this.smsSupported != null;
    }

    /**
    * The flag of the SMS support.
    */
    public GetPhoneNumbersRequest setSmsSupported(boolean d) {
        this.smsSupported = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<String> phoneRegionName;

    @RequestField(name="phone_region_name")
    /**
    * The region names list separated by the ';' symbol.
    */
    public MultiArgument<String> getPhoneRegionName() {
        return this.phoneRegionName;
    }

    public boolean hasPhoneRegionName() {
        return this.phoneRegionName != null;
    }

    /**
    * The region names list separated by the ';' symbol.
    */
    public GetPhoneNumbersRequest setPhoneRegionName(MultiArgument<String> d) {
        this.phoneRegionName = d;
        return this;
    }

    private MultiArgument<Long> ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID list separated by the ';' symbol.
    */
    public GetPhoneNumbersRequest setRuleId(MultiArgument<Long> d) {
        this.ruleId = d;
        return this;
    }

    private MultiArgument<String> ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule names list separated by the ';' symbol. Can be used only if
    * __application_id__ or __application_name__ is specified.
    */
    public MultiArgument<String> getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule names list separated by the ';' symbol. Can be used only if
    * __application_id__ or __application_name__ is specified.
    */
    public GetPhoneNumbersRequest setRuleName(MultiArgument<String> d) {
        this.ruleName = d;
        return this;
    }

    private Boolean isBoundToRule;

    @RequestField(name="is_bound_to_rule")
    /**
    * Is the number bound to any rule?
    */
    public boolean getIsBoundToRule() {
        return this.isBoundToRule.booleanValue();
    }

    public boolean hasIsBoundToRule() {
        return this.isBoundToRule != null;
    }

    /**
    * Is the number bound to any rule?
    */
    public GetPhoneNumbersRequest setIsBoundToRule(boolean d) {
        this.isBoundToRule = Boolean.valueOf(d);
        return this;
    }

}