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

public class EditCallListTaskRequest implements Alignable {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * Call list's ID
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * Call list's ID
    */
    public EditCallListTaskRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

    private Long taskId;

    @RequestField(name="task_id")
    /**
    * Call list's task ID. Please specify either the task's ID or the
    * task's UUID to edit the task
    */
    public Long getTaskId() {
        return this.taskId;
    }

    public boolean hasTaskId() {
        return this.taskId != null;
    }

    /**
    * Call list's task ID. Please specify either the task's ID or the
    * task's UUID to edit the task
    */
    public EditCallListTaskRequest setTaskId(long d) {
        this.taskId = Long.valueOf(d);
        return this;
    }

    private String callSchedule;

    @RequestField(name="call_schedule")
    /**
    * Call list schedule in the JSON format. Refer to the <a
    * href="/docs/guides/solutions/call-lists">Call lists guide</a> for
    * more information.
    */
    public String getCallSchedule() {
        return this.callSchedule;
    }

    public boolean hasCallSchedule() {
        return this.callSchedule != null;
    }

    /**
    * Call list schedule in the JSON format. Refer to the <a
    * href="/docs/guides/solutions/call-lists">Call lists guide</a> for
    * more information.
    */
    public EditCallListTaskRequest setCallSchedule(String d) {
        this.callSchedule = d;
        return this;
    }

    private String taskUuid;

    @RequestField(name="task_uuid")
    /**
    * Call list's task ID. Please specify either the task's ID or the
    * task's UUID to edit the task. The UUID is unique within the call list
    */
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public boolean hasTaskUuid() {
        return this.taskUuid != null;
    }

    /**
    * Call list's task ID. Please specify either the task's ID or the
    * task's UUID to edit the task. The UUID is unique within the call list
    */
    public EditCallListTaskRequest setTaskUuid(String d) {
        this.taskUuid = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date startAt;

    @RequestField(name="start_at")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Next calling attempts timestamp in the yyyy-MM-dd HH:mm:ss format
    */
    public Date getStartAt() {
        return this.startAt;
    }

    public boolean hasStartAt() {
        return this.startAt != null;
    }

    /**
    * Next calling attempts timestamp in the yyyy-MM-dd HH:mm:ss format
    */
    public EditCallListTaskRequest setStartAt(Date d) {
        this.startAt = d;
        return this;
    }

    private Long attemptsLeft;

    @RequestField(name="attempts_left")
    /**
    * Number of remaining calling attempts
    */
    public Long getAttemptsLeft() {
        return this.attemptsLeft;
    }

    public boolean hasAttemptsLeft() {
        return this.attemptsLeft != null;
    }

    /**
    * Number of remaining calling attempts
    */
    public EditCallListTaskRequest setAttemptsLeft(long d) {
        this.attemptsLeft = Long.valueOf(d);
        return this;
    }

    private String customData;

    @RequestField(name="custom_data")
    /**
    * Custom data string
    */
    public String getCustomData() {
        return this.customData;
    }

    public boolean hasCustomData() {
        return this.customData != null;
    }

    /**
    * Custom data string
    */
    public EditCallListTaskRequest setCustomData(String d) {
        this.customData = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date minExecutionTime;

    @RequestField(name="min_execution_time")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Optional. Start time for the daily calling attempts in the UTC+0 24-h
    * format: HH:mm:ss format. If spefied, please specify
    * `max_execution_time` as well
    */
    public Date getMinExecutionTime() {
        return this.minExecutionTime;
    }

    public boolean hasMinExecutionTime() {
        return this.minExecutionTime != null;
    }

    /**
    * Optional. Start time for the daily calling attempts in the UTC+0 24-h
    * format: HH:mm:ss format. If spefied, please specify
    * `max_execution_time` as well
    */
    public EditCallListTaskRequest setMinExecutionTime(Date d) {
        this.minExecutionTime = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date maxExecutionTime;

    @RequestField(name="max_execution_time")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Optional. End time for the daily calling attempts in the UTC+0 24-h
    * format: HH:mm:ss format. If spefied, please specify
    * `min_execution_time` as well
    */
    public Date getMaxExecutionTime() {
        return this.maxExecutionTime;
    }

    public boolean hasMaxExecutionTime() {
        return this.maxExecutionTime != null;
    }

    /**
    * Optional. End time for the daily calling attempts in the UTC+0 24-h
    * format: HH:mm:ss format. If spefied, please specify
    * `min_execution_time` as well
    */
    public EditCallListTaskRequest setMaxExecutionTime(Date d) {
        this.maxExecutionTime = d;
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
        if (taskId != null) {
            sb.append(aligned)
                .append("\"taskId\": \"")
                .append(taskId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callSchedule != null) {
            sb.append(aligned)
                .append("\"callSchedule\": \"")
                .append(callSchedule)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (taskUuid != null) {
            sb.append(aligned)
                .append("\"taskUuid\": \"")
                .append(taskUuid)
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
        if (attemptsLeft != null) {
            sb.append(aligned)
                .append("\"attemptsLeft\": \"")
                .append(attemptsLeft)
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
        if (minExecutionTime != null) {
            sb.append(aligned)
                .append("\"minExecutionTime\": \"")
                .append(minExecutionTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (maxExecutionTime != null) {
            sb.append(aligned)
                .append("\"maxExecutionTime\": \"")
                .append(maxExecutionTime)
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