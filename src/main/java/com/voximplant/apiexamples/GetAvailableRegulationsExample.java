package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetAvailableRegulationsRequest;
import com.voximplant.apiclient.response.GetAvailableRegulationsResponse;
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
* Search available regulation address.
*/
public class GetAvailableRegulationsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetAvailableRegulationsResponse res = client.getAvailableRegulations(new GetAvailableRegulationsRequest()
                .setCountryCode("DE")
                .setPhoneCategoryName("GEOGRAPHIC")
                .setPhoneRegionCode("643")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}