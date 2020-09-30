package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The cloned application info.
*/
public class ClonedApplicationType {

    private Long applicationId;

    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    private String applicationName;

    /**
    * The full application name.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    private ClonedRuleType[] users;

    /**
    * The cloned rules.
    */
    public ClonedRuleType[] getUsers() {
        return this.users;
    }

    public boolean hasUsers() {
        return this.users != null;
    }

}