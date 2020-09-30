package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddPushCredentialRequest;
import com.voximplant.apiclient.response.AddPushCredentialResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Add new Google credentials.
*/
public class AddPushCredentialExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddPushCredentialResponse res = client.addPushCredential(new AddPushCredentialRequest()
                .setPushProviderName("GOOGLE")
                .setSenderId("704777431520")
                .setServerKey("AAAAjM-LQsc:APA91bGyCb5WhcGtaM-RaOI1GqWps1Uh9K-YoY75HIBy-En-4piH4c6_50gIEbSaCfuDrsLNfyZCvteiu6EjxA_rEBOvlc4xZ30uiGgbuM_jdT6y6Ku55OwnCyIxRNznvmx1jkkLexSU")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}