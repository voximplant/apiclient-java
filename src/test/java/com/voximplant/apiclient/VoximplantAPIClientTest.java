package com.voximplant.apiclient;

import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.request.*;
import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.util.MultiArgument;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;


public class VoximplantAPIClientTest {
    @Test
    public void testMain() {
        String testApplicationName = "javasdk";

        try {
            VoximplantAPIClient client = new VoximplantAPIClient("../testfiles/credentials.json");

            // Delete application
            DelApplicationResponse delApplicationRes = client.delApplication(new DelApplicationRequest().setApplicationName(MultiArgument.forSingleValue(testApplicationName)));
            if (delApplicationRes.getResult() == 1) {
                System.out.println("The application is deleted.");
            } else {
                System.out.println("The application is NOT deleted.");
            }
            System.out.println("'DelApplication' succeeded.");

            // Add application
            AddApplicationResponse addApplicationRes = client.addApplication((new AddApplicationRequest()).setApplicationName(testApplicationName));
            assertEquals(addApplicationRes.getResult(), 1);
            System.out.println("'AddApplication' succeeded.");
        } catch (ClientException | IOException ex) {
            Exception e = ex;
            ((Exception) e).printStackTrace();
        }
    }
}