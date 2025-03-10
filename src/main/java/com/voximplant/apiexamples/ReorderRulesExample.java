package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.ReorderRulesRequest;
import com.voximplant.apiclient.response.ReorderRulesResponse;
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
* Set the rule selection order: 1, 7, 3.
*/
public class ReorderRulesExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            ReorderRulesResponse res = client.reorderRules(new ReorderRulesRequest()
                .setRuleId(MultiArgument.forMultipleValues(Arrays.asList(1L, 7L, 3L)))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}