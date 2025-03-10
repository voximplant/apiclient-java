package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.DownloadHistoryReportRequest;
import com.voximplant.apiclient.response.DownloadHistoryReportResponse;
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
* Download the completed history report with id = 1.
*/
public class DownloadHistoryReportExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            DownloadHistoryReportResponse res = client.downloadHistoryReport(new DownloadHistoryReportRequest()
                .setHistoryReportId(1)
            );
            if (res.hasFileContent()) {
                InputStream inputStream = res.getFileContent();
            } else {
                System.out.println(res.getError());
            }
            System.out.println(res);
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}