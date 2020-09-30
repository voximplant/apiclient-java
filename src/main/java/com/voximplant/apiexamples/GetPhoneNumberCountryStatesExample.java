package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetPhoneNumberCountryStatesRequest;
import com.voximplant.apiclient.response.GetPhoneNumberCountryStatesResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the AL (Alabama) state info.
*/
public class GetPhoneNumberCountryStatesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetPhoneNumberCountryStatesResponse res = client.getPhoneNumberCountryStates(new GetPhoneNumberCountryStatesRequest()
                .setCountryCode("US")
                .setPhoneCategoryName("GEOGRAPHIC")
                .setCountryState("AL")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}