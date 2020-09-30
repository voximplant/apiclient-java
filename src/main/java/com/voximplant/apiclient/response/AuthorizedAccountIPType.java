package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetAuthorizedAccountIPs] function result.
*/
public class AuthorizedAccountIPType {

    private String authorizedIp;

    /**
    * The authorized IP4 or network.
    */
    public String getAuthorizedIp() {
        return this.authorizedIp;
    }

    public boolean hasAuthorizedIp() {
        return this.authorizedIp != null;
    }

    private Boolean allowed;

    /**
    * The allowed flag (true - whitelist, false - blacklist).
    */
    public boolean getAllowed() {
        return this.allowed.booleanValue();
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * The item creating UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

}