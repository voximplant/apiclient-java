package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.TransferMoneyToUserRequest;
import com.voximplant.apiclient.response.TransferMoneyToUserResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Transfer the all money from the user 1 to the parent account.
*/
public class TransferMoneyToUserExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            TransferMoneyToUserResponse res = client.transferMoneyToUser(new TransferMoneyToUserRequest()
                .setUserId(MultiArgument.forSingleValue(1L))
                .setAmount(BigDecimal.valueOf(-10000000,0))
                .setStrictMode(false)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}