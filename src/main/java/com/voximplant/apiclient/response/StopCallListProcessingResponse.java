package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class StopCallListProcessingResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Boolean result;

    /**
    * true
    */
    public boolean getResult() {
        return this.result.booleanValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private String msg;

    /**
    * Result message.
    */
    public String getMsg() {
        return this.msg;
    }

    public boolean hasMsg() {
        return this.msg != null;
    }

}