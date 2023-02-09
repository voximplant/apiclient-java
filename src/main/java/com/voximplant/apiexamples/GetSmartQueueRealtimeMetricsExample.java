package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetSmartQueueRealtimeMetricsRequest;
import com.voximplant.apiclient.response.GetSmartQueueRealtimeMetricsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the time agents spent in the DIALING status for all smart queues
* within one application.
*/
public class GetSmartQueueRealtimeMetricsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetSmartQueueRealtimeMetricsResponse res = client.getSmartQueueRealtimeMetrics(new GetSmartQueueRealtimeMetricsRequest()
                .setApplicationId(1)
                .setReportType(MultiArgument.forSingleValue("sum_agents_dialing_time"))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}