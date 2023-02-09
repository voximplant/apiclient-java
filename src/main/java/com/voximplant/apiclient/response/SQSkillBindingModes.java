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
* Skill binding mode for the [SQ_BindSkill] function.
*/
public class SQSkillBindingModes implements Alignable {

    private String add;

    /**
    * Add new skills to the agents
    */
    public String getAdd() {
        return this.add;
    }

    public boolean hasAdd() {
        return this.add != null;
    }

    private String replaceSkills;

    /**
    * Replace agent skills with new ones
    */
    public String getReplaceSkills() {
        return this.replaceSkills;
    }

    public boolean hasReplaceSkills() {
        return this.replaceSkills != null;
    }

    private String replaceAgents;

    /**
    * Replace agents with new ones
    */
    public String getReplaceAgents() {
        return this.replaceAgents;
    }

    public boolean hasReplaceAgents() {
        return this.replaceAgents != null;
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
        if (add != null) {
            sb.append(aligned)
                .append("\"add\": \"")
                .append(add)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (replaceSkills != null) {
            sb.append(aligned)
                .append("\"replaceSkills\": \"")
                .append(replaceSkills)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (replaceAgents != null) {
            sb.append(aligned)
                .append("\"replaceAgents\": \"")
                .append(replaceAgents)
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