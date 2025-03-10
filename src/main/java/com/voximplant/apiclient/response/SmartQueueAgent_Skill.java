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
* Agent skill info.
*/
public class SmartQueueAgent_Skill implements Alignable {

    private Long sqSkillId;

    /**
    * The agent skill ID
    */
    public Long getSqSkillId() {
        return this.sqSkillId;
    }

    public boolean hasSqSkillId() {
        return this.sqSkillId != null;
    }

    private String sqSkillName;

    /**
    * The agent skill name
    */
    public String getSqSkillName() {
        return this.sqSkillName;
    }

    public boolean hasSqSkillName() {
        return this.sqSkillName != null;
    }

    private Long sqSkillLevel;

    /**
    * The agent skill level
    */
    public Long getSqSkillLevel() {
        return this.sqSkillLevel;
    }

    public boolean hasSqSkillLevel() {
        return this.sqSkillLevel != null;
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
        if (sqSkillLevel != null) {
            sb.append(aligned)
                .append("\"sqSkillLevel\": \"")
                .append(sqSkillLevel)
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