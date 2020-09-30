package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetACDOperatorStatusStatisticsRequest;
import com.voximplant.apiclient.response.GetACDOperatorStatusStatisticsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get statistics for the 'READY' and 'ONLINE' statuses of all
* operators; grouped by operators.
*/
public class GetACDOperatorStatusStatisticsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2019, 5, 20, 11, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2019, 5, 20, 13, 0, 0);

            GetACDOperatorStatusStatisticsResponse res = client.getACDOperatorStatusStatistics(new GetACDOperatorStatusStatisticsRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setAcdStatus(MultiArgument.forMultipleValues(Arrays.asList("READY", "ONLINE")))
                .setUserId(MultiArgument.forAllValues())
                .setAggregation("hour")
                .setGroup("user")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}