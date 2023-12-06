package com.voximplant.apiclient;

import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.request.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.voximplant.apiclient.util.RequestSerializer;
import java.io.IOException;

/**
 * Voximplant HTTP API client
 */
public class VoximplantAPIClient {
    private final VoximplantAPIClientImpl impl;

    /**
     * Create client instance with default parameters
     * @param credentials Voximplant HTTP API Service account credentials file path
     * @throws IOException
     * @throws ClientException
     */
    public VoximplantAPIClient(String credentials) throws IOException, ClientException {
        this(ClientConfiguration.builder()
                .setCredentialsPath(credentials)
                .build());
    }

    /**
     * Create client instance with custom parameters
     * @param clientConfiguration You should set credentialsPath, other parameters are optional
     * @throws IOException
     * @throws ClientException
     */
    public VoximplantAPIClient(ClientConfiguration clientConfiguration) throws IOException, ClientException {
        this.impl = new VoximplantAPIClientImpl(clientConfiguration);
    }

    public GetAccountInfoResponse getAccountInfo(GetAccountInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAccountInfo", RequestSerializer.serialize(req)), GetAccountInfoResponse.class);
    }

    public SetAccountInfoResponse setAccountInfo(SetAccountInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetAccountInfo", RequestSerializer.serialize(req)), SetAccountInfoResponse.class);
    }

    public SetChildAccountInfoResponse setChildAccountInfo(SetChildAccountInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetChildAccountInfo", RequestSerializer.serialize(req)), SetChildAccountInfoResponse.class);
    }

    public GetCurrencyRateResponse getCurrencyRate(GetCurrencyRateRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetCurrencyRate", RequestSerializer.serialize(req)), GetCurrencyRateResponse.class);
    }

    public GetResourcePriceResponse getResourcePrice(GetResourcePriceRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetResourcePrice", RequestSerializer.serialize(req)), GetResourcePriceResponse.class);
    }

    public GetSubscriptionPriceResponse getSubscriptionPrice(GetSubscriptionPriceRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSubscriptionPrice", RequestSerializer.serialize(req)), GetSubscriptionPriceResponse.class);
    }

    public GetChildrenAccountsResponse getChildrenAccounts(GetChildrenAccountsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetChildrenAccounts", RequestSerializer.serialize(req)), GetChildrenAccountsResponse.class);
    }

    public GetMoneyAmountToChargeResponse getMoneyAmountToCharge(GetMoneyAmountToChargeRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetMoneyAmountToCharge", RequestSerializer.serialize(req)), GetMoneyAmountToChargeResponse.class);
    }

    public ChargeAccountResponse chargeAccount(ChargeAccountRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("ChargeAccount", RequestSerializer.serialize(req)), ChargeAccountResponse.class);
    }

    public ChangeAccountPlanResponse changeAccountPlan(ChangeAccountPlanRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("ChangeAccountPlan", RequestSerializer.serialize(req)), ChangeAccountPlanResponse.class);
    }

    public GetAccountPlansResponse getAccountPlans(GetAccountPlansRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAccountPlans", RequestSerializer.serialize(req)), GetAccountPlansResponse.class);
    }

    public GetAvailablePlansResponse getAvailablePlans(GetAvailablePlansRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAvailablePlans", RequestSerializer.serialize(req)), GetAvailablePlansResponse.class);
    }

    public AddApplicationResponse addApplication(AddApplicationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddApplication", RequestSerializer.serialize(req)), AddApplicationResponse.class);
    }

    public DelApplicationResponse delApplication(DelApplicationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelApplication", RequestSerializer.serialize(req)), DelApplicationResponse.class);
    }

    public SetApplicationInfoResponse setApplicationInfo(SetApplicationInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetApplicationInfo", RequestSerializer.serialize(req)), SetApplicationInfoResponse.class);
    }

    public GetApplicationsResponse getApplications(GetApplicationsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetApplications", RequestSerializer.serialize(req)), GetApplicationsResponse.class);
    }

    public AddUserResponse addUser(AddUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddUser", RequestSerializer.serialize(req)), AddUserResponse.class);
    }

    public DelUserResponse delUser(DelUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelUser", RequestSerializer.serialize(req)), DelUserResponse.class);
    }

    public SetUserInfoResponse setUserInfo(SetUserInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetUserInfo", RequestSerializer.serialize(req)), SetUserInfoResponse.class);
    }

    public GetUsersResponse getUsers(GetUsersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetUsers", RequestSerializer.serialize(req)), GetUsersResponse.class);
    }

    public TransferMoneyToUserResponse transferMoneyToUser(TransferMoneyToUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("TransferMoneyToUser", RequestSerializer.serialize(req)), TransferMoneyToUserResponse.class);
    }

    public CreateCallListResponse createCallList(CreateCallListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("CreateCallList", RequestSerializer.serialize(req)), CreateCallListResponse.class);
    }

    public GetCallListsResponse getCallLists(GetCallListsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetCallLists", RequestSerializer.serialize(req)), GetCallListsResponse.class);
    }

    public GetCallListDetailsResponse getCallListDetails(GetCallListDetailsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetCallListDetails", RequestSerializer.serialize(req)), GetCallListDetailsResponse.class);
    }

    public StopCallListProcessingResponse stopCallListProcessing(StopCallListProcessingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("StopCallListProcessing", RequestSerializer.serialize(req)), StopCallListProcessingResponse.class);
    }

    public RecoverCallListResponse recoverCallList(RecoverCallListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("RecoverCallList", RequestSerializer.serialize(req)), RecoverCallListResponse.class);
    }

    public AddScenarioResponse addScenario(AddScenarioRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddScenario", RequestSerializer.serialize(req)), AddScenarioResponse.class);
    }

    public DelScenarioResponse delScenario(DelScenarioRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelScenario", RequestSerializer.serialize(req)), DelScenarioResponse.class);
    }

    public BindScenarioResponse bindScenario(BindScenarioRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("BindScenario", RequestSerializer.serialize(req)), BindScenarioResponse.class);
    }

    public GetScenariosResponse getScenarios(GetScenariosRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetScenarios", RequestSerializer.serialize(req)), GetScenariosResponse.class);
    }

    public SetScenarioInfoResponse setScenarioInfo(SetScenarioInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetScenarioInfo", RequestSerializer.serialize(req)), SetScenarioInfoResponse.class);
    }

    public ReorderScenariosResponse reorderScenarios(ReorderScenariosRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("ReorderScenarios", RequestSerializer.serialize(req)), ReorderScenariosResponse.class);
    }

    public StartScenariosResponse startScenarios(StartScenariosRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("StartScenarios", RequestSerializer.serialize(req)), StartScenariosResponse.class);
    }

    public StartConferenceResponse startConference(StartConferenceRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("StartConference", RequestSerializer.serialize(req)), StartConferenceResponse.class);
    }

    public AddRuleResponse addRule(AddRuleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddRule", RequestSerializer.serialize(req)), AddRuleResponse.class);
    }

    public DelRuleResponse delRule(DelRuleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelRule", RequestSerializer.serialize(req)), DelRuleResponse.class);
    }

    public SetRuleInfoResponse setRuleInfo(SetRuleInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetRuleInfo", RequestSerializer.serialize(req)), SetRuleInfoResponse.class);
    }

    public GetRulesResponse getRules(GetRulesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetRules", RequestSerializer.serialize(req)), GetRulesResponse.class);
    }

    public ReorderRulesResponse reorderRules(ReorderRulesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("ReorderRules", RequestSerializer.serialize(req)), ReorderRulesResponse.class);
    }

    public GetCallHistoryResponse getCallHistory(GetCallHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetCallHistory", RequestSerializer.serialize(req)), GetCallHistoryResponse.class);
    }

    public GetBriefCallHistoryResponse getBriefCallHistory(GetBriefCallHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetBriefCallHistory", RequestSerializer.serialize(req)), GetBriefCallHistoryResponse.class);
    }

    public GetHistoryReportsResponse getHistoryReports(GetHistoryReportsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetHistoryReports", RequestSerializer.serialize(req)), GetHistoryReportsResponse.class);
    }

    public GetTransactionHistoryResponse getTransactionHistory(GetTransactionHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetTransactionHistory", RequestSerializer.serialize(req)), GetTransactionHistoryResponse.class);
    }

    public DeleteRecordResponse deleteRecord(DeleteRecordRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DeleteRecord", RequestSerializer.serialize(req)), DeleteRecordResponse.class);
    }

    public GetACDHistoryResponse getACDHistory(GetACDHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetACDHistory", RequestSerializer.serialize(req)), GetACDHistoryResponse.class);
    }

    public GetAuditLogResponse getAuditLog(GetAuditLogRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAuditLog", RequestSerializer.serialize(req)), GetAuditLogResponse.class);
    }

    public AddPstnBlackListItemResponse addPstnBlackListItem(AddPstnBlackListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddPstnBlackListItem", RequestSerializer.serialize(req)), AddPstnBlackListItemResponse.class);
    }

    public SetPstnBlackListItemResponse setPstnBlackListItem(SetPstnBlackListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetPstnBlackListItem", RequestSerializer.serialize(req)), SetPstnBlackListItemResponse.class);
    }

    public DelPstnBlackListItemResponse delPstnBlackListItem(DelPstnBlackListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelPstnBlackListItem", RequestSerializer.serialize(req)), DelPstnBlackListItemResponse.class);
    }

    public GetPstnBlackListResponse getPstnBlackList(GetPstnBlackListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetPstnBlackList", RequestSerializer.serialize(req)), GetPstnBlackListResponse.class);
    }

    public AddSipWhiteListItemResponse addSipWhiteListItem(AddSipWhiteListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddSipWhiteListItem", RequestSerializer.serialize(req)), AddSipWhiteListItemResponse.class);
    }

    public DelSipWhiteListItemResponse delSipWhiteListItem(DelSipWhiteListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelSipWhiteListItem", RequestSerializer.serialize(req)), DelSipWhiteListItemResponse.class);
    }

    public SetSipWhiteListItemResponse setSipWhiteListItem(SetSipWhiteListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetSipWhiteListItem", RequestSerializer.serialize(req)), SetSipWhiteListItemResponse.class);
    }

    public GetSipWhiteListResponse getSipWhiteList(GetSipWhiteListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSipWhiteList", RequestSerializer.serialize(req)), GetSipWhiteListResponse.class);
    }

    public CreateSipRegistrationResponse createSipRegistration(CreateSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("CreateSipRegistration", RequestSerializer.serialize(req)), CreateSipRegistrationResponse.class);
    }

    public UpdateSipRegistrationResponse updateSipRegistration(UpdateSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("UpdateSipRegistration", RequestSerializer.serialize(req)), UpdateSipRegistrationResponse.class);
    }

    public BindSipRegistrationResponse bindSipRegistration(BindSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("BindSipRegistration", RequestSerializer.serialize(req)), BindSipRegistrationResponse.class);
    }

    public DeleteSipRegistrationResponse deleteSipRegistration(DeleteSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DeleteSipRegistration", RequestSerializer.serialize(req)), DeleteSipRegistrationResponse.class);
    }

    public GetSipRegistrationsResponse getSipRegistrations(GetSipRegistrationsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSipRegistrations", RequestSerializer.serialize(req)), GetSipRegistrationsResponse.class);
    }

    public AttachPhoneNumberResponse attachPhoneNumber(AttachPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AttachPhoneNumber", RequestSerializer.serialize(req)), AttachPhoneNumberResponse.class);
    }

    public BindPhoneNumberToApplicationResponse bindPhoneNumberToApplication(BindPhoneNumberToApplicationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("BindPhoneNumberToApplication", RequestSerializer.serialize(req)), BindPhoneNumberToApplicationResponse.class);
    }

    public DeactivatePhoneNumberResponse deactivatePhoneNumber(DeactivatePhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DeactivatePhoneNumber", RequestSerializer.serialize(req)), DeactivatePhoneNumberResponse.class);
    }

    public SetPhoneNumberInfoResponse setPhoneNumberInfo(SetPhoneNumberInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetPhoneNumberInfo", RequestSerializer.serialize(req)), SetPhoneNumberInfoResponse.class);
    }

    public GetPhoneNumbersResponse getPhoneNumbers(GetPhoneNumbersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetPhoneNumbers", RequestSerializer.serialize(req)), GetPhoneNumbersResponse.class);
    }

    public GetNewPhoneNumbersResponse getNewPhoneNumbers(GetNewPhoneNumbersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetNewPhoneNumbers", RequestSerializer.serialize(req)), GetNewPhoneNumbersResponse.class);
    }

    public GetPhoneNumberCategoriesResponse getPhoneNumberCategories(GetPhoneNumberCategoriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetPhoneNumberCategories", RequestSerializer.serialize(req)), GetPhoneNumberCategoriesResponse.class);
    }

    public GetPhoneNumberCountryStatesResponse getPhoneNumberCountryStates(GetPhoneNumberCountryStatesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetPhoneNumberCountryStates", RequestSerializer.serialize(req)), GetPhoneNumberCountryStatesResponse.class);
    }

    public GetPhoneNumberRegionsResponse getPhoneNumberRegions(GetPhoneNumberRegionsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetPhoneNumberRegions", RequestSerializer.serialize(req)), GetPhoneNumberRegionsResponse.class);
    }

    public GetActualPhoneNumberRegionResponse getActualPhoneNumberRegion(GetActualPhoneNumberRegionRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetActualPhoneNumberRegion", RequestSerializer.serialize(req)), GetActualPhoneNumberRegionResponse.class);
    }

    public AddCallerIDResponse addCallerID(AddCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddCallerID", RequestSerializer.serialize(req)), AddCallerIDResponse.class);
    }

    public ActivateCallerIDResponse activateCallerID(ActivateCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("ActivateCallerID", RequestSerializer.serialize(req)), ActivateCallerIDResponse.class);
    }

    public DelCallerIDResponse delCallerID(DelCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelCallerID", RequestSerializer.serialize(req)), DelCallerIDResponse.class);
    }

    public GetCallerIDsResponse getCallerIDs(GetCallerIDsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetCallerIDs", RequestSerializer.serialize(req)), GetCallerIDsResponse.class);
    }

    public VerifyCallerIDResponse verifyCallerID(VerifyCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("VerifyCallerID", RequestSerializer.serialize(req)), VerifyCallerIDResponse.class);
    }

    public AddOutboundTestPhoneNumberResponse addOutboundTestPhoneNumber(AddOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddOutboundTestPhoneNumber", RequestSerializer.serialize(req)), AddOutboundTestPhoneNumberResponse.class);
    }

    public VerifyOutboundTestPhoneNumberResponse verifyOutboundTestPhoneNumber(VerifyOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("VerifyOutboundTestPhoneNumber", RequestSerializer.serialize(req)), VerifyOutboundTestPhoneNumberResponse.class);
    }

    public ActivateOutboundTestPhoneNumberResponse activateOutboundTestPhoneNumber(ActivateOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("ActivateOutboundTestPhoneNumber", RequestSerializer.serialize(req)), ActivateOutboundTestPhoneNumberResponse.class);
    }

    public DelOutboundTestPhoneNumberResponse delOutboundTestPhoneNumber(DelOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelOutboundTestPhoneNumber", RequestSerializer.serialize(req)), DelOutboundTestPhoneNumberResponse.class);
    }

    public GetOutboundTestPhoneNumbersResponse getOutboundTestPhoneNumbers(GetOutboundTestPhoneNumbersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetOutboundTestPhoneNumbers", RequestSerializer.serialize(req)), GetOutboundTestPhoneNumbersResponse.class);
    }

    public AddQueueResponse addQueue(AddQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddQueue", RequestSerializer.serialize(req)), AddQueueResponse.class);
    }

    public BindUserToQueueResponse bindUserToQueue(BindUserToQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("BindUserToQueue", RequestSerializer.serialize(req)), BindUserToQueueResponse.class);
    }

    public DelQueueResponse delQueue(DelQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelQueue", RequestSerializer.serialize(req)), DelQueueResponse.class);
    }

    public SetQueueInfoResponse setQueueInfo(SetQueueInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetQueueInfo", RequestSerializer.serialize(req)), SetQueueInfoResponse.class);
    }

    public GetQueuesResponse getQueues(GetQueuesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetQueues", RequestSerializer.serialize(req)), GetQueuesResponse.class);
    }

    public GetACDStateResponse getACDState(GetACDStateRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetACDState", RequestSerializer.serialize(req)), GetACDStateResponse.class);
    }

    public GetACDOperatorStatisticsResponse getACDOperatorStatistics(GetACDOperatorStatisticsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetACDOperatorStatistics", RequestSerializer.serialize(req)), GetACDOperatorStatisticsResponse.class);
    }

    public GetACDQueueStatisticsResponse getACDQueueStatistics(GetACDQueueStatisticsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetACDQueueStatistics", RequestSerializer.serialize(req)), GetACDQueueStatisticsResponse.class);
    }

    public GetACDOperatorStatusStatisticsResponse getACDOperatorStatusStatistics(GetACDOperatorStatusStatisticsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetACDOperatorStatusStatistics", RequestSerializer.serialize(req)), GetACDOperatorStatusStatisticsResponse.class);
    }

    public GetSmartQueueRealtimeMetricsResponse getSmartQueueRealtimeMetrics(GetSmartQueueRealtimeMetricsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSmartQueueRealtimeMetrics", RequestSerializer.serialize(req)), GetSmartQueueRealtimeMetricsResponse.class);
    }

    public GetSmartQueueDayHistoryResponse getSmartQueueDayHistory(GetSmartQueueDayHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSmartQueueDayHistory", RequestSerializer.serialize(req)), GetSmartQueueDayHistoryResponse.class);
    }

    public RequestSmartQueueHistoryResponse requestSmartQueueHistory(RequestSmartQueueHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("RequestSmartQueueHistory", RequestSerializer.serialize(req)), RequestSmartQueueHistoryResponse.class);
    }

    public GetSQStateResponse getSQState(GetSQStateRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSQState", RequestSerializer.serialize(req)), GetSQStateResponse.class);
    }

    public SQ_SetAgentCustomStatusMappingResponse sQ_SetAgentCustomStatusMapping(SQ_SetAgentCustomStatusMappingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_SetAgentCustomStatusMapping", RequestSerializer.serialize(req)), SQ_SetAgentCustomStatusMappingResponse.class);
    }

    public SQ_GetAgentCustomStatusMappingResponse sQ_GetAgentCustomStatusMapping(SQ_GetAgentCustomStatusMappingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_GetAgentCustomStatusMapping", RequestSerializer.serialize(req)), SQ_GetAgentCustomStatusMappingResponse.class);
    }

    public SQ_DeleteAgentCustomStatusMappingResponse sQ_DeleteAgentCustomStatusMapping(SQ_DeleteAgentCustomStatusMappingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_DeleteAgentCustomStatusMapping", RequestSerializer.serialize(req)), SQ_DeleteAgentCustomStatusMappingResponse.class);
    }

    public AddSkillResponse addSkill(AddSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddSkill", RequestSerializer.serialize(req)), AddSkillResponse.class);
    }

    public DelSkillResponse delSkill(DelSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelSkill", RequestSerializer.serialize(req)), DelSkillResponse.class);
    }

    public SetSkillInfoResponse setSkillInfo(SetSkillInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetSkillInfo", RequestSerializer.serialize(req)), SetSkillInfoResponse.class);
    }

    public GetSkillsResponse getSkills(GetSkillsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSkills", RequestSerializer.serialize(req)), GetSkillsResponse.class);
    }

    public BindSkillResponse bindSkill(BindSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("BindSkill", RequestSerializer.serialize(req)), BindSkillResponse.class);
    }

    public GetAccountDocumentsResponse getAccountDocuments(GetAccountDocumentsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAccountDocuments", RequestSerializer.serialize(req)), GetAccountDocumentsResponse.class);
    }

    public AddAdminUserResponse addAdminUser(AddAdminUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddAdminUser", RequestSerializer.serialize(req)), AddAdminUserResponse.class);
    }

    public DelAdminUserResponse delAdminUser(DelAdminUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelAdminUser", RequestSerializer.serialize(req)), DelAdminUserResponse.class);
    }

    public SetAdminUserInfoResponse setAdminUserInfo(SetAdminUserInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetAdminUserInfo", RequestSerializer.serialize(req)), SetAdminUserInfoResponse.class);
    }

    public GetAdminUsersResponse getAdminUsers(GetAdminUsersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAdminUsers", RequestSerializer.serialize(req)), GetAdminUsersResponse.class);
    }

    public AddAdminRoleResponse addAdminRole(AddAdminRoleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddAdminRole", RequestSerializer.serialize(req)), AddAdminRoleResponse.class);
    }

    public DelAdminRoleResponse delAdminRole(DelAdminRoleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelAdminRole", RequestSerializer.serialize(req)), DelAdminRoleResponse.class);
    }

    public SetAdminRoleInfoResponse setAdminRoleInfo(SetAdminRoleInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetAdminRoleInfo", RequestSerializer.serialize(req)), SetAdminRoleInfoResponse.class);
    }

    public GetAdminRolesResponse getAdminRoles(GetAdminRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAdminRoles", RequestSerializer.serialize(req)), GetAdminRolesResponse.class);
    }

    public AttachAdminRoleResponse attachAdminRole(AttachAdminRoleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AttachAdminRole", RequestSerializer.serialize(req)), AttachAdminRoleResponse.class);
    }

    public GetAvailableAdminRoleEntriesResponse getAvailableAdminRoleEntries(GetAvailableAdminRoleEntriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAvailableAdminRoleEntries", RequestSerializer.serialize(req)), GetAvailableAdminRoleEntriesResponse.class);
    }

    public AddAuthorizedAccountIPResponse addAuthorizedAccountIP(AddAuthorizedAccountIPRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddAuthorizedAccountIP", RequestSerializer.serialize(req)), AddAuthorizedAccountIPResponse.class);
    }

    public DelAuthorizedAccountIPResponse delAuthorizedAccountIP(DelAuthorizedAccountIPRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelAuthorizedAccountIP", RequestSerializer.serialize(req)), DelAuthorizedAccountIPResponse.class);
    }

    public GetAuthorizedAccountIPsResponse getAuthorizedAccountIPs(GetAuthorizedAccountIPsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAuthorizedAccountIPs", RequestSerializer.serialize(req)), GetAuthorizedAccountIPsResponse.class);
    }

    public CheckAuthorizedAccountIPResponse checkAuthorizedAccountIP(CheckAuthorizedAccountIPRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("CheckAuthorizedAccountIP", RequestSerializer.serialize(req)), CheckAuthorizedAccountIPResponse.class);
    }

    public LinkRegulationAddressResponse linkRegulationAddress(LinkRegulationAddressRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("LinkRegulationAddress", RequestSerializer.serialize(req)), LinkRegulationAddressResponse.class);
    }

    public GetZIPCodesResponse getZIPCodes(GetZIPCodesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetZIPCodes", RequestSerializer.serialize(req)), GetZIPCodesResponse.class);
    }

    public GetRegulationsAddressResponse getRegulationsAddress(GetRegulationsAddressRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetRegulationsAddress", RequestSerializer.serialize(req)), GetRegulationsAddressResponse.class);
    }

    public GetAvailableRegulationsResponse getAvailableRegulations(GetAvailableRegulationsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAvailableRegulations", RequestSerializer.serialize(req)), GetAvailableRegulationsResponse.class);
    }

    public GetCountriesResponse getCountries(GetCountriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetCountries", RequestSerializer.serialize(req)), GetCountriesResponse.class);
    }

    public GetAccountPhoneNumberCountriesResponse getAccountPhoneNumberCountries(GetAccountPhoneNumberCountriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAccountPhoneNumberCountries", RequestSerializer.serialize(req)), GetAccountPhoneNumberCountriesResponse.class);
    }

    public GetRegionsResponse getRegions(GetRegionsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetRegions", RequestSerializer.serialize(req)), GetRegionsResponse.class);
    }

    public AddPushCredentialResponse addPushCredential(AddPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddPushCredential", RequestSerializer.serialize(req)), AddPushCredentialResponse.class);
    }

    public SetPushCredentialResponse setPushCredential(SetPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetPushCredential", RequestSerializer.serialize(req)), SetPushCredentialResponse.class);
    }

    public DelPushCredentialResponse delPushCredential(DelPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelPushCredential", RequestSerializer.serialize(req)), DelPushCredentialResponse.class);
    }

    public GetPushCredentialResponse getPushCredential(GetPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetPushCredential", RequestSerializer.serialize(req)), GetPushCredentialResponse.class);
    }

    public BindPushCredentialResponse bindPushCredential(BindPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("BindPushCredential", RequestSerializer.serialize(req)), BindPushCredentialResponse.class);
    }

    public AddDialogflowKeyResponse addDialogflowKey(AddDialogflowKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddDialogflowKey", RequestSerializer.serialize(req)), AddDialogflowKeyResponse.class);
    }

    public SetDialogflowKeyResponse setDialogflowKey(SetDialogflowKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetDialogflowKey", RequestSerializer.serialize(req)), SetDialogflowKeyResponse.class);
    }

    public DelDialogflowKeyResponse delDialogflowKey(DelDialogflowKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelDialogflowKey", RequestSerializer.serialize(req)), DelDialogflowKeyResponse.class);
    }

    public GetDialogflowKeysResponse getDialogflowKeys(GetDialogflowKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetDialogflowKeys", RequestSerializer.serialize(req)), GetDialogflowKeysResponse.class);
    }

    public BindDialogflowKeysResponse bindDialogflowKeys(BindDialogflowKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("BindDialogflowKeys", RequestSerializer.serialize(req)), BindDialogflowKeysResponse.class);
    }

    public SendSmsMessageResponse sendSmsMessage(SendSmsMessageRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SendSmsMessage", RequestSerializer.serialize(req)), SendSmsMessageResponse.class);
    }

    public A2PSendSmsResponse a2PSendSms(A2PSendSmsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("A2PSendSms", RequestSerializer.serialize(req)), A2PSendSmsResponse.class);
    }

    public ControlSmsResponse controlSms(ControlSmsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("ControlSms", RequestSerializer.serialize(req)), ControlSmsResponse.class);
    }

    public GetRecordStoragesResponse getRecordStorages(GetRecordStoragesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetRecordStorages", RequestSerializer.serialize(req)), GetRecordStoragesResponse.class);
    }

    public CreateKeyResponse createKey(CreateKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("CreateKey", RequestSerializer.serialize(req)), CreateKeyResponse.class);
    }

    public GetKeysResponse getKeys(GetKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetKeys", RequestSerializer.serialize(req)), GetKeysResponse.class);
    }

    public UpdateKeyResponse updateKey(UpdateKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("UpdateKey", RequestSerializer.serialize(req)), UpdateKeyResponse.class);
    }

    public DeleteKeyResponse deleteKey(DeleteKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DeleteKey", RequestSerializer.serialize(req)), DeleteKeyResponse.class);
    }

    public SetKeyRolesResponse setKeyRoles(SetKeyRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetKeyRoles", RequestSerializer.serialize(req)), SetKeyRolesResponse.class);
    }

    public GetKeyRolesResponse getKeyRoles(GetKeyRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetKeyRoles", RequestSerializer.serialize(req)), GetKeyRolesResponse.class);
    }

    public RemoveKeyRolesResponse removeKeyRoles(RemoveKeyRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("RemoveKeyRoles", RequestSerializer.serialize(req)), RemoveKeyRolesResponse.class);
    }

    public AddSubUserResponse addSubUser(AddSubUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("AddSubUser", RequestSerializer.serialize(req)), AddSubUserResponse.class);
    }

    public GetSubUsersResponse getSubUsers(GetSubUsersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSubUsers", RequestSerializer.serialize(req)), GetSubUsersResponse.class);
    }

    public SetSubUserInfoResponse setSubUserInfo(SetSubUserInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetSubUserInfo", RequestSerializer.serialize(req)), SetSubUserInfoResponse.class);
    }

    public DelSubUserResponse delSubUser(DelSubUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelSubUser", RequestSerializer.serialize(req)), DelSubUserResponse.class);
    }

    public SetSubUserRolesResponse setSubUserRoles(SetSubUserRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetSubUserRoles", RequestSerializer.serialize(req)), SetSubUserRolesResponse.class);
    }

    public GetSubUserRolesResponse getSubUserRoles(GetSubUserRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSubUserRoles", RequestSerializer.serialize(req)), GetSubUserRolesResponse.class);
    }

    public RemoveSubUserRolesResponse removeSubUserRoles(RemoveSubUserRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("RemoveSubUserRoles", RequestSerializer.serialize(req)), RemoveSubUserRolesResponse.class);
    }

    public GetRolesResponse getRoles(GetRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetRoles", RequestSerializer.serialize(req)), GetRolesResponse.class);
    }

    public GetRoleGroupsResponse getRoleGroups(GetRoleGroupsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetRoleGroups", RequestSerializer.serialize(req)), GetRoleGroupsResponse.class);
    }

    public SetKeyValueItemResponse setKeyValueItem(SetKeyValueItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SetKeyValueItem", RequestSerializer.serialize(req)), SetKeyValueItemResponse.class);
    }

    public DelKeyValueItemResponse delKeyValueItem(DelKeyValueItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("DelKeyValueItem", RequestSerializer.serialize(req)), DelKeyValueItemResponse.class);
    }

    public GetKeyValueItemResponse getKeyValueItem(GetKeyValueItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetKeyValueItem", RequestSerializer.serialize(req)), GetKeyValueItemResponse.class);
    }

    public GetKeyValueItemsResponse getKeyValueItems(GetKeyValueItemsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetKeyValueItems", RequestSerializer.serialize(req)), GetKeyValueItemsResponse.class);
    }

    public GetKeyValueKeysResponse getKeyValueKeys(GetKeyValueKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetKeyValueKeys", RequestSerializer.serialize(req)), GetKeyValueKeysResponse.class);
    }

    public GetAccountInvoicesResponse getAccountInvoices(GetAccountInvoicesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetAccountInvoices", RequestSerializer.serialize(req)), GetAccountInvoicesResponse.class);
    }

    public GetSmsHistoryResponse getSmsHistory(GetSmsHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("GetSmsHistory", RequestSerializer.serialize(req)), GetSmsHistoryResponse.class);
    }

    public A2PGetSmsHistoryResponse a2PGetSmsHistory(A2PGetSmsHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("A2PGetSmsHistory", RequestSerializer.serialize(req)), A2PGetSmsHistoryResponse.class);
    }

    public SQ_AddQueueResponse sQ_AddQueue(SQ_AddQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_AddQueue", RequestSerializer.serialize(req)), SQ_AddQueueResponse.class);
    }

    public SQ_SetQueueInfoResponse sQ_SetQueueInfo(SQ_SetQueueInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_SetQueueInfo", RequestSerializer.serialize(req)), SQ_SetQueueInfoResponse.class);
    }

    public SQ_DelQueueResponse sQ_DelQueue(SQ_DelQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_DelQueue", RequestSerializer.serialize(req)), SQ_DelQueueResponse.class);
    }

    public SQ_GetQueuesResponse sQ_GetQueues(SQ_GetQueuesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_GetQueues", RequestSerializer.serialize(req)), SQ_GetQueuesResponse.class);
    }

    public SQ_AddSkillResponse sQ_AddSkill(SQ_AddSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_AddSkill", RequestSerializer.serialize(req)), SQ_AddSkillResponse.class);
    }

    public SQ_DelSkillResponse sQ_DelSkill(SQ_DelSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_DelSkill", RequestSerializer.serialize(req)), SQ_DelSkillResponse.class);
    }

    public SQ_SetSkillInfoResponse sQ_SetSkillInfo(SQ_SetSkillInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_SetSkillInfo", RequestSerializer.serialize(req)), SQ_SetSkillInfoResponse.class);
    }

    public SQ_BindSkillResponse sQ_BindSkill(SQ_BindSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_BindSkill", RequestSerializer.serialize(req)), SQ_BindSkillResponse.class);
    }

    public SQ_UnbindSkillResponse sQ_UnbindSkill(SQ_UnbindSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_UnbindSkill", RequestSerializer.serialize(req)), SQ_UnbindSkillResponse.class);
    }

    public SQ_GetSkillsResponse sQ_GetSkills(SQ_GetSkillsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_GetSkills", RequestSerializer.serialize(req)), SQ_GetSkillsResponse.class);
    }

    public SQ_BindAgentResponse sQ_BindAgent(SQ_BindAgentRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_BindAgent", RequestSerializer.serialize(req)), SQ_BindAgentResponse.class);
    }

    public SQ_UnbindAgentResponse sQ_UnbindAgent(SQ_UnbindAgentRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_UnbindAgent", RequestSerializer.serialize(req)), SQ_UnbindAgentResponse.class);
    }

    public SQ_GetAgentsResponse sQ_GetAgents(SQ_GetAgentsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_GetAgents", RequestSerializer.serialize(req)), SQ_GetAgentsResponse.class);
    }

    public SQ_SetAgentInfoResponse sQ_SetAgentInfo(SQ_SetAgentInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue(impl.performRequest("SQ_SetAgentInfo", RequestSerializer.serialize(req)), SQ_SetAgentInfoResponse.class);
    }
}