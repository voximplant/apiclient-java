package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class SubscriptionIsDetachedCallback {

    private SubscriptionIsDetachedCallbackItem[] subscriptions;

    /**
    * The detached subscription list.
    */
    public SubscriptionIsDetachedCallbackItem[] getSubscriptions() {
        return this.subscriptions;
    }

    public boolean hasSubscriptions() {
        return this.subscriptions != null;
    }

}