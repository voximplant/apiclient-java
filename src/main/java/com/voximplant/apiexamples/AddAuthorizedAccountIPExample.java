package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.AddAuthorizedAccountIPRequest;
import com.voximplant.apiclient.response.AddAuthorizedAccountIPResponse;
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
* Add the 92.255.220.0/24 network to the white list.
*/
public class AddAuthorizedAccountIPExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            AddAuthorizedAccountIPResponse res = client.addAuthorizedAccountIP(new AddAuthorizedAccountIPRequest()
                .setAuthorizedIp("92.255.220.0/24")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}