package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.IsAccountPhoneNumberRequest;
import com.voximplant.apiclient.response.IsAccountPhoneNumberResponse;
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
* Check if the phone number belongs to the account.
*/
public class IsAccountPhoneNumberExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            IsAccountPhoneNumberResponse res = client.isAccountPhoneNumber(new IsAccountPhoneNumberRequest()
                .setPhoneNumber("79991234567")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}