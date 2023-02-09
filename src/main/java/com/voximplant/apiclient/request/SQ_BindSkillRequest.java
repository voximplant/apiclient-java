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

public class SQ_BindSkillRequest implements Alignable {
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
    public SQ_BindSkillRequest setApplicationId(long d) {
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
    public SQ_BindSkillRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> userId;

    @RequestField(name="user_id")
    /**
    * List of user IDs separated by semicolon (;). Use 'all' to select all
    * the users
    */
    public MultiArgument<Long> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * List of user IDs separated by semicolon (;). Use 'all' to select all
    * the users
    */
    public SQ_BindSkillRequest setUserId(MultiArgument<Long> d) {
        this.userId = d;
        return this;
    }

    private MultiArgument<String> userName;

    @RequestField(name="user_name")
    /**
    * List of user names separated by semicolon (;). Can be used instead of
    * <b>user_id</b>
    */
    public MultiArgument<String> getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * List of user names separated by semicolon (;). Can be used instead of
    * <b>user_id</b>
    */
    public SQ_BindSkillRequest setUserName(MultiArgument<String> d) {
        this.userName = d;
        return this;
    }

    private Object sqSkills;

    @RequestField(name="sq_skills")
    /**
    * Skills to be bound to agents in the json array format. The array
    * should contain objects with the
    * <b>sq_skill_id</b>/<b>sq_skill_name</b> and <b>sq_skill_level</b>
    * keys where skill levels range from 1 to 5
    */
    public Object getSqSkills() {
        return this.sqSkills;
    }

    public boolean hasSqSkills() {
        return this.sqSkills != null;
    }

    /**
    * Skills to be bound to agents in the json array format. The array
    * should contain objects with the
    * <b>sq_skill_id</b>/<b>sq_skill_name</b> and <b>sq_skill_level</b>
    * keys where skill levels range from 1 to 5
    */
    public SQ_BindSkillRequest setSqSkills(Object d) {
        this.sqSkills = d;
        return this;
    }

    private SQSkillBindingModes[] bindMode;

    @RequestField(name="bind_mode")
    /**
    * Binding mode
    */
    public SQSkillBindingModes[] getBindMode() {
        return this.bindMode;
    }

    public boolean hasBindMode() {
        return this.bindMode != null;
    }

    /**
    * Binding mode
    */
    public SQ_BindSkillRequest setBindMode(SQSkillBindingModes[] d) {
        this.bindMode = d;
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
        if (sqSkills != null) {
            sb.append(aligned)
                .append("\"sqSkills\": \"")
                .append(sqSkills)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bindMode != null) {
            sb.append(aligned)
                .append("\"SQSkillBindingModes\": ")
                .append(StringHelper.arrayToString(bindMode, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}