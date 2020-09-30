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

public class GetQueuesRequest {
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
    public GetQueuesRequest setAcdQueueId(long d) {
        this.acdQueueId = Long.valueOf(d);
        return this;
    }

    private String acdQueueName;

    @RequestField(name="acd_queue_name")
    /**
    * The ACD queue name part to filter.
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    /**
    * The ACD queue name part to filter.
    */
    public GetQueuesRequest setAcdQueueName(String d) {
        this.acdQueueName = d;
        return this;
    }

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
    public GetQueuesRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
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
    public GetQueuesRequest setSkillId(long d) {
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
    public GetQueuesRequest setExcludedSkillId(long d) {
        this.excludedSkillId = Long.valueOf(d);
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
    public GetQueuesRequest setWithSkills(boolean d) {
        this.withSkills = Boolean.valueOf(d);
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
    public GetQueuesRequest setShowingSkillId(long d) {
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
    public GetQueuesRequest setCount(long d) {
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
    public GetQueuesRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

}