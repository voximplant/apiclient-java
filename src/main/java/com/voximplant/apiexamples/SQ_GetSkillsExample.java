package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SQ_GetSkillsRequest;
import com.voximplant.apiclient.response.SQ_GetSkillsResponse;
import com.voximplant.apiclient.VoximplantAPIClient;
import com.voximplant.apiclient.util.MultiArgument;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.io.IOException;

/**
* Get the skills with id 2 and 4
*/
public class SQ_GetSkillsExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SQ_GetSkillsResponse res = client.sQ_GetSkills(new SQ_GetSkillsRequest()
                .setApplicationId(1)
                .setSqSkillId(MultiArgument.forSingleValue(2L))
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}