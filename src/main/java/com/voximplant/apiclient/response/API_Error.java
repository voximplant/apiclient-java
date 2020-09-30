package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The API error.
*/
public class API_Error {

    private Long code;

    /**
    * The error code.
    */
    public long getCode() {
        return this.code.longValue();
    }

    public boolean hasCode() {
        return this.code != null;
    }

    private String msg;

    /**
    * The error description.
    */
    public String getMsg() {
        return this.msg;
    }

    public boolean hasMsg() {
        return this.msg != null;
    }

}