package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetCallHistoryAsyncRequest;
import com.voximplant.apiclient.response.GetCallHistoryAsyncResponse;
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
* Get the first call session history record with calls and record URLs
* from the 2020-02-25 00:00:00 UTC to the 2020-02-26 00:00:00 UTC.
*/
public class GetCallHistoryAsyncExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2020, 2, 25, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2020, 2, 26, 0, 0, 0);

            GetCallHistoryAsyncResponse res = client.getCallHistoryAsync(new GetCallHistoryAsyncRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setWithCalls(true)
                .setWithRecords(true)
                .setOutput("csv")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}