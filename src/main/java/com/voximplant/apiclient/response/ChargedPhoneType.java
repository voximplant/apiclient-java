package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The charged phone info.
*/
public class ChargedPhoneType {

    private Long phoneId;

    /**
    * The phone ID.
    */
    public long getPhoneId() {
        return this.phoneId.longValue();
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    private String phoneNumber;

    /**
    * The phone number.
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    private Boolean deactivated;

    /**
    * Is subscription frozen?
    */
    public boolean getDeactivated() {
        return this.deactivated.booleanValue();
    }

    public boolean hasDeactivated() {
        return this.deactivated != null;
    }

    private Boolean isCharged;

    /**
    * Has phone been charged?
    */
    public boolean getIsCharged() {
        return this.isCharged.booleanValue();
    }

    public boolean hasIsCharged() {
        return this.isCharged != null;
    }

}