package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetChildAccountInfoRequest;
import com.voximplant.apiclient.response.SetChildAccountInfoResponse;
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
* Disable the child account.
*/
public class SetChildAccountInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetChildAccountInfoResponse res = client.setChildAccountInfo(new SetChildAccountInfoRequest()
                .setChildAccountId(MultiArgument.forSingleValue(1321L))
                .setActive(false)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}