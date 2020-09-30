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

public class AddAuthorizedAccountIPRequest {
    private String authorizedIp;

    @RequestField(name="authorized_ip")
    /**
    * The authorized IP4 or network.
    */
    public String getAuthorizedIp() {
        return this.authorizedIp;
    }

    public boolean hasAuthorizedIp() {
        return this.authorizedIp != null;
    }

    /**
    * The authorized IP4 or network.
    */
    public AddAuthorizedAccountIPRequest setAuthorizedIp(String d) {
        this.authorizedIp = d;
        return this;
    }

    private Boolean allowed;

    @RequestField(name="allowed")
    /**
    * Set false to add the IP to the blacklist.
    */
    public boolean getAllowed() {
        return this.allowed.booleanValue();
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    /**
    * Set false to add the IP to the blacklist.
    */
    public AddAuthorizedAccountIPRequest setAllowed(boolean d) {
        this.allowed = Boolean.valueOf(d);
        return this;
    }

}