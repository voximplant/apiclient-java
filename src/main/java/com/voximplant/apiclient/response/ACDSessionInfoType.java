package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetACDHistory] function result item.
*/
public class ACDSessionInfoType implements Alignable {

    private Long acdSessionHistoryId;

    /**
    * The ACD session history ID
    */
    public Long getAcdSessionHistoryId() {
        return this.acdSessionHistoryId;
    }

    public boolean hasAcdSessionHistoryId() {
        return this.acdSessionHistoryId != null;
    }

    private String acdRequestId;

    /**
    * The ACD request ID. See the
    * [ACDRequest.id()](/docs/references/voxengine/acd/acdrequest#id)
    * VoxEngine method
    */
    public String getAcdRequestId() {
        return this.acdRequestId;
    }

    public boolean hasAcdRequestId() {
        return this.acdRequestId != null;
    }

    private Long accountId;

    /**
    * The account ID
    */
    public Long getAccountId() {
        return this.accountId;
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
    * The request priority
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    private Long acdQueueId;

    /**
    * The ACD queue ID
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    private Long userId;

    /**
    * The user ID
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private Long waitingDuration;

    /**
    * The waiting duration in seconds
    */
    public Long getWaitingDuration() {
        return this.waitingDuration;
    }

    public boolean hasWaitingDuration() {
        return this.waitingDuration != null;
    }

    private Long inServiceDuration;

    /**
    * The conversation duration in seconds
    */
    public Long getInServiceDuration() {
        return this.inServiceDuration;
    }

    public boolean hasInServiceDuration() {
        return this.inServiceDuration != null;
    }

    private Long afterServiceDuration;

    /**
    * The after service duration in seconds
    */
    public Long getAfterServiceDuration() {
        return this.afterServiceDuration;
    }

    public boolean hasAfterServiceDuration() {
        return this.afterServiceDuration != null;
    }

    private ACDSessionEventInfoType[] events;

    /**
    * The bound events
    */
    public ACDSessionEventInfoType[] getEvents() {
        return this.events;
    }

    public boolean hasEvents() {
        return this.events != null;
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
        if (acdSessionHistoryId != null) {
            sb.append(aligned)
                .append("\"acdSessionHistoryId\": \"")
                .append(acdSessionHistoryId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdRequestId != null) {
            sb.append(aligned)
                .append("\"acdRequestId\": \"")
                .append(acdRequestId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
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
        if (priority != null) {
            sb.append(aligned)
                .append("\"priority\": \"")
                .append(priority)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (waitingDuration != null) {
            sb.append(aligned)
                .append("\"waitingDuration\": \"")
                .append(waitingDuration)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (inServiceDuration != null) {
            sb.append(aligned)
                .append("\"inServiceDuration\": \"")
                .append(inServiceDuration)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (afterServiceDuration != null) {
            sb.append(aligned)
                .append("\"afterServiceDuration\": \"")
                .append(afterServiceDuration)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (events != null) {
            sb.append(aligned)
                .append("\"ACDSessionEventInfoType\": ")
                .append(StringHelper.arrayToString(events, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}