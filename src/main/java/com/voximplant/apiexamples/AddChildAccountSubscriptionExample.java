package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddChildAccountSubscriptionRequest;
import com.voximplant.apiclient.response.AddChildAccountSubscriptionResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Create a subscription for the child account with ID = 10 using the
* subscription template with ID = 184.
*/
public class AddChildAccountSubscriptionExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddChildAccountSubscriptionResponse res = client.addChildAccountSubscription(new AddChildAccountSubscriptionRequest()
                .setChildAccountId(10)
                .setSubscriptionTemplateId(184)
                .setSubscriptionName("Meaningful subscription name")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}