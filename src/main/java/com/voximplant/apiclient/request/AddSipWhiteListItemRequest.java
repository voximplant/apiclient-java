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

public class AddSipWhiteListItemRequest {
    private String sipWhitelistNetwork;

    @RequestField(name="sip_whitelist_network")
    /**
    * The network address in format A.B.C.D/L or A.B.C.D/a.b.c.d (example
    * 192.168.1.5/16).
    */
    public String getSipWhitelistNetwork() {
        return this.sipWhitelistNetwork;
    }

    public boolean hasSipWhitelistNetwork() {
        return this.sipWhitelistNetwork != null;
    }

    /**
    * The network address in format A.B.C.D/L or A.B.C.D/a.b.c.d (example
    * 192.168.1.5/16).
    */
    public AddSipWhiteListItemRequest setSipWhitelistNetwork(String d) {
        this.sipWhitelistNetwork = d;
        return this;
    }

}