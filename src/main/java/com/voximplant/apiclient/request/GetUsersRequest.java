package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetUsersRequest {
    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID to filter.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID to filter.
    */
    public GetUsersRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name part to filter.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name part to filter.
    */
    public GetUsersRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long skillId;

    @RequestField(name="skill_id")
    /**
    * The skill ID to filter.
    */
    public long getSkillId() {
        return this.skillId.longValue();
    }

    public boolean hasSkillId() {
        return this.skillId != null;
    }

    /**
    * The skill ID to filter.
    */
    public GetUsersRequest setSkillId(long d) {
        this.skillId = Long.valueOf(d);
        return this;
    }

    private Long excludedSkillId;

    @RequestField(name="excluded_skill_id")
    /**
    * The excluded skill ID to filter.
    */
    public long getExcludedSkillId() {
        return this.excludedSkillId.longValue();
    }

    public boolean hasExcludedSkillId() {
        return this.excludedSkillId != null;
    }

    /**
    * The excluded skill ID to filter.
    */
    public GetUsersRequest setExcludedSkillId(long d) {
        this.excludedSkillId = Long.valueOf(d);
        return this;
    }

    private Long acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID to filter.
    */
    public long getAcdQueueId() {
        return this.acdQueueId.longValue();
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    /**
    * The ACD queue ID to filter.
    */
    public GetUsersRequest setAcdQueueId(long d) {
        this.acdQueueId = Long.valueOf(d);
        return this;
    }

    private Long excludedAcdQueueId;

    @RequestField(name="excluded_acd_queue_id")
    /**
    * The excluded ACD queue ID to filter.
    */
    public long getExcludedAcdQueueId() {
        return this.excludedAcdQueueId.longValue();
    }

    public boolean hasExcludedAcdQueueId() {
        return this.excludedAcdQueueId != null;
    }

    /**
    * The excluded ACD queue ID to filter.
    */
    public GetUsersRequest setExcludedAcdQueueId(long d) {
        this.excludedAcdQueueId = Long.valueOf(d);
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user ID to filter.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID to filter.
    */
    public GetUsersRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name part to filter.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name part to filter.
    */
    public GetUsersRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Boolean userActive;

    @RequestField(name="user_active")
    /**
    * The user active flag to filter.
    */
    public boolean getUserActive() {
        return this.userActive.booleanValue();
    }

    public boolean hasUserActive() {
        return this.userActive != null;
    }

    /**
    * The user active flag to filter.
    */
    public GetUsersRequest setUserActive(boolean d) {
        this.userActive = Boolean.valueOf(d);
        return this;
    }

    private String userDisplayName;

    @RequestField(name="user_display_name")
    /**
    * The user display name part to filter.
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    /**
    * The user display name part to filter.
    */
    public GetUsersRequest setUserDisplayName(String d) {
        this.userDisplayName = d;
        return this;
    }

    private Boolean withSkills;

    @RequestField(name="with_skills")
    /**
    * Set true to get the bound skills.
    */
    public boolean getWithSkills() {
        return this.withSkills.booleanValue();
    }

    public boolean hasWithSkills() {
        return this.withSkills != null;
    }

    /**
    * Set true to get the bound skills.
    */
    public GetUsersRequest setWithSkills(boolean d) {
        this.withSkills = Boolean.valueOf(d);
        return this;
    }

    private Boolean withQueues;

    @RequestField(name="with_queues")
    /**
    * Set true to get the bound queues.
    */
    public boolean getWithQueues() {
        return this.withQueues.booleanValue();
    }

    public boolean hasWithQueues() {
        return this.withQueues != null;
    }

    /**
    * Set true to get the bound queues.
    */
    public GetUsersRequest setWithQueues(boolean d) {
        this.withQueues = Boolean.valueOf(d);
        return this;
    }

    private MultiArgument<String> acdStatus;

    @RequestField(name="acd_status")
    /**
    * The ACD status list separated by the ';' symbol to filter. The
    * following values are possible: OFFLINE, ONLINE, READY, BANNED,
    * IN_SERVICE, AFTER_SERVICE, TIMEOUT, DND.
    */
    public MultiArgument<String> getAcdStatus() {
        return this.acdStatus;
    }

    public boolean hasAcdStatus() {
        return this.acdStatus != null;
    }

    /**
    * The ACD status list separated by the ';' symbol to filter. The
    * following values are possible: OFFLINE, ONLINE, READY, BANNED,
    * IN_SERVICE, AFTER_SERVICE, TIMEOUT, DND.
    */
    public GetUsersRequest setAcdStatus(MultiArgument<String> d) {
        this.acdStatus = d;
        return this;
    }

    private Long showingSkillId;

    @RequestField(name="showing_skill_id")
    /**
    * The skill to show in the 'skills' field output.
    */
    public long getShowingSkillId() {
        return this.showingSkillId.longValue();
    }

    public boolean hasShowingSkillId() {
        return this.showingSkillId != null;
    }

    /**
    * The skill to show in the 'skills' field output.
    */
    public GetUsersRequest setShowingSkillId(long d) {
        this.showingSkillId = Long.valueOf(d);
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * The max returning record count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * The max returning record count.
    */
    public GetUsersRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetUsersRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    private String orderBy;

    @RequestField(name="order_by")
    /**
    * The following values are available: 'user_id', 'user_name' and
    * 'user_display_name'.
    */
    public String getOrderBy() {
        return this.orderBy;
    }

    public boolean hasOrderBy() {
        return this.orderBy != null;
    }

    /**
    * The following values are available: 'user_id', 'user_name' and
    * 'user_display_name'.
    */
    public GetUsersRequest setOrderBy(String d) {
        this.orderBy = d;
        return this;
    }

    private Boolean returnLiveBalance;

    @RequestField(name="return_live_balance")
    /**
    * Set true to get the user live balance.
    */
    public boolean getReturnLiveBalance() {
        return this.returnLiveBalance.booleanValue();
    }

    public boolean hasReturnLiveBalance() {
        return this.returnLiveBalance != null;
    }

    /**
    * Set true to get the user live balance.
    */
    public GetUsersRequest setReturnLiveBalance(boolean d) {
        this.returnLiveBalance = Boolean.valueOf(d);
        return this;
    }

}