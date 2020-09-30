package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The ACD operator call type.
*/
public class ACDOperatorCall {

    private Long acdSessionHistoryId;

    /**
    * The ACD session history ID of the request.
    */
    public long getAcdSessionHistoryId() {
        return this.acdSessionHistoryId.longValue();
    }

    public boolean hasAcdSessionHistoryId() {
        return this.acdSessionHistoryId != null;
    }

    private String acdRequestId;

    /**
    * The internal ACD session history ID.
    */
    public String getAcdRequestId() {
        return this.acdRequestId;
    }

    public boolean hasAcdRequestId() {
        return this.acdRequestId != null;
    }

    private Long acdQueueId;

    /**
    * The ACD queue ID.
    */
    public long getAcdQueueId() {
        return this.acdQueueId.longValue();
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    private String acdQueueName;

    /**
    * The ACD queue name.
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    private String callerid;

    /**
    * The client callerid.
    */
    public String getCallerid() {
        return this.callerid;
    }

    public boolean hasCallerid() {
        return this.callerid != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date beginTime;

    /**
    * The begin time of the request in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getBeginTime() {
        return this.beginTime;
    }

    public boolean hasBeginTime() {
        return this.beginTime != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date submitted;

    /**
    * The submission time of the request in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getSubmitted() {
        return this.submitted;
    }

    public boolean hasSubmitted() {
        return this.submitted != null;
    }

}