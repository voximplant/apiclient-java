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
* The [SQ_GetQueues] function result.
*/
public class GetSQQueuesResult implements Alignable {

    private Long sqQueueId;

    /**
    * ID of the smart queue
    */
    public Long getSqQueueId() {
        return this.sqQueueId;
    }

    public boolean hasSqQueueId() {
        return this.sqQueueId != null;
    }

    private String sqQueueName;

    /**
    * Name of the smart queue
    */
    public String getSqQueueName() {
        return this.sqQueueName;
    }

    public boolean hasSqQueueName() {
        return this.sqQueueName != null;
    }

    private String agentSelection;

    /**
    * Agent selection strategy
    */
    public String getAgentSelection() {
        return this.agentSelection;
    }

    public boolean hasAgentSelection() {
        return this.agentSelection != null;
    }

    private String fallbackAgentSelection;

    /**
    * Fallback for the agent selection strategy
    */
    public String getFallbackAgentSelection() {
        return this.fallbackAgentSelection;
    }

    public boolean hasFallbackAgentSelection() {
        return this.fallbackAgentSelection != null;
    }

    private String taskSelection;

    /**
    * Strategy of prioritizing requests for service
    */
    public String getTaskSelection() {
        return this.taskSelection;
    }

    public boolean hasTaskSelection() {
        return this.taskSelection != null;
    }

    private String description;

    /**
    * Comment
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * UTC date of the queue creation in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * UTC date of the queue modification in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
    }

    private Long callMaxWaitingTime;

    /**
    * Maximum time in minutes that a CALL-type request can remain in the
    * queue without being assigned to an agent
    */
    public Long getCallMaxWaitingTime() {
        return this.callMaxWaitingTime;
    }

    public boolean hasCallMaxWaitingTime() {
        return this.callMaxWaitingTime != null;
    }

    private Long imMaxWaitingTime;

    /**
    * Maximum time in minutes that an IM-type request can remain in the
    * queue without being assigned to an agent
    */
    public Long getImMaxWaitingTime() {
        return this.imMaxWaitingTime;
    }

    public boolean hasImMaxWaitingTime() {
        return this.imMaxWaitingTime != null;
    }

    private Long callMaxQueueSize;

    /**
    * Maximum size of the queue with CALL-type requests
    */
    public Long getCallMaxQueueSize() {
        return this.callMaxQueueSize;
    }

    public boolean hasCallMaxQueueSize() {
        return this.callMaxQueueSize != null;
    }

    private Long imMaxQueueSize;

    /**
    * Maximum size of the queue with IM-type requests
    */
    public Long getImMaxQueueSize() {
        return this.imMaxQueueSize;
    }

    public boolean hasImMaxQueueSize() {
        return this.imMaxQueueSize != null;
    }

    private Long agentcount;

    /**
    * Number of agents bound to the queue
    */
    public Long getAgentcount() {
        return this.agentcount;
    }

    public boolean hasAgentcount() {
        return this.agentcount != null;
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
        if (sqQueueId != null) {
            sb.append(aligned)
                .append("\"sqQueueId\": \"")
                .append(sqQueueId)
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
        if (agentSelection != null) {
            sb.append(aligned)
                .append("\"agentSelection\": \"")
                .append(agentSelection)
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
        if (taskSelection != null) {
            sb.append(aligned)
                .append("\"taskSelection\": \"")
                .append(taskSelection)
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
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
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
        if (agentcount != null) {
            sb.append(aligned)
                .append("\"agentcount\": \"")
                .append(agentcount)
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