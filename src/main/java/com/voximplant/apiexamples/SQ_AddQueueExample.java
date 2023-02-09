package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_AddQueueRequest;
import com.voximplant.apiclient.response.SQ_AddQueueResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Add a new queue.
*/
public class SQ_AddQueueExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_AddQueueResponse res = client.sQ_AddQueue(new SQ_AddQueueRequest()
                .setApplicationId(1)
                .setSqQueueName("smartQueue1")
                .setCallAgentSelection("MOST_QUALIFIED")
                .setCallTaskSelection("MAX_WAITING_TIME")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}