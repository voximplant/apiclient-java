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
* The account callback. See the [AccountCallbacks] type.
*/
public class AccountCallback implements Alignable {

    private Long callbackId;

    /**
    * The callback ID (sequence)
    */
    public Long getCallbackId() {
        return this.callbackId;
    }

    public boolean hasCallbackId() {
        return this.callbackId != null;
    }

    private String type;

    /**
    * The callback type
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private Long accountId;

    /**
    * The account ID
    */
    public Long getAccountId() {
        return this.accountId;
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
    * The account name
    */
    public String getAccountName() {
        return this.accountName;
    }

    public boolean hasAccountName() {
        return this.accountName != null;
    }

    private String accountEmail;

    /**
    * The account email
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

    private AccountDocumentUploadedCallback accountDocumentUploaded;

    /**
    * Deprecated. Please use the unified
    * <b>account_document_status_updated</b> callback instead
    */
    public AccountDocumentUploadedCallback getAccountDocumentUploaded() {
        return this.accountDocumentUploaded;
    }

    public boolean hasAccountDocumentUploaded() {
        return this.accountDocumentUploaded != null;
    }

    private RegulationAddressUploadedCallback regulationAddressUploaded;

    /**
    * Received when proof of address is uploaded
    */
    public RegulationAddressUploadedCallback getRegulationAddressUploaded() {
        return this.regulationAddressUploaded;
    }

    public boolean hasRegulationAddressUploaded() {
        return this.regulationAddressUploaded != null;
    }

    private AccountDocumentVerifiedCallback accountDocumentVerified;

    /**
    * Deprecated. Please use the unified
    * <b>account_document_status_updated</b> callback instead
    */
    public AccountDocumentVerifiedCallback getAccountDocumentVerified() {
        return this.accountDocumentVerified;
    }

    public boolean hasAccountDocumentVerified() {
        return this.accountDocumentVerified != null;
    }

    private AccountIsFrozenCallback accountIsFrozen;

    /**
    * Received when an account is frozen
    */
    public AccountIsFrozenCallback getAccountIsFrozen() {
        return this.accountIsFrozen;
    }

    public boolean hasAccountIsFrozen() {
        return this.accountIsFrozen != null;
    }

    private AccountIsUnfrozenCallback accountIsUnfrozen;

    /**
    * Received when an account is unfrozen
    */
    public AccountIsUnfrozenCallback getAccountIsUnfrozen() {
        return this.accountIsUnfrozen;
    }

    public boolean hasAccountIsUnfrozen() {
        return this.accountIsUnfrozen != null;
    }

    private ActivateSuccessfulCallback activateSuccessful;

    /**
    * Received when a new (not child) account is created
    */
    public ActivateSuccessfulCallback getActivateSuccessful() {
        return this.activateSuccessful;
    }

    public boolean hasActivateSuccessful() {
        return this.activateSuccessful != null;
    }

    private CallHistoryReportCallback callHistoryReport;

    /**
    * Received when a call history report is ready
    */
    public CallHistoryReportCallback getCallHistoryReport() {
        return this.callHistoryReport;
    }

    public boolean hasCallHistoryReport() {
        return this.callHistoryReport != null;
    }

    private CardExpiredCallback cardExpired;

    /**
    * Received when a card is expired
    */
    public CardExpiredCallback getCardExpired() {
        return this.cardExpired;
    }

    public boolean hasCardExpired() {
        return this.cardExpired != null;
    }

    private CardExpiresInMonthCallback cardExpiresInMonth;

    /**
    * Received when one month is left for a card to be expired
    */
    public CardExpiresInMonthCallback getCardExpiresInMonth() {
        return this.cardExpiresInMonth;
    }

    public boolean hasCardExpiresInMonth() {
        return this.cardExpiresInMonth != null;
    }

    private CardPaymentCallback cardPayment;

    /**
    * Received when a bank card payment is made
    */
    public CardPaymentCallback getCardPayment() {
        return this.cardPayment;
    }

    public boolean hasCardPayment() {
        return this.cardPayment != null;
    }

    private CardPaymentFailedCallback cardPaymentFailed;

    /**
    * Received when a bank card payment is failed
    */
    public CardPaymentFailedCallback getCardPaymentFailed() {
        return this.cardPaymentFailed;
    }

    public boolean hasCardPaymentFailed() {
        return this.cardPaymentFailed != null;
    }

    private RobokassaPaymentCallback robokassaPayment;

    /**
    * Received when a robokassa payment is made
    */
    public RobokassaPaymentCallback getRobokassaPayment() {
        return this.robokassaPayment;
    }

    public boolean hasRobokassaPayment() {
        return this.robokassaPayment != null;
    }

    private WireTransferCallback wireTransfer;

    /**
    * Received when a wire transfer is made
    */
    public WireTransferCallback getWireTransfer() {
        return this.wireTransfer;
    }

    public boolean hasWireTransfer() {
        return this.wireTransfer != null;
    }

    private JSFailCallback jsFail;

    /**
    * Received when <b>send_js_error</b> is set to true and a JS error
    * occurs. See the 'send_js_error' parameter of the 'SetAccountInfo'
    * function
    */
    public JSFailCallback getJsFail() {
        return this.jsFail;
    }

    public boolean hasJsFail() {
        return this.jsFail != null;
    }

    private MinBalanceCallback minBalance;

    /**
    * Received when the minimum balance is reached
    */
    public MinBalanceCallback getMinBalance() {
        return this.minBalance;
    }

    public boolean hasMinBalance() {
        return this.minBalance != null;
    }

    private RegulationAddressVerifiedCallback regulationAddressVerified;

    /**
    * Received when proof of address is verified
    */
    public RegulationAddressVerifiedCallback getRegulationAddressVerified() {
        return this.regulationAddressVerified;
    }

    public boolean hasRegulationAddressVerified() {
        return this.regulationAddressVerified != null;
    }

    private RenewedSubscriptionsCallback renewedSubscriptions;

    /**
    * Received when subscriptions are renewed
    */
    public RenewedSubscriptionsCallback getRenewedSubscriptions() {
        return this.renewedSubscriptions;
    }

    public boolean hasRenewedSubscriptions() {
        return this.renewedSubscriptions != null;
    }

    private ResetAccountPasswordRequestCallback resetAccountPasswordRequest;

    /**
    * Received when an account password reset is requested
    */
    public ResetAccountPasswordRequestCallback getResetAccountPasswordRequest() {
        return this.resetAccountPasswordRequest;
    }

    public boolean hasResetAccountPasswordRequest() {
        return this.resetAccountPasswordRequest != null;
    }

    private SIPRegistrationFailCallback sipRegistrationFail;

    /**
    * Received when one or several SIP registrations are failed
    */
    public SIPRegistrationFailCallback getSipRegistrationFail() {
        return this.sipRegistrationFail;
    }

    public boolean hasSipRegistrationFail() {
        return this.sipRegistrationFail != null;
    }

    private SIPRegistrationRecoveredCallback sipRegistrationRecovered;

    /**
    * Received when one or several SIP registrations are recovered
    */
    public SIPRegistrationRecoveredCallback getSipRegistrationRecovered() {
        return this.sipRegistrationRecovered;
    }

    public boolean hasSipRegistrationRecovered() {
        return this.sipRegistrationRecovered != null;
    }

    private StagnantAccountCallback stagnantAccount;

    /**
    * Received when there are no actions in accounts after their creation
    */
    public StagnantAccountCallback getStagnantAccount() {
        return this.stagnantAccount;
    }

    public boolean hasStagnantAccount() {
        return this.stagnantAccount != null;
    }

    private SubscriptionIsFrozenCallback subscriptionIsFrozen;

    /**
    * Received when a subscription is frozen
    */
    public SubscriptionIsFrozenCallback getSubscriptionIsFrozen() {
        return this.subscriptionIsFrozen;
    }

    public boolean hasSubscriptionIsFrozen() {
        return this.subscriptionIsFrozen != null;
    }

    private SubscriptionIsDetachedCallback subscriptionIsDetached;

    /**
    * Received when a subscription is canceled
    */
    public SubscriptionIsDetachedCallback getSubscriptionIsDetached() {
        return this.subscriptionIsDetached;
    }

    public boolean hasSubscriptionIsDetached() {
        return this.subscriptionIsDetached != null;
    }

    private TransactionHistoryReportCallback transactionHistoryReport;

    /**
    * Received when a transaction history report is ready
    */
    public TransactionHistoryReportCallback getTransactionHistoryReport() {
        return this.transactionHistoryReport;
    }

    public boolean hasTransactionHistoryReport() {
        return this.transactionHistoryReport != null;
    }

    private PlanConfigCallback planConfig;

    /**
    * Received when a plan (IM, MAU) is changed
    */
    public PlanConfigCallback getPlanConfig() {
        return this.planConfig;
    }

    public boolean hasPlanConfig() {
        return this.planConfig != null;
    }

    private UnverifiedSubscriptionDetachedCallback unverifiedSubscriptionDetached;

    /**
    * Received when an unverified subscription is canceled
    */
    public UnverifiedSubscriptionDetachedCallback getUnverifiedSubscriptionDetached() {
        return this.unverifiedSubscriptionDetached;
    }

    public boolean hasUnverifiedSubscriptionDetached() {
        return this.unverifiedSubscriptionDetached != null;
    }

    private ExpiringCallerIDCallback expiringCallerid;

    /**
    * Received when a caller ID is about to be expired
    */
    public ExpiringCallerIDCallback getExpiringCallerid() {
        return this.expiringCallerid;
    }

    public boolean hasExpiringCallerid() {
        return this.expiringCallerid != null;
    }

    private ExpiredCallerIDCallback expiredCallerid;

    /**
    * Received when a caller ID is expired
    */
    public ExpiredCallerIDCallback getExpiredCallerid() {
        return this.expiredCallerid;
    }

    public boolean hasExpiredCallerid() {
        return this.expiredCallerid != null;
    }

    private TranscriptionCompleteCallback transcriptionComplete;

    /**
    * Received when a transcription is saved
    */
    public TranscriptionCompleteCallback getTranscriptionComplete() {
        return this.transcriptionComplete;
    }

    public boolean hasTranscriptionComplete() {
        return this.transcriptionComplete != null;
    }

    private InboundSmsCallback smsInbound;

    /**
    * Received when an incoming SMS is gotten
    */
    public InboundSmsCallback getSmsInbound() {
        return this.smsInbound;
    }

    public boolean hasSmsInbound() {
        return this.smsInbound != null;
    }

    private NewInvoiceCallback newInvoice;

    /**
    * Received when a new invoice is generated
    */
    public NewInvoiceCallback getNewInvoice() {
        return this.newInvoice;
    }

    public boolean hasNewInvoice() {
        return this.newInvoice != null;
    }

    private ExpiringAgreementCallback expiringAgreement;

    /**
    * Received for the accounts for which the confirmation documents
    * waiting period expires in 20/15/10/5/1 day(s)
    */
    public ExpiringAgreementCallback getExpiringAgreement() {
        return this.expiringAgreement;
    }

    public boolean hasExpiringAgreement() {
        return this.expiringAgreement != null;
    }

    private ExpiredAgreementCallback expiredAgreement;

    /**
    * Received for the accounts for which the confirmation documents
    * waiting period has already expired or expires today
    */
    public ExpiredAgreementCallback getExpiredAgreement() {
        return this.expiredAgreement;
    }

    public boolean hasExpiredAgreement() {
        return this.expiredAgreement != null;
    }

    private RestoredAgreementStatusCallback restoredAgreementStatus;

    /**
    * Received when an expiration date of the confirmation documents
    * waiting period is changed
    */
    public RestoredAgreementStatusCallback getRestoredAgreementStatus() {
        return this.restoredAgreementStatus;
    }

    public boolean hasRestoredAgreementStatus() {
        return this.restoredAgreementStatus != null;
    }

    private BalanceIsChanged balanceIsChanged;

    /**
    * Received when an account is refilled
    */
    public BalanceIsChanged getBalanceIsChanged() {
        return this.balanceIsChanged;
    }

    public boolean hasBalanceIsChanged() {
        return this.balanceIsChanged != null;
    }

    private NextChargeAlertCallback nextChargeAlert;

    /**
    * Received when a plan is to be renewed in 3 days, but there is not
    * enough money
    */
    public NextChargeAlertCallback getNextChargeAlert() {
        return this.nextChargeAlert;
    }

    public boolean hasNextChargeAlert() {
        return this.nextChargeAlert != null;
    }

    private CertificateExpiredCallback certificateExpired;

    /**
    * Deprecated. Please use the <b>expired_certificates</b> and
    * <b>expiring_certificates</b> callbacks instead
    */
    public CertificateExpiredCallback getCertificateExpired() {
        return this.certificateExpired;
    }

    public boolean hasCertificateExpired() {
        return this.certificateExpired != null;
    }

    private ExpiredCertificateCallback expiredCertificates;

    /**
    * Received for the accounts whose Apple VOIP certificates are expired
    */
    public ExpiredCertificateCallback getExpiredCertificates() {
        return this.expiredCertificates;
    }

    public boolean hasExpiredCertificates() {
        return this.expiredCertificates != null;
    }

    private ExpiringCertificateCallback expiringCertificates;

    /**
    * Received for the accounts whose Apple VOIP certificates expire in 14
    * or fewer days
    */
    public ExpiringCertificateCallback getExpiringCertificates() {
        return this.expiringCertificates;
    }

    public boolean hasExpiringCertificates() {
        return this.expiringCertificates != null;
    }

    private AccountDocumentStatusUpdatedCallback accountDocumentStatusUpdated;

    /**
    * Received when the verification status is updated
    */
    public AccountDocumentStatusUpdatedCallback getAccountDocumentStatusUpdated() {
        return this.accountDocumentStatusUpdated;
    }

    public boolean hasAccountDocumentStatusUpdated() {
        return this.accountDocumentStatusUpdated != null;
    }

    private A2PActivatedCallback a2pSmsActivated;

    /**
    * Received when A2P SMS are activated
    */
    public A2PActivatedCallback getA2pSmsActivated() {
        return this.a2pSmsActivated;
    }

    public boolean hasA2pSmsActivated() {
        return this.a2pSmsActivated != null;
    }

    private RegulationAddressDocumentsRequestedCallback regulationAddressDocumentsRequested;

    /**
    * Received when the verification status is changed to PENDING
    */
    public RegulationAddressDocumentsRequestedCallback getRegulationAddressDocumentsRequested() {
        return this.regulationAddressDocumentsRequested;
    }

    public boolean hasRegulationAddressDocumentsRequested() {
        return this.regulationAddressDocumentsRequested != null;
    }

    private InvoiceReceivedCallback invoiceReceived;

    /**
    * Received when a monthly invoice is sent
    */
    public InvoiceReceivedCallback getInvoiceReceived() {
        return this.invoiceReceived;
    }

    public boolean hasInvoiceReceived() {
        return this.invoiceReceived != null;
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
        if (callbackId != null) {
            sb.append(aligned)
                .append("\"callbackId\": \"")
                .append(callbackId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (type != null) {
            sb.append(aligned)
                .append("\"type\": \"")
                .append(type)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (hash != null) {
            sb.append(aligned)
                .append("\"hash\": \"")
                .append(hash)
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
        if (languageCode != null) {
            sb.append(aligned)
                .append("\"languageCode\": \"")
                .append(languageCode)
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
        if (balance != null) {
            sb.append(aligned)
                .append("\"balance\": \"")
                .append(balance)
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
        if (accountDocumentUploaded != null) {
            sb.append(aligned)
                .append("\"accountDocumentUploaded\": \"")
                .append(accountDocumentUploaded)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressUploaded != null) {
            sb.append(aligned)
                .append("\"regulationAddressUploaded\": \"")
                .append(regulationAddressUploaded)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountDocumentVerified != null) {
            sb.append(aligned)
                .append("\"accountDocumentVerified\": \"")
                .append(accountDocumentVerified)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountIsFrozen != null) {
            sb.append(aligned)
                .append("\"accountIsFrozen\": \"")
                .append(accountIsFrozen)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountIsUnfrozen != null) {
            sb.append(aligned)
                .append("\"accountIsUnfrozen\": \"")
                .append(accountIsUnfrozen)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (activateSuccessful != null) {
            sb.append(aligned)
                .append("\"activateSuccessful\": \"")
                .append(activateSuccessful)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callHistoryReport != null) {
            sb.append(aligned)
                .append("\"callHistoryReport\": \"")
                .append(callHistoryReport)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cardExpired != null) {
            sb.append(aligned)
                .append("\"cardExpired\": \"")
                .append(cardExpired)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cardExpiresInMonth != null) {
            sb.append(aligned)
                .append("\"cardExpiresInMonth\": \"")
                .append(cardExpiresInMonth)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cardPayment != null) {
            sb.append(aligned)
                .append("\"cardPayment\": \"")
                .append(cardPayment)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cardPaymentFailed != null) {
            sb.append(aligned)
                .append("\"cardPaymentFailed\": \"")
                .append(cardPaymentFailed)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (robokassaPayment != null) {
            sb.append(aligned)
                .append("\"robokassaPayment\": \"")
                .append(robokassaPayment)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (wireTransfer != null) {
            sb.append(aligned)
                .append("\"wireTransfer\": \"")
                .append(wireTransfer)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (jsFail != null) {
            sb.append(aligned)
                .append("\"jsFail\": \"")
                .append(jsFail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (minBalance != null) {
            sb.append(aligned)
                .append("\"minBalance\": \"")
                .append(minBalance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressVerified != null) {
            sb.append(aligned)
                .append("\"regulationAddressVerified\": \"")
                .append(regulationAddressVerified)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (renewedSubscriptions != null) {
            sb.append(aligned)
                .append("\"renewedSubscriptions\": \"")
                .append(renewedSubscriptions)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (resetAccountPasswordRequest != null) {
            sb.append(aligned)
                .append("\"resetAccountPasswordRequest\": \"")
                .append(resetAccountPasswordRequest)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sipRegistrationFail != null) {
            sb.append(aligned)
                .append("\"sipRegistrationFail\": \"")
                .append(sipRegistrationFail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sipRegistrationRecovered != null) {
            sb.append(aligned)
                .append("\"sipRegistrationRecovered\": \"")
                .append(sipRegistrationRecovered)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (stagnantAccount != null) {
            sb.append(aligned)
                .append("\"stagnantAccount\": \"")
                .append(stagnantAccount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionIsFrozen != null) {
            sb.append(aligned)
                .append("\"subscriptionIsFrozen\": \"")
                .append(subscriptionIsFrozen)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionIsDetached != null) {
            sb.append(aligned)
                .append("\"subscriptionIsDetached\": \"")
                .append(subscriptionIsDetached)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transactionHistoryReport != null) {
            sb.append(aligned)
                .append("\"transactionHistoryReport\": \"")
                .append(transactionHistoryReport)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (planConfig != null) {
            sb.append(aligned)
                .append("\"planConfig\": \"")
                .append(planConfig)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (unverifiedSubscriptionDetached != null) {
            sb.append(aligned)
                .append("\"unverifiedSubscriptionDetached\": \"")
                .append(unverifiedSubscriptionDetached)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expiringCallerid != null) {
            sb.append(aligned)
                .append("\"expiringCallerid\": \"")
                .append(expiringCallerid)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expiredCallerid != null) {
            sb.append(aligned)
                .append("\"expiredCallerid\": \"")
                .append(expiredCallerid)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transcriptionComplete != null) {
            sb.append(aligned)
                .append("\"transcriptionComplete\": \"")
                .append(transcriptionComplete)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (smsInbound != null) {
            sb.append(aligned)
                .append("\"smsInbound\": \"")
                .append(smsInbound)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (newInvoice != null) {
            sb.append(aligned)
                .append("\"newInvoice\": \"")
                .append(newInvoice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expiringAgreement != null) {
            sb.append(aligned)
                .append("\"expiringAgreement\": \"")
                .append(expiringAgreement)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expiredAgreement != null) {
            sb.append(aligned)
                .append("\"expiredAgreement\": \"")
                .append(expiredAgreement)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (restoredAgreementStatus != null) {
            sb.append(aligned)
                .append("\"restoredAgreementStatus\": \"")
                .append(restoredAgreementStatus)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (balanceIsChanged != null) {
            sb.append(aligned)
                .append("\"balanceIsChanged\": \"")
                .append(balanceIsChanged)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (nextChargeAlert != null) {
            sb.append(aligned)
                .append("\"nextChargeAlert\": \"")
                .append(nextChargeAlert)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (certificateExpired != null) {
            sb.append(aligned)
                .append("\"certificateExpired\": \"")
                .append(certificateExpired)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expiredCertificates != null) {
            sb.append(aligned)
                .append("\"expiredCertificates\": \"")
                .append(expiredCertificates)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expiringCertificates != null) {
            sb.append(aligned)
                .append("\"expiringCertificates\": \"")
                .append(expiringCertificates)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountDocumentStatusUpdated != null) {
            sb.append(aligned)
                .append("\"accountDocumentStatusUpdated\": \"")
                .append(accountDocumentStatusUpdated)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (a2pSmsActivated != null) {
            sb.append(aligned)
                .append("\"a2pSmsActivated\": \"")
                .append(a2pSmsActivated)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (regulationAddressDocumentsRequested != null) {
            sb.append(aligned)
                .append("\"regulationAddressDocumentsRequested\": \"")
                .append(regulationAddressDocumentsRequested)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (invoiceReceived != null) {
            sb.append(aligned)
                .append("\"invoiceReceived\": \"")
                .append(invoiceReceived)
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