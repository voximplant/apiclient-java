package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.DelAuthorizedAccountIPRequest;
import com.voximplant.apiclient.response.DelAuthorizedAccountIPResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Delete the 92.255.220.0/24 network from all the lists.
*/
public class DelAuthorizedAccountIPExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            DelAuthorizedAccountIPResponse res = client.delAuthorizedAccountIP(new DelAuthorizedAccountIPRequest()
                .setAuthorizedIp("92.255.220.0/24")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}