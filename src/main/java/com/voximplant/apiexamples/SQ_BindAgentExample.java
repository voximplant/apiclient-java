package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_BindAgentRequest;
import com.voximplant.apiclient.response.SQ_BindAgentResponse;
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
* Bind the agent with id 1 and 2 to the queue with id = 1.
*/
public class SQ_BindAgentExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_BindAgentResponse res = client.sQ_BindAgent(new SQ_BindAgentRequest()
                .setApplicationId(1)
                .setSqQueueId("1")
                .setUserId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}