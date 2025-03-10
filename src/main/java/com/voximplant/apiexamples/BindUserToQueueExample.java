package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.BindUserToQueueRequest;
import com.voximplant.apiclient.response.BindUserToQueueResponse;
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
* Bind three users to one queue.
*/
public class BindUserToQueueExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            BindUserToQueueResponse res = client.bindUserToQueue(new BindUserToQueueRequest()
                .setApplicationId(1)
                .setUserId(MultiArgument.forMultipleValues(Arrays.asList(12L, 987L, 456L)))
                .setAcdQueueName(MultiArgument.forSingleValue("myqueue"))
                .setBind(true)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}