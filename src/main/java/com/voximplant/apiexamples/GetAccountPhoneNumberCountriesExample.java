package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetAccountPhoneNumberCountriesRequest;
import com.voximplant.apiclient.response.GetAccountPhoneNumberCountriesResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the countries where the account with id = 1 has phone numbers
* attached to the application with id = 1.
*/
public class GetAccountPhoneNumberCountriesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetAccountPhoneNumberCountriesResponse res = client.getAccountPhoneNumberCountries(new GetAccountPhoneNumberCountriesRequest()
                .setApplicationId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}