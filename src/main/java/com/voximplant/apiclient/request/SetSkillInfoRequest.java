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

public class SetSkillInfoRequest {
    private Long skillId;

    @RequestField(name="skill_id")
    /**
    * The skill ID.
    */
    public long getSkillId() {
        return this.skillId.longValue();
    }

    public boolean hasSkillId() {
        return this.skillId != null;
    }

    /**
    * The skill ID.
    */
    public SetSkillInfoRequest setSkillId(long d) {
        this.skillId = Long.valueOf(d);
        return this;
    }

    private String skillName;

    @RequestField(name="skill_name")
    /**
    * The skill name that can be used instead of <b>skill_id</b>.
    */
    public String getSkillName() {
        return this.skillName;
    }

    public boolean hasSkillName() {
        return this.skillName != null;
    }

    /**
    * The skill name that can be used instead of <b>skill_id</b>.
    */
    public SetSkillInfoRequest setSkillName(String d) {
        this.skillName = d;
        return this;
    }

    private String newSkillName;

    @RequestField(name="new_skill_name")
    /**
    * The new skill name. The length must be less than 512.
    */
    public String getNewSkillName() {
        return this.newSkillName;
    }

    public boolean hasNewSkillName() {
        return this.newSkillName != null;
    }

    /**
    * The new skill name. The length must be less than 512.
    */
    public SetSkillInfoRequest setNewSkillName(String d) {
        this.newSkillName = d;
        return this;
    }

}