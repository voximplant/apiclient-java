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

public class DelQueueRequest {
    private MultiArgument<Long> acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID list separated by the ';' symbol.
    */
    public DelQueueRequest setAcdQueueId(MultiArgument<Long> d) {
        this.acdQueueId = d;
        return this;
    }

    private MultiArgument<String> acdQueueName;

    @RequestField(name="acd_queue_name")
    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>.
    * The ACD queue name list separated by the ';' symbol.
    */
    public MultiArgument<String> getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    /**
    * The ACD queue name that can be used instead of <b>acd_queue_id</b>.
    * The ACD queue name list separated by the ';' symbol.
    */
    public DelQueueRequest setAcdQueueName(MultiArgument<String> d) {
        this.acdQueueName = d;
        return this;
    }

}