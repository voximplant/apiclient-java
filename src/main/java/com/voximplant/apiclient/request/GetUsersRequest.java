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

public class GetUsersRequest implements Alignable {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID to filter
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID to filter
    */
    public GetUsersRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name part to filter
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name part to filter
    */
    public GetUsersRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long skillId;

    @RequestField(name="skill_id")
    /**
    * The skill ID to filter
    */
    public Long getSkillId() {
        return this.skillId;
    }

    public boolean hasSkillId() {
        return this.skillId != null;
    }

    /**
    * The skill ID to filter
    */
    public GetUsersRequest setSkillId(long d) {
        this.skillId = Long.valueOf(d);
        return this;
    }

    private Long excludedSkillId;

    @RequestField(name="excluded_skill_id")
    /**
    * The excluded skill ID to filter
    */
    public Long getExcludedSkillId() {
        return this.excludedSkillId;
    }

    public boolean hasExcludedSkillId() {
        return this.excludedSkillId != null;
    }

    /**
    * The excluded skill ID to filter
    */
    public GetUsersRequest setExcludedSkillId(long d) {
        this.excludedSkillId = Long.valueOf(d);
        return this;
    }

    private Long acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID to filter
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID to filter
    */
    public GetUsersRequest setAcdQueueId(long d) {
        this.acdQueueId = Long.valueOf(d);
        return this;
    }

    private Long excludedAcdQueueId;

    @RequestField(name="excluded_acd_queue_id")
    /**
    * The excluded ACD queue ID to filter
    */
    public Long getExcludedAcdQueueId() {
        return this.excludedAcdQueueId;
    }

    public boolean hasExcludedAcdQueueId() {
        return this.excludedAcdQueueId != null;
    }

    /**
    * The excluded ACD queue ID to filter
    */
    public GetUsersRequest setExcludedAcdQueueId(long d) {
        this.excludedAcdQueueId = Long.valueOf(d);
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user ID to filter
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID to filter
    */
    public GetUsersRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name part to filter
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name part to filter
    */
    public GetUsersRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Boolean userActive;

    @RequestField(name="user_active")
    /**
    * Whether the user is active to filter. Inactive users cannot log in to
    * applications
    */
    public Boolean getUserActive() {
        return this.userActive;
    }

    public boolean hasUserActive() {
        return this.userActive != null;
    }

    /**
    * Whether the user is active to filter. Inactive users cannot log in to
    * applications
    */
    public GetUsersRequest setUserActive(boolean d) {
        this.userActive = Boolean.valueOf(d);
        return this;
    }

    private String userDisplayName;

    @RequestField(name="user_display_name")
    /**
    * The user display name part to filter
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    /**
    * The user display name part to filter
    */
    public GetUsersRequest setUserDisplayName(String d) {
        this.userDisplayName = d;
        return this;
    }

    private Boolean withSkills;

    @RequestField(name="with_skills")
    /**
    * Whether to get the bound skills
    */
    public Boolean getWithSkills() {
        return this.withSkills;
    }

    public boolean hasWithSkills() {
        return this.withSkills != null;
    }

    /**
    * Whether to get the bound skills
    */
    public GetUsersRequest setWithSkills(boolean d) {
        this.withSkills = Boolean.valueOf(d);
        return this;
    }

    private Boolean withQueues;

    @RequestField(name="with_queues")
    /**
    * Whether to get the bound queues
    */
    public Boolean getWithQueues() {
        return this.withQueues;
    }

    public boolean hasWithQueues() {
        return this.withQueues != null;
    }

    /**
    * Whether to get the bound queues
    */
    public GetUsersRequest setWithQueues(boolean d) {
        this.withQueues = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<String> acdStatus;

    @RequestField(name="acd_status")
    /**
    * The ACD status list separated by semicolons (;) to filter. The
    * following values are possible: OFFLINE, ONLINE, READY, BANNED,
    * IN_SERVICE, AFTER_SERVICE, TIMEOUT, DND
    */
    public MultiArgument<String> getAcdStatus() {
        return this.acdStatus;
    }

    public boolean hasAcdStatus() {
        return this.acdStatus != null;
    }

    /**
    * The ACD status list separated by semicolons (;) to filter. The
    * following values are possible: OFFLINE, ONLINE, READY, BANNED,
    * IN_SERVICE, AFTER_SERVICE, TIMEOUT, DND
    */
    public GetUsersRequest setAcdStatus(MultiArgument<String> d) {
        this.acdStatus = d;
        return this;
    }

    private Long showingSkillId;

    @RequestField(name="showing_skill_id")
    /**
    * The skill to show in the 'skills' field output
    */
    public Long getShowingSkillId() {
        return this.showingSkillId;
    }

    public boolean hasShowingSkillId() {
        return this.showingSkillId != null;
    }

    /**
    * The skill to show in the 'skills' field output
    */
    public GetUsersRequest setShowingSkillId(long d) {
        this.showingSkillId = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count
    */
    public GetUsersRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records are skipped in the output
    */
    public Long getOffset() {
        return this.offset;
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records are skipped in the output
    */
    public GetUsersRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String orderBy;

    @RequestField(name="order_by")
    /**
    * The following values are available: 'user_id', 'user_name' and
    * 'user_display_name'
    */
    public String getOrderBy() {
        return this.orderBy;
    }

    public boolean hasOrderBy() {
        return this.orderBy != null;
    }

    /**
    * The following values are available: 'user_id', 'user_name' and
    * 'user_display_name'
    */
    public GetUsersRequest setOrderBy(String d) {
        this.orderBy = d;
        return this;
    }

    private Boolean returnLiveBalance;

    @RequestField(name="return_live_balance")
    /**
    * Whether to get the user live balance
    */
    public Boolean getReturnLiveBalance() {
        return this.returnLiveBalance;
    }

    public boolean hasReturnLiveBalance() {
        return this.returnLiveBalance != null;
    }

    /**
    * Whether to get the user live balance
    */
    public GetUsersRequest setReturnLiveBalance(boolean d) {
        this.returnLiveBalance = Boolean.valueOf(d);
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
        if (skillId != null) {
            sb.append(aligned)
                .append("\"skillId\": \"")
                .append(skillId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (excludedSkillId != null) {
            sb.append(aligned)
                .append("\"excludedSkillId\": \"")
                .append(excludedSkillId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (excludedAcdQueueId != null) {
            sb.append(aligned)
                .append("\"excludedAcdQueueId\": \"")
                .append(excludedAcdQueueId)
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
        if (userActive != null) {
            sb.append(aligned)
                .append("\"userActive\": \"")
                .append(userActive)
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
        if (withSkills != null) {
            sb.append(aligned)
                .append("\"withSkills\": \"")
                .append(withSkills)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (withQueues != null) {
            sb.append(aligned)
                .append("\"withQueues\": \"")
                .append(withQueues)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdStatus != null) {
            sb.append(aligned)
                .append("\"acdStatus\": \"")
                .append(acdStatus)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (showingSkillId != null) {
            sb.append(aligned)
                .append("\"showingSkillId\": \"")
                .append(showingSkillId)
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
        if (orderBy != null) {
            sb.append(aligned)
                .append("\"orderBy\": \"")
                .append(orderBy)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (returnLiveBalance != null) {
            sb.append(aligned)
                .append("\"returnLiveBalance\": \"")
                .append(returnLiveBalance)
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