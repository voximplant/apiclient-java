package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetTransactionHistoryRequest;
import com.voximplant.apiclient.response.GetTransactionHistoryResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the three transactions record from the 2012-01-01 00:00:00 UTC to
* the 2014-01-01 00:00:00 UTC with the 'gift' or 'money_distribution'
* types.
*/
public class GetTransactionHistoryExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2012, 1, 1, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2014, 1, 1, 0, 0, 0);

            GetTransactionHistoryResponse res = client.getTransactionHistory(new GetTransactionHistoryRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setCount(3)
                .setTransactionType(MultiArgument.forMultipleValues(Arrays.asList("gift", "money_distribution")))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}