package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetSubscriptionPriceResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private SubscriptionTemplateType[] result;

    /**
    * The subscription template prices.
    */
    public SubscriptionTemplateType[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

}