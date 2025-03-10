package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AttachAdminRoleRequest;
import com.voximplant.apiclient.response.AttachAdminRoleResponse;
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
* Bind the all admin users with the admin roles 1, 2 and 3.
*/
public class AttachAdminRoleExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AttachAdminRoleResponse res = client.attachAdminRole(new AttachAdminRoleRequest()
                .setRequiredAdminUserId(MultiArgument.forAllValues())
                .setAdminRoleId(MultiArgument.forMultipleValues(Arrays.asList(1L, 2L, 3L)))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}