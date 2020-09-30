package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetAccountInfoRequest;
import com.voximplant.apiclient.response.SetAccountInfoResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Set the notification settings.
*/
public class SetAccountInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetAccountInfoResponse res = client.setAccountInfo(new SetAccountInfoRequest()
                .setLanguageCode("en")
                .setLocation("GMT-8")
                .setMinBalanceToNotify(BigDecimal.valueOf(150,2))
                .setTariffChangingNotifications(true)
                .setNewsNotifications(true)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}