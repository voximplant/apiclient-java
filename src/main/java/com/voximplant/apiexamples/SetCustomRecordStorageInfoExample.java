package com.voximplant.apiexamples;

import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.request.SetCustomRecordStorageInfoRequest;
import com.voximplant.apiclient.response.SetCustomRecordStorageInfoResponse;
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
* Modify the custom record storage.
*/
public class SetCustomRecordStorageInfoExample {
    public static void main(String [] args) {
        try {
            VoximplantAPIClient client = new VoximplantAPIClient("/path/to/credentials.json");


            SetCustomRecordStorageInfoResponse res = client.setCustomRecordStorageInfo(new SetCustomRecordStorageInfoRequest()
                .setHost("example.com")
                .setAccessKeyId("AKIAIOSFODNN7EXAMPLE")
                .setSecretAccessKey("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
                .setBucket("my-custom-voximplant-bucket")
                .setCustomRecordStorageId(123)
            );
            System.out.println("OK");
        } catch (IOException | ClientException e) {
            e.printStackTrace();
        }
    }
}