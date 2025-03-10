package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetMoneyAmountToChargeRequest;
import com.voximplant.apiclient.response.GetMoneyAmountToChargeResponse;
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
* Get the recommended money amount to charge in USD.
*/
public class GetMoneyAmountToChargeExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetMoneyAmountToChargeResponse res = client.getMoneyAmountToCharge(new GetMoneyAmountToChargeRequest()
                .setCurrency("USD")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}