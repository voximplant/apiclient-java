package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class A2PSendSmsResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private SmsTransaction[] result;

        public SmsTransaction[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private FailedSms[] failed;

        public FailedSms[] getFailed() {
        return this.failed;
    }

    public boolean hasFailed() {
        return this.failed != null;
    }

    private Long fragmentsCount;

    /**
    * The number of fragments the message is divided into.
    */
    public long getFragmentsCount() {
        return this.fragmentsCount.longValue();
    }

    public boolean hasFragmentsCount() {
        return this.fragmentsCount != null;
    }

}