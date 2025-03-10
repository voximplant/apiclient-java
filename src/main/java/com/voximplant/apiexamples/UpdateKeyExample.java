package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.UpdateKeyRequest;
import com.voximplant.apiclient.response.UpdateKeyResponse;
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
* Create a new subuser for account_id = 1.
*/
public class UpdateKeyExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            UpdateKeyResponse res = client.updateKey(new UpdateKeyRequest()
                .setKeyId("ab98c70e-573e-4446-9af9-105269dfafca")
                .setDescription("test_desc")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}