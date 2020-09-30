package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.UpdateSipRegistrationRequest;
import com.voximplant.apiclient.response.UpdateSipRegistrationResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Bind SIP registration with id 1 to the application with id 123.
*/
public class UpdateSipRegistrationExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            UpdateSipRegistrationResponse res = client.updateSipRegistration(new UpdateSipRegistrationRequest()
                .setSipRegistrationId(1)
                .setApplicationId(123)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}