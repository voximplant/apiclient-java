package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.ReorderScenariosRequest;
import com.voximplant.apiclient.response.ReorderScenariosResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Set the scenario loading order: 17, 15, 20.
*/
public class ReorderScenariosExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            ReorderScenariosResponse res = client.reorderScenarios(new ReorderScenariosRequest()
                .setRuleId(2)
                .setScenarioId(MultiArgument.forMultipleValues(Arrays.asList(17L, 15L, 20L)))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}