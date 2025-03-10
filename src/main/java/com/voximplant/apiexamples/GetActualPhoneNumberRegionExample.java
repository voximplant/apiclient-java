package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetActualPhoneNumberRegionRequest;
import com.voximplant.apiclient.response.GetActualPhoneNumberRegionResponse;
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
* Get the Germany region of the phone numbers.
*/
public class GetActualPhoneNumberRegionExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetActualPhoneNumberRegionResponse res = client.getActualPhoneNumberRegion(new GetActualPhoneNumberRegionRequest()
                .setCountryCode("DE")
                .setPhoneCategoryName("GEOGRAPHIC")
                .setPhoneRegionId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}