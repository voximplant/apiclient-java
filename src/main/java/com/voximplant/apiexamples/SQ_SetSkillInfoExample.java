package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_SetSkillInfoRequest;
import com.voximplant.apiclient.response.SQ_SetSkillInfoResponse;
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
* Edit a skill.
*/
public class SQ_SetSkillInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_SetSkillInfoResponse res = client.sQ_SetSkillInfo(new SQ_SetSkillInfoRequest()
                .setApplicationId(1)
                .setSqSkillId(1)
                .setNewSqSkillName("newSkill")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}