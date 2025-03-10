package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetACDQueueStatisticsRequest;
import com.voximplant.apiclient.response.GetACDQueueStatisticsResponse;
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
* Get WT and TT statistics for the queue from the specified date.
*/
public class GetACDQueueStatisticsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2021, 4, 8, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2021, 4, 10, 0, 0, 0);

            GetACDQueueStatisticsResponse res = client.getACDQueueStatistics(new GetACDQueueStatisticsRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setAcdQueueId(MultiArgument.forSingleValue(54L))
                .setReport(MultiArgument.forSingleValue("WT"))
                .setAggregation("day")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}