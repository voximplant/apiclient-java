package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.RecoverCallListRequest;
import com.voximplant.apiclient.response.RecoverCallListResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Restore list with id = 1.
*/
public class RecoverCallListExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            RecoverCallListResponse res = client.recoverCallList(new RecoverCallListRequest()
                .setListId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}