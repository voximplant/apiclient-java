package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetCurrencyRateRequest;
import com.voximplant.apiclient.response.GetCurrencyRateResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the current currency rates: RUR/USD and EUR/USD.
*/
public class GetCurrencyRateExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetCurrencyRateResponse res = client.getCurrencyRate(new GetCurrencyRateRequest()
                .setCurrency(MultiArgument.forMultipleValues(Arrays.asList("RUR", "EUR")))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}