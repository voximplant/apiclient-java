package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetACDHistoryRequest;
import com.voximplant.apiclient.response.GetACDHistoryResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the two ACD session history records from the 2012-01-01 00:00:00
* to the 2014-04-01 00:00:00.
*/
public class GetACDHistoryExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2012, 1, 1, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2014, 1, 1, 0, 0, 0);

            GetACDHistoryResponse res = client.getACDHistory(new GetACDHistoryRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setWithEvents(true)
                .setCount(2)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}