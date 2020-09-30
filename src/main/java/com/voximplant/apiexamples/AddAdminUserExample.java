package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddAdminUserRequest;
import com.voximplant.apiclient.response.AddAdminUserResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Add a new admin user.
*/
public class AddAdminUserExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddAdminUserResponse res = client.addAdminUser(new AddAdminUserRequest()
                .setNewAdminUserName("Overseer_Campbell")
                .setAdminUserDisplayName("Overseer_Campbell")
                .setNewAdminUserPassword("1234567")
                .setAdminRoleId("1")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}