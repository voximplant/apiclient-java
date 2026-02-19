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

public class EditCallListTasksPriorityRequest implements Alignable {
    private Long listId;

    @RequestField(name="list_id")
    /**
    * Call list ID. If the ID does not exist, the 251 error returns.
    */
    public Long getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * Call list ID. If the ID does not exist, the 251 error returns.
    */
    public EditCallListTasksPriorityRequest setListId(long d) {
        this.listId = Long.valueOf(d);
        return this;
    }

    private String tasks;

    @RequestField(name="tasks")
    /**
    * JSON-encoded array of task objects. Each object should contain either
    * 'task_id' (number) or 'task_uuid' (string), and 'task_priority'
    * (number).
    */
    public String getTasks() {
        return this.tasks;
    }

    public boolean hasTasks() {
        return this.tasks != null;
    }

    /**
    * JSON-encoded array of task objects. Each object should contain either
    * 'task_id' (number) or 'task_uuid' (string), and 'task_priority'
    * (number).
    */
    public EditCallListTasksPriorityRequest setTasks(String d) {
        this.tasks = d;
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
        if (tasks != null) {
            sb.append(aligned)
                .append("\"tasks\": \"")
                .append(tasks)
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