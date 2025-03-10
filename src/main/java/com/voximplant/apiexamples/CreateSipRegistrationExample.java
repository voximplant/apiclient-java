package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.CreateSipRegistrationRequest;
import com.voximplant.apiclient.response.CreateSipRegistrationResponse;
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
* Create SIP registration.
*/
public class CreateSipRegistrationExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            CreateSipRegistrationResponse res = client.createSipRegistration(new CreateSipRegistrationRequest()
                .setSipUsername("JohnGalt")
                .setProxy("localhost")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}