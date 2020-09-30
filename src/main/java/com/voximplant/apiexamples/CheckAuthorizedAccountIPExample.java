package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.CheckAuthorizedAccountIPRequest;
import com.voximplant.apiclient.response.CheckAuthorizedAccountIPResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

public class CheckAuthorizedAccountIPExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            CheckAuthorizedAccountIPResponse res = client.checkAuthorizedAccountIP(new CheckAuthorizedAccountIPRequest()
                .setAuthorizedIp("92.255.220.0/24")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}