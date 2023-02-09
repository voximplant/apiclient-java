package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddSubUserRequest;
import com.voximplant.apiclient.response.AddSubUserResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Create a new subuser for account_id = 1.
*/
public class AddSubUserExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddSubUserResponse res = client.addSubUser(new AddSubUserRequest()
                .setNewSubuserName("John_McClane")
                .setNewSubuserPassword("pssw0rd")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}