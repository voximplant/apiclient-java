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

public class DelSkillRequest {
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
    public DelSkillRequest setSkillId(long d) {
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
    public DelSkillRequest setSkillName(String d) {
        this.skillName = d;
        return this;
    }

}