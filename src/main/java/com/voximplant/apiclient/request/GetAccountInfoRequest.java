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

public class GetAccountInfoRequest {
    private Boolean returnLiveBalance;

    @RequestField(name="return_live_balance")
    /**
    * Set true to get the account's live balance.
    */
    public boolean getReturnLiveBalance() {
        return this.returnLiveBalance.booleanValue();
    }

    public boolean hasReturnLiveBalance() {
        return this.returnLiveBalance != null;
    }

    /**
    * Set true to get the account's live balance.
    */
    public GetAccountInfoRequest setReturnLiveBalance(boolean d) {
        this.returnLiveBalance = Boolean.valueOf(d);
        return this;
    }

}