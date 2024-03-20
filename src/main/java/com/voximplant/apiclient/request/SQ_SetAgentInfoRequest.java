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

public class SQ_SetAgentInfoRequest implements Alignable {
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
    public SQ_SetAgentInfoRequest setApplicationId(long d) {
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
    public SQ_SetAgentInfoRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * List of user IDs separated by semicolons (;). Use 'all' to select all
    * the users
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * List of user IDs separated by semicolons (;). Use 'all' to select all
    * the users
    */
    public SQ_SetAgentInfoRequest setUserId(MultiArgument<Long> d) {
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
    public SQ_SetAgentInfoRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private Long maxSimultaneousConversations;

    @RequestField(name="max_simultaneous_conversations")
    /**
    * Maximum number of chats that the user processes simultaneously
    */
    public Long getMaxSimultaneousConversations() {
        return this.maxSimultaneousConversations;
    }

    public boolean hasMaxSimultaneousConversations() {
        return this.maxSimultaneousConversations != null;
    }

    /**
    * Maximum number of chats that the user processes simultaneously
    */
    public SQ_SetAgentInfoRequest setMaxSimultaneousConversations(long d) {
        this.maxSimultaneousConversations = Long.valueOf(d);
        return this;
    }

    private Boolean handleCalls;

    @RequestField(name="handle_calls")
    /**
    * The agent can handle calls. When set to false, the agent is excluded
    * from the CALL-request distribution
    */
    public Boolean getHandleCalls() {
        return this.handleCalls;
    }

    public boolean hasHandleCalls() {
        return this.handleCalls != null;
    }

    /**
    * The agent can handle calls. When set to false, the agent is excluded
    * from the CALL-request distribution
    */
    public SQ_SetAgentInfoRequest setHandleCalls(boolean d) {
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
        if (maxSimultaneousConversations != null) {
            sb.append(aligned)
                .append("\"maxSimultaneousConversations\": \"")
                .append(maxSimultaneousConversations)
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