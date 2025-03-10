package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_DelQueueRequest;
import com.voximplant.apiclient.response.SQ_DelQueueResponse;
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
* Delete the queue with id = 3.
*/
public class SQ_DelQueueExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_DelQueueResponse res = client.sQ_DelQueue(new SQ_DelQueueRequest()
                .setApplicationId(1)
                .setSqQueueId(MultiArgument.forSingleValue(3L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}