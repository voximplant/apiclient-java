package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* Received when an unverified subscription is canceled. Received as
* part of the [AccountCallback] structure.
*/
public class UnverifiedSubscriptionDetachedCallback implements Alignable {

    private UnverifiedSubscriptionDetachedCallbackItem[] subscriptions;

    /**
    * The frozen subscription list
    */
    public UnverifiedSubscriptionDetachedCallbackItem[] getSubscriptions() {
        return this.subscriptions;
    }

    public boolean hasSubscriptions() {
        return this.subscriptions != null;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (subscriptions != null) {
            sb.append(aligned)
                .append("\"UnverifiedSubscriptionDetachedCallbackItem\": ")
                .append(StringHelper.arrayToString(subscriptions, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}