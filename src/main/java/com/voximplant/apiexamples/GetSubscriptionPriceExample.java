package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetSubscriptionPriceRequest;
import com.voximplant.apiclient.response.GetSubscriptionPriceResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;
import java.io.InputStream;

/**
* Get the SIP registration subscription template.
*/
public class GetSubscriptionPriceExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetSubscriptionPriceResponse res = client.getSubscriptionPrice(new GetSubscriptionPriceRequest()
                .setSubscriptionTemplateType("SIP_REGISTRATION")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}