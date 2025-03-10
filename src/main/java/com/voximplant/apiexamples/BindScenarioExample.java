package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.BindScenarioRequest;
import com.voximplant.apiclient.response.BindScenarioResponse;
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
* Bind the scenarios 1, 2 and 3 with the rule 1.
*/
public class BindScenarioExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            BindScenarioResponse res = client.bindScenario(new BindScenarioRequest()
                .setScenarioId(MultiArgument.forMultipleValues(Arrays.asList(1L, 2L, 3L)))
                .setRuleId(1)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}