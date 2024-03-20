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

public class SQ_GetSkillsRequest implements Alignable {
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
    public SQ_GetSkillsRequest setApplicationId(long d) {
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
    public SQ_GetSkillsRequest setApplicationName(String d) {
        this.applicationName = d;
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
    public SQ_GetSkillsRequest setUserId(MultiArgument<Long> d) {
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
    public SQ_GetSkillsRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private MultiArgument<Long> sqSkillId;

    @RequestField(name="sq_skill_id")
    /**
    * List of skill IDs separated by semicolons (;)
    */
    public MultiArgument<Long> getSqSkillId() {
        return this.sqSkillId;
    }

    public boolean hasSqSkillId() {
        return this.sqSkillId != null;
    }

    /**
    * List of skill IDs separated by semicolons (;)
    */
    public SQ_GetSkillsRequest setSqSkillId(MultiArgument<Long> d) {
        this.sqSkillId = d;
        return this;
    }

    private MultiArgument<String> sqSkillName;

    @RequestField(name="sq_skill_name")
    /**
    * List of skill names separated by semicolons (;). Can be used instead
    * of <b>sq_skill_id</b>
    */
    public MultiArgument<String> getSqSkillName() {
        return this.sqSkillName;
    }

    public boolean hasSqSkillName() {
        return this.sqSkillName != null;
    }

    /**
    * List of skill names separated by semicolons (;). Can be used instead
    * of <b>sq_skill_id</b>
    */
    public SQ_GetSkillsRequest setSqSkillName(MultiArgument<String> d) {
        this.sqSkillName = d;
        return this;
    }

    private String sqSkillNameTemplate;

    @RequestField(name="sq_skill_name_template")
    /**
    * Substring of the skill name to filter, case-insensitive
    */
    public String getSqSkillNameTemplate() {
        return this.sqSkillNameTemplate;
    }

    public boolean hasSqSkillNameTemplate() {
        return this.sqSkillNameTemplate != null;
    }

    /**
    * Substring of the skill name to filter, case-insensitive
    */
    public SQ_GetSkillsRequest setSqSkillNameTemplate(String d) {
        this.sqSkillNameTemplate = d;
        return this;
    }

    private Long excludedUserId;

    @RequestField(name="excluded_user_id")
    /**
    * ID of the user that is not bound to the skill
    */
    public Long getExcludedUserId() {
        return this.excludedUserId;
    }

    public boolean hasExcludedUserId() {
        return this.excludedUserId != null;
    }

    /**
    * ID of the user that is not bound to the skill
    */
    public SQ_GetSkillsRequest setExcludedUserId(long d) {
        this.excludedUserId = Long.valueOf(d);
        return this;
    }

    private String excludedUserName;

    @RequestField(name="excluded_user_name")
    /**
    * Name of the user that is not bound to the skill. Can be used instead
    * of <b>excluded_user_id</b>
    */
    public String getExcludedUserName() {
        return this.excludedUserName;
    }

    public boolean hasExcludedUserName() {
        return this.excludedUserName != null;
    }

    /**
    * Name of the user that is not bound to the skill. Can be used instead
    * of <b>excluded_user_id</b>
    */
    public SQ_GetSkillsRequest setExcludedUserName(String d) {
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
    public SQ_GetSkillsRequest setCount(long d) {
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
    public SQ_GetSkillsRequest setOffset(long d) {
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
        if (sqSkillId != null) {
            sb.append(aligned)
                .append("\"sqSkillId\": \"")
                .append(sqSkillId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sqSkillName != null) {
            sb.append(aligned)
                .append("\"sqSkillName\": \"")
                .append(sqSkillName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (sqSkillNameTemplate != null) {
            sb.append(aligned)
                .append("\"sqSkillNameTemplate\": \"")
                .append(sqSkillNameTemplate)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}