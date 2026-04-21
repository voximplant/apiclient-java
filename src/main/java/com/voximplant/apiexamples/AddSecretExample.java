package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddSecretRequest;
import com.voximplant.apiclient.response.AddSecretResponse;
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
* Add a new secret to application 1
*/
public class AddSecretExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddSecretResponse res = client.addSecret(new AddSecretRequest()
                .setApplicationId(1)
                .setSecretName("some_secret_name")
                .setSecretValue("secret123")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}