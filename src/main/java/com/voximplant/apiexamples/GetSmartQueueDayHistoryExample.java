package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetSmartQueueDayHistoryRequest;
import com.voximplant.apiclient.response.GetSmartQueueDayHistoryResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the time agents spent in the ONLINE status for all SmartQueues
* within one application.
*/
public class GetSmartQueueDayHistoryExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetSmartQueueDayHistoryResponse res = client.getSmartQueueDayHistory(new GetSmartQueueDayHistoryRequest()
                .setApplicationId(1)
                .setReportType(MultiArgument.forSingleValue("sum_agents_online_time"))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}