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

public class GetChildAccountSubscriptionsRequest {
    private Long childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID.
    */
    public long getChildAccountId() {
        return this.childAccountId.longValue();
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID.
    */
    public GetChildAccountSubscriptionsRequest setChildAccountId(long d) {
        this.childAccountId = Long.valueOf(d);
        return this;
    }

    private Long subscriptionId;

    @RequestField(name="subscription_id")
    /**
    * The subscription ID. If empty, then all the non-deactivated
    * subscriptions for the current child account will be retrieved.
    */
    public long getSubscriptionId() {
        return this.subscriptionId.longValue();
    }

    public boolean hasSubscriptionId() {
        return this.subscriptionId != null;
    }

    /**
    * The subscription ID. If empty, then all the non-deactivated
    * subscriptions for the current child account will be retrieved.
    */
    public GetChildAccountSubscriptionsRequest setSubscriptionId(long d) {
        this.subscriptionId = Long.valueOf(d);
        return this;
    }

}