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

public class GetRolesRequest {
    private String groupName;

    @RequestField(name="group_name")
    /**
    * The role group.
    */
    public String getGroupName() {
        return this.groupName;
    }

    public boolean hasGroupName() {
        return this.groupName != null;
    }

    /**
    * The role group.
    */
    public GetRolesRequest setGroupName(String d) {
        this.groupName = d;
        return this;
    }

}