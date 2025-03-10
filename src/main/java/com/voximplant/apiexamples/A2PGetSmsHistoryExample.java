package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.A2PGetSmsHistoryRequest;
import com.voximplant.apiclient.response.A2PGetSmsHistoryResponse;
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
* Get messages that had been sent to number 12345678222 starting from
* March 1, 2019. Number of resulting rows is limited to 2.
*/
public class A2PGetSmsHistoryExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2019, 3, 1, 0, 0, 0);

            A2PGetSmsHistoryResponse res = client.a2PGetSmsHistory(new A2PGetSmsHistoryRequest()
                .setDestinationNumber("12345678222")
                .setFromDate(fromDate.getTime())
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}