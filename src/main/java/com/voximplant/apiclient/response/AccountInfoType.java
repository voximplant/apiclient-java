package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAccountInfo] function result.
*/
public class AccountInfoType {

    private Long accountId;

    /**
    * The account's ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private String accountName;

    /**
    * The account's name.
    */
    public String getAccountName() {
        return this.accountName;
    }

    public boolean hasAccountName() {
        return this.accountName != null;
    }

    private String accountEmail;

    /**
    * The account's email.
    */
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public boolean hasAccountEmail() {
        return this.accountEmail != null;
    }

    private String apiKey;

    /**
    * The account API key. Use password or api_key authentication to show
    * the api_key.
    */
    public String getApiKey() {
        return this.apiKey;
    }

    public boolean hasApiKey() {
        return this.apiKey != null;
    }

    private String accountFirstName;

    /**
    * The first name.
    */
    public String getAccountFirstName() {
        return this.accountFirstName;
    }

    public boolean hasAccountFirstName() {
        return this.accountFirstName != null;
    }

    private String accountLastName;

    /**
    * The last name.
    */
    public String getAccountLastName() {
        return this.accountLastName;
    }

    public boolean hasAccountLastName() {
        return this.accountLastName != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * The UTC account created time in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    private String languageCode;

    /**
    * The notification language code (2 symbols, ISO639-1). Examples: en, ru
    */
    public String getLanguageCode() {
        return this.languageCode;
    }

    public boolean hasLanguageCode() {
        return this.languageCode != null;
    }

    private String location;

    /**
    * The account location (timezone). Examples: America/Los_Angeles,
    * Etc/GMT-8, Etc/GMT+10
    */
    public String getLocation() {
        return this.location;
    }

    public boolean hasLocation() {
        return this.location != null;
    }

    private BigDecimal minBalanceToNotify;

    /**
    * The min balance value to notify by email or SMS.
    */
    public BigDecimal getMinBalanceToNotify() {
        return this.minBalanceToNotify;
    }

    public boolean hasMinBalanceToNotify() {
        return this.minBalanceToNotify != null;
    }

    private Boolean accountNotifications;

    /**
    * Are the Voximplant notifications required?
    */
    public boolean getAccountNotifications() {
        return this.accountNotifications.booleanValue();
    }

    public boolean hasAccountNotifications() {
        return this.accountNotifications != null;
    }

    private Boolean tariffChangingNotifications;

    /**
    * Are the Voximplant plan changing notifications required?
    */
    public boolean getTariffChangingNotifications() {
        return this.tariffChangingNotifications.booleanValue();
    }

    public boolean hasTariffChangingNotifications() {
        return this.tariffChangingNotifications != null;
    }

    private Boolean newsNotifications;

    /**
    * Are the Voximplant news notifications required?
    */
    public boolean getNewsNotifications() {
        return this.newsNotifications.booleanValue();
    }

    public boolean hasNewsNotifications() {
        return this.newsNotifications != null;
    }

    private String billingAddressName;

    /**
    * The company or businessman name.
    */
    public String getBillingAddressName() {
        return this.billingAddressName;
    }

    public boolean hasBillingAddressName() {
        return this.billingAddressName != null;
    }

    private String billingAddressCountryCode;

    /**
    * The billing address country code (2 symbols, ISO 3166-1 alpha-2).
    * Examples: US, RU, GB
    */
    public String getBillingAddressCountryCode() {
        return this.billingAddressCountryCode;
    }

    public boolean hasBillingAddressCountryCode() {
        return this.billingAddressCountryCode != null;
    }

    private String billingAddressAddress;

    /**
    * The office address.
    */
    public String getBillingAddressAddress() {
        return this.billingAddressAddress;
    }

    public boolean hasBillingAddressAddress() {
        return this.billingAddressAddress != null;
    }

    private String billingAddressZip;

    /**
    * The office ZIP.
    */
    public String getBillingAddressZip() {
        return this.billingAddressZip;
    }

    public boolean hasBillingAddressZip() {
        return this.billingAddressZip != null;
    }

    private String billingAddressPhone;

    /**
    * The office phone number.
    */
    public String getBillingAddressPhone() {
        return this.billingAddressPhone;
    }

    public boolean hasBillingAddressPhone() {
        return this.billingAddressPhone != null;
    }

    private String billingAddressState;

    /**
    * The office state (US) or province (Canada), up to 100 characters.
    * Examples: California, Illinois, British Columbia.
    */
    public String getBillingAddressState() {
        return this.billingAddressState;
    }

    public boolean hasBillingAddressState() {
        return this.billingAddressState != null;
    }

    private Boolean active;

    /**
    * The account activation flag.
    */
    public boolean getActive() {
        return this.active.booleanValue();
    }

    public boolean hasActive() {
        return this.active != null;
    }

    private Boolean frozen;

    /**
    * Is account blocked by Voximplant admins or not.
    */
    public boolean getFrozen() {
        return this.frozen.booleanValue();
    }

    public boolean hasFrozen() {
        return this.frozen != null;
    }

    private BigDecimal balance;

    /**
    * The account's money.
    */
    public BigDecimal getBalance() {
        return this.balance;
    }

    public boolean hasBalance() {
        return this.balance != null;
    }

    private BigDecimal creditLimit;

    /**
    * The account's credit limit.
    */
    public BigDecimal getCreditLimit() {
        return this.creditLimit;
    }

    public boolean hasCreditLimit() {
        return this.creditLimit != null;
    }

    private String currency;

    /**
    * The currency code (USD, RUR, EUR, ...).
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    private Boolean supportRobokassa;

    /**
    * Is the robokassa payment system allowed?
    */
    public boolean getSupportRobokassa() {
        return this.supportRobokassa.booleanValue();
    }

    public boolean hasSupportRobokassa() {
        return this.supportRobokassa != null;
    }

    private Boolean supportBankCard;

    /**
    * Is the bank card payments allowed?
    */
    public boolean getSupportBankCard() {
        return this.supportBankCard.booleanValue();
    }

    public boolean hasSupportBankCard() {
        return this.supportBankCard != null;
    }

    private String bankCardProvider;

    /**
    * The possible values are: BRAINTREE, ALFABANK.
    */
    public String getBankCardProvider() {
        return this.bankCardProvider;
    }

    public boolean hasBankCardProvider() {
        return this.bankCardProvider != null;
    }

    private Boolean supportInvoice;

    /**
    * Is the bank invoice allowed?
    */
    public boolean getSupportInvoice() {
        return this.supportInvoice.booleanValue();
    }

    public boolean hasSupportInvoice() {
        return this.supportInvoice != null;
    }

    private String accountCustomData;

    /**
    * The custom data.
    */
    public String getAccountCustomData() {
        return this.accountCustomData;
    }

    public boolean hasAccountCustomData() {
        return this.accountCustomData != null;
    }

    private String[] accessEntries;

    /**
    * The allowed access entries (the API function names).
    */
    public String[] getAccessEntries() {
        return this.accessEntries;
    }

    public boolean hasAccessEntries() {
        return this.accessEntries != null;
    }

    private Boolean withAccessEntries;

    /**
    * Set true to get the admin user permissions.
    */
    public boolean getWithAccessEntries() {
        return this.withAccessEntries.booleanValue();
    }

    public boolean hasWithAccessEntries() {
        return this.withAccessEntries != null;
    }

    private String callbackUrl;

    /**
    * If URL is specified, Voximplant cloud will make HTTP POST requests to
    * it when something happens. For a full list of reasons see the
    * <b>type</b> field of the [AccountCallback] structure. The HTTP
    * request will have a JSON-encoded body that conforms to the
    * [AccountCallbacks] structure
    */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public boolean hasCallbackUrl() {
        return this.callbackUrl != null;
    }

    private String callbackSalt;

    /**
    * If salt string is specified, each HTTP request made by the Voximplant
    * cloud toward the <b>callback_url</b> will have a <b>salt</b> field
    * set to MD5 hash of account information and salt. That hash can be
    * used be a developer to ensure that HTTP request is made by the
    * Voximplant cloud
    */
    public String getCallbackSalt() {
        return this.callbackSalt;
    }

    public boolean hasCallbackSalt() {
        return this.callbackSalt != null;
    }

    private Boolean sendJsError;

    /**
    * Is email sending on a JS error?
    */
    public boolean getSendJsError() {
        return this.sendJsError.booleanValue();
    }

    public boolean hasSendJsError() {
        return this.sendJsError != null;
    }

    private BillingLimitsType billingLimits;

    /**
    * The payments limits applicable to each payment method.
    */
    public BillingLimitsType getBillingLimits() {
        return this.billingLimits;
    }

    public boolean hasBillingLimits() {
        return this.billingLimits != null;
    }

}