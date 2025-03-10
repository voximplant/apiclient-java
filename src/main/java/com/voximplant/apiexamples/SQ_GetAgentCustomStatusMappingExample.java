package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_GetAgentCustomStatusMappingRequest;
import com.voximplant.apiclient.response.SQ_GetAgentCustomStatusMappingResponse;
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
* Get the status mappings.
*/
public class SQ_GetAgentCustomStatusMappingExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_GetAgentCustomStatusMappingResponse res = client.sQ_GetAgentCustomStatusMapping(new SQ_GetAgentCustomStatusMappingRequest()
                .setApplicationId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}