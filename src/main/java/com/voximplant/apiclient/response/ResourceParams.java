package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The available resource parameters.
*/
public class ResourceParams {

    private String[] allowed;

    /**
    * The allowed parameter prefixes. Example: 7495
    */
    public String[] getAllowed() {
        return this.allowed;
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    private String[] forbidden;

    /**
    * The forbidden parameter prefixes. Example: 7800
    */
    public String[] getForbidden() {
        return this.forbidden;
    }

    public boolean hasForbidden() {
        return this.forbidden != null;
    }

    private String[] requested;

    /**
    * The requested parameters. Example: 79263331122
    */
    public String[] getRequested() {
        return this.requested;
    }

    public boolean hasRequested() {
        return this.requested != null;
    }

}