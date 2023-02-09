package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The servicing call state.
*/
public class ACDServicingCallStateType implements Alignable {

    private Long userId;

    /**
    * The user ID of the operator
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The user name of the operator
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * The display user name of the operator
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    private Long priority;

    /**
    * The request priority
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    private String callerid;

    /**
    * The client callerid
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
    * The waiting time before servicing in seconds
    */
    public Long getWaitingTime() {
        return this.waitingTime;
    }

    public boolean hasWaitingTime() {
        return this.waitingTime != null;
    }

    private Long acdSessionHistoryId;

    /**
    * The ACD session history ID of the request
    */
    public Long getAcdSessionHistoryId() {
        return this.acdSessionHistoryId;
    }

    public boolean hasAcdSessionHistoryId() {
        return this.acdSessionHistoryId != null;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userDisplayName != null) {
            sb.append(aligned)
                .append("\"userDisplayName\": \"")
                .append(userDisplayName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (priority != null) {
            sb.append(aligned)
                .append("\"priority\": \"")
                .append(priority)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callerid != null) {
            sb.append(aligned)
                .append("\"callerid\": \"")
                .append(callerid)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (beginTime != null) {
            sb.append(aligned)
                .append("\"beginTime\": \"")
                .append(beginTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (waitingTime != null) {
            sb.append(aligned)
                .append("\"waitingTime\": \"")
                .append(waitingTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdSessionHistoryId != null) {
            sb.append(aligned)
                .append("\"acdSessionHistoryId\": \"")
                .append(acdSessionHistoryId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}