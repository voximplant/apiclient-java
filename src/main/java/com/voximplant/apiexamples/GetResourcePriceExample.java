package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetResourcePriceRequest;
import com.voximplant.apiclient.response.GetResourcePriceResponse;
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
* Get the price to call to the phone number 79263332211.
*/
public class GetResourcePriceExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetResourcePriceResponse res = client.getResourcePrice(new GetResourcePriceRequest()
                .setResourceType(MultiArgument.forSingleValue("PSTNOUT"))
                .setResourceParam(MultiArgument.forSingleValue("79263332211"))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}