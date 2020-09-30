package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.DeactivateChildAccountSubscriptionRequest;
import com.voximplant.apiclient.response.DeactivateChildAccountSubscriptionResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Deactivates the subscription with ID = 20 and
* subscription_finish_date = September 29th 2019.
*/
public class DeactivateChildAccountSubscriptionExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar subscriptionFinishDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            subscriptionFinishDate.set(2019, 9, 29, 0, 0, 0);

            DeactivateChildAccountSubscriptionResponse res = client.deactivateChildAccountSubscription(new DeactivateChildAccountSubscriptionRequest()
                .setSubscriptionId(20)
                .setChildAccountId(10)
                .setSubscriptionFinishDate(subscriptionFinishDate.getTime())
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}