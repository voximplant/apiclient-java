package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The account callback. See the [AccountCallbacks] type.
*/
public class AccountCallback {

    private Long callbackId;

    /**
    * The callback ID (sequence).
    */
    public long getCallbackId() {
        return this.callbackId.longValue();
    }

    public boolean hasCallbackId() {
        return this.callbackId != null;
    }

    private String type;

    /**
    * The callback type. The following values are possible:
    * account_document_verified, account_is_frozen, account_is_unfrozen,
    * activate_successful, call_history_report, card_expired,
    * card_expires_in_month, card_payment, card_payment_failed, js_fail,
    * min_balance, regulation_address_verified, renewed_subscriptions,
    * reset_account_password_request, sip_registration_fail,
    * stagnant_account, subscription_is_detached, subscription_is_frozen,
    * transaction_history_report, plan_config,
    * unverified_subscription_detached, sms_inbound.
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private Long accountId;

    /**
    * The account ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private String hash;

    /**
    * The security hash: hash = md5(account_salt + account_id + api_key +
    * callback_id). Example: 50c5fe2290cd7409b37e673b8b05e495
    */
    public String getHash() {
        return this.hash;
    }

    public boolean hasHash() {
        return this.hash != null;
    }

    private String accountName;

    /**
    * The account name.
    */
    public String getAccountName() {
        return this.accountName;
    }

    public boolean hasAccountName() {
        return this.accountName != null;
    }

    private String accountEmail;

    /**
    * The account email.
    */
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public boolean hasAccountEmail() {
        return this.accountEmail != null;
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

    private AccountDocumentUploadedCallback accountDocumentUploaded;

    /**
    * The specific account callback details.
    */
    public AccountDocumentUploadedCallback getAccountDocumentUploaded() {
        return this.accountDocumentUploaded;
    }

    public boolean hasAccountDocumentUploaded() {
        return this.accountDocumentUploaded != null;
    }

    private RegulationAddressUploadedCallback regulationAddressUploaded;

    /**
    * The specific account callback details.
    */
    public RegulationAddressUploadedCallback getRegulationAddressUploaded() {
        return this.regulationAddressUploaded;
    }

    public boolean hasRegulationAddressUploaded() {
        return this.regulationAddressUploaded != null;
    }

    private AccountDocumentVerifiedCallback accountDocumentVerified;

    /**
    * The specific account callback details.
    */
    public AccountDocumentVerifiedCallback getAccountDocumentVerified() {
        return this.accountDocumentVerified;
    }

    public boolean hasAccountDocumentVerified() {
        return this.accountDocumentVerified != null;
    }

    private AccountIsFrozenCallback accountIsFrozen;

    /**
    * The specific account callback details.
    */
    public AccountIsFrozenCallback getAccountIsFrozen() {
        return this.accountIsFrozen;
    }

    public boolean hasAccountIsFrozen() {
        return this.accountIsFrozen != null;
    }

    private AccountIsUnfrozenCallback accountIsUnfrozen;

    /**
    * The specific account callback details.
    */
    public AccountIsUnfrozenCallback getAccountIsUnfrozen() {
        return this.accountIsUnfrozen;
    }

    public boolean hasAccountIsUnfrozen() {
        return this.accountIsUnfrozen != null;
    }

    private ActivateSuccessfulCallback activateSuccessful;

    /**
    * The specific account callback details.
    */
    public ActivateSuccessfulCallback getActivateSuccessful() {
        return this.activateSuccessful;
    }

    public boolean hasActivateSuccessful() {
        return this.activateSuccessful != null;
    }

    private CallHistoryReportCallback callHistoryReport;

    /**
    * The specific account callback details.
    */
    public CallHistoryReportCallback getCallHistoryReport() {
        return this.callHistoryReport;
    }

    public boolean hasCallHistoryReport() {
        return this.callHistoryReport != null;
    }

    private CardExpiredCallback cardExpired;

    /**
    * The specific account callback details.
    */
    public CardExpiredCallback getCardExpired() {
        return this.cardExpired;
    }

    public boolean hasCardExpired() {
        return this.cardExpired != null;
    }

    private CardExpiresInMonthCallback cardExpiresInMonth;

    /**
    * The specific account callback details.
    */
    public CardExpiresInMonthCallback getCardExpiresInMonth() {
        return this.cardExpiresInMonth;
    }

    public boolean hasCardExpiresInMonth() {
        return this.cardExpiresInMonth != null;
    }

    private CardPaymentCallback cardPayment;

    /**
    * The specific account callback details.
    */
    public CardPaymentCallback getCardPayment() {
        return this.cardPayment;
    }

    public boolean hasCardPayment() {
        return this.cardPayment != null;
    }

    private CardPaymentFailedCallback cardPaymentFailed;

    /**
    * The specific account callback details.
    */
    public CardPaymentFailedCallback getCardPaymentFailed() {
        return this.cardPaymentFailed;
    }

    public boolean hasCardPaymentFailed() {
        return this.cardPaymentFailed != null;
    }

    private RobokassaPaymentCallback robokassaPayment;

    /**
    * The specific account callback details.
    */
    public RobokassaPaymentCallback getRobokassaPayment() {
        return this.robokassaPayment;
    }

    public boolean hasRobokassaPayment() {
        return this.robokassaPayment != null;
    }

    private WireTransferCallback wireTransfer;

    /**
    * The specific account callback details.
    */
    public WireTransferCallback getWireTransfer() {
        return this.wireTransfer;
    }

    public boolean hasWireTransfer() {
        return this.wireTransfer != null;
    }

    private JSFailCallback jsFail;

    /**
    * The specific account callback details. See the 'send_js_error'
    * parameter of the 'SetAccountInfo' function.
    */
    public JSFailCallback getJsFail() {
        return this.jsFail;
    }

    public boolean hasJsFail() {
        return this.jsFail != null;
    }

    private MinBalanceCallback minBalance;

    /**
    * The specific account callback details.
    */
    public MinBalanceCallback getMinBalance() {
        return this.minBalance;
    }

    public boolean hasMinBalance() {
        return this.minBalance != null;
    }

    private RegulationAddressVerifiedCallback regulationAddressVerified;

    /**
    * The specific account callback details.
    */
    public RegulationAddressVerifiedCallback getRegulationAddressVerified() {
        return this.regulationAddressVerified;
    }

    public boolean hasRegulationAddressVerified() {
        return this.regulationAddressVerified != null;
    }

    private RenewedSubscriptionsCallback renewedSubscriptions;

    /**
    * The specific account callback details.
    */
    public RenewedSubscriptionsCallback getRenewedSubscriptions() {
        return this.renewedSubscriptions;
    }

    public boolean hasRenewedSubscriptions() {
        return this.renewedSubscriptions != null;
    }

    private ResetAccountPasswordRequestCallback resetAccountPasswordRequest;

    /**
    * The specific account callback details.
    */
    public ResetAccountPasswordRequestCallback getResetAccountPasswordRequest() {
        return this.resetAccountPasswordRequest;
    }

    public boolean hasResetAccountPasswordRequest() {
        return this.resetAccountPasswordRequest != null;
    }

    private SIPRegistrationFailCallback sipRegistrationFail;

    /**
    * The specific account callback details.
    */
    public SIPRegistrationFailCallback getSipRegistrationFail() {
        return this.sipRegistrationFail;
    }

    public boolean hasSipRegistrationFail() {
        return this.sipRegistrationFail != null;
    }

    private StagnantAccountCallback stagnantAccount;

    /**
    * The specific account callback details.
    */
    public StagnantAccountCallback getStagnantAccount() {
        return this.stagnantAccount;
    }

    public boolean hasStagnantAccount() {
        return this.stagnantAccount != null;
    }

    private SubscriptionIsFrozenCallback subscriptionIsFrozen;

    /**
    * The specific account callback details.
    */
    public SubscriptionIsFrozenCallback getSubscriptionIsFrozen() {
        return this.subscriptionIsFrozen;
    }

    public boolean hasSubscriptionIsFrozen() {
        return this.subscriptionIsFrozen != null;
    }

    private SubscriptionIsDetachedCallback subscriptionIsDetached;

    /**
    * The specific account callback details.
    */
    public SubscriptionIsDetachedCallback getSubscriptionIsDetached() {
        return this.subscriptionIsDetached;
    }

    public boolean hasSubscriptionIsDetached() {
        return this.subscriptionIsDetached != null;
    }

    private TransactionHistoryReportCallback transactionHistoryReport;

    /**
    * The specific account callback details.
    */
    public TransactionHistoryReportCallback getTransactionHistoryReport() {
        return this.transactionHistoryReport;
    }

    public boolean hasTransactionHistoryReport() {
        return this.transactionHistoryReport != null;
    }

    private PlanConfigCallback planConfig;

    /**
    * The specific account callback details.
    */
    public PlanConfigCallback getPlanConfig() {
        return this.planConfig;
    }

    public boolean hasPlanConfig() {
        return this.planConfig != null;
    }

    private UnverifiedSubscriptionDetachedCallback unverifiedSubscriptionDetached;

    /**
    * The specific account callback details.
    */
    public UnverifiedSubscriptionDetachedCallback getUnverifiedSubscriptionDetached() {
        return this.unverifiedSubscriptionDetached;
    }

    public boolean hasUnverifiedSubscriptionDetached() {
        return this.unverifiedSubscriptionDetached != null;
    }

    private ExpiringCallerIDCallback expiringCallerid;

    /**
    * The specific account callback details.
    */
    public ExpiringCallerIDCallback getExpiringCallerid() {
        return this.expiringCallerid;
    }

    public boolean hasExpiringCallerid() {
        return this.expiringCallerid != null;
    }

    private ExpiredCallerIDCallback expiredCallerid;

    /**
    * The specific account callback details.
    */
    public ExpiredCallerIDCallback getExpiredCallerid() {
        return this.expiredCallerid;
    }

    public boolean hasExpiredCallerid() {
        return this.expiredCallerid != null;
    }

    private TranscriptionCompleteCallback transcriptionComplete;

    /**
    * The specific account callback details.
    */
    public TranscriptionCompleteCallback getTranscriptionComplete() {
        return this.transcriptionComplete;
    }

    public boolean hasTranscriptionComplete() {
        return this.transcriptionComplete != null;
    }

    private ClassificationCompleteCallback classificationComplete;

    /**
    * The specific account callback details.
    */
    public ClassificationCompleteCallback getClassificationComplete() {
        return this.classificationComplete;
    }

    public boolean hasClassificationComplete() {
        return this.classificationComplete != null;
    }

    private InboundSmsCallback smsInbound;

    /**
    * The specific account callback details.
    */
    public InboundSmsCallback getSmsInbound() {
        return this.smsInbound;
    }

    public boolean hasSmsInbound() {
        return this.smsInbound != null;
    }

    private NewInvoiceCallback newInvoice;

    /**
    * The specific account callback details.
    */
    public NewInvoiceCallback getNewInvoice() {
        return this.newInvoice;
    }

    public boolean hasNewInvoice() {
        return this.newInvoice != null;
    }

    private ExpiringAgreementCallback expiringAgreement;

    /**
    * The specific account callback details.
    */
    public ExpiringAgreementCallback getExpiringAgreement() {
        return this.expiringAgreement;
    }

    public boolean hasExpiringAgreement() {
        return this.expiringAgreement != null;
    }

    private ExpiredAgreementCallback expiredAgreement;

    /**
    * The specific account callback details.
    */
    public ExpiredAgreementCallback getExpiredAgreement() {
        return this.expiredAgreement;
    }

    public boolean hasExpiredAgreement() {
        return this.expiredAgreement != null;
    }

    private RestoredAgreementStatusCallback restoredAgreementStatus;

    /**
    * The specific account callback details.
    */
    public RestoredAgreementStatusCallback getRestoredAgreementStatus() {
        return this.restoredAgreementStatus;
    }

    public boolean hasRestoredAgreementStatus() {
        return this.restoredAgreementStatus != null;
    }

    private BalanceIsChanged balanceIsChanged;

    /**
    * The specific account callback details.
    */
    public BalanceIsChanged getBalanceIsChanged() {
        return this.balanceIsChanged;
    }

    public boolean hasBalanceIsChanged() {
        return this.balanceIsChanged != null;
    }

}