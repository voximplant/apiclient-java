package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.GetPhoneNumberCategoriesRequest;
import com.voximplant.apiclient.response.GetPhoneNumberCategoriesResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the phone number categories in Russia.
*/
public class GetPhoneNumberCategoriesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            GetPhoneNumberCategoriesResponse res = client.getPhoneNumberCategories(new GetPhoneNumberCategoriesRequest()
                .setCountryCode(MultiArgument.forSingleValue("RU"))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}