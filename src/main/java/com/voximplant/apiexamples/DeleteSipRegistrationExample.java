package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.DeleteSipRegistrationRequest;
import com.voximplant.apiclient.response.DeleteSipRegistrationResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Delete SIP registration with id 1.
*/
public class DeleteSipRegistrationExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            DeleteSipRegistrationResponse res = client.deleteSipRegistration(new DeleteSipRegistrationRequest()
                .setSipRegistrationId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}