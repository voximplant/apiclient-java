package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.DelSipWhiteListItemRequest;
import com.voximplant.apiclient.response.DelSipWhiteListItemResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;
import java.io.InputStream;

public class DelSipWhiteListItemExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            DelSipWhiteListItemResponse res = client.delSipWhiteListItem(new DelSipWhiteListItemRequest()
                .setSipWhitelistId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}