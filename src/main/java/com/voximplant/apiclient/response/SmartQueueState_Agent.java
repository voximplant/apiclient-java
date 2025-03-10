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
* SmartQueueState.sq_agents item.
*/
public class SmartQueueState_Agent implements Alignable {

    private Long userId;

    /**
    * The user ID
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The user name
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * The display user name
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    private SmartQueueAgent_Skill[] sqSkills;

    /**
    * Agent skills
    */
    public SmartQueueAgent_Skill[] getSqSkills() {
        return this.sqSkills;
    }

    public boolean hasSqSkills() {
        return this.sqSkills != null;
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
        if (sqSkills != null) {
            sb.append(aligned)
                .append("\"SmartQueueAgent_Skill\": ")
                .append(StringHelper.arrayToString(sqSkills, alignment + 1))
                .append(System.lineSeparator());
        }
        if (sqStatuses != null) {
            sb.append(aligned)
                .append("\"SmartQueueState_Agent_Status\": ")
                .append(StringHelper.arrayToString(sqStatuses, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}