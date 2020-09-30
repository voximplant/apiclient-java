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

public class BindPushCredentialRequest {
    private MultiArgument<Long> pushCredentialId;

    @RequestField(name="push_credential_id")
    /**
    * The push credentials ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getPushCredentialId() {
        return this.pushCredentialId;
    }

    public boolean hasPushCredentialId() {
        return this.pushCredentialId != null;
    }

    /**
    * The push credentials ID list separated by the ';' symbol.
    */
    public BindPushCredentialRequest setPushCredentialId(MultiArgument<Long> d) {
        this.pushCredentialId = d;
        return this;
    }

    private MultiArgument<Long> applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public BindPushCredentialRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private Boolean bind;

    @RequestField(name="bind")
    /**
    * Set to false for unbind. Default value is true.
    */
    public boolean getBind() {
        return this.bind.booleanValue();
    }

    public boolean hasBind() {
        return this.bind != null;
    }

    /**
    * Set to false for unbind. Default value is true.
    */
    public BindPushCredentialRequest setBind(boolean d) {
        this.bind = Boolean.valueOf(d);
        return this;
    }

}