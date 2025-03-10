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

public class SQ_GetQueuesRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * ID of the application to search by
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * ID of the application to search by
    */
    public SQ_GetQueuesRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * Name of the application to search by. Can be used instead of
    * <b>application_id</b>
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * Name of the application to search by. Can be used instead of
    * <b>application_id</b>
    */
    public SQ_GetQueuesRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> sqQueueId;

    @RequestField(name="sq_queue_id")
    /**
    * List of SmartQueue IDs separated by semicolons (;)
    */
    public MultiArgument<Long> getSqQueueId() {
        return this.sqQueueId;
    }

    public boolean hasSqQueueId() {
        return this.sqQueueId != null;
    }

    /**
    * List of SmartQueue IDs separated by semicolons (;)
    */
    public SQ_GetQueuesRequest setSqQueueId(MultiArgument<Long> d) {
        this.sqQueueId = d;
        return this;
    }

    private MultiArgument<String> sqQueueName;

    @RequestField(name="sq_queue_name")
    /**
    * List of SmartQueue names separated by semicolons (;). Can be used
    * instead of <b>sq_queue_id</b>
    */
    public MultiArgument<String> getSqQueueName() {
        return this.sqQueueName;
    }

    public boolean hasSqQueueName() {
        return this.sqQueueName != null;
    }

    /**
    * List of SmartQueue names separated by semicolons (;). Can be used
    * instead of <b>sq_queue_id</b>
    */
    public SQ_GetQueuesRequest setSqQueueName(MultiArgument<String> d) {
        this.sqQueueName = d;
        return this;
    }

    private String sqQueueNameTemplate;

    @RequestField(name="sq_queue_name_template")
    /**
    * Substring of the SmartQueue name to filter
    */
    public String getSqQueueNameTemplate() {
        return this.sqQueueNameTemplate;
    }

    public boolean hasSqQueueNameTemplate() {
        return this.sqQueueNameTemplate != null;
    }

    /**
    * Substring of the SmartQueue name to filter
    */
    public SQ_GetQueuesRequest setSqQueueNameTemplate(String d) {
        this.sqQueueNameTemplate = d;
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * ID of the user that is bound to the queue
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * ID of the user that is bound to the queue
    */
    public SQ_GetQueuesRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * Name of the user that is bound to the queue. Can be used instead of
    * <b>user_id</b>
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * Name of the user that is bound to the queue. Can be used instead of
    * <b>user_id</b>
    */
    public SQ_GetQueuesRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Long excludedUserId;

    @RequestField(name="excluded_user_id")
    /**
    * ID of the user that is not bound to the queue
    */
    public Long getExcludedUserId() {
        return this.excludedUserId;
    }

    public boolean hasExcludedUserId() {
        return this.excludedUserId != null;
    }

    /**
    * ID of the user that is not bound to the queue
    */
    public SQ_GetQueuesRequest setExcludedUserId(long d) {
        this.excludedUserId = Long.valueOf(d);
        return this;
    }

    private String excludedUserName;

    @RequestField(name="excluded_user_name")
    /**
    * Name of the user that is not bound to the queue. Can be used instead
    * of <b>excluded_user_id</b>
    */
    public String getExcludedUserName() {
        return this.excludedUserName;
    }

    public boolean hasExcludedUserName() {
        return this.excludedUserName != null;
    }

    /**
    * Name of the user that is not bound to the queue. Can be used instead
    * of <b>excluded_user_id</b>
    */
    public SQ_GetQueuesRequest setExcludedUserName(String d) {
        this.excludedUserName = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * Number of items to show in the output
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * Number of items to show in the output
    */
    public SQ_GetQueuesRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * Number of items to skip in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * Number of items to skip in the output
    */
    public SQ_GetQueuesRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private Boolean withAgentcount;

    @RequestField(name="with_agentcount")
    /**
    * Whether to include the number of agents bound to the queue
    */
    public Boolean getWithAgentcount() {
        return this.withAgentcount;
    }

    public boolean hasWithAgentcount() {
        return this.withAgentcount != null;
    }

    /**
    * Whether to include the number of agents bound to the queue
    */
    public SQ_GetQueuesRequest setWithAgentcount(boolean d) {
        this.withAgentcount = Boolean.valueOf(d);
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
        if (sqQueueNameTemplate != null) {
            sb.append(aligned)
                .append("\"sqQueueNameTemplate\": \"")
                .append(sqQueueNameTemplate)
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
        if (excludedUserId != null) {
            sb.append(aligned)
                .append("\"excludedUserId\": \"")
                .append(excludedUserId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (excludedUserName != null) {
            sb.append(aligned)
                .append("\"excludedUserName\": \"")
                .append(excludedUserName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (offset != null) {
            sb.append(aligned)
                .append("\"offset\": \"")
                .append(offset)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withAgentcount != null) {
            sb.append(aligned)
                .append("\"withAgentcount\": \"")
                .append(withAgentcount)
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