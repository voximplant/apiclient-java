package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_SetAgentCustomStatusMappingRequest;
import com.voximplant.apiclient.response.SQ_SetAgentCustomStatusMappingResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Add/rename a status depending on the presence of an internal status
* in agent_status_mapping.
*/
public class SQ_SetAgentCustomStatusMappingExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_SetAgentCustomStatusMappingResponse res = client.sQ_SetAgentCustomStatusMapping(new SQ_SetAgentCustomStatusMappingRequest()
                .setSqStatusName("READY")
                .setCustomStatusName("ReadyForCall")
                .setApplicationId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}