package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetCallHistory] function result item.
*/
public class CallSessionInfoType {

    private Long callSessionHistoryId;

    /**
    * The call session history ID.
    */
    public long getCallSessionHistoryId() {
        return this.callSessionHistoryId.longValue();
    }

    public boolean hasCallSessionHistoryId() {
        return this.callSessionHistoryId != null;
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

    private Long applicationId;

    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
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

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date startDate;

    /**
    * The start date in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getStartDate() {
        return this.startDate;
    }

    public boolean hasStartDate() {
        return this.startDate != null;
    }

    private Long duration;

    /**
    * The session duration in seconds.
    */
    public long getDuration() {
        return this.duration.longValue();
    }

    public boolean hasDuration() {
        return this.duration != null;
    }

    private String initiatorAddress;

    /**
    * The initiator IP address.
    */
    public String getInitiatorAddress() {
        return this.initiatorAddress;
    }

    public boolean hasInitiatorAddress() {
        return this.initiatorAddress != null;
    }

    private String mediaServerAddress;

    /**
    * The media server IP address.
    */
    public String getMediaServerAddress() {
        return this.mediaServerAddress;
    }

    public boolean hasMediaServerAddress() {
        return this.mediaServerAddress != null;
    }

    private String logFileUrl;

    /**
    * The session log URL.
    */
    public String getLogFileUrl() {
        return this.logFileUrl;
    }

    public boolean hasLogFileUrl() {
        return this.logFileUrl != null;
    }

    private String finishReason;

    /**
    * The finish reason. Possible values are: __Normal termination__,
    * __Insufficient funds__, __Internal error (billing timeout)__,
    * __Terminated administratively__, __JS Error__, __Timeout__.
    */
    public String getFinishReason() {
        return this.finishReason;
    }

    public boolean hasFinishReason() {
        return this.finishReason != null;
    }

    private CallInfoType[] calls;

    /**
    * The bound calls.
    */
    public CallInfoType[] getCalls() {
        return this.calls;
    }

    public boolean hasCalls() {
        return this.calls != null;
    }

    private ResourceUsageType[] otherResourceUsage;

    /**
    * The used resorces.
    */
    public ResourceUsageType[] getOtherResourceUsage() {
        return this.otherResourceUsage;
    }

    public boolean hasOtherResourceUsage() {
        return this.otherResourceUsage != null;
    }

    private RecordType[] records;

    /**
    * The bound records.
    */
    public RecordType[] getRecords() {
        return this.records;
    }

    public boolean hasRecords() {
        return this.records != null;
    }

    private String customData;

    /**
    * The custom data.
    */
    public String getCustomData() {
        return this.customData;
    }

    public boolean hasCustomData() {
        return this.customData != null;
    }

}