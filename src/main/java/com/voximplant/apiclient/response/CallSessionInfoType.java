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
* The [GetCallHistory] function result item.
*/
public class CallSessionInfoType implements Alignable {

    private String ruleName;

    /**
    * The routing rule name
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    private String applicationName;

    /**
    * The application name
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    private Long callSessionHistoryId;

    /**
    * The unique JS session identifier
    */
    public Long getCallSessionHistoryId() {
        return this.callSessionHistoryId;
    }

    public boolean hasCallSessionHistoryId() {
        return this.callSessionHistoryId != null;
    }

    private Long accountId;

    /**
    * The account ID that initiates the JS session
    */
    public Long getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private Long applicationId;

    /**
    * The application ID that initiates the JS session
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private Long userId;

    /**
    * The user ID that initiates the JS session
    */
    public Long getUserId() {
        return this.userId;
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
    * The entire JS session duration in seconds. The session can contain
    * multiple calls
    */
    public Long getDuration() {
        return this.duration;
    }

    public boolean hasDuration() {
        return this.duration != null;
    }

    private String initiatorAddress;

    /**
    * The initiator IP address
    */
    public String getInitiatorAddress() {
        return this.initiatorAddress;
    }

    public boolean hasInitiatorAddress() {
        return this.initiatorAddress != null;
    }

    private String mediaServerAddress;

    /**
    * The media server IP address
    */
    public String getMediaServerAddress() {
        return this.mediaServerAddress;
    }

    public boolean hasMediaServerAddress() {
        return this.mediaServerAddress != null;
    }

    private String logFileUrl;

    /**
    * The link to the session log. The log retention policy is 1 month,
    * after that time this field clears
    */
    public String getLogFileUrl() {
        return this.logFileUrl;
    }

    public boolean hasLogFileUrl() {
        return this.logFileUrl != null;
    }

    private String finishReason;

    /**
    * The finish reason. Possible values are __Normal termination__,
    * __Insufficient funds__, __Internal error (billing timeout)__,
    * __Terminated administratively__, __JS session error__, __Timeout__
    */
    public String getFinishReason() {
        return this.finishReason;
    }

    public boolean hasFinishReason() {
        return this.finishReason != null;
    }

    private CallInfoType[] calls;

    /**
    * The calls within JS session, including durations, cost, phone numbers
    * and other information
    */
    public CallInfoType[] getCalls() {
        return this.calls;
    }

    public boolean hasCalls() {
        return this.calls != null;
    }

    private ResourceUsageType[] otherResourceUsage;

    /**
    * The used resorces
    */
    public ResourceUsageType[] getOtherResourceUsage() {
        return this.otherResourceUsage;
    }

    public boolean hasOtherResourceUsage() {
        return this.otherResourceUsage != null;
    }

    private RecordType[] records;

    /**
    * The bound records
    */
    public RecordType[] getRecords() {
        return this.records;
    }

    public boolean hasRecords() {
        return this.records != null;
    }

    private String customData;

    /**
    * The custom data
    */
    public String getCustomData() {
        return this.customData;
    }

    public boolean hasCustomData() {
        return this.customData != null;
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
        if (ruleName != null) {
            sb.append(aligned)
                .append("\"ruleName\": \"")
                .append(ruleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callSessionHistoryId != null) {
            sb.append(aligned)
                .append("\"callSessionHistoryId\": \"")
                .append(callSessionHistoryId)
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
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
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
        if (startDate != null) {
            sb.append(aligned)
                .append("\"startDate\": \"")
                .append(startDate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (duration != null) {
            sb.append(aligned)
                .append("\"duration\": \"")
                .append(duration)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (initiatorAddress != null) {
            sb.append(aligned)
                .append("\"initiatorAddress\": \"")
                .append(initiatorAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mediaServerAddress != null) {
            sb.append(aligned)
                .append("\"mediaServerAddress\": \"")
                .append(mediaServerAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (logFileUrl != null) {
            sb.append(aligned)
                .append("\"logFileUrl\": \"")
                .append(logFileUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (finishReason != null) {
            sb.append(aligned)
                .append("\"finishReason\": \"")
                .append(finishReason)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (calls != null) {
            sb.append(aligned)
                .append("\"CallInfoType\": ")
                .append(StringHelper.arrayToString(calls, alignment + 1))
                .append(System.lineSeparator());
        }
        if (otherResourceUsage != null) {
            sb.append(aligned)
                .append("\"ResourceUsageType\": ")
                .append(StringHelper.arrayToString(otherResourceUsage, alignment + 1))
                .append(System.lineSeparator());
        }
        if (records != null) {
            sb.append(aligned)
                .append("\"RecordType\": ")
                .append(StringHelper.arrayToString(records, alignment + 1))
                .append(System.lineSeparator());
        }
        if (customData != null) {
            sb.append(aligned)
                .append("\"customData\": \"")
                .append(customData)
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