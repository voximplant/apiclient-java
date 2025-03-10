package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_UnbindSkillRequest;
import com.voximplant.apiclient.response.SQ_UnbindSkillResponse;
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
* Unbind the skill with id = 1 from the user with id = 1.
*/
public class SQ_UnbindSkillExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_UnbindSkillResponse res = client.sQ_UnbindSkill(new SQ_UnbindSkillRequest()
                .setApplicationId(1)
                .setUserId(MultiArgument.forSingleValue(1L))
                .setSqSkillId(MultiArgument.forSingleValue(1L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}