package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_SetAgentInfoRequest;
import com.voximplant.apiclient.response.SQ_SetAgentInfoResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Edit settings of the agent with id = 2.
*/
public class SQ_SetAgentInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_SetAgentInfoResponse res = client.sQ_SetAgentInfo(new SQ_SetAgentInfoRequest()
                .setApplicationId(1)
                .setUserId(MultiArgument.forSingleValue(2L))
                .setHandleCalls(true)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}