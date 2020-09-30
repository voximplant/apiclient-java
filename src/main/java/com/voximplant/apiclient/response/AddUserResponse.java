package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class AddUserResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public long getResult() {
        return this.result.longValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long userId;

    /**
    * The new user ID.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

}