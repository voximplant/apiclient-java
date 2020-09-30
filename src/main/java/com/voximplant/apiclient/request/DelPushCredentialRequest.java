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

public class DelPushCredentialRequest {
    private Long pushCredentialId;

    @RequestField(name="push_credential_id")
    /**
    * The push credentials id.
    */
    public long getPushCredentialId() {
        return this.pushCredentialId.longValue();
    }

    public boolean hasPushCredentialId() {
        return this.pushCredentialId != null;
    }

    /**
    * The push credentials id.
    */
    public DelPushCredentialRequest setPushCredentialId(long d) {
        this.pushCredentialId = Long.valueOf(d);
        return this;
    }

}