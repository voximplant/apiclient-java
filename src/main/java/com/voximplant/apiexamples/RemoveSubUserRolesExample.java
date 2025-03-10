package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.RemoveSubUserRolesRequest;
import com.voximplant.apiclient.response.RemoveSubUserRolesResponse;
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
* Remove roles 1,2,3 from the subuser with id = 12.
*/
public class RemoveSubUserRolesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            RemoveSubUserRolesResponse res = client.removeSubUserRoles(new RemoveSubUserRolesRequest()
                .setSubuserId(12)
                .setRoleId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}