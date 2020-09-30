package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetPstnBlackListItemRequest;
import com.voximplant.apiclient.response.SetPstnBlackListItemResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

public class SetPstnBlackListItemExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetPstnBlackListItemResponse res = client.setPstnBlackListItem(new SetPstnBlackListItemRequest()
                .setPstnBlacklistPhone("123456789")
                .setPstnBlacklistId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}