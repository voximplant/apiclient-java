package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.BindPhoneNumberToApplicationRequest;
import com.voximplant.apiclient.response.BindPhoneNumberToApplicationResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Bind the phone 1 to the application 1.
*/
public class BindPhoneNumberToApplicationExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            BindPhoneNumberToApplicationResponse res = client.bindPhoneNumberToApplication(new BindPhoneNumberToApplicationRequest()
                .setPhoneId(MultiArgument.forSingleValue(1L))
                .setApplicationId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}