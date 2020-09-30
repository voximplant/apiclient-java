package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddAdminRoleRequest;
import com.voximplant.apiclient.response.AddAdminRoleResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Add a new admin role with the GetAccountInfo and GetCallHistory
* permissions.
*/
public class AddAdminRoleExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddAdminRoleResponse res = client.addAdminRole(new AddAdminRoleRequest()
                .setAdminRoleName("read_only")
                .setAllowedEntries(MultiArgument.forMultipleValues(Arrays.asList("GetAccountInfo", "GetCallHistory")))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}