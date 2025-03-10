package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetSubUserInfoRequest;
import com.voximplant.apiclient.response.SetSubUserInfoResponse;
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
* Edit the password and description for the subuser with id = 12 from
* account_id = 1.
*/
public class SetSubUserInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetSubUserInfoResponse res = client.setSubUserInfo(new SetSubUserInfoRequest()
                .setSubuserId(12)
                .setOldSubuserPassword("old_test_password")
                .setNewSubuserPassword("test_pass")
                .setDescription("test_desc")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}