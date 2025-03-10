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

public class CancelCallListTaskResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long taskId;

    /**
    * Task's ID
    */
    public Long getTaskId() {
        return this.taskId;
    }

    public boolean hasTaskId() {
        return this.taskId != null;
    }

    private String taskUuid;

    /**
    * Task's UUID
    */
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public boolean hasTaskUuid() {
        return this.taskUuid != null;
    }

    private Boolean result;

    /**
    * Result of the operation
    */
    public Boolean getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private String errorMsg;

    /**
    * Reason for the error
    */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean hasErrorMsg() {
        return this.errorMsg != null;
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
        if (result != null) {
            sb.append(aligned)
                .append("\"result\": \"")
                .append(result)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (errorMsg != null) {
            sb.append(aligned)
                .append("\"errorMsg\": \"")
                .append(errorMsg)
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