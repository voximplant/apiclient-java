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

public class SQ_DelSkillRequest implements Alignable {
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
    public SQ_DelSkillRequest setApplicationId(long d) {
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
    public SQ_DelSkillRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private MultiArgument<Long> sqSkillId;

    @RequestField(name="sq_skill_id")
    /**
    * List of skill IDs separated by semicolons (;). Use 'all' to delete
    * all the skills
    */
    public MultiArgument<Long> getSqSkillId() {
        return this.sqSkillId;
    }

    public boolean hasSqSkillId() {
        return this.sqSkillId != null;
    }

    /**
    * List of skill IDs separated by semicolons (;). Use 'all' to delete
    * all the skills
    */
    public SQ_DelSkillRequest setSqSkillId(MultiArgument<Long> d) {
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
    public SQ_DelSkillRequest setSqSkillName(MultiArgument<String> d) {
        this.sqSkillName = d;
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}