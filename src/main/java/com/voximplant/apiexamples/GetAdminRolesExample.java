package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetAdminRolesRequest;
import com.voximplant.apiclient.response.GetAdminRolesResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get two admin roles attached to the admin_user_id=22.
*/
public class GetAdminRolesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetAdminRolesResponse res = client.getAdminRoles(new GetAdminRolesRequest()
                .setWithEntries(true)
                .setShowingAdminUserId(11)
                .setIncludedAdminUserId(MultiArgument.forSingleValue(22L))
                .setCount(2)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}