package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_SetQueueInfoRequest;
import com.voximplant.apiclient.response.SQ_SetQueueInfoResponse;
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
* Edit the queue with id = 1.
*/
public class SQ_SetQueueInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_SetQueueInfoResponse res = client.sQ_SetQueueInfo(new SQ_SetQueueInfoRequest()
                .setApplicationId(1)
                .setSqQueueId(1)
                .setNewSqQueueName("myNewSmartQueue")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}