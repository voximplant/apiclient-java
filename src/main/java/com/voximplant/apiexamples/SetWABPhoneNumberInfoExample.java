package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetWABPhoneNumberInfoRequest;
import com.voximplant.apiclient.response.SetWABPhoneNumberInfoResponse;
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
* 
*/
public class SetWABPhoneNumberInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetWABPhoneNumberInfoResponse res = client.setWABPhoneNumberInfo(new SetWABPhoneNumberInfoRequest()
                .setWabPhoneNumber("12126367890")
                .setDescription("my number")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}