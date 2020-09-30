package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class SendSmsMessageResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

        public long getResult() {
        return this.result.longValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long fragmentsCount;

    /**
    * The number of fragments the message was divided into.
    */
    public long getFragmentsCount() {
        return this.fragmentsCount.longValue();
    }

    public boolean hasFragmentsCount() {
        return this.fragmentsCount != null;
    }

}