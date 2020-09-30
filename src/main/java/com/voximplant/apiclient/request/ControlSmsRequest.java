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

public class ControlSmsRequest {
    private String phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone number.
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone number.
    */
    public ControlSmsRequest setPhoneNumber(String d) {
        this.phoneNumber = d;
        return this;
    }

    private String command;

    @RequestField(name="command")
    /**
    * The SMS control command. The following values are possible: enable,
    * disable.
    */
    public String getCommand() {
        return this.command;
    }

    public boolean hasCommand() {
        return this.command != null;
    }

    /**
    * The SMS control command. The following values are possible: enable,
    * disable.
    */
    public ControlSmsRequest setCommand(String d) {
        this.command = d;
        return this;
    }

}