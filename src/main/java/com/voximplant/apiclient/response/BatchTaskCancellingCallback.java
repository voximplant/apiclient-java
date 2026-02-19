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
* Received when batch task cancelling has been completed
*/
public class BatchTaskCancellingCallback implements Alignable {

    private Long batchId;

    /**
    * Batch UUID of the cancelled tasks
    */
    public Long getBatchId() {
        return this.batchId;
    }

    public boolean hasBatchId() {
        return this.batchId != null;
    }

    private Long cancelledTasksNumber;

    /**
    * Number of cancelled tasks
    */
    public Long getCancelledTasksNumber() {
        return this.cancelledTasksNumber;
    }

    public boolean hasCancelledTasksNumber() {
        return this.cancelledTasksNumber != null;
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
        if (batchId != null) {
            sb.append(aligned)
                .append("\"batchId\": \"")
                .append(batchId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cancelledTasksNumber != null) {
            sb.append(aligned)
                .append("\"cancelledTasksNumber\": \"")
                .append(cancelledTasksNumber)
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