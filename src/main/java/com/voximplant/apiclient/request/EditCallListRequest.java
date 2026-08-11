package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class EditCallListRequest implements Alignable {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * Call list ID. If the ID is non existing, the 251 error returns
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * Call list ID. If the ID is non existing, the 251 error returns
    */
    public EditCallListRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

    private String listCustomData;

    @RequestField(name="list_custom_data")
    /**
    * Custom data string for the call list
    */
    public String getListCustomData() {
        return this.listCustomData;
    }

    public boolean hasListCustomData() {
        return this.listCustomData != null;
    }

    /**
    * Custom data string for the call list
    */
    public EditCallListRequest setListCustomData(String d) {
        this.listCustomData = d;
        return this;
    }

    private Long intervalSeconds;

    @RequestField(name="interval_seconds")
    /**
    * Minimum interval between call attempts. Cannot be a negative value
    */
    public Long getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public boolean hasIntervalSeconds() {
        return this.intervalSeconds != null;
    }

    /**
    * Minimum interval between call attempts. Cannot be a negative value
    */
    public EditCallListRequest setIntervalSeconds(long d) {
        this.intervalSeconds = Long.valueOf(d);
        return this;
    }

    private Long numAttempts;

    @RequestField(name="num_attempts")
    /**
    * Maximum call attempt number. Cannot be less than 1
    */
    public Long getNumAttempts() {
        return this.numAttempts;
    }

    public boolean hasNumAttempts() {
        return this.numAttempts != null;
    }

    /**
    * Maximum call attempt number. Cannot be less than 1
    */
    public EditCallListRequest setNumAttempts(long d) {
        this.numAttempts = Long.valueOf(d);
        return this;
    }

    private Long maxSimultaneous;

    @RequestField(name="max_simultaneous")
    /**
    * Maximum simultaneous call attempts for this call list. Cannot be less
    * than 1
    */
    public Long getMaxSimultaneous() {
        return this.maxSimultaneous;
    }

    public boolean hasMaxSimultaneous() {
        return this.maxSimultaneous != null;
    }

    /**
    * Maximum simultaneous call attempts for this call list. Cannot be less
    * than 1
    */
    public EditCallListRequest setMaxSimultaneous(long d) {
        this.maxSimultaneous = Long.valueOf(d);
        return this;
    }

    private String ipAddress;

    @RequestField(name="ip_address")
    /**
    * IP address in the `Inet4Address` format
    */
    public String getIpAddress() {
        return this.ipAddress;
    }

    public boolean hasIpAddress() {
        return this.ipAddress != null;
    }

    /**
    * IP address in the `Inet4Address` format
    */
    public EditCallListRequest setIpAddress(String d) {
        this.ipAddress = d;
        return this;
    }

    private String name;

    @RequestField(name="name")
    /**
    * Call list name. Cannot be bigger than 255 characters, cannot contain
    * slash symbol
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

    /**
    * Call list name. Cannot be bigger than 255 characters, cannot contain
    * slash symbol
    */
    public EditCallListRequest setName(String d) {
        this.name = d;
        return this;
    }

    private Long priority;

    @RequestField(name="priority")
    /**
    * Call list's priority among other call list. The lower the value, the
    * higher is the call list's priority
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    /**
    * Call list's priority among other call list. The lower the value, the
    * higher is the call list's priority
    */
    public EditCallListRequest setPriority(long d) {
        this.priority = Long.valueOf(d);
        return this;
    }

    private Long startAt;

    @RequestField(name="start_at")
    /**
    * Time when the call list should start, as a Unix timestamp in seconds
    * (UTC)
    */
    public Long getStartAt() {
        return this.startAt;
    }

    public boolean hasStartAt() {
        return this.startAt != null;
    }

    /**
    * Time when the call list should start, as a Unix timestamp in seconds
    * (UTC)
    */
    public EditCallListRequest setStartAt(long d) {
        this.startAt = Long.valueOf(d);
        return this;
    }

    private String taskPriorityStrategy;

    @RequestField(name="task_priority_strategy")
    /**
    * Optional. Whether to prioritize first calling attempts or repeated
    * ones. The possible values are: first_attempts, repeated_attempts. The
    * default values is first_attempts
    */
    public String getTaskPriorityStrategy() {
        return this.taskPriorityStrategy;
    }

    public boolean hasTaskPriorityStrategy() {
        return this.taskPriorityStrategy != null;
    }

    /**
    * Optional. Whether to prioritize first calling attempts or repeated
    * ones. The possible values are: first_attempts, repeated_attempts. The
    * default values is first_attempts
    */
    public EditCallListRequest setTaskPriorityStrategy(String d) {
        this.taskPriorityStrategy = d;
        return this;
    }

    private String serverLocation;

    @RequestField(name="server_location")
    /**
    * Location of the server processing the call list. If the ID is non
    * existing, the 496 error returns: The 'server_location' parameter is
    * invalid.
    */
    public String getServerLocation() {
        return this.serverLocation;
    }

    public boolean hasServerLocation() {
        return this.serverLocation != null;
    }

    /**
    * Location of the server processing the call list. If the ID is non
    * existing, the 496 error returns: The 'server_location' parameter is
    * invalid.
    */
    public EditCallListRequest setServerLocation(String d) {
        this.serverLocation = d;
        return this;
    }

    private String callListType;

    @RequestField(name="call_list_type")
    /**
    * Call list type. The possible values are: automatic, manual,
    * predictive, progressive. The value is case-insensitive
    */
    public String getCallListType() {
        return this.callListType;
    }

    public boolean hasCallListType() {
        return this.callListType != null;
    }

    /**
    * Call list type. The possible values are: automatic, manual,
    * predictive, progressive. The value is case-insensitive
    */
    public EditCallListRequest setCallListType(String d) {
        this.callListType = d;
        return this;
    }

    private String callType;

    @RequestField(name="call_type")
    /**
    * Alias for <b>call_list_type</b>. Applies only if
    * <b>call_list_type</b> is not specified
    */
    public String getCallType() {
        return this.callType;
    }

    public boolean hasCallType() {
        return this.callType != null;
    }

    /**
    * Alias for <b>call_list_type</b>. Applies only if
    * <b>call_list_type</b> is not specified
    */
    public EditCallListRequest setCallType(String d) {
        this.callType = d;
        return this;
    }

    private String predictiveType;

    @RequestField(name="predictive_type")
    /**
    * The predictive dialing algorithm. The possible values are:
    * AR_OPTIMIZED, BF_OPTIMIZED, AR_SMALL_GROUP, AR_AUTO_BALANCED. If
    * omitted while <b>call_list_type</b> is set to predictive, the value
    * becomes AR_OPTIMIZED; for progressive the value is reset
    */
    public String getPredictiveType() {
        return this.predictiveType;
    }

    public boolean hasPredictiveType() {
        return this.predictiveType != null;
    }

    /**
    * The predictive dialing algorithm. The possible values are:
    * AR_OPTIMIZED, BF_OPTIMIZED, AR_SMALL_GROUP, AR_AUTO_BALANCED. If
    * omitted while <b>call_list_type</b> is set to predictive, the value
    * becomes AR_OPTIMIZED; for progressive the value is reset
    */
    public EditCallListRequest setPredictiveType(String d) {
        this.predictiveType = d;
        return this;
    }

    private Long maximumErrorRate;

    @RequestField(name="maximum_error_rate")
    /**
    * The maximum abandoned call rate for predictive dialing, from 0 to 1.
    * If omitted while <b>call_list_type</b> is set to predictive, the
    * value becomes 0.02
    */
    public Long getMaximumErrorRate() {
        return this.maximumErrorRate;
    }

    public boolean hasMaximumErrorRate() {
        return this.maximumErrorRate != null;
    }

    /**
    * The maximum abandoned call rate for predictive dialing, from 0 to 1.
    * If omitted while <b>call_list_type</b> is set to predictive, the
    * value becomes 0.02
    */
    public EditCallListRequest setMaximumErrorRate(long d) {
        this.maximumErrorRate = Long.valueOf(d);
        return this;
    }

    private Long minimumBusyFactor;

    @RequestField(name="minimum_busy_factor")
    /**
    * The minimum agent busy factor for predictive dialing. Cannot be
    * negative. If omitted while <b>call_list_type</b> is set to
    * predictive, the value becomes 0.8
    */
    public Long getMinimumBusyFactor() {
        return this.minimumBusyFactor;
    }

    public boolean hasMinimumBusyFactor() {
        return this.minimumBusyFactor != null;
    }

    /**
    * The minimum agent busy factor for predictive dialing. Cannot be
    * negative. If omitted while <b>call_list_type</b> is set to
    * predictive, the value becomes 0.8
    */
    public EditCallListRequest setMinimumBusyFactor(long d) {
        this.minimumBusyFactor = Long.valueOf(d);
        return this;
    }

    private Long taskMultiplier;

    @RequestField(name="task_multiplier")
    /**
    * The task multiplier for progressive dialing. Cannot be negative. If
    * omitted while <b>call_list_type</b> is set to progressive, the value
    * becomes 1
    */
    public Long getTaskMultiplier() {
        return this.taskMultiplier;
    }

    public boolean hasTaskMultiplier() {
        return this.taskMultiplier != null;
    }

    /**
    * The task multiplier for progressive dialing. Cannot be negative. If
    * omitted while <b>call_list_type</b> is set to progressive, the value
    * becomes 1
    */
    public EditCallListRequest setTaskMultiplier(long d) {
        this.taskMultiplier = Long.valueOf(d);
        return this;
    }

    private Boolean isPersonalCampaign;

    @RequestField(name="is_personal_campaign")
    /**
    * Whether the call list is a personal campaign. <b>Required</b> if
    * <b>personal_campaign_type</b> is specified
    */
    public Boolean getIsPersonalCampaign() {
        return this.isPersonalCampaign;
    }

    public boolean hasIsPersonalCampaign() {
        return this.isPersonalCampaign != null;
    }

    /**
    * Whether the call list is a personal campaign. <b>Required</b> if
    * <b>personal_campaign_type</b> is specified
    */
    public EditCallListRequest setIsPersonalCampaign(boolean d) {
        this.isPersonalCampaign = Boolean.valueOf(d);
        return this;
    }

    private String personalCampaignType;

    @RequestField(name="personal_campaign_type")
    /**
    * The personal campaign mode. The possible values are: smart, strict.
    * Allowed only if <b>is_personal_campaign</b> is true; the default
    * value in that case is smart
    */
    public String getPersonalCampaignType() {
        return this.personalCampaignType;
    }

    public boolean hasPersonalCampaignType() {
        return this.personalCampaignType != null;
    }

    /**
    * The personal campaign mode. The possible values are: smart, strict.
    * Allowed only if <b>is_personal_campaign</b> is true; the default
    * value in that case is smart
    */
    public EditCallListRequest setPersonalCampaignType(String d) {
        this.personalCampaignType = d;
        return this;
    }

    private Long avgDialTimeSec;

    @RequestField(name="avg_dial_time_sec")
    /**
    * The average dial time in seconds for the dialing statistics. Cannot
    * be negative
    */
    public Long getAvgDialTimeSec() {
        return this.avgDialTimeSec;
    }

    public boolean hasAvgDialTimeSec() {
        return this.avgDialTimeSec != null;
    }

    /**
    * The average dial time in seconds for the dialing statistics. Cannot
    * be negative
    */
    public EditCallListRequest setAvgDialTimeSec(long d) {
        this.avgDialTimeSec = Long.valueOf(d);
        return this;
    }

    private Long avgTimeTalkSec;

    @RequestField(name="avg_time_talk_sec")
    /**
    * The average talk time in seconds for the dialing statistics. Cannot
    * be negative
    */
    public Long getAvgTimeTalkSec() {
        return this.avgTimeTalkSec;
    }

    public boolean hasAvgTimeTalkSec() {
        return this.avgTimeTalkSec != null;
    }

    /**
    * The average talk time in seconds for the dialing statistics. Cannot
    * be negative
    */
    public EditCallListRequest setAvgTimeTalkSec(long d) {
        this.avgTimeTalkSec = Long.valueOf(d);
        return this;
    }

    private Long avgTotalTimeSec;

    @RequestField(name="avg_total_time_sec")
    /**
    * The average total call time in seconds for the dialing statistics.
    * Cannot be negative
    */
    public Long getAvgTotalTimeSec() {
        return this.avgTotalTimeSec;
    }

    public boolean hasAvgTotalTimeSec() {
        return this.avgTotalTimeSec != null;
    }

    /**
    * The average total call time in seconds for the dialing statistics.
    * Cannot be negative
    */
    public EditCallListRequest setAvgTotalTimeSec(long d) {
        this.avgTotalTimeSec = Long.valueOf(d);
        return this;
    }

    private Long percentSuccessful;

    @RequestField(name="percent_successful")
    /**
    * The successful call ratio for the dialing statistics. Cannot be
    * negative
    */
    public Long getPercentSuccessful() {
        return this.percentSuccessful;
    }

    public boolean hasPercentSuccessful() {
        return this.percentSuccessful != null;
    }

    /**
    * The successful call ratio for the dialing statistics. Cannot be
    * negative
    */
    public EditCallListRequest setPercentSuccessful(long d) {
        this.percentSuccessful = Long.valueOf(d);
        return this;
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
        if (listId != null) {
            sb.append(aligned)
                .append("\"listId\": \"")
                .append(listId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (listCustomData != null) {
            sb.append(aligned)
                .append("\"listCustomData\": \"")
                .append(listCustomData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (intervalSeconds != null) {
            sb.append(aligned)
                .append("\"intervalSeconds\": \"")
                .append(intervalSeconds)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (numAttempts != null) {
            sb.append(aligned)
                .append("\"numAttempts\": \"")
                .append(numAttempts)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxSimultaneous != null) {
            sb.append(aligned)
                .append("\"maxSimultaneous\": \"")
                .append(maxSimultaneous)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ipAddress != null) {
            sb.append(aligned)
                .append("\"ipAddress\": \"")
                .append(ipAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (name != null) {
            sb.append(aligned)
                .append("\"name\": \"")
                .append(name)
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
        if (startAt != null) {
            sb.append(aligned)
                .append("\"startAt\": \"")
                .append(startAt)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (taskPriorityStrategy != null) {
            sb.append(aligned)
                .append("\"taskPriorityStrategy\": \"")
                .append(taskPriorityStrategy)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serverLocation != null) {
            sb.append(aligned)
                .append("\"serverLocation\": \"")
                .append(serverLocation)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callListType != null) {
            sb.append(aligned)
                .append("\"callListType\": \"")
                .append(callListType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callType != null) {
            sb.append(aligned)
                .append("\"callType\": \"")
                .append(callType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (predictiveType != null) {
            sb.append(aligned)
                .append("\"predictiveType\": \"")
                .append(predictiveType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maximumErrorRate != null) {
            sb.append(aligned)
                .append("\"maximumErrorRate\": \"")
                .append(maximumErrorRate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (minimumBusyFactor != null) {
            sb.append(aligned)
                .append("\"minimumBusyFactor\": \"")
                .append(minimumBusyFactor)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (taskMultiplier != null) {
            sb.append(aligned)
                .append("\"taskMultiplier\": \"")
                .append(taskMultiplier)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (isPersonalCampaign != null) {
            sb.append(aligned)
                .append("\"isPersonalCampaign\": \"")
                .append(isPersonalCampaign)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (personalCampaignType != null) {
            sb.append(aligned)
                .append("\"personalCampaignType\": \"")
                .append(personalCampaignType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (avgDialTimeSec != null) {
            sb.append(aligned)
                .append("\"avgDialTimeSec\": \"")
                .append(avgDialTimeSec)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (avgTimeTalkSec != null) {
            sb.append(aligned)
                .append("\"avgTimeTalkSec\": \"")
                .append(avgTimeTalkSec)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (avgTotalTimeSec != null) {
            sb.append(aligned)
                .append("\"avgTotalTimeSec\": \"")
                .append(avgTotalTimeSec)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (percentSuccessful != null) {
            sb.append(aligned)
                .append("\"percentSuccessful\": \"")
                .append(percentSuccessful)
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