package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetSipWhiteList] function result item.
*/
public class SipWhiteListInfoType {

    private Long sipWhitelistId;

    /**
    * The SIP white list item ID.
    */
    public long getSipWhitelistId() {
        return this.sipWhitelistId.longValue();
    }

    public boolean hasSipWhitelistId() {
        return this.sipWhitelistId != null;
    }

    private String sipWhitelistNetwork;

    /**
    * The network address in format A.B.C.D/L
    */
    public String getSipWhitelistNetwork() {
        return this.sipWhitelistNetwork;
    }

    public boolean hasSipWhitelistNetwork() {
        return this.sipWhitelistNetwork != null;
    }

}