package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.StartConferenceRequest;
import com.voximplant.apiclient.response.StartConferenceResponse;
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
* Start the conference from the user 1.
*/
public class StartConferenceExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            StartConferenceResponse res = client.startConference(new StartConferenceRequest()
                .setConferenceName("boss")
                .setRuleId(1)
                .setScriptCustomData("mystr")
                .setUserId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}