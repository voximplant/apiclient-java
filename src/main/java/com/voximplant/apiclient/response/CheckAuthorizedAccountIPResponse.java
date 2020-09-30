package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CheckAuthorizedAccountIPResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Boolean result;

    /**
    * True if IP is allowed.
    */
    public boolean getResult() {
        return this.result.booleanValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private String authorizedIp;

    /**
    * The matched authorized IP or network (if found).
    */
    public String getAuthorizedIp() {
        return this.authorizedIp;
    }

    public boolean hasAuthorizedIp() {
        return this.authorizedIp != null;
    }

}