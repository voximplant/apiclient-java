package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetAccountInfoResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private AccountInfoType result;

    /**
    * Account's info as the [AccountInfoType] object instance.
    */
    public AccountInfoType getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private String apiAddress;

    /**
    * The preferred address for the http api requests.
    */
    public String getApiAddress() {
        return this.apiAddress;
    }

    public boolean hasApiAddress() {
        return this.apiAddress != null;
    }

}