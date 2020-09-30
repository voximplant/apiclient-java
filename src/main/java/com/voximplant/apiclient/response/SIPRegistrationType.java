package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Detailing SIP registration
*/
public class SIPRegistrationType {

    private Long sipRegistrationId;

    /**
    * The SIP registration ID.
    */
    public long getSipRegistrationId() {
        return this.sipRegistrationId.longValue();
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    private String sipUsername;

    /**
    * The user name from sip proxy.
    */
    public String getSipUsername() {
        return this.sipUsername;
    }

    public boolean hasSipUsername() {
        return this.sipUsername != null;
    }

    private String proxy;

    /**
    * The sip proxy.
    */
    public String getProxy() {
        return this.proxy;
    }

    public boolean hasProxy() {
        return this.proxy != null;
    }

    private Long lastUpdated;

    /**
    * The last time updated.
    */
    public long getLastUpdated() {
        return this.lastUpdated.longValue();
    }

    public boolean hasLastUpdated() {
        return this.lastUpdated != null;
    }

    private String authUser;

    /**
    * The SIP authentications user
    */
    public String getAuthUser() {
        return this.authUser;
    }

    public boolean hasAuthUser() {
        return this.authUser != null;
    }

    private String outboundProxy;

    /**
    * The outbound proxy.
    */
    public String getOutboundProxy() {
        return this.outboundProxy;
    }

    public boolean hasOutboundProxy() {
        return this.outboundProxy != null;
    }

    private Boolean successful;

    /**
    * The successful SIP registration.
    */
    public boolean getSuccessful() {
        return this.successful.booleanValue();
    }

    public boolean hasSuccessful() {
        return this.successful != null;
    }

    private Long statusCode;

    /**
    * The status code from SIP registration.
    */
    public long getStatusCode() {
        return this.statusCode.longValue();
    }

    public boolean hasStatusCode() {
        return this.statusCode != null;
    }

    private String errorMessage;

    /**
    * The error message from SIP registration.
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public boolean hasErrorMessage() {
        return this.errorMessage != null;
    }

    private Boolean deactivated;

    /**
    * The subscription deactivation flag. The SIP registration is frozen if
    * true.
    */
    public boolean getDeactivated() {
        return this.deactivated.booleanValue();
    }

    public boolean hasDeactivated() {
        return this.deactivated != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date nextSubscriptionRenewal;

    /**
    * The next subscription renewal date in format: YYYY-MM-DD
    */
    public Date getNextSubscriptionRenewal() {
        return this.nextSubscriptionRenewal;
    }

    public boolean hasNextSubscriptionRenewal() {
        return this.nextSubscriptionRenewal != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date purchaseDate;

    /**
    * The purchase date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public boolean hasPurchaseDate() {
        return this.purchaseDate != null;
    }

    private String subscriptionPrice;

    /**
    * The subscription monthly charge.
    */
    public String getSubscriptionPrice() {
        return this.subscriptionPrice;
    }

    public boolean hasSubscriptionPrice() {
        return this.subscriptionPrice != null;
    }

    private Boolean isPersistent;

    /**
    * Is SIP registration persistent or on the user logon?
    */
    public boolean getIsPersistent() {
        return this.isPersistent.booleanValue();
    }

    public boolean hasIsPersistent() {
        return this.isPersistent != null;
    }

    private Long userId;

    /**
    * The id of the bound user.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The name of the bound user.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private Long applicationId;

    /**
    * The id of the bound application.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
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
    public long getRuleId() {
        return this.ruleId.longValue();
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

}