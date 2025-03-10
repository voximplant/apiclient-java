package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_BindSkillRequest;
import com.voximplant.apiclient.response.SQ_BindSkillResponse;
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
* Bind the skills with id 1 and 2 to all users.
*/
public class SQ_BindSkillExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_BindSkillResponse res = client.sQ_BindSkill(new SQ_BindSkillRequest()
                .setApplicationId(1)
                .setUserId(MultiArgument.forAllValues())
                .setSqSkills("[{\"sq_skill_id\":1,\"sq_skill_level\":1},{\"sq_skill_id\":2,\"sq_skill_level\":5}]")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}