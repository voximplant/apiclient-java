package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.ActivateOutboundTestPhoneNumberRequest;
import com.voximplant.apiclient.response.ActivateOutboundTestPhoneNumberResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Activate the personal phone number by the verification code.
*/
public class ActivateOutboundTestPhoneNumberExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            ActivateOutboundTestPhoneNumberResponse res = client.activateOutboundTestPhoneNumber(new ActivateOutboundTestPhoneNumberRequest()
                .setVerificationCode("12345")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}