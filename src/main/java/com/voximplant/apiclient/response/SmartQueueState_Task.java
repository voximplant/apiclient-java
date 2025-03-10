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
* SmartQueueState.tasks item.
*/
public class SmartQueueState_Task implements Alignable {

    private String taskType;

    /**
    * The task type. Possible values are CALL, IM
    */
    public String getTaskType() {
        return this.taskType;
    }

    public boolean hasTaskType() {
        return this.taskType != null;
    }

    private String status;

    /**
    * The task status. Possible values are IN_QUEUE, DISTRIBUTED,
    * IN_PROCESSING
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    private Long userId;

    /**
    * Selected agent
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private SmartQueueTask_Skill[] sqSkills;

    /**
    * Task skills
    */
    public SmartQueueTask_Skill[] getSqSkills() {
        return this.sqSkills;
    }

    public boolean hasSqSkills() {
        return this.sqSkills != null;
    }

    private Long waitingTime;

    /**
    * Waiting time in ms
    */
    public Long getWaitingTime() {
        return this.waitingTime;
    }

    public boolean hasWaitingTime() {
        return this.waitingTime != null;
    }

    private Long processingTime;

    /**
    * Processing time in ms
    */
    public Long getProcessingTime() {
        return this.processingTime;
    }

    public boolean hasProcessingTime() {
        return this.processingTime != null;
    }

    private Object customData;

    /**
    * Custom data text string for the current task. You can set the custom
    * data in the
    * [enqueueTask](/docs/references/voxengine/voxengine/enqueuetask#enqueuetask)
    * method
    */
    public Object getCustomData() {
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
        if (taskType != null) {
            sb.append(aligned)
                .append("\"taskType\": \"")
                .append(taskType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
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
        if (sqSkills != null) {
            sb.append(aligned)
                .append("\"SmartQueueTask_Skill\": ")
                .append(StringHelper.arrayToString(sqSkills, alignment + 1))
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
        if (processingTime != null) {
            sb.append(aligned)
                .append("\"processingTime\": \"")
                .append(processingTime)
                .append('"')
                .append(',')
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