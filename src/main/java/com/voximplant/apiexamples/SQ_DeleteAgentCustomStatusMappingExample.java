package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_DeleteAgentCustomStatusMappingRequest;
import com.voximplant.apiclient.response.SQ_DeleteAgentCustomStatusMappingResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Remove a mapping for sq_status_name = READY.
*/
public class SQ_DeleteAgentCustomStatusMappingExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_DeleteAgentCustomStatusMappingResponse res = client.sQ_DeleteAgentCustomStatusMapping(new SQ_DeleteAgentCustomStatusMappingRequest()
                .setSqStatusName("READY")
                .setApplicationId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}