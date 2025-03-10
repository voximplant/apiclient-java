package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The push credentials list item info.
*/
public class PushCredentialInfo implements Alignable {

    private Long pushCredentialId;

    /**
    * The push credential id
    */
    public Long getPushCredentialId() {
        return this.pushCredentialId;
    }

    public boolean hasPushCredentialId() {
        return this.pushCredentialId != null;
    }

    private Long pushProviderId;

    /**
    * The push provider id
    */
    public Long getPushProviderId() {
        return this.pushProviderId;
    }

    public boolean hasPushProviderId() {
        return this.pushProviderId != null;
    }

    private String pushProviderName;

    /**
    * The push provider name. The possible values are APPLE, APPLE_VOIP,
    * GOOGLE, HUAWEI
    */
    public String getPushProviderName() {
        return this.pushProviderName;
    }

    public boolean hasPushProviderName() {
        return this.pushProviderName != null;
    }

    private String expirationDate;

    /**
    * The expiration date of the push certificate
    */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null;
    }

    private String credentialBundle;

    /**
    * The bundle of Android/iOS application
    */
    public String getCredentialBundle() {
        return this.credentialBundle;
    }

    public boolean hasCredentialBundle() {
        return this.credentialBundle != null;
    }

    private PushCredentialContent[] content;

    /**
    * The credentials content
    */
    public PushCredentialContent[] getContent() {
        return this.content;
    }

    public boolean hasContent() {
        return this.content != null;
    }

    private ApplicationInfoType[] applications;

    /**
    * Bound applications
    */
    public ApplicationInfoType[] getApplications() {
        return this.applications;
    }

    public boolean hasApplications() {
        return this.applications != null;
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
        if (pushCredentialId != null) {
            sb.append(aligned)
                .append("\"pushCredentialId\": \"")
                .append(pushCredentialId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (pushProviderId != null) {
            sb.append(aligned)
                .append("\"pushProviderId\": \"")
                .append(pushProviderId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (pushProviderName != null) {
            sb.append(aligned)
                .append("\"pushProviderName\": \"")
                .append(pushProviderName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (expirationDate != null) {
            sb.append(aligned)
                .append("\"expirationDate\": \"")
                .append(expirationDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (credentialBundle != null) {
            sb.append(aligned)
                .append("\"credentialBundle\": \"")
                .append(credentialBundle)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (content != null) {
            sb.append(aligned)
                .append("\"PushCredentialContent\": ")
                .append(StringHelper.arrayToString(content, alignment + 1))
                .append(System.lineSeparator());
        }
        if (applications != null) {
            sb.append(aligned)
                .append("\"ApplicationInfoType\": ")
                .append(StringHelper.arrayToString(applications, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}