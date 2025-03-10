package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetAdminRoleInfoRequest;
import com.voximplant.apiclient.response.SetAdminRoleInfoResponse;
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
* Allow the all permissions except the DelUser and DelApplication.
*/
public class SetAdminRoleInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetAdminRoleInfoResponse res = client.setAdminRoleInfo(new SetAdminRoleInfoRequest()
                .setAdminRoleId(1)
                .setEntryModificationMode("set")
                .setAllowedEntries(MultiArgument.forAllValues())
                .setDeniedEntries(MultiArgument.forMultipleValues(Arrays.asList("DelUser", "DelApplication")))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}