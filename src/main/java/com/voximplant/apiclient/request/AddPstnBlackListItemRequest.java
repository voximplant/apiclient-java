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

public class AddPstnBlackListItemRequest {
    private String pstnBlacklistPhone;

    @RequestField(name="pstn_blacklist_phone")
    /**
    * The phone number in format e164 or regex pattern
    */
    public String getPstnBlacklistPhone() {
        return this.pstnBlacklistPhone;
    }

    public boolean hasPstnBlacklistPhone() {
        return this.pstnBlacklistPhone != null;
    }

    /**
    * The phone number in format e164 or regex pattern
    */
    public AddPstnBlackListItemRequest setPstnBlacklistPhone(String d) {
        this.pstnBlacklistPhone = d;
        return this;
    }

}