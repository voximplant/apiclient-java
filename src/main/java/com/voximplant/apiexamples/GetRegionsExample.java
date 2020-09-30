package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetRegionsRequest;
import com.voximplant.apiclient.response.GetRegionsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get regions with city AACHEN.
*/
public class GetRegionsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetRegionsResponse res = client.getRegions(new GetRegionsRequest()
                .setCountryCode("DE")
                .setPhoneCategoryName("GEOGRAPHIC")
                .setCityName("AACHEN")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}