package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SendSmsMessageRequest;
import com.voximplant.apiclient.response.SendSmsMessageResponse;
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
* number 447443332211 to the phone number 447443332212.
*/
public class SendSmsMessageExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SendSmsMessageResponse res = client.sendSmsMessage(new SendSmsMessageRequest()
                .setSource("447443332211")
                .setDestination("447443332212")
                .setSmsBody("Test message")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}