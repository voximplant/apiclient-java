package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.BindSkillRequest;
import com.voximplant.apiclient.response.BindSkillResponse;
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
* Unbind the skills 1, 6 from the all users and the queues 11, 12.
*/
public class BindSkillExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            BindSkillResponse res = client.bindSkill(new BindSkillRequest()
                .setSkillId(MultiArgument.forMultipleValues(Arrays.asList(1L, 6L)))
                .setAcdQueueId(MultiArgument.forMultipleValues(Arrays.asList(11L, 12L)))
                .setUserId(MultiArgument.forAllValues())
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}