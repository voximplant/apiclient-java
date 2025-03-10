package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetAuditLogRequest;
import com.voximplant.apiclient.response.GetAuditLogResponse;
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
* Get the three log items from the 2018-02-01 00:00:00 to the
* 2018-03-01 00:00:00 and filter.
*/
public class GetAuditLogExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar fromDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            fromDate.set(2018, 2, 1, 0, 0, 0);
            Calendar toDate = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            toDate.set(2018, 3, 1, 0, 0, 0);

            GetAuditLogResponse res = client.getAuditLog(new GetAuditLogRequest()
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setFilteredCmd(MultiArgument.forMultipleValues(Arrays.asList("BindSkill", "AddSkill", "DelSkill")))
                .setAdvancedFilters("152")
                .setCount(3)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}