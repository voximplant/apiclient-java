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

public class DelPstnBlackListItemRequest {
    private Long pstnBlacklistId;

    @RequestField(name="pstn_blacklist_id")
    /**
    * The PSTN black list item ID.
    */
    public long getPstnBlacklistId() {
        return this.pstnBlacklistId.longValue();
    }

    public boolean hasPstnBlacklistId() {
        return this.pstnBlacklistId != null;
    }

    /**
    * The PSTN black list item ID.
    */
    public DelPstnBlackListItemRequest setPstnBlacklistId(long d) {
        this.pstnBlacklistId = Long.valueOf(d);
        return this;
    }

}