package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_UnbindAgentRequest;
import com.voximplant.apiclient.response.SQ_UnbindAgentResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Unbind the agent with id 1 from all queues.
*/
public class SQ_UnbindAgentExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_UnbindAgentResponse res = client.sQ_UnbindAgent(new SQ_UnbindAgentRequest()
                .setApplicationId(1)
                .setSqQueueId(MultiArgument.forAllValues())
                .setUserId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}