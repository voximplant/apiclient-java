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
* Detailing SIP registration.
*/
public class SIPRegistrationType implements Alignable {

    private Long sipRegistrationId;

    /**
    * The SIP registration ID
    */
    public Long getSipRegistrationId() {
        return this.sipRegistrationId;
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    private String sipUsername;

    /**
    * The user name from sip proxy
    */
    public String getSipUsername() {
        return this.sipUsername;
    }

    public boolean hasSipUsername() {
        return this.sipUsername != null;
    }

    private String proxy;

    /**
    * The sip proxy
    */
    public String getProxy() {
        return this.proxy;
    }

    public boolean hasProxy() {
        return this.proxy != null;
    }

    private Long lastUpdated;

    /**
    * The last time updated
    */
    public Long getLastUpdated() {
        return this.lastUpdated;
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
    * The outgoing proxy
    */
    public String getOutboundProxy() {
        return this.outboundProxy;
    }

    public boolean hasOutboundProxy() {
        return this.outboundProxy != null;
    }

    private Boolean successful;

    /**
    * Whether the SIP registration is successful
    */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public boolean hasSuccessful() {
        return this.successful != null;
    }

    private Long statusCode;

    /**
    * The status code from a SIP registration
    */
    public Long getStatusCode() {
        return this.statusCode;
    }

    public boolean hasStatusCode() {
        return this.statusCode != null;
    }

    private String errorMessage;

    /**
    * The error message from a SIP registration
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public boolean hasErrorMessage() {
        return this.errorMessage != null;
    }

    private Boolean deactivated;

    /**
    * Whether the subscription is deactivation. The SIP registration is
    * frozen if true
    */
    public Boolean getDeactivated() {
        return this.deactivated;
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
    * The subscription monthly charge
    */
    public String getSubscriptionPrice() {
        return this.subscriptionPrice;
    }

    public boolean hasSubscriptionPrice() {
        return this.subscriptionPrice != null;
    }

    private Boolean isPersistent;

    /**
    * Whether the SIP registration is persistent. Set false to activate it
    * only on the user login
    */
    public Boolean getIsPersistent() {
        return this.isPersistent;
    }

    public boolean hasIsPersistent() {
        return this.isPersistent != null;
    }

    private Long userId;

    /**
    * The id of the bound user
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The name of the bound user
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private Long applicationId;

    /**
    * The id of the bound application
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private String applicationName;

    /**
    * The name of the bound application
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    private Long ruleId;

    /**
    * The id of the bound rule
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    private String ruleName;

    /**
    * The name of the bound rule
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
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
        if (sipRegistrationId != null) {
            sb.append(aligned)
                .append("\"sipRegistrationId\": \"")
                .append(sipRegistrationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sipUsername != null) {
            sb.append(aligned)
                .append("\"sipUsername\": \"")
                .append(sipUsername)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (proxy != null) {
            sb.append(aligned)
                .append("\"proxy\": \"")
                .append(proxy)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lastUpdated != null) {
            sb.append(aligned)
                .append("\"lastUpdated\": \"")
                .append(lastUpdated)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (authUser != null) {
            sb.append(aligned)
                .append("\"authUser\": \"")
                .append(authUser)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (outboundProxy != null) {
            sb.append(aligned)
                .append("\"outboundProxy\": \"")
                .append(outboundProxy)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (successful != null) {
            sb.append(aligned)
                .append("\"successful\": \"")
                .append(successful)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (statusCode != null) {
            sb.append(aligned)
                .append("\"statusCode\": \"")
                .append(statusCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (errorMessage != null) {
            sb.append(aligned)
                .append("\"errorMessage\": \"")
                .append(errorMessage)
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
        if (nextSubscriptionRenewal != null) {
            sb.append(aligned)
                .append("\"nextSubscriptionRenewal\": \"")
                .append(nextSubscriptionRenewal)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (purchaseDate != null) {
            sb.append(aligned)
                .append("\"purchaseDate\": \"")
                .append(purchaseDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (subscriptionPrice != null) {
            sb.append(aligned)
                .append("\"subscriptionPrice\": \"")
                .append(subscriptionPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isPersistent != null) {
            sb.append(aligned)
                .append("\"isPersistent\": \"")
                .append(isPersistent)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}