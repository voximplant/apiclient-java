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

public class DelAuthorizedAccountIPRequest {
    private String authorizedIp;

    @RequestField(name="authorized_ip")
    /**
    * The authorized IP4 or network to remove. Set to 'all' to remove all
    * items.
    */
    public String getAuthorizedIp() {
        return this.authorizedIp;
    }

    public boolean hasAuthorizedIp() {
        return this.authorizedIp != null;
    }

    /**
    * The authorized IP4 or network to remove. Set to 'all' to remove all
    * items.
    */
    public DelAuthorizedAccountIPRequest setAuthorizedIp(String d) {
        this.authorizedIp = d;
        return this;
    }

    private String containsIp;

    @RequestField(name="contains_ip")
    /**
    * Specify the parameter to remove the networks that contains the
    * particular IP4. Can be used instead of <b>autharized_ip</b>.
    */
    public String getContainsIp() {
        return this.containsIp;
    }

    public boolean hasContainsIp() {
        return this.containsIp != null;
    }

    /**
    * Specify the parameter to remove the networks that contains the
    * particular IP4. Can be used instead of <b>autharized_ip</b>.
    */
    public DelAuthorizedAccountIPRequest setContainsIp(String d) {
        this.containsIp = d;
        return this;
    }

    private Boolean allowed;

    @RequestField(name="allowed")
    /**
    * Set true to remove the network from the white list. Set false to
    * remove the network from the black list. Omit the parameter to remove
    * the network from all lists.
    */
    public boolean getAllowed() {
        return this.allowed.booleanValue();
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    /**
    * Set true to remove the network from the white list. Set false to
    * remove the network from the black list. Omit the parameter to remove
    * the network from all lists.
    */
    public DelAuthorizedAccountIPRequest setAllowed(boolean d) {
        this.allowed = Boolean.valueOf(d);
        return this;
    }

}