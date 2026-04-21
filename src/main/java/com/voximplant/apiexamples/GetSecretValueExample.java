package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetSecretValueRequest;
import com.voximplant.apiclient.response.GetSecretValueResponse;
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
* Get the value of secret 10.
*/
public class GetSecretValueExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetSecretValueResponse res = client.getSecretValue(new GetSecretValueRequest()
                .setApplicationId(1)
                .setSecretId(10)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}