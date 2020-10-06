package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class GetQueuesRequest implements Alignable {
    private Long acdQueueId;

    @RequestField(name="acd_queue_id")
    /**
    * The ACD queue ID to filter.
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
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
    public Long getApplicationId() {
        return this.applicationId;
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
    public Long getSkillId() {
        return this.skillId;
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
    public Long getExcludedSkillId() {
        return this.excludedSkillId;
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
    public Boolean getWithSkills() {
        return this.withSkills;
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
    public Long getShowingSkillId() {
        return this.showingSkillId;
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
    public Long getCount() {
        return this.count;
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
    public Long getOffset() {
        return this.offset;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueName != null) {
            sb.append(aligned)
                .append("\"acdQueueName\": \"")
                .append(acdQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
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
        if (withSkills != null) {
            sb.append(aligned)
                .append("\"withSkills\": \"")
                .append(withSkills)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}