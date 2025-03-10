package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.EditCallListTaskRequest;
import com.voximplant.apiclient.response.EditCallListTaskResponse;
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
* Set attempts_left, start_at, and custom_data the task with id=1 in
* the call list with id=1.
*/
public class EditCallListTaskExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");

            Calendar startAt = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            startAt.set(2023, 11, 13, 18, 0, 0);

            EditCallListTaskResponse res = client.editCallListTask(new EditCallListTaskRequest()
                .setListId(1)
                .setTaskId(1)
                .setAttemptsLeft(2)
                .setStartAt(startAt.getTime())
                .setCustomData("{\"phone\":\"555111222333\",\"name\":\"Mr.Fate\"}")
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}