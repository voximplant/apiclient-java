package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AttachPhoneNumberRequest;
import com.voximplant.apiclient.response.AttachPhoneNumberResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Attach the '74953332211' and '74953332299' phone numbers to the
* account 1.
*/
public class AttachPhoneNumberExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AttachPhoneNumberResponse res = client.attachPhoneNumber(new AttachPhoneNumberRequest()
                .setCountryCode("RU")
                .setPhoneCategoryName("GEOGRAPHIC")
                .setPhoneRegionId(4)
                .setPhoneNumber(MultiArgument.forSingleValue("74953332211"))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}