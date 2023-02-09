package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_DelSkillRequest;
import com.voximplant.apiclient.response.SQ_DelSkillResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Delete the skill with id = 5.
*/
public class SQ_DelSkillExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_DelSkillResponse res = client.sQ_DelSkill(new SQ_DelSkillRequest()
                .setApplicationId(1)
                .setSqSkillId(MultiArgument.forSingleValue(5L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}