package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddOutboundTestPhoneNumberRequest;
import com.voximplant.apiclient.response.AddOutboundTestPhoneNumberResponse;
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
* Add a personal phone number.
*/
public class AddOutboundTestPhoneNumberExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddOutboundTestPhoneNumberResponse res = client.addOutboundTestPhoneNumber(new AddOutboundTestPhoneNumberRequest()
                .setPhoneNumber("12223334444")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}