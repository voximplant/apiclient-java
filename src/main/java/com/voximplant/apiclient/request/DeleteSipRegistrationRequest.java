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

public class DeleteSipRegistrationRequest {
    private Long sipRegistrationId;

    @RequestField(name="sip_registration_id")
    /**
    * The registration ID
    */
    public long getSipRegistrationId() {
        return this.sipRegistrationId.longValue();
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    /**
    * The registration ID
    */
    public DeleteSipRegistrationRequest setSipRegistrationId(long d) {
        this.sipRegistrationId = Long.valueOf(d);
        return this;
    }

}