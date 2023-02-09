package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_AddSkillRequest;
import com.voximplant.apiclient.response.SQ_AddSkillResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Add a new skill.
*/
public class SQ_AddSkillExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_AddSkillResponse res = client.sQ_AddSkill(new SQ_AddSkillRequest()
                .setApplicationId(1)
                .setSqSkillName("mySkill")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}