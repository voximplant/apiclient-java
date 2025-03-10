package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_GetAgentsRequest;
import com.voximplant.apiclient.response.SQ_GetAgentsResponse;
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
* Get all agents with their current statuses.
*/
public class SQ_GetAgentsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_GetAgentsResponse res = client.sQ_GetAgents(new SQ_GetAgentsRequest()
                .setApplicationId(1)
                .setWithSqStatuses(true)
                .setHandleCalls(false)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}