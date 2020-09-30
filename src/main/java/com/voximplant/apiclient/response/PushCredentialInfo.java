package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The push credentials list item info.
*/
public class PushCredentialInfo {

    private Long pushCredentialId;

    /**
    * The push credential id
    */
    public long getPushCredentialId() {
        return this.pushCredentialId.longValue();
    }

    public boolean hasPushCredentialId() {
        return this.pushCredentialId != null;
    }

    private Long pushProviderId;

    /**
    * The push provider id
    */
    public long getPushProviderId() {
        return this.pushProviderId.longValue();
    }

    public boolean hasPushProviderId() {
        return this.pushProviderId != null;
    }

    private String pushProviderName;

    /**
    * The push provider name. The possible values are: APPLE, APPLE_VOIP,
    * GOOGLE
    */
    public String getPushProviderName() {
        return this.pushProviderName;
    }

    public boolean hasPushProviderName() {
        return this.pushProviderName != null;
    }

    private String credentialBundle;

    /**
    * The bundle of Android/iOS application.
    */
    public String getCredentialBundle() {
        return this.credentialBundle;
    }

    public boolean hasCredentialBundle() {
        return this.credentialBundle != null;
    }

    private PushCredentialContent content;

    /**
    * The credentials content.
    */
    public PushCredentialContent getContent() {
        return this.content;
    }

    public boolean hasContent() {
        return this.content != null;
    }

    private ApplicationInfoType[] applications;

    /**
    * Bound applications.
    */
    public ApplicationInfoType[] getApplications() {
        return this.applications;
    }

    public boolean hasApplications() {
        return this.applications != null;
    }

}