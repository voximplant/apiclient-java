package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetChildAccountSubscriptionTemplatesRequest;
import com.voximplant.apiclient.response.GetChildAccountSubscriptionTemplatesResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the eligible subscription templates.
*/
public class GetChildAccountSubscriptionTemplatesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetChildAccountSubscriptionTemplatesResponse res = client.getChildAccountSubscriptionTemplates(new GetChildAccountSubscriptionTemplatesRequest()
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}