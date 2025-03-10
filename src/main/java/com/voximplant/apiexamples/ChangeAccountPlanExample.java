package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.ChangeAccountPlanRequest;
import com.voximplant.apiclient.response.ChangeAccountPlanResponse;
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
* Change the IM plan.
*/
public class ChangeAccountPlanExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            ChangeAccountPlanResponse res = client.changeAccountPlan(new ChangeAccountPlanRequest()
                .setPlanType("IM")
                .setPlanSubscriptionTemplateId(3)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}