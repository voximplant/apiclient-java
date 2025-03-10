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

public class CancelCallListTaskRequest implements Alignable {
    private String accountId;

    @RequestField(name="account_id")
    /**
    * Account's ID
    */
    public String getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    /**
    * Account's ID
    */
    public CancelCallListTaskRequest setAccountId(String d) {
        this.accountId = d;
        return this;
    }

    private String listId;

    @RequestField(name="list_id")
    /**
    * Call list's ID
    */
    public String getListId() {
        return this.listId;
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    /**
    * Call list's ID
    */
    public CancelCallListTaskRequest setListId(String d) {
        this.listId = d;
        return this;
    }

    private String tasksIds;

    @RequestField(name="tasks_ids")
    /**
    * Task IDs separated by a semicolon. Specify either `tasks_ids` or
    * `tasks_uuids`. The method returns an error if none of the parameters
    * is specified
    */
    public String getTasksIds() {
        return this.tasksIds;
    }

    public boolean hasTasksIds() {
        return this.tasksIds != null;
    }

    /**
    * Task IDs separated by a semicolon. Specify either `tasks_ids` or
    * `tasks_uuids`. The method returns an error if none of the parameters
    * is specified
    */
    public CancelCallListTaskRequest setTasksIds(String d) {
        this.tasksIds = d;
        return this;
    }

    private String tasksUuids;

    @RequestField(name="tasks_uuids")
    /**
    * Task UUIDs separated by a semicolon. Specify either `tasks_ids` or
    * `tasks_uuids`. The method returns an error if none of the parameters
    * is specified
    */
    public String getTasksUuids() {
        return this.tasksUuids;
    }

    public boolean hasTasksUuids() {
        return this.tasksUuids != null;
    }

    /**
    * Task UUIDs separated by a semicolon. Specify either `tasks_ids` or
    * `tasks_uuids`. The method returns an error if none of the parameters
    * is specified
    */
    public CancelCallListTaskRequest setTasksUuids(String d) {
        this.tasksUuids = d;
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
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (listId != null) {
            sb.append(aligned)
                .append("\"listId\": \"")
                .append(listId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (tasksIds != null) {
            sb.append(aligned)
                .append("\"tasksIds\": \"")
                .append(tasksIds)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (tasksUuids != null) {
            sb.append(aligned)
                .append("\"tasksUuids\": \"")
                .append(tasksUuids)
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