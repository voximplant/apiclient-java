package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetACDHistory] function result item.
*/
public class ACDSessionInfoType {

    private Long acdSessionHistoryId;

    /**
    * The ACD session history ID.
    */
    public long getAcdSessionHistoryId() {
        return this.acdSessionHistoryId.longValue();
    }

    public boolean hasAcdSessionHistoryId() {
        return this.acdSessionHistoryId != null;
    }

    private String acdRequestId;

    /**
    * The ACD request ID. See the
    * [ACDRequest.id()](https://voximplant.com/docs/references/voxengine/acd/acdrequest#id)
    * VoxEngine method.
    */
    public String getAcdRequestId() {
        return this.acdRequestId;
    }

    public boolean hasAcdRequestId() {
        return this.acdRequestId != null;
    }

    private Long accountId;

    /**
    * The account ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date beginTime;

    /**
    * The UTC start date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getBeginTime() {
        return this.beginTime;
    }

    public boolean hasBeginTime() {
        return this.beginTime != null;
    }

    private Long priority;

    /**
    * The request priority.
    */
    public long getPriority() {
        return this.priority.longValue();
    }

    public boolean hasPriority() {
        return this.priority != null;
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

    private Long userId;

    /**
    * The user ID.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private Long waitingDuration;

    /**
    * The waiting duration in seconds.
    */
    public long getWaitingDuration() {
        return this.waitingDuration.longValue();
    }

    public boolean hasWaitingDuration() {
        return this.waitingDuration != null;
    }

    private Long inServiceDuration;

    /**
    * The conversation duration in seconds.
    */
    public long getInServiceDuration() {
        return this.inServiceDuration.longValue();
    }

    public boolean hasInServiceDuration() {
        return this.inServiceDuration != null;
    }

    private Long afterServiceDuration;

    /**
    * The after service duration in seconds.
    */
    public long getAfterServiceDuration() {
        return this.afterServiceDuration.longValue();
    }

    public boolean hasAfterServiceDuration() {
        return this.afterServiceDuration != null;
    }

    private ACDSessionEventInfoType[] events;

    /**
    * The bound events.
    */
    public ACDSessionEventInfoType[] getEvents() {
        return this.events;
    }

    public boolean hasEvents() {
        return this.events != null;
    }

}