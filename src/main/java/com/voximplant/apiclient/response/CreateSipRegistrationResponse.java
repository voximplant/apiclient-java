package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CreateSipRegistrationResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public long getResult() {
        return this.result.longValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long sipRegistrationId;

    /**
    * The sip registration id.
    */
    public long getSipRegistrationId() {
        return this.sipRegistrationId.longValue();
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    private ShortAccountInfoType accountInfo;

    /**
    * The current account state.
    */
    public ShortAccountInfoType getAccountInfo() {
        return this.accountInfo;
    }

    public boolean hasAccountInfo() {
        return this.accountInfo != null;
    }

}