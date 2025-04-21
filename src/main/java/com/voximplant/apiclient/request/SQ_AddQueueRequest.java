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

public class SQ_AddQueueRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * ID of the application to bind to
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * ID of the application to bind to
    */
    public SQ_AddQueueRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Name of the application to bind to. Can be used instead of
    * <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Name of the application to bind to. Can be used instead of
    * <b>application_id</b>
    */
    public SQ_AddQueueRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String sqQueueName;

    @RequestField(name="sq_queue_name")
    /**
    * Unique SmartQueue name within the application, up to 100 characters
    */
    public String getSqQueueName() {
        return this.sqQueueName;
    }

    public boolean hasSqQueueName() {
        return this.sqQueueName != null;
    }

    /**
    * Unique SmartQueue name within the application, up to 100 characters
    */
    public SQ_AddQueueRequest setSqQueueName(String d) {
        this.sqQueueName = d;
        return this;
    }

    private String callAgentSelection;

    @RequestField(name="call_agent_selection")
    /**
    * Agent selection strategy for calls. Accepts one of the following
    * values: "MOST_QUALIFIED", "LEAST_QUALIFIED", "MAX_WAITING_TIME"
    */
    public String getCallAgentSelection() {
        return this.callAgentSelection;
    }

    public boolean hasCallAgentSelection() {
        return this.callAgentSelection != null;
    }

    /**
    * Agent selection strategy for calls. Accepts one of the following
    * values: "MOST_QUALIFIED", "LEAST_QUALIFIED", "MAX_WAITING_TIME"
    */
    public SQ_AddQueueRequest setCallAgentSelection(String d) {
        this.callAgentSelection = d;
        return this;
    }

    private String imAgentSelection;

    @RequestField(name="im_agent_selection")
    /**
    * Agent selection strategy for messages. Accepts one of the following
    * values: "MOST_QUALIFIED", "LEAST_QUALIFIED", "MAX_WAITING_TIME". The
    * default value is **call_agent_selection**
    */
    public String getImAgentSelection() {
        return this.imAgentSelection;
    }

    public boolean hasImAgentSelection() {
        return this.imAgentSelection != null;
    }

    /**
    * Agent selection strategy for messages. Accepts one of the following
    * values: "MOST_QUALIFIED", "LEAST_QUALIFIED", "MAX_WAITING_TIME". The
    * default value is **call_agent_selection**
    */
    public SQ_AddQueueRequest setImAgentSelection(String d) {
        this.imAgentSelection = d;
        return this;
    }

    private String callTaskSelection;

    @RequestField(name="call_task_selection")
    /**
    * Call type requests prioritizing strategy. Accepts one of the
    * [SQTaskSelectionStrategies] enum values
    */
    public String getCallTaskSelection() {
        return this.callTaskSelection;
    }

    public boolean hasCallTaskSelection() {
        return this.callTaskSelection != null;
    }

    /**
    * Call type requests prioritizing strategy. Accepts one of the
    * [SQTaskSelectionStrategies] enum values
    */
    public SQ_AddQueueRequest setCallTaskSelection(String d) {
        this.callTaskSelection = d;
        return this;
    }

    private String imTaskSelection;

    @RequestField(name="im_task_selection")
    /**
    * IM type requests prioritizing strategy. Accepts one of the
    * [SQTaskSelectionStrategies] enum values. The default value is
    * **call_task_selection**
    */
    public String getImTaskSelection() {
        return this.imTaskSelection;
    }

    public boolean hasImTaskSelection() {
        return this.imTaskSelection != null;
    }

    /**
    * IM type requests prioritizing strategy. Accepts one of the
    * [SQTaskSelectionStrategies] enum values. The default value is
    * **call_task_selection**
    */
    public SQ_AddQueueRequest setImTaskSelection(String d) {
        this.imTaskSelection = d;
        return this;
    }

    private String fallbackAgentSelection;

    @RequestField(name="fallback_agent_selection")
    /**
    * Agent selection strategy, applied when it is not possible to wait for
    * a suitable free agent. Currently not used
    */
    public String getFallbackAgentSelection() {
        return this.fallbackAgentSelection;
    }

    public boolean hasFallbackAgentSelection() {
        return this.fallbackAgentSelection != null;
    }

    /**
    * Agent selection strategy, applied when it is not possible to wait for
    * a suitable free agent. Currently not used
    */
    public SQ_AddQueueRequest setFallbackAgentSelection(String d) {
        this.fallbackAgentSelection = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * Comment, up to 200 characters
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * Comment, up to 200 characters
    */
    public SQ_AddQueueRequest setDescription(String d) {
        this.description = d;
        return this;
    }

    private Long callMaxWaitingTime;

    @RequestField(name="call_max_waiting_time")
    /**
    * Maximum time in minutes that a CALL-type request can remain in the
    * queue without being assigned to an agent. Specify either this
    * parameter or `call_max_waiting_time_in_seconds`. Specifying both
    * parameters simultaniously leads to an error
    */
    public Long getCallMaxWaitingTime() {
        return this.callMaxWaitingTime;
    }

    public boolean hasCallMaxWaitingTime() {
        return this.callMaxWaitingTime != null;
    }

    /**
    * Maximum time in minutes that a CALL-type request can remain in the
    * queue without being assigned to an agent. Specify either this
    * parameter or `call_max_waiting_time_in_seconds`. Specifying both
    * parameters simultaniously leads to an error
    */
    public SQ_AddQueueRequest setCallMaxWaitingTime(long d) {
        this.callMaxWaitingTime = Long.valueOf(d);
        return this;
    }

    private Long imMaxWaitingTime;

    @RequestField(name="im_max_waiting_time")
    /**
    * Maximum time in minutes that an IM-type request can remain in the
    * queue without being assigned to an agent. Specify either this
    * parameter or `im_max_waiting_time_in_seconds`. Specifying both
    * parameters simultaniously leads to an error
    */
    public Long getImMaxWaitingTime() {
        return this.imMaxWaitingTime;
    }

    public boolean hasImMaxWaitingTime() {
        return this.imMaxWaitingTime != null;
    }

    /**
    * Maximum time in minutes that an IM-type request can remain in the
    * queue without being assigned to an agent. Specify either this
    * parameter or `im_max_waiting_time_in_seconds`. Specifying both
    * parameters simultaniously leads to an error
    */
    public SQ_AddQueueRequest setImMaxWaitingTime(long d) {
        this.imMaxWaitingTime = Long.valueOf(d);
        return this;
    }

    private Long callMaxQueueSize;

    @RequestField(name="call_max_queue_size")
    /**
    * Maximum size of the queue with CALL-type requests
    */
    public Long getCallMaxQueueSize() {
        return this.callMaxQueueSize;
    }

    public boolean hasCallMaxQueueSize() {
        return this.callMaxQueueSize != null;
    }

    /**
    * Maximum size of the queue with CALL-type requests
    */
    public SQ_AddQueueRequest setCallMaxQueueSize(long d) {
        this.callMaxQueueSize = Long.valueOf(d);
        return this;
    }

    private Long imMaxQueueSize;

    @RequestField(name="im_max_queue_size")
    /**
    * Maximum size of the queue with IM-type requests
    */
    public Long getImMaxQueueSize() {
        return this.imMaxQueueSize;
    }

    public boolean hasImMaxQueueSize() {
        return this.imMaxQueueSize != null;
    }

    /**
    * Maximum size of the queue with IM-type requests
    */
    public SQ_AddQueueRequest setImMaxQueueSize(long d) {
        this.imMaxQueueSize = Long.valueOf(d);
        return this;
    }

    private Long priority;

    @RequestField(name="priority")
    /**
    * The queue's priority from 1 to 100
    */
    public Long getPriority() {
        return this.priority;
    }

    public boolean hasPriority() {
        return this.priority != null;
    }

    /**
    * The queue's priority from 1 to 100
    */
    public SQ_AddQueueRequest setPriority(long d) {
        this.priority = Long.valueOf(d);
        return this;
    }

    private Long callMaxWaitingTimeInSeconds;

    @RequestField(name="call_max_waiting_time_in_seconds")
    /**
    * Maximum call waiting time in seconds. Specify either this parameter
    * or `call_max_waiting_time`. Specifying both parameters simultaniously
    * leads to an error
    */
    public Long getCallMaxWaitingTimeInSeconds() {
        return this.callMaxWaitingTimeInSeconds;
    }

    public boolean hasCallMaxWaitingTimeInSeconds() {
        return this.callMaxWaitingTimeInSeconds != null;
    }

    /**
    * Maximum call waiting time in seconds. Specify either this parameter
    * or `call_max_waiting_time`. Specifying both parameters simultaniously
    * leads to an error
    */
    public SQ_AddQueueRequest setCallMaxWaitingTimeInSeconds(long d) {
        this.callMaxWaitingTimeInSeconds = Long.valueOf(d);
        return this;
    }

    private Long imMaxWaitingTimeInSeconds;

    @RequestField(name="im_max_waiting_time_in_seconds")
    /**
    * Maximum chat message waiting time in seconds. Specify either this
    * parameter or `im_max_waiting_time`. Specifying both parameters
    * simultaniously leads to an error
    */
    public Long getImMaxWaitingTimeInSeconds() {
        return this.imMaxWaitingTimeInSeconds;
    }

    public boolean hasImMaxWaitingTimeInSeconds() {
        return this.imMaxWaitingTimeInSeconds != null;
    }

    /**
    * Maximum chat message waiting time in seconds. Specify either this
    * parameter or `im_max_waiting_time`. Specifying both parameters
    * simultaniously leads to an error
    */
    public SQ_AddQueueRequest setImMaxWaitingTimeInSeconds(long d) {
        this.imMaxWaitingTimeInSeconds = Long.valueOf(d);
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
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
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
        if (sqQueueName != null) {
            sb.append(aligned)
                .append("\"sqQueueName\": \"")
                .append(sqQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callAgentSelection != null) {
            sb.append(aligned)
                .append("\"callAgentSelection\": \"")
                .append(callAgentSelection)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (imAgentSelection != null) {
            sb.append(aligned)
                .append("\"imAgentSelection\": \"")
                .append(imAgentSelection)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callTaskSelection != null) {
            sb.append(aligned)
                .append("\"callTaskSelection\": \"")
                .append(callTaskSelection)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (imTaskSelection != null) {
            sb.append(aligned)
                .append("\"imTaskSelection\": \"")
                .append(imTaskSelection)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fallbackAgentSelection != null) {
            sb.append(aligned)
                .append("\"fallbackAgentSelection\": \"")
                .append(fallbackAgentSelection)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (description != null) {
            sb.append(aligned)
                .append("\"description\": \"")
                .append(description)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callMaxWaitingTime != null) {
            sb.append(aligned)
                .append("\"callMaxWaitingTime\": \"")
                .append(callMaxWaitingTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (imMaxWaitingTime != null) {
            sb.append(aligned)
                .append("\"imMaxWaitingTime\": \"")
                .append(imMaxWaitingTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callMaxQueueSize != null) {
            sb.append(aligned)
                .append("\"callMaxQueueSize\": \"")
                .append(callMaxQueueSize)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (imMaxQueueSize != null) {
            sb.append(aligned)
                .append("\"imMaxQueueSize\": \"")
                .append(imMaxQueueSize)
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
        if (callMaxWaitingTimeInSeconds != null) {
            sb.append(aligned)
                .append("\"callMaxWaitingTimeInSeconds\": \"")
                .append(callMaxWaitingTimeInSeconds)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (imMaxWaitingTimeInSeconds != null) {
            sb.append(aligned)
                .append("\"imMaxWaitingTimeInSeconds\": \"")
                .append(imMaxWaitingTimeInSeconds)
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