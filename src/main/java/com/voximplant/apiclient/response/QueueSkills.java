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
* The queue skills info.
*/
public class QueueSkills implements Alignable {

    private Long skillId;

    /**
    * The skill ID.
    */
    public Long getSkillId() {
        return this.skillId;
    }

    public boolean hasSkillId() {
        return this.skillId != null;
    }

    private String skillName;

    /**
    * The skill name.
    */
    public String getSkillName() {
        return this.skillName;
    }

    public boolean hasSkillName() {
        return this.skillName != null;
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
        if (skillId != null) {
            sb.append(aligned)
                .append("\"skillId\": \"")
                .append(skillId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (skillName != null) {
            sb.append(aligned)
                .append("\"skillName\": \"")
                .append(skillName)
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