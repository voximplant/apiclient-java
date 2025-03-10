package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetTransactionHistoryAsyncRequest;
import com.voximplant.apiclient.response.GetTransactionHistoryAsyncResponse;
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
* Get the three transactions record from the 2012-01-01 00:00:00 UTC to
* the 2014-01-01 00:00:00 UTC with the 'gift' or 'money_distribution'
* types.
*/
public class GetTransactionHistoryAsyncExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2012, 1, 1, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2014, 1, 1, 0, 0, 0);

            GetTransactionHistoryAsyncResponse res = client.getTransactionHistoryAsync(new GetTransactionHistoryAsyncRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setTransactionType(MultiArgument.forMultipleValues(Arrays.asList("gift", "money_distribution")))
                .setOutput("csv")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}