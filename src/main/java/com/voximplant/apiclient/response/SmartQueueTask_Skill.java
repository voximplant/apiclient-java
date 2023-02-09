package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* Task skill info.
*/
public class SmartQueueTask_Skill implements Alignable {

    private String sqSkillName;

    /**
    * The skill name
    */
    public String getSqSkillName() {
        return this.sqSkillName;
    }

    public boolean hasSqSkillName() {
        return this.sqSkillName != null;
    }

    private Long sqSkillLevel;

    /**
    * The skill level
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