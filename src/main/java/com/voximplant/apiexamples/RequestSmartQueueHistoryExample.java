package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.RequestSmartQueueHistoryRequest;
import com.voximplant.apiclient.response.RequestSmartQueueHistoryResponse;
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
* Generate a service_level report file in csv format for the period
* from 2021-03-17 00:00:00 to 2021-03-17 22:00:00.
*/
public class RequestSmartQueueHistoryExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2021, 3, 17, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2021, 3, 17, 22, 0, 0);

            RequestSmartQueueHistoryResponse res = client.requestSmartQueueHistory(new RequestSmartQueueHistoryRequest()
                .setApplicationId(1)
                .setSqQueueId(MultiArgument.forSingleValue(1L))
                .setReportType(MultiArgument.forSingleValue("service_level"))
                .setMaxWaitingSec(6)
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}