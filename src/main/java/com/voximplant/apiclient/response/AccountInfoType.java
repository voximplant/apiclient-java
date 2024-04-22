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
* The [GetAccountInfo] function result.
*/
public class AccountInfoType implements Alignable {

    private Long accountId;

    /**
    * The account's ID
    */
    public Long getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private String accountName;

    /**
    * The account's name
    */
    public String getAccountName() {
        return this.accountName;
    }

    public boolean hasAccountName() {
        return this.accountName != null;
    }

    private String accountEmail;

    /**
    * The account's email
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
    * the api_key
    */
    public String getApiKey() {
        return this.apiKey;
    }

    public boolean hasApiKey() {
        return this.apiKey != null;
    }

    private String accountFirstName;

    /**
    * The first name
    */
    public String getAccountFirstName() {
        return this.accountFirstName;
    }

    public boolean hasAccountFirstName() {
        return this.accountFirstName != null;
    }

    private String accountLastName;

    /**
    * The last name
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
    * The min balance value to notify by email or SMS
    */
    public BigDecimal getMinBalanceToNotify() {
        return this.minBalanceToNotify;
    }

    public boolean hasMinBalanceToNotify() {
        return this.minBalanceToNotify != null;
    }

    private Boolean accountNotifications;

    /**
    * Whether Voximplant notifications are required
    */
    public Boolean getAccountNotifications() {
        return this.accountNotifications;
    }

    public boolean hasAccountNotifications() {
        return this.accountNotifications != null;
    }

    private Boolean tariffChangingNotifications;

    /**
    * Whether Voximplant plan changing notifications are required
    */
    public Boolean getTariffChangingNotifications() {
        return this.tariffChangingNotifications;
    }

    public boolean hasTariffChangingNotifications() {
        return this.tariffChangingNotifications != null;
    }

    private Boolean newsNotifications;

    /**
    * Whether Voximplant news notifications are required
    */
    public Boolean getNewsNotifications() {
        return this.newsNotifications;
    }

    public boolean hasNewsNotifications() {
        return this.newsNotifications != null;
    }

    private String billingAddressName;

    /**
    * The company or businessman name
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
    * The office address
    */
    public String getBillingAddressAddress() {
        return this.billingAddressAddress;
    }

    public boolean hasBillingAddressAddress() {
        return this.billingAddressAddress != null;
    }

    private String billingAddressZip;

    /**
    * The office ZIP
    */
    public String getBillingAddressZip() {
        return this.billingAddressZip;
    }

    public boolean hasBillingAddressZip() {
        return this.billingAddressZip != null;
    }

    private String billingAddressPhone;

    /**
    * The office phone number
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
    * Examples: California, Illinois, British Columbia
    */
    public String getBillingAddressState() {
        return this.billingAddressState;
    }

    public boolean hasBillingAddressState() {
        return this.billingAddressState != null;
    }

    private Boolean active;

    /**
    * Whether the account is ctive
    */
    public Boolean getActive() {
        return this.active;
    }

    public boolean hasActive() {
        return this.active != null;
    }

    private Boolean frozen;

    /**
    * Whether account is blocked by Voximplant admins
    */
    public Boolean getFrozen() {
        return this.frozen;
    }

    public boolean hasFrozen() {
        return this.frozen != null;
    }

    private BigDecimal balance;

    /**
    * The account's money
    */
    public BigDecimal getBalance() {
        return this.balance;
    }

    public boolean hasBalance() {
        return this.balance != null;
    }

    private BigDecimal creditLimit;

    /**
    * The account's credit limit
    */
    public BigDecimal getCreditLimit() {
        return this.creditLimit;
    }

    public boolean hasCreditLimit() {
        return this.creditLimit != null;
    }

    private String currency;

    /**
    * The currency code (USD, RUR, EUR, ...)
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    private Boolean supportRobokassa;

    /**
    * Whether Robokassa payments are allowed
    */
    public Boolean getSupportRobokassa() {
        return this.supportRobokassa;
    }

    public boolean hasSupportRobokassa() {
        return this.supportRobokassa != null;
    }

    private Boolean supportBankCard;

    /**
    * Whether Bank card payments are allowed
    */
    public Boolean getSupportBankCard() {
        return this.supportBankCard;
    }

    public boolean hasSupportBankCard() {
        return this.supportBankCard != null;
    }

    private String bankCardProvider;

    /**
    * The possible values are BRAINTREE, ALFABANK
    */
    public String getBankCardProvider() {
        return this.bankCardProvider;
    }

    public boolean hasBankCardProvider() {
        return this.bankCardProvider != null;
    }

    private Boolean supportInvoice;

    /**
    * Whether Bank invoices are allowed
    */
    public Boolean getSupportInvoice() {
        return this.supportInvoice;
    }

    public boolean hasSupportInvoice() {
        return this.supportInvoice != null;
    }

    private String accountCustomData;

    /**
    * The custom data
    */
    public String getAccountCustomData() {
        return this.accountCustomData;
    }

    public boolean hasAccountCustomData() {
        return this.accountCustomData != null;
    }

    private String[] accessEntries;

    /**
    * The allowed access entries (the API function names)
    */
    public String[] getAccessEntries() {
        return this.accessEntries;
    }

    public boolean hasAccessEntries() {
        return this.accessEntries != null;
    }

    private Boolean withAccessEntries;

    /**
    * Whether the admin user permissions are granted
    */
    public Boolean getWithAccessEntries() {
        return this.withAccessEntries;
    }

    public boolean hasWithAccessEntries() {
        return this.withAccessEntries != null;
    }

    private String callbackUrl;

    /**
    * If URL is specified, Voximplant cloud makes HTTP POST requests to it
    * when something happens. For a full list of reasons see the
    * <b>type</b> field of the [AccountCallback] structure. The HTTP
    * request has a JSON-encoded body that conforms to the
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
    * cloud toward the <b>callback_url</b> has a <b>salt</b> field set to
    * MD5 hash of account information and salt. That hash can be used be a
    * developer to ensure that HTTP request is made by the Voximplant cloud
    */
    public String getCallbackSalt() {
        return this.callbackSalt;
    }

    public boolean hasCallbackSalt() {
        return this.callbackSalt != null;
    }

    private Boolean sendJsError;

    /**
    * Whether to send an email when a JS error occures
    */
    public Boolean getSendJsError() {
        return this.sendJsError;
    }

    public boolean hasSendJsError() {
        return this.sendJsError != null;
    }

    private BillingLimitsType billingLimits;

    /**
    * The payments limits applicable to each payment method
    */
    public BillingLimitsType getBillingLimits() {
        return this.billingLimits;
    }

    public boolean hasBillingLimits() {
        return this.billingLimits != null;
    }

    private Boolean a2pSmsEnabled;

    /**
    * Whether to activate one-way SMS
    */
    public Boolean getA2pSmsEnabled() {
        return this.a2pSmsEnabled;
    }

    public boolean hasA2pSmsEnabled() {
        return this.a2pSmsEnabled != null;
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
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountName != null) {
            sb.append(aligned)
                .append("\"accountName\": \"")
                .append(accountName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountEmail != null) {
            sb.append(aligned)
                .append("\"accountEmail\": \"")
                .append(accountEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (apiKey != null) {
            sb.append(aligned)
                .append("\"apiKey\": \"")
                .append(apiKey)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountFirstName != null) {
            sb.append(aligned)
                .append("\"accountFirstName\": \"")
                .append(accountFirstName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountLastName != null) {
            sb.append(aligned)
                .append("\"accountLastName\": \"")
                .append(accountLastName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (languageCode != null) {
            sb.append(aligned)
                .append("\"languageCode\": \"")
                .append(languageCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (location != null) {
            sb.append(aligned)
                .append("\"location\": \"")
                .append(location)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (minBalanceToNotify != null) {
            sb.append(aligned)
                .append("\"minBalanceToNotify\": \"")
                .append(minBalanceToNotify)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountNotifications != null) {
            sb.append(aligned)
                .append("\"accountNotifications\": \"")
                .append(accountNotifications)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (tariffChangingNotifications != null) {
            sb.append(aligned)
                .append("\"tariffChangingNotifications\": \"")
                .append(tariffChangingNotifications)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newsNotifications != null) {
            sb.append(aligned)
                .append("\"newsNotifications\": \"")
                .append(newsNotifications)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressName != null) {
            sb.append(aligned)
                .append("\"billingAddressName\": \"")
                .append(billingAddressName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressCountryCode != null) {
            sb.append(aligned)
                .append("\"billingAddressCountryCode\": \"")
                .append(billingAddressCountryCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressAddress != null) {
            sb.append(aligned)
                .append("\"billingAddressAddress\": \"")
                .append(billingAddressAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressZip != null) {
            sb.append(aligned)
                .append("\"billingAddressZip\": \"")
                .append(billingAddressZip)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressPhone != null) {
            sb.append(aligned)
                .append("\"billingAddressPhone\": \"")
                .append(billingAddressPhone)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingAddressState != null) {
            sb.append(aligned)
                .append("\"billingAddressState\": \"")
                .append(billingAddressState)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (active != null) {
            sb.append(aligned)
                .append("\"active\": \"")
                .append(active)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (frozen != null) {
            sb.append(aligned)
                .append("\"frozen\": \"")
                .append(frozen)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (balance != null) {
            sb.append(aligned)
                .append("\"balance\": \"")
                .append(balance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (creditLimit != null) {
            sb.append(aligned)
                .append("\"creditLimit\": \"")
                .append(creditLimit)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (currency != null) {
            sb.append(aligned)
                .append("\"currency\": \"")
                .append(currency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (supportRobokassa != null) {
            sb.append(aligned)
                .append("\"supportRobokassa\": \"")
                .append(supportRobokassa)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (supportBankCard != null) {
            sb.append(aligned)
                .append("\"supportBankCard\": \"")
                .append(supportBankCard)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bankCardProvider != null) {
            sb.append(aligned)
                .append("\"bankCardProvider\": \"")
                .append(bankCardProvider)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (supportInvoice != null) {
            sb.append(aligned)
                .append("\"supportInvoice\": \"")
                .append(supportInvoice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountCustomData != null) {
            sb.append(aligned)
                .append("\"accountCustomData\": \"")
                .append(accountCustomData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accessEntries != null) {
            sb.append(aligned)
                .append("\"string\": ")
                .append(StringHelper.arrayToString(accessEntries, alignment + 1))
                .append(System.lineSeparator());
        }
        if (withAccessEntries != null) {
            sb.append(aligned)
                .append("\"withAccessEntries\": \"")
                .append(withAccessEntries)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callbackUrl != null) {
            sb.append(aligned)
                .append("\"callbackUrl\": \"")
                .append(callbackUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callbackSalt != null) {
            sb.append(aligned)
                .append("\"callbackSalt\": \"")
                .append(callbackSalt)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sendJsError != null) {
            sb.append(aligned)
                .append("\"sendJsError\": \"")
                .append(sendJsError)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (billingLimits != null) {
            sb.append(aligned)
                .append("\"billingLimits\": \"")
                .append(billingLimits)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (a2pSmsEnabled != null) {
            sb.append(aligned)
                .append("\"a2pSmsEnabled\": \"")
                .append(a2pSmsEnabled)
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