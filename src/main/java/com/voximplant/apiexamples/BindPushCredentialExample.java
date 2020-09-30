package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.BindPushCredentialRequest;
import com.voximplant.apiclient.response.BindPushCredentialResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Bind the push credential to the application.
*/
public class BindPushCredentialExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            BindPushCredentialResponse res = client.bindPushCredential(new BindPushCredentialRequest()
                .setPushCredentialId(MultiArgument.forSingleValue(1L))
                .setApplicationId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}