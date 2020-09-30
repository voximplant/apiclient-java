package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The queue skills info.
*/
public class QueueSkills {

    private Long skillId;

    /**
    * The skill ID.
    */
    public long getSkillId() {
        return this.skillId.longValue();
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

}