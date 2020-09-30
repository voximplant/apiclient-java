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

public class AddSkillRequest {
    private String skillName;

    @RequestField(name="skill_name")
    /**
    * The ACD operator skill name. The length must be less than 512.
    */
    public String getSkillName() {
        return this.skillName;
    }

    public boolean hasSkillName() {
        return this.skillName != null;
    }

    /**
    * The ACD operator skill name. The length must be less than 512.
    */
    public AddSkillRequest setSkillName(String d) {
        this.skillName = d;
        return this;
    }

}