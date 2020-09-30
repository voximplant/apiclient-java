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

public class DelSipWhiteListItemRequest {
    private Long sipWhitelistId;

    @RequestField(name="sip_whitelist_id")
    /**
    * The SIP white list item ID to delete.
    */
    public long getSipWhitelistId() {
        return this.sipWhitelistId.longValue();
    }

    public boolean hasSipWhitelistId() {
        return this.sipWhitelistId != null;
    }

    /**
    * The SIP white list item ID to delete.
    */
    public DelSipWhiteListItemRequest setSipWhitelistId(long d) {
        this.sipWhitelistId = Long.valueOf(d);
        return this;
    }

}