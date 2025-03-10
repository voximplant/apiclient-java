package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetKeyValueItemRequest;
import com.voximplant.apiclient.response.SetKeyValueItemResponse;
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
* SetKeyValueItem example.
*/
public class SetKeyValueItemExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetKeyValueItemResponse res = client.setKeyValueItem(new SetKeyValueItemRequest()
                .setApplicationId(1)
                .setKey("key1")
                .setValue("value1")
                .setTtl(864000)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}