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

public class GetACDStateRequest {
    private MultiArgument<Long> acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID list separated by the ';' symbol or the 'all' value.
    */
    public GetACDStateRequest setAcdQueueId(MultiArgument<Long> d) {
        this.acdQueueId = d;
        return this;
    }

}