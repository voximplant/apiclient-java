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

public class SQ_BindAgentRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * Application ID to search by. <b>Required</b> unless
    * <b>application_name</b> is provided.
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * Application ID to search by. <b>Required</b> unless
    * <b>application_name</b> is provided.
    */
    public SQ_BindAgentRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Application name to search by. <b>Required</b> unless
    * <b>application_id</b> is provided.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Application name to search by. <b>Required</b> unless
    * <b>application_id</b> is provided.
    */
    public SQ_BindAgentRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> sqQueueId;

    @RequestField(name="sq_queue_id")
    /**
    * List of SmartQueue IDs separated by semicolons (;). Use 'all' to
    * select all the queues. <b>Required</b> unless <b>sq_queue_name</b> is
    * provided.
    */
    public MultiArgument<Long> getSqQueueId() {
        return this.sqQueueId;
    }

    public boolean hasSqQueueId() {
        return this.sqQueueId != null;
    }

    /**
    * List of SmartQueue IDs separated by semicolons (;). Use 'all' to
    * select all the queues. <b>Required</b> unless <b>sq_queue_name</b> is
    * provided.
    */
    public SQ_BindAgentRequest setSqQueueId(MultiArgument<Long> d) {
        this.sqQueueId = d;
        return this;
    }

    private MultiArgument<String> sqQueueName;

    @RequestField(name="sq_queue_name")
    /**
    * List of SmartQueue names separated by semicolons (;). <b>Required</b>
    * unless <b>sq_queue_id</b> is provided.
    */
    public MultiArgument<String> getSqQueueName() {
        return this.sqQueueName;
    }

    public boolean hasSqQueueName() {
        return this.sqQueueName != null;
    }

    /**
    * List of SmartQueue names separated by semicolons (;). <b>Required</b>
    * unless <b>sq_queue_id</b> is provided.
    */
    public SQ_BindAgentRequest setSqQueueName(MultiArgument<String> d) {
        this.sqQueueName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * List of user IDs separated by semicolons (;). Use 'all' to select all
    * the users. <b>Required</b> unless <b>user_name</b> is provided.
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * List of user IDs separated by semicolons (;). Use 'all' to select all
    * the users. <b>Required</b> unless <b>user_name</b> is provided.
    */
    public SQ_BindAgentRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * List of user names separated by semicolons (;). <b>Required</b>
    * unless <b>user_id</b> is provided.
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * List of user names separated by semicolons (;). <b>Required</b>
    * unless <b>user_id</b> is provided.
    */
    public SQ_BindAgentRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private String bindMode;

    @RequestField(name="bind_mode")
    /**
    * Binding mode. Accepts one of the [SQAgentBindingModes] enum values
    */
    public String getBindMode() {
        return this.bindMode;
    }

    public boolean hasBindMode() {
        return this.bindMode != null;
    }

    /**
    * Binding mode. Accepts one of the [SQAgentBindingModes] enum values
    */
    public SQ_BindAgentRequest setBindMode(String d) {
        this.bindMode = d;
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
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bindMode != null) {
            sb.append(aligned)
                .append("\"bindMode\": \"")
                .append(bindMode)
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