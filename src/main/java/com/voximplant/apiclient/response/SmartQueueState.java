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
* The [GetSQState] function result.
*/
public class SmartQueueState implements Alignable {

    private Long sqQueueId;

    /**
    * The smart queue ID
    */
    public Long getSqQueueId() {
        return this.sqQueueId;
    }

    public boolean hasSqQueueId() {
        return this.sqQueueId != null;
    }

    private String sqQueueName;

    /**
    * The smart queue name
    */
    public String getSqQueueName() {
        return this.sqQueueName;
    }

    public boolean hasSqQueueName() {
        return this.sqQueueName != null;
    }

    private SmartQueueState_Agent[] sqAgents;

    /**
    * The list of logged-in agents with their skills and statuses
    */
    public SmartQueueState_Agent[] getSqAgents() {
        return this.sqAgents;
    }

    public boolean hasSqAgents() {
        return this.sqAgents != null;
    }

    private SmartQueueState_Task[] tasks;

    /**
    * The list of tasks
    */
    public SmartQueueState_Task[] getTasks() {
        return this.tasks;
    }

    public boolean hasTasks() {
        return this.tasks != null;
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
        if (sqAgents != null) {
            sb.append(aligned)
                .append("\"SmartQueueState_Agent\": ")
                .append(StringHelper.arrayToString(sqAgents, alignment + 1))
                .append(System.lineSeparator());
        }
        if (tasks != null) {
            sb.append(aligned)
                .append("\"SmartQueueState_Task\": ")
                .append(StringHelper.arrayToString(tasks, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}