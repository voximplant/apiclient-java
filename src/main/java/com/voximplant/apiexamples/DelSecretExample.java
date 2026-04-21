package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.DelSecretRequest;
import com.voximplant.apiclient.response.DelSecretResponse;
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
* Delete secret with ID 10.
*/
public class DelSecretExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            DelSecretResponse res = client.delSecret(new DelSecretRequest()
                .setApplicationId(1)
                .setSecretId(MultiArgument.forSingleValue(10L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}