package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetAvailableAdminRoleEntriesRequest;
import com.voximplant.apiclient.response.GetAvailableAdminRoleEntriesResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the all available admin role entries.
*/
public class GetAvailableAdminRoleEntriesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetAvailableAdminRoleEntriesResponse res = client.getAvailableAdminRoleEntries(new GetAvailableAdminRoleEntriesRequest()
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}