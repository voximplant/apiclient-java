package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.A2PSendSmsRequest;
import com.voximplant.apiclient.response.A2PSendSmsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Send the SMS message with the text "Test message" from the phone
* number 447443332211 to the phone numbers 447443332212 and
* 447443332213.
*/
public class A2PSendSmsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            A2PSendSmsResponse res = client.a2PSendSms(new A2PSendSmsRequest()
                .setSrcNumber("447443332211")
                .setDstNumbers(MultiArgument.forSingleValue("447443332212"))
                .setText("Test message")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}