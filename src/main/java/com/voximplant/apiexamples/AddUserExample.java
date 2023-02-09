package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddUserRequest;
import com.voximplant.apiclient.response.AddUserResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Add a new user.
*/
public class AddUserExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddUserResponse res = client.addUser(new AddUserRequest()
                .setUserName("GordonFreeman")
                .setUserDisplayName("GordonFreeman")
                .setUserPassword("1234567")
                .setApplicationId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}