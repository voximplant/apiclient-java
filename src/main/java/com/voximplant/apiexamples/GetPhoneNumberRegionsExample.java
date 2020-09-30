package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetPhoneNumberRegionsRequest;
import com.voximplant.apiclient.response.GetPhoneNumberRegionsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the Russian regions of the phone numbers.
*/
public class GetPhoneNumberRegionsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetPhoneNumberRegionsResponse res = client.getPhoneNumberRegions(new GetPhoneNumberRegionsRequest()
                .setCountryCode("RU")
                .setPhoneCategoryName("GEOGRAPHIC")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}