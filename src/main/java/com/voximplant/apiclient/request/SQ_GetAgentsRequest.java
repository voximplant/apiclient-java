package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
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

public class SQ_GetAgentsRequest implements Alignable {
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
    public SQ_GetAgentsRequest setApplicationId(long d) {
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
    public SQ_GetAgentsRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> sqQueueId;

    @RequestField(name="sq_queue_id")
    /**
    * List of SmartQueue IDs separated by semicolons (;). Use 'all' to
    * select all the queues
    */
    public MultiArgument<Long> getSqQueueId() {
        return this.sqQueueId;
    }

    public boolean hasSqQueueId() {
        return this.sqQueueId != null;
    }

    /**
    * List of SmartQueue IDs separated by semicolons (;). Use 'all' to
    * select all the queues
    */
    public SQ_GetAgentsRequest setSqQueueId(MultiArgument<Long> d) {
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
    public SQ_GetAgentsRequest setSqQueueName(MultiArgument<String> d) {
        this.sqQueueName = d;
        return this;
    }

    private Long excludedSqQueueId;

    @RequestField(name="excluded_sq_queue_id")
    /**
    * ID of the SmartQueue to exclude
    */
    public Long getExcludedSqQueueId() {
        return this.excludedSqQueueId;
    }

    public boolean hasExcludedSqQueueId() {
        return this.excludedSqQueueId != null;
    }

    /**
    * ID of the SmartQueue to exclude
    */
    public SQ_GetAgentsRequest setExcludedSqQueueId(long d) {
        this.excludedSqQueueId = Long.valueOf(d);
        return this;
    }

    private String excludedSqQueueName;

    @RequestField(name="excluded_sq_queue_name")
    /**
    * Name of the SmartQueue to exclude. Can be used instead of
    * <b>excluded_sq_queue_id</b>
    */
    public String getExcludedSqQueueName() {
        return this.excludedSqQueueName;
    }

    public boolean hasExcludedSqQueueName() {
        return this.excludedSqQueueName != null;
    }

    /**
    * Name of the SmartQueue to exclude. Can be used instead of
    * <b>excluded_sq_queue_id</b>
    */
    public SQ_GetAgentsRequest setExcludedSqQueueName(String d) {
        this.excludedSqQueueName = d;
        return this;
    }

    private Object sqSkills;

    @RequestField(name="sq_skills")
    /**
    * Skills to filter in the json array format. The array should contain
    * objects with the <b>sq_skill_id</b>/<b>sq_skill_name</b>,
    * <b>min_sq_skill_level</b>, and <b>max_sq_skill_level</b> keys where
    * skill levels range from 1 to 5
    */
    public Object getSqSkills() {
        return this.sqSkills;
    }

    public boolean hasSqSkills() {
        return this.sqSkills != null;
    }

    /**
    * Skills to filter in the json array format. The array should contain
    * objects with the <b>sq_skill_id</b>/<b>sq_skill_name</b>,
    * <b>min_sq_skill_level</b>, and <b>max_sq_skill_level</b> keys where
    * skill levels range from 1 to 5
    */
    public SQ_GetAgentsRequest setSqSkills(Object d) {
        this.sqSkills = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * List of user IDs separated by semicolons (;)
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * List of user IDs separated by semicolons (;)
    */
    public SQ_GetAgentsRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * List of user names separated by semicolons (;). Can be used instead
    * of <b>user_id</b>
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * List of user names separated by semicolons (;). Can be used instead
    * of <b>user_id</b>
    */
    public SQ_GetAgentsRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private String userNameTemplate;

    @RequestField(name="user_name_template")
    /**
    * Substring of the user name to filter
    */
    public String getUserNameTemplate() {
        return this.userNameTemplate;
    }

    public boolean hasUserNameTemplate() {
        return this.userNameTemplate != null;
    }

    /**
    * Substring of the user name to filter
    */
    public SQ_GetAgentsRequest setUserNameTemplate(String d) {
        this.userNameTemplate = d;
        return this;
    }

    private Object sqStatuses;

    @RequestField(name="sq_statuses")
    /**
    * Filter statuses in the json array format. The array should contain
    * objects with the <b>sq_status_type</b> and <b>sq_status_name</b>
    * keys. Possible values for <b>sq_status_type</b> are 'CALL' and'IM'.
    * Possible values for <b>sq_status_name</b> are 'OFFLINE', 'ONLINE',
    * 'READY', 'IN_SERVICE', 'AFTER_SERVICE', 'DND'
    */
    public Object getSqStatuses() {
        return this.sqStatuses;
    }

    public boolean hasSqStatuses() {
        return this.sqStatuses != null;
    }

    /**
    * Filter statuses in the json array format. The array should contain
    * objects with the <b>sq_status_type</b> and <b>sq_status_name</b>
    * keys. Possible values for <b>sq_status_type</b> are 'CALL' and'IM'.
    * Possible values for <b>sq_status_name</b> are 'OFFLINE', 'ONLINE',
    * 'READY', 'IN_SERVICE', 'AFTER_SERVICE', 'DND'
    */
    public SQ_GetAgentsRequest setSqStatuses(Object d) {
        this.sqStatuses = d;
        return this;
    }

    private Boolean withSqSkills;

    @RequestField(name="with_sq_skills")
    /**
    * Whether to display agent skills
    */
    public Boolean getWithSqSkills() {
        return this.withSqSkills;
    }

    public boolean hasWithSqSkills() {
        return this.withSqSkills != null;
    }

    /**
    * Whether to display agent skills
    */
    public SQ_GetAgentsRequest setWithSqSkills(boolean d) {
        this.withSqSkills = Boolean.valueOf(d);
        return this;
    }

    private Boolean withSqQueues;

    @RequestField(name="with_sq_queues")
    /**
    * Whether to display agent queues
    */
    public Boolean getWithSqQueues() {
        return this.withSqQueues;
    }

    public boolean hasWithSqQueues() {
        return this.withSqQueues != null;
    }

    /**
    * Whether to display agent queues
    */
    public SQ_GetAgentsRequest setWithSqQueues(boolean d) {
        this.withSqQueues = Boolean.valueOf(d);
        return this;
    }

    private Boolean withSqStatuses;

    @RequestField(name="with_sq_statuses")
    /**
    * Whether to display agent current statuses
    */
    public Boolean getWithSqStatuses() {
        return this.withSqStatuses;
    }

    public boolean hasWithSqStatuses() {
        return this.withSqStatuses != null;
    }

    /**
    * Whether to display agent current statuses
    */
    public SQ_GetAgentsRequest setWithSqStatuses(boolean d) {
        this.withSqStatuses = Boolean.valueOf(d);
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
    public SQ_GetAgentsRequest setCount(long d) {
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
    public SQ_GetAgentsRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private Boolean handleCalls;

    @RequestField(name="handle_calls")
    /**
    * Whether the agent can handle calls. When set to false, the agent is
    * excluded from the CALL-request distribution
    */
    public Boolean getHandleCalls() {
        return this.handleCalls;
    }

    public boolean hasHandleCalls() {
        return this.handleCalls != null;
    }

    /**
    * Whether the agent can handle calls. When set to false, the agent is
    * excluded from the CALL-request distribution
    */
    public SQ_GetAgentsRequest setHandleCalls(boolean d) {
        this.handleCalls = Boolean.valueOf(d);
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
        if (excludedSqQueueId != null) {
            sb.append(aligned)
                .append("\"excludedSqQueueId\": \"")
                .append(excludedSqQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (excludedSqQueueName != null) {
            sb.append(aligned)
                .append("\"excludedSqQueueName\": \"")
                .append(excludedSqQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sqSkills != null) {
            sb.append(aligned)
                .append("\"sqSkills\": \"")
                .append(sqSkills)
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
        if (userNameTemplate != null) {
            sb.append(aligned)
                .append("\"userNameTemplate\": \"")
                .append(userNameTemplate)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sqStatuses != null) {
            sb.append(aligned)
                .append("\"sqStatuses\": \"")
                .append(sqStatuses)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withSqSkills != null) {
            sb.append(aligned)
                .append("\"withSqSkills\": \"")
                .append(withSqSkills)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withSqQueues != null) {
            sb.append(aligned)
                .append("\"withSqQueues\": \"")
                .append(withSqQueues)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withSqStatuses != null) {
            sb.append(aligned)
                .append("\"withSqStatuses\": \"")
                .append(withSqStatuses)
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
        if (handleCalls != null) {
            sb.append(aligned)
                .append("\"handleCalls\": \"")
                .append(handleCalls)
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