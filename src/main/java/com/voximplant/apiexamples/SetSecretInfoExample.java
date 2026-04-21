package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetSecretInfoRequest;
import com.voximplant.apiclient.response.SetSecretInfoResponse;
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
* Update the value for secret 10.
*/
public class SetSecretInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetSecretInfoResponse res = client.setSecretInfo(new SetSecretInfoRequest()
                .setApplicationId(1)
                .setSecretId(10)
                .setSecretValue("newsecret456")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}