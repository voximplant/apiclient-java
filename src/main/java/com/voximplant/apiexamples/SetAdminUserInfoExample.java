package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetAdminUserInfoRequest;
import com.voximplant.apiclient.response.SetAdminUserInfoResponse;
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
* Edit the admin user password.
*/
public class SetAdminUserInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetAdminUserInfoResponse res = client.setAdminUserInfo(new SetAdminUserInfoRequest()
                .setRequiredAdminUserId(1)
                .setNewAdminUserPassword("7654321")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}