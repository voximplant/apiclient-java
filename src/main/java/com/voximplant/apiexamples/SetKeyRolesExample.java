package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetKeyRolesRequest;
import com.voximplant.apiclient.response.SetKeyRolesResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Set roles 1, 2, 3 for the key.
*/
public class SetKeyRolesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetKeyRolesResponse res = client.setKeyRoles(new SetKeyRolesRequest()
                .setKeyId("ab81c76e-573e-4046-9af9-105269dfafca")
                .setRoleId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}