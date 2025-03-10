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
* The [SQ_GetAgents] function result.
*/
public class GetSQAgentsResult implements Alignable {

    private Long userId;

    /**
    * ID of the user
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * Name of the user
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * Display name of the user
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    private Long maxSimultaneousConversations;

    /**
    * Maximum number of chats that the user processes simultaneously
    */
    public Long getMaxSimultaneousConversations() {
        return this.maxSimultaneousConversations;
    }

    public boolean hasMaxSimultaneousConversations() {
        return this.maxSimultaneousConversations != null;
    }

    private SmartQueueState_Agent_Status[] sqStatuses;

    /**
    * Agent statuses info
    */
    public SmartQueueState_Agent_Status[] getSqStatuses() {
        return this.sqStatuses;
    }

    public boolean hasSqStatuses() {
        return this.sqStatuses != null;
    }

    private Object sqQueues;

    /**
    * JSON array of the agent's queues
    */
    public Object getSqQueues() {
        return this.sqQueues;
    }

    public boolean hasSqQueues() {
        return this.sqQueues != null;
    }

    private Object sqSkills;

    /**
    * JSON array of the agent's skills
    */
    public Object getSqSkills() {
        return this.sqSkills;
    }

    public boolean hasSqSkills() {
        return this.sqSkills != null;
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
        if (userDisplayName != null) {
            sb.append(aligned)
                .append("\"userDisplayName\": \"")
                .append(userDisplayName)
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
        if (sqStatuses != null) {
            sb.append(aligned)
                .append("\"SmartQueueState_Agent_Status\": ")
                .append(StringHelper.arrayToString(sqStatuses, alignment + 1))
                .append(System.lineSeparator());
        }
        if (sqQueues != null) {
            sb.append(aligned)
                .append("\"sqQueues\": \"")
                .append(sqQueues)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}