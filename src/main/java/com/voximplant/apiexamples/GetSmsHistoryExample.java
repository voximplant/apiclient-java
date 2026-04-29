package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetSmsHistoryRequest;
import com.voximplant.apiclient.response.GetSmsHistoryResponse;
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
* Get messages with 1234, 1235, 1236 IDs, sent starting from March 1,
* 2019.
*/
public class GetSmsHistoryExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2019, 3, 1, 0, 0, 0);

            GetSmsHistoryResponse res = client.getSmsHistory(new GetSmsHistoryRequest()
                .setMessageId(MultiArgument.forSingleValue(1234L))
                .setFromDate(fromDate.getTime())
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}