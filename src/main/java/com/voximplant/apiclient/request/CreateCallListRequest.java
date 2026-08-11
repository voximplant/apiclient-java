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

public class CreateCallListRequest implements Alignable {
    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * Rule ID. It is specified in the <a
    * href='//manage.voximplant.com/applications'>Applications</a> section
    * of the Control Panel
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * Rule ID. It is specified in the <a
    * href='//manage.voximplant.com/applications'>Applications</a> section
    * of the Control Panel
    */
    public CreateCallListRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
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
    public CreateCallListRequest setListCustomData(String d) {
        this.listCustomData = d;
        return this;
    }

    private Long priority;

    @RequestField(name="priority")
    /**
    * Call list priority. The value is in the range of [0 ... 2^31] where
    * zero is the highest priority
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    /**
    * Call list priority. The value is in the range of [0 ... 2^31] where
    * zero is the highest priority
    */
    public CreateCallListRequest setPriority(long d) {
        this.priority = Long.valueOf(d);
        return this;
    }

    private Long maxSimultaneous;

    @RequestField(name="max_simultaneous")
    /**
    * Number of simultaneously processed tasks
    */
    public Long getMaxSimultaneous() {
        return this.maxSimultaneous;
    }

    public boolean hasMaxSimultaneous() {
        return this.maxSimultaneous != null;
    }

    /**
    * Number of simultaneously processed tasks
    */
    public CreateCallListRequest setMaxSimultaneous(long d) {
        this.maxSimultaneous = Long.valueOf(d);
        return this;
    }

    private Long numAttempts;

    @RequestField(name="num_attempts")
    /**
    * Number of attempts. Minimum is <b>1</b>, maximum is <b>5</b>
    */
    public Long getNumAttempts() {
        return this.numAttempts;
    }

    public boolean hasNumAttempts() {
        return this.numAttempts != null;
    }

    /**
    * Number of attempts. Minimum is <b>1</b>, maximum is <b>5</b>
    */
    public CreateCallListRequest setNumAttempts(long d) {
        this.numAttempts = Long.valueOf(d);
        return this;
    }

    private String name;

    @RequestField(name="name")
    /**
    * File name, up to 255 characters and cannot contain the '/' and '\'
    * symbols
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

    /**
    * File name, up to 255 characters and cannot contain the '/' and '\'
    * symbols
    */
    public CreateCallListRequest setName(String d) {
        this.name = d;
        return this;
    }

    private InputStream fileContent;

    @RequestField(name="file_content")
    /**
    * Send as the "body" part of the HTTP request or as multiform. The
    * sending "file_content" via URL is at its own risk because the network
    * devices tend to drop HTTP requests with large headers. Refer to the
    * <a
    * href="https://voximplant.com/docs/guides/solutions/call-lists#csv-table-setup">Call
    * lists guide</a> to learn about file syntax
    */
    public InputStream getFileContent() {
        return this.fileContent;
    }

    public boolean hasFileContent() {
        return this.fileContent != null;
    }

    /**
    * Send as the "body" part of the HTTP request or as multiform. The
    * sending "file_content" via URL is at its own risk because the network
    * devices tend to drop HTTP requests with large headers. Refer to the
    * <a
    * href="https://voximplant.com/docs/guides/solutions/call-lists#csv-table-setup">Call
    * lists guide</a> to learn about file syntax
    */
    public CreateCallListRequest setFileContent(InputStream d) {
        this.fileContent = d;
        return this;
    }

    private Long intervalSeconds;

    @RequestField(name="interval_seconds")
    /**
    * Interval between call attempts in seconds. The default value is 0
    */
    public Long getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public boolean hasIntervalSeconds() {
        return this.intervalSeconds != null;
    }

    /**
    * Interval between call attempts in seconds. The default value is 0
    */
    public CreateCallListRequest setIntervalSeconds(long d) {
        this.intervalSeconds = Long.valueOf(d);
        return this;
    }

    private String encoding;

    @RequestField(name="encoding")
    /**
    * Encoding file. The default value is UTF-8
    */
    public String getEncoding() {
        return this.encoding;
    }

    public boolean hasEncoding() {
        return this.encoding != null;
    }

    /**
    * Encoding file. The default value is UTF-8
    */
    public CreateCallListRequest setEncoding(String d) {
        this.encoding = d;
        return this;
    }

    private String delimiter;

    @RequestField(name="delimiter")
    /**
    * Separator values. The default value is ';'
    */
    public String getDelimiter() {
        return this.delimiter;
    }

    public boolean hasDelimiter() {
        return this.delimiter != null;
    }

    /**
    * Separator values. The default value is ';'
    */
    public CreateCallListRequest setDelimiter(String d) {
        this.delimiter = d;
        return this;
    }

    private String escape;

    @RequestField(name="escape")
    /**
    * Escape character for parsing csv
    */
    public String getEscape() {
        return this.escape;
    }

    public boolean hasEscape() {
        return this.escape != null;
    }

    /**
    * Escape character for parsing csv
    */
    public CreateCallListRequest setEscape(String d) {
        this.escape = d;
        return this;
    }

    private String serverLocation;

    @RequestField(name="server_location")
    /**
    * Location of the server where the scenario needs to be executed. Has
    * higher priority than `ip_address`. Request
    * [getServerLocations](https://api.voximplant.com/getServerLocations)
    * for possible values
    */
    public String getServerLocation() {
        return this.serverLocation;
    }

    public boolean hasServerLocation() {
        return this.serverLocation != null;
    }

    /**
    * Location of the server where the scenario needs to be executed. Has
    * higher priority than `ip_address`. Request
    * [getServerLocations](https://api.voximplant.com/getServerLocations)
    * for possible values
    */
    public CreateCallListRequest setServerLocation(String d) {
        this.serverLocation = d;
        return this;
    }

    private String taskPriorityStrategy;

    @RequestField(name="task_priority_strategy")
    /**
    * Optional. Whether to prioritize first calling attempts or repeated
    * ones. The possible values are: first_attempts, repeated_attempts. The
    * default values is first_attempts.
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
    * default values is first_attempts.
    */
    public CreateCallListRequest setTaskPriorityStrategy(String d) {
        this.taskPriorityStrategy = d;
        return this;
    }

    private String ipAddress;

    @RequestField(name="ip_address")
    /**
    * IP from the geolocation of the call list subscribers. It allows
    * selecting the nearest server for serving subscribers. If not
    * specified, the client IP of the request is used
    */
    public String getIpAddress() {
        return this.ipAddress;
    }

    public boolean hasIpAddress() {
        return this.ipAddress != null;
    }

    /**
    * IP from the geolocation of the call list subscribers. It allows
    * selecting the nearest server for serving subscribers. If not
    * specified, the client IP of the request is used
    */
    public CreateCallListRequest setIpAddress(String d) {
        this.ipAddress = d;
        return this;
    }

    private String callListType;

    @RequestField(name="call_list_type")
    /**
    * Call list type. The possible values are: automatic, predictive,
    * progressive. The value is case-insensitive
    */
    public String getCallListType() {
        return this.callListType;
    }

    public boolean hasCallListType() {
        return this.callListType != null;
    }

    /**
    * Call list type. The possible values are: automatic, predictive,
    * progressive. The value is case-insensitive
    */
    public CreateCallListRequest setCallListType(String d) {
        this.callListType = d;
        return this;
    }

    private Long queueId;

    @RequestField(name="queue_id")
    /**
    * The ACD queue ID. <b>Required</b> if <b>call_list_type</b> is
    * predictive or progressive, and should be omitted otherwise
    */
    public Long getQueueId() {
        return this.queueId;
    }

    public boolean hasQueueId() {
        return this.queueId != null;
    }

    /**
    * The ACD queue ID. <b>Required</b> if <b>call_list_type</b> is
    * predictive or progressive, and should be omitted otherwise
    */
    public CreateCallListRequest setQueueId(long d) {
        this.queueId = Long.valueOf(d);
        return this;
    }

    private Long startAt;

    @RequestField(name="start_at")
    /**
    * Time when the call list should start, as a Unix timestamp in seconds
    * (UTC). The default value is the current time. The value cannot be in
    * the past
    */
    public Long getStartAt() {
        return this.startAt;
    }

    public boolean hasStartAt() {
        return this.startAt != null;
    }

    /**
    * Time when the call list should start, as a Unix timestamp in seconds
    * (UTC). The default value is the current time. The value cannot be in
    * the past
    */
    public CreateCallListRequest setStartAt(long d) {
        this.startAt = Long.valueOf(d);
        return this;
    }

    private Boolean isCancelled;

    @RequestField(name="is_cancelled")
    /**
    * Whether to create the call list in the cancelled state
    */
    public Boolean getIsCancelled() {
        return this.isCancelled;
    }

    public boolean hasIsCancelled() {
        return this.isCancelled != null;
    }

    /**
    * Whether to create the call list in the cancelled state
    */
    public CreateCallListRequest setIsCancelled(boolean d) {
        this.isCancelled = Boolean.valueOf(d);
        return this;
    }

    private String quote;

    @RequestField(name="quote")
    /**
    * Quote character for parsing csv
    */
    public String getQuote() {
        return this.quote;
    }

    public boolean hasQuote() {
        return this.quote != null;
    }

    /**
    * Quote character for parsing csv
    */
    public CreateCallListRequest setQuote(String d) {
        this.quote = d;
        return this;
    }

    private String acdVersion;

    @RequestField(name="acd_version")
    /**
    * The ACD version. The possible values are: V1, V2. Applies only if
    * <b>call_list_type</b> is predictive or progressive
    */
    public String getAcdVersion() {
        return this.acdVersion;
    }

    public boolean hasAcdVersion() {
        return this.acdVersion != null;
    }

    /**
    * The ACD version. The possible values are: V1, V2. Applies only if
    * <b>call_list_type</b> is predictive or progressive
    */
    public CreateCallListRequest setAcdVersion(String d) {
        this.acdVersion = d;
        return this;
    }

    private String predictiveType;

    @RequestField(name="predictive_type")
    /**
    * The predictive dialing algorithm. The possible values are:
    * DEFAULT_PREDICTIVE_TYPE, AR_OPTIMIZED, BF_OPTIMIZED, AR_SMALL_GROUP,
    * AR_AUTO_BALANCED. Applies only if <b>call_list_type</b> is predictive
    */
    public String getPredictiveType() {
        return this.predictiveType;
    }

    public boolean hasPredictiveType() {
        return this.predictiveType != null;
    }

    /**
    * The predictive dialing algorithm. The possible values are:
    * DEFAULT_PREDICTIVE_TYPE, AR_OPTIMIZED, BF_OPTIMIZED, AR_SMALL_GROUP,
    * AR_AUTO_BALANCED. Applies only if <b>call_list_type</b> is predictive
    */
    public CreateCallListRequest setPredictiveType(String d) {
        this.predictiveType = d;
        return this;
    }

    private Long maximumErrorRate;

    @RequestField(name="maximum_error_rate")
    /**
    * The maximum abandoned call rate for predictive dialing, from 0 to 1.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public Long getMaximumErrorRate() {
        return this.maximumErrorRate;
    }

    public boolean hasMaximumErrorRate() {
        return this.maximumErrorRate != null;
    }

    /**
    * The maximum abandoned call rate for predictive dialing, from 0 to 1.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public CreateCallListRequest setMaximumErrorRate(long d) {
        this.maximumErrorRate = Long.valueOf(d);
        return this;
    }

    private Long minimumBusyFactor;

    @RequestField(name="minimum_busy_factor")
    /**
    * The minimum agent busy factor for predictive dialing, from 0 to 1.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public Long getMinimumBusyFactor() {
        return this.minimumBusyFactor;
    }

    public boolean hasMinimumBusyFactor() {
        return this.minimumBusyFactor != null;
    }

    /**
    * The minimum agent busy factor for predictive dialing, from 0 to 1.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public CreateCallListRequest setMinimumBusyFactor(long d) {
        this.minimumBusyFactor = Long.valueOf(d);
        return this;
    }

    private Long taskMultiplier;

    @RequestField(name="task_multiplier")
    /**
    * The task multiplier for progressive dialing. The minimum value is 1.
    * Applies only if <b>call_list_type</b> is progressive
    */
    public Long getTaskMultiplier() {
        return this.taskMultiplier;
    }

    public boolean hasTaskMultiplier() {
        return this.taskMultiplier != null;
    }

    /**
    * The task multiplier for progressive dialing. The minimum value is 1.
    * Applies only if <b>call_list_type</b> is progressive
    */
    public CreateCallListRequest setTaskMultiplier(long d) {
        this.taskMultiplier = Long.valueOf(d);
        return this;
    }

    private Boolean isPersonalCampaign;

    @RequestField(name="is_personal_campaign")
    /**
    * Whether the call list is a personal campaign. Applies only if
    * <b>call_list_type</b> is progressive
    */
    public Boolean getIsPersonalCampaign() {
        return this.isPersonalCampaign;
    }

    public boolean hasIsPersonalCampaign() {
        return this.isPersonalCampaign != null;
    }

    /**
    * Whether the call list is a personal campaign. Applies only if
    * <b>call_list_type</b> is progressive
    */
    public CreateCallListRequest setIsPersonalCampaign(boolean d) {
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
    public CreateCallListRequest setPersonalCampaignType(String d) {
        this.personalCampaignType = d;
        return this;
    }

    private String bufferSizeTarget;

    @RequestField(name="buffer_size_target")
    /**
    * The PDS buffer size target. The possible values are: VALUE, OPERATOR,
    * AGENT. Applies only if <b>call_list_type</b> is predictive or
    * progressive
    */
    public String getBufferSizeTarget() {
        return this.bufferSizeTarget;
    }

    public boolean hasBufferSizeTarget() {
        return this.bufferSizeTarget != null;
    }

    /**
    * The PDS buffer size target. The possible values are: VALUE, OPERATOR,
    * AGENT. Applies only if <b>call_list_type</b> is predictive or
    * progressive
    */
    public CreateCallListRequest setBufferSizeTarget(String d) {
        this.bufferSizeTarget = d;
        return this;
    }

    private Long bufferSizeValue;

    @RequestField(name="buffer_size_value")
    /**
    * The PDS buffer size, from 20 to 500. Applies only if
    * <b>buffer_size_target</b> is VALUE
    */
    public Long getBufferSizeValue() {
        return this.bufferSizeValue;
    }

    public boolean hasBufferSizeValue() {
        return this.bufferSizeValue != null;
    }

    /**
    * The PDS buffer size, from 20 to 500. Applies only if
    * <b>buffer_size_target</b> is VALUE
    */
    public CreateCallListRequest setBufferSizeValue(long d) {
        this.bufferSizeValue = Long.valueOf(d);
        return this;
    }

    private Long bufferThresholdFactor;

    @RequestField(name="buffer_threshold_factor")
    /**
    * The PDS buffer threshold factor. Cannot be negative. Applies only if
    * <b>buffer_size_target</b> is specified
    */
    public Long getBufferThresholdFactor() {
        return this.bufferThresholdFactor;
    }

    public boolean hasBufferThresholdFactor() {
        return this.bufferThresholdFactor != null;
    }

    /**
    * The PDS buffer threshold factor. Cannot be negative. Applies only if
    * <b>buffer_size_target</b> is specified
    */
    public CreateCallListRequest setBufferThresholdFactor(long d) {
        this.bufferThresholdFactor = Long.valueOf(d);
        return this;
    }

    private Long avgDialTimeSec;

    @RequestField(name="avg_dial_time_sec")
    /**
    * The initial average dial time in seconds for the dialing statistics.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public Long getAvgDialTimeSec() {
        return this.avgDialTimeSec;
    }

    public boolean hasAvgDialTimeSec() {
        return this.avgDialTimeSec != null;
    }

    /**
    * The initial average dial time in seconds for the dialing statistics.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public CreateCallListRequest setAvgDialTimeSec(long d) {
        this.avgDialTimeSec = Long.valueOf(d);
        return this;
    }

    private Long avgTimeTalkSec;

    @RequestField(name="avg_time_talk_sec")
    /**
    * The initial average talk time in seconds for the dialing statistics.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public Long getAvgTimeTalkSec() {
        return this.avgTimeTalkSec;
    }

    public boolean hasAvgTimeTalkSec() {
        return this.avgTimeTalkSec != null;
    }

    /**
    * The initial average talk time in seconds for the dialing statistics.
    * Applies only if <b>call_list_type</b> is predictive or progressive
    */
    public CreateCallListRequest setAvgTimeTalkSec(long d) {
        this.avgTimeTalkSec = Long.valueOf(d);
        return this;
    }

    private Long avgTotalTimeSec;

    @RequestField(name="avg_total_time_sec")
    /**
    * The initial average total call time in seconds for the dialing
    * statistics. Applies only if <b>call_list_type</b> is predictive or
    * progressive
    */
    public Long getAvgTotalTimeSec() {
        return this.avgTotalTimeSec;
    }

    public boolean hasAvgTotalTimeSec() {
        return this.avgTotalTimeSec != null;
    }

    /**
    * The initial average total call time in seconds for the dialing
    * statistics. Applies only if <b>call_list_type</b> is predictive or
    * progressive
    */
    public CreateCallListRequest setAvgTotalTimeSec(long d) {
        this.avgTotalTimeSec = Long.valueOf(d);
        return this;
    }

    private Long percentSuccessful;

    @RequestField(name="percent_successful")
    /**
    * The initial successful call ratio for the dialing statistics. Applies
    * only if <b>call_list_type</b> is predictive or progressive
    */
    public Long getPercentSuccessful() {
        return this.percentSuccessful;
    }

    public boolean hasPercentSuccessful() {
        return this.percentSuccessful != null;
    }

    /**
    * The initial successful call ratio for the dialing statistics. Applies
    * only if <b>call_list_type</b> is predictive or progressive
    */
    public CreateCallListRequest setPercentSuccessful(long d) {
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
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
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
        if (priority != null) {
            sb.append(aligned)
                .append("\"priority\": \"")
                .append(priority)
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
        if (numAttempts != null) {
            sb.append(aligned)
                .append("\"numAttempts\": \"")
                .append(numAttempts)
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
        if (fileContent != null) {
        }
        if (intervalSeconds != null) {
            sb.append(aligned)
                .append("\"intervalSeconds\": \"")
                .append(intervalSeconds)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (encoding != null) {
            sb.append(aligned)
                .append("\"encoding\": \"")
                .append(encoding)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (delimiter != null) {
            sb.append(aligned)
                .append("\"delimiter\": \"")
                .append(delimiter)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (escape != null) {
            sb.append(aligned)
                .append("\"escape\": \"")
                .append(escape)
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
        if (taskPriorityStrategy != null) {
            sb.append(aligned)
                .append("\"taskPriorityStrategy\": \"")
                .append(taskPriorityStrategy)
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
        if (callListType != null) {
            sb.append(aligned)
                .append("\"callListType\": \"")
                .append(callListType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (queueId != null) {
            sb.append(aligned)
                .append("\"queueId\": \"")
                .append(queueId)
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
        if (isCancelled != null) {
            sb.append(aligned)
                .append("\"isCancelled\": \"")
                .append(isCancelled)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (quote != null) {
            sb.append(aligned)
                .append("\"quote\": \"")
                .append(quote)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdVersion != null) {
            sb.append(aligned)
                .append("\"acdVersion\": \"")
                .append(acdVersion)
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
        if (bufferSizeTarget != null) {
            sb.append(aligned)
                .append("\"bufferSizeTarget\": \"")
                .append(bufferSizeTarget)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bufferSizeValue != null) {
            sb.append(aligned)
                .append("\"bufferSizeValue\": \"")
                .append(bufferSizeValue)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bufferThresholdFactor != null) {
            sb.append(aligned)
                .append("\"bufferThresholdFactor\": \"")
                .append(bufferThresholdFactor)
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