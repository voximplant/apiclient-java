package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The servicing call state.
*/
public class ACDServicingCallStateType {

    private Long userId;

    /**
    * The user ID of the operator.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The user name of the operator.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * The display user name of the operator.
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
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

    private Long waitingTime;

    /**
    * The waiting time before servicing in seconds.
    */
    public long getWaitingTime() {
        return this.waitingTime.longValue();
    }

    public boolean hasWaitingTime() {
        return this.waitingTime != null;
    }

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

}