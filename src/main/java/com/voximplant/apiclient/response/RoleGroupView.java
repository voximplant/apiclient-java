package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetRoleGroups] function result.
*/
public class RoleGroupView {

    private Long id;

    /**
    * The role group ID.
    */
    public long getId() {
        return this.id.longValue();
    }

    public boolean hasId() {
        return this.id != null;
    }

    private String name;

    /**
    * The role group name.
    */
    public String getName() {
        return this.name;
    }

    public boolean hasName() {
        return this.name != null;
    }

}