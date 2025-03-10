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
* Detailing job telephone calls.
*/
public class CallListDetailType implements Alignable {

    private Long listId;

    /**
    * The list ID
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    private String customData;

    /**
    * Data for transmission to the script
    */
    public String getCustomData() {
        return this.customData;
    }

    public boolean hasCustomData() {
        return this.customData != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date startExecutionTime;

    /**
    * Time with which to start the job in 24-h format: HH:mm:ss
    */
    public Date getStartExecutionTime() {
        return this.startExecutionTime;
    }

    public boolean hasStartExecutionTime() {
        return this.startExecutionTime != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date finishExecutionTime;

    /**
    * Time after which the task cannot be performed in 24-h format: HH:mm:ss
    */
    public Date getFinishExecutionTime() {
        return this.finishExecutionTime;
    }

    public boolean hasFinishExecutionTime() {
        return this.finishExecutionTime != null;
    }

    private String resultData;

    /**
    * Results of the task, if it is granted, or information about the
    * runtime error
    */
    public String getResultData() {
        return this.resultData;
    }

    public boolean hasResultData() {
        return this.resultData != null;
    }

    private String lastAttempt;

    /**
    * Date and time of the last attempt to perform a task
    */
    public String getLastAttempt() {
        return this.lastAttempt;
    }

    public boolean hasLastAttempt() {
        return this.lastAttempt != null;
    }

    private Long attemptsLeft;

    /**
    * Number of remaining attempts
    */
    public Long getAttemptsLeft() {
        return this.attemptsLeft;
    }

    public boolean hasAttemptsLeft() {
        return this.attemptsLeft != null;
    }

    private Long statusId;

    /**
    * The status ID. The possible values are __0__ (status = New), __1__
    * (status = In progress), __2__ (status = Processed), __3__ (status =
    * Error), __4__ (status = Canceled)
    */
    public Long getStatusId() {
        return this.statusId;
    }

    public boolean hasStatusId() {
        return this.statusId != null;
    }

    private String status;

    /**
    * The status name. The possible values are __New__ (status_id = 0),
    * __In progress__ (status_id = 1), __Processed__ (status_id = 2),
    * __Error__ (status_id = 3), __Canceled__ (status_id = 4)
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    private Long taskId;

    /**
    * The call list task ID
    */
    public Long getTaskId() {
        return this.taskId;
    }

    public boolean hasTaskId() {
        return this.taskId != null;
    }

    private String taskUuid;

    /**
    * The call list task UUID
    */
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public boolean hasTaskUuid() {
        return this.taskUuid != null;
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
        if (customData != null) {
            sb.append(aligned)
                .append("\"customData\": \"")
                .append(customData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (startExecutionTime != null) {
            sb.append(aligned)
                .append("\"startExecutionTime\": \"")
                .append(startExecutionTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (finishExecutionTime != null) {
            sb.append(aligned)
                .append("\"finishExecutionTime\": \"")
                .append(finishExecutionTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (resultData != null) {
            sb.append(aligned)
                .append("\"resultData\": \"")
                .append(resultData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lastAttempt != null) {
            sb.append(aligned)
                .append("\"lastAttempt\": \"")
                .append(lastAttempt)
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
        if (statusId != null) {
            sb.append(aligned)
                .append("\"statusId\": \"")
                .append(statusId)
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
        if (taskId != null) {
            sb.append(aligned)
                .append("\"taskId\": \"")
                .append(taskId)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}