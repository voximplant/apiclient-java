package com.voximplant.apiclient;

import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.request.*;
import com.voximplant.apiclient.ClientException;
import com.voximplant.apiclient.util.MultiArgument;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Calendar;
import java.util.TimeZone;


public class VoximplantAPIClientTest {
    @Test
    public void testMain() {
        String testApplicationName = "javasdk";
        String testRuleName = "javasdk_rule";
        String testScenarioName = "javasdk_scenario";
        String testScenario = "VoxEngine.addEventListener(AppEvents.Started, VoxEngine.terminate);";
        String testUserName = "javasdk_user";
        String testUserPassword = "p@ssw0rd";
        String rulePattern = ".*";
        String sqQueueName = "gosdk_test_sq_queue";
        String sqSkillName1 = "gosdk_test_sq_skill_1";
        String sqSkillName2 = "gosdk_test_sq_skill_2";

        try {
            VoximplantAPIClient client = new VoximplantAPIClient("../testfiles/credentials.json");
            // For starting from container
            //VoximplantAPIClient client = new VoximplantAPIClient("src/test/java/com/voximplant/apiclient/credentials.json");

            // GetApplications
            GetApplicationsResponse getApplicationsResponse = client.getApplications(new GetApplicationsRequest()
                .setApplicationName(testApplicationName));
            
            assertNotNull(getApplicationsResponse, "GetApplicationsResponse should not be null");
            
            boolean applicationExists = false;
            for (ApplicationInfoType application : getApplicationsResponse.getResult()) {
                if (application.getApplicationName().contains(testApplicationName)) {
                    applicationExists = true;
                    System.out.println("The application already exists.");
                    break;
                }
            }
            if (applicationExists){
                // Delete application
                DelApplicationResponse delApplicationRes = client.delApplication(new DelApplicationRequest().setApplicationName(MultiArgument.forSingleValue(testApplicationName)));
                if (delApplicationRes.getResult() == 1) {
                    System.out.println("The application is deleted.");
                } else {
                    System.out.println("The application is NOT deleted.");
                }
                System.out.println("'DelApplication' succeeded.");
            }

            // Add application
            AddApplicationResponse addApplicationRes = client.addApplication((new AddApplicationRequest()).setApplicationName(testApplicationName));
            assertEquals(addApplicationRes.getResult(), 1);
            System.out.println("'AddApplication' succeeded.");

            long applicationId = addApplicationRes.getApplicationId();

            // Add first user
            AddUserResponse addFirstUserResponse = client.addUser((new AddUserRequest())
                .setApplicationId(applicationId)
                .setUserName(testUserName)
                .setUserDisplayName(testUserName)
                .setUserPassword(testUserPassword)
            );
            assertEquals(1, addFirstUserResponse.getResult(), 
                "Result should be " + 1);
            assertNotNull(addFirstUserResponse.getUserId(), "UserId should not be null");
            System.out.println("'AddUser' (first user) succeeded.");

            long userId1 = addFirstUserResponse.getUserId();

            // Get first user
            GetUsersResponse getFirstUserResponse = client.getUsers((new GetUsersRequest())
                .setApplicationId(applicationId)
                .setUserId(userId1)
            );
            assertEquals(1, getFirstUserResponse.getCount(), "Count should be " + 1);
            long firstUserId = getFirstUserResponse.getResult()[0].getUserId();
            System.out.println("'GetUser' (first user) succeeded.");

            // Get scenarios
            GetScenariosResponse getScenariosResponse = client.getScenarios(new GetScenariosRequest());
            assertNotNull(getScenariosResponse, "GetScenariosResponse should not be null");
            assertNotNull(getScenariosResponse.getResult(), "GetScenariosResponse result should not be null");

            long existingScenarioId = 0;
            boolean scenarioExists = false;
            for (ScenarioInfoType scenario : getScenariosResponse.getResult()) {
                if (scenario.getScenarioName().contains(testScenarioName)) {
                    scenarioExists = true;
                    existingScenarioId = scenario.getScenarioId();
                    System.out.println("The scenario already exists.");
                    break;
                }
            }

            if (scenarioExists && existingScenarioId > 0) {
                // Delete scenario
                DelScenarioResponse delScenarioResponse = client.delScenario(new DelScenarioRequest()
                    .setScenarioId(MultiArgument.forSingleValue(existingScenarioId))
                );
                long expectDelScenarioResult = 1;
                assertEquals(expectDelScenarioResult, delScenarioResponse.getResult(), 
                    "Result should be " + expectDelScenarioResult);
                System.out.println("'DelScenario' succeeded.");
            }

            // Add scenario
            AddScenarioResponse addScenarioResponse = client.addScenario(
                new AddScenarioRequest()
                .setApplicationId(applicationId)
                .setScenarioName(testScenarioName)
                .setScenarioScript(testScenario)
            );
            assertNotNull(addScenarioResponse.getScenarioId(),
                "ScenarioId should not be null");
            System.out.println("'AddScenario' succeeded.");

            long scenarioId = addScenarioResponse.getScenarioId();

            // Add rule
            AddRuleResponse addRuleResponse = client.addRule(new AddRuleRequest()
                .setRuleName(testRuleName)
                .setRulePattern(rulePattern)
                .setApplicationId(applicationId)
                .setScenarioId(MultiArgument.forSingleValue(scenarioId))
            );
            long expectAddRuleResult = 1;
            assertEquals(expectAddRuleResult, addRuleResponse.getResult(), "Result should be " + expectAddRuleResult);
            assertNotNull(addRuleResponse.getRuleId(), "RuleId should not be null");
            System.out.println("'AddRule' succeeded.");
            long ruleId = addRuleResponse.getRuleId();

            // Start scenarios
            StartScenariosResponse startScenariosResponse = client.startScenarios(new StartScenariosRequest()
                .setRuleId(ruleId)
            );
            assertEquals(1, startScenariosResponse.getResult(),
            "Result should be " + 1);
            System.out.println("'StartScenarios' succeeded.");

            System.out.println("Await for 10 seconds to get the start scenarios results...");
            Thread.sleep(10000); // Wait for 10 seconds

            // Add push credentials
            Path path = Paths.get("../testfiles/dialogflow-es-440412-43c96e91bbd1.json");
            // For starting from container
            //Path path = Paths.get("/app/apiclient/src/test/java/com/voximplant/apiclient/dialogflow-es-440412-43c96e91bbd1.json");
            try (InputStream fileStream = Files.newInputStream(path)) {
                AddPushCredentialResponse addPushCredsResult = client.addPushCredential(new AddPushCredentialRequest()
                    .setPushProviderName("GOOGLE")
                    .setApplicationId(applicationId)
                    .setServiceAccountFile(fileStream)
                );
                assertEquals(addPushCredsResult.getResult(), 1);
                System.out.println("'AddPushCredential' succeeded.");
            } catch (IOException e) {
                assertTrue(false, "AddPushCredential failed with error");
            }

            // Get call history
            Calendar now = Calendar.getInstance(TimeZone.getTimeZone("Etc/UTC"));
            Calendar fromDate = (Calendar) now.clone();
            fromDate.add(Calendar.HOUR, -24);  
            Calendar toDate = (Calendar) now.clone();
            boolean withCalls = true;
            boolean withTotalCount = true;
            GetCallHistoryResponse secondCallHistoryResponse = client.getCallHistory(new GetCallHistoryRequest()
                .setApplicationId(applicationId)
                .setCount(10)
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setWithCalls(withCalls)
                .setWithTotalCount(withTotalCount)
            );
            assertTrue(1 >= secondCallHistoryResponse.getTotalCount(),
                "Should return at least one call history record");
            System.out.println("'GetCallHistory' succeeded.");

            // GetCallHistoryAsync
            String output = "csv";
            GetCallHistoryAsyncResponse res = client.getCallHistoryAsync(new GetCallHistoryAsyncRequest()
            .setApplicationId(applicationId)
                .setFromDate(fromDate.getTime())
                .setToDate(toDate.getTime())
                .setOutput(output)
            );
            assertNotNull(res.getHistoryReportId(), "HistoryReportId should not be null");
            System.out.println("'GetCallHistoryAsync' succeeded.");

            Long reportId = res.getHistoryReportId();

            System.out.println("Await for 3 minutes to get the history report results...");
            Thread.sleep(1000*60*3);

            DownloadHistoryReportResponse reportRes = client.downloadHistoryReport(new DownloadHistoryReportRequest().setHistoryReportId(reportId));
            if (reportRes.hasFileContent()) {
                InputStream inputStream = reportRes.getFileContent();
                File outputFile = new File("test-out.csv");

                if (outputFile.exists()) {
                    outputFile.delete();
                }

                Files.copy(inputStream, outputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                inputStream.close();
                if (outputFile.exists() == true) {
                    System.out.println("File is created.");
                } else {
                    System.out.println("File is NOT created.");
                }
                assertTrue(outputFile.exists(), "File is created.");
                System.out.println("'downloadHistoryReport' succeeded.");
            } else {
                assertTrue(false, "Report download failed with error: " + reportRes.getError());
            }

            // SmartQueue add queue
            SQ_AddQueueResponse sqAddQueueResponse = client.sQ_AddQueue(new SQ_AddQueueRequest()
                .setApplicationId(applicationId)
                .setCallAgentSelection("MOST_QUALIFIED")
                .setCallTaskSelection("MAX_PRIORITY")
                .setSqQueueName(sqQueueName)
            );
            assertNotNull(sqAddQueueResponse, "SQAddQueueResponse should not be null");
            assertTrue(sqAddQueueResponse.getResult().getSqQueueId() > 0, 
                "Queue ID should be greater than 0");
            long sqQueueId = sqAddQueueResponse.getResult().getSqQueueId();
            System.out.println("'SQAddQueue' succeeded.");

            // SmartQueue bind agent
            SQ_BindAgentResponse sqBindAgentResponse = client.sQ_BindAgent(new SQ_BindAgentRequest()
                .setApplicationId(applicationId)
                .setSqQueueId(String.valueOf(sqQueueId))
                .setUserId(MultiArgument.forSingleValue(firstUserId))
            );
            assertEquals(1, sqBindAgentResponse.getResult(), 
                "Bind agent result should be 1");
            System.out.println("'SQBindAgent' succeeded.");

            // SmartQueue add first skill
            SQ_AddSkillResponse sqAddFirstSkillResponse = client.sQ_AddSkill(new SQ_AddSkillRequest()
                .setApplicationId(applicationId)
                .setSqSkillName(sqSkillName1)
            );
            assertTrue(sqAddFirstSkillResponse.getResult().getSqSkillId() > 0,
                "First skill ID should be greater than 0");
            long sqFirstSkillId = sqAddFirstSkillResponse.getResult().getSqSkillId();
            System.out.println("'SQAddSkill' (first) succeeded.");

            // SmartQueue add second skill
            SQ_AddSkillResponse sqAddSecondSkillResponse = client.sQ_AddSkill(new SQ_AddSkillRequest()
                .setApplicationId(applicationId)
                .setSqSkillName(sqSkillName2)
            );
            assertTrue(sqAddSecondSkillResponse.getResult().getSqSkillId() > 0,
                "Second skill ID should be greater than 0");
            long sqSecondSkillId = sqAddSecondSkillResponse.getResult().getSqSkillId();
            System.out.println("'SQAddSkill' (second) succeeded.");

            // SmartQueue bind skills
            String skills = String.format("[{\"sq_skill_id\":%d,\"sq_skill_level\":1},{\"sq_skill_id\":%d,\"sq_skill_level\":5}]",
                sqFirstSkillId, sqSecondSkillId);       
            SQ_BindSkillResponse sqBindSkillResponse = client.sQ_BindSkill(new SQ_BindSkillRequest()
                .setApplicationId(applicationId)
                .setSqSkills(skills)
                .setUserId(MultiArgument.forSingleValue(firstUserId))
            );
            assertEquals(1, sqBindSkillResponse.getResult(),
                "Bind skill result should be 1");
            System.out.println("'SQBindSkill' succeeded.");
            
        } catch (ClientException | InterruptedException | IOException ex) {
            Exception e = ex;
            ((Exception) e).printStackTrace();
        }
    }
}