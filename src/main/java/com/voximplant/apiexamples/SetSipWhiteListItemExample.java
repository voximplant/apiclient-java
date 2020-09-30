package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetSipWhiteListItemRequest;
import com.voximplant.apiclient.response.SetSipWhiteListItemResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

public class SetSipWhiteListItemExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetSipWhiteListItemResponse res = client.setSipWhiteListItem(new SetSipWhiteListItemRequest()
                .setSipWhitelistId(1)
                .setSipWhitelistNetwork("192.168.1.5/16")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}