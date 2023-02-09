package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.LinkRegulationAddressRequest;
import com.voximplant.apiclient.response.LinkRegulationAddressResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Link the regulation address to a phone number.
*/
public class LinkRegulationAddressExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            LinkRegulationAddressResponse res = client.linkRegulationAddress(new LinkRegulationAddressRequest()
                .setRegulationAddressId(1)
                .setPhoneId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}