package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetKeyValueItemsRequest;
import com.voximplant.apiclient.response.GetKeyValueItemsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* GetKeyValueItems example.
*/
public class GetKeyValueItemsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetKeyValueItemsResponse res = client.getKeyValueItems(new GetKeyValueItemsRequest()
                .setApplicationId(1)
                .setKey("test")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}