package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.BindDialogflowKeysRequest;
import com.voximplant.apiclient.response.BindDialogflowKeysResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Bind a Dialogflow key to the application.
*/
public class BindDialogflowKeysExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            BindDialogflowKeysResponse res = client.bindDialogflowKeys(new BindDialogflowKeysRequest()
                .setDialogflowKeyId(1)
                .setApplicationId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}