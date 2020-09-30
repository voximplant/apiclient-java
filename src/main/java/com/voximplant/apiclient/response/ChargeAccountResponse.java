package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class ChargeAccountResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private ChargeAccountResult result;

    /**
    * Result
    */
    public ChargeAccountResult getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private ShortAccountInfoType accountInfo;

    /**
    * The current account state.
    */
    public ShortAccountInfoType getAccountInfo() {
        return this.accountInfo;
    }

    public boolean hasAccountInfo() {
        return this.accountInfo != null;
    }

}