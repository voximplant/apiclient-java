package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetScenarioInfoRequest;
import com.voximplant.apiclient.response.SetScenarioInfoResponse;
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
* Add a new scenario: var s='hello';
*/
public class SetScenarioInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetScenarioInfoResponse res = client.setScenarioInfo(new SetScenarioInfoRequest()
                .setScenarioId(1)
                .setScenarioName("call_scenario")
                .setScenarioScript("var s=\"hello world\";")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}