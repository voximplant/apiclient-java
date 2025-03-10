package com.voximplant.apiclient;

import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.request.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.voximplant.apiclient.util.RequestSerializer;
import java.io.IOException;
import java.io.InputStream;

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
    public A2PGetSmsHistoryResponse a2PGetSmsHistory(A2PGetSmsHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("A2PGetSmsHistory", RequestSerializer.serialize(req)), A2PGetSmsHistoryResponse.class);
    }
    public A2PSendSmsResponse a2PSendSms(A2PSendSmsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("A2PSendSms", RequestSerializer.serialize(req)), A2PSendSmsResponse.class);
    }
    public ActivateCallerIDResponse activateCallerID(ActivateCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("ActivateCallerID", RequestSerializer.serialize(req)), ActivateCallerIDResponse.class);
    }
    public ActivateOutboundTestPhoneNumberResponse activateOutboundTestPhoneNumber(ActivateOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("ActivateOutboundTestPhoneNumber", RequestSerializer.serialize(req)), ActivateOutboundTestPhoneNumberResponse.class);
    }
    public AddAdminRoleResponse addAdminRole(AddAdminRoleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddAdminRole", RequestSerializer.serialize(req)), AddAdminRoleResponse.class);
    }
    public AddAdminUserResponse addAdminUser(AddAdminUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddAdminUser", RequestSerializer.serialize(req)), AddAdminUserResponse.class);
    }
    public AddApplicationResponse addApplication(AddApplicationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddApplication", RequestSerializer.serialize(req)), AddApplicationResponse.class);
    }
    public AddAuthorizedAccountIPResponse addAuthorizedAccountIP(AddAuthorizedAccountIPRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddAuthorizedAccountIP", RequestSerializer.serialize(req)), AddAuthorizedAccountIPResponse.class);
    }
    public AddCallerIDResponse addCallerID(AddCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddCallerID", RequestSerializer.serialize(req)), AddCallerIDResponse.class);
    }
    public AddDialogflowKeyResponse addDialogflowKey(AddDialogflowKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddDialogflowKey", RequestSerializer.serialize(req)), AddDialogflowKeyResponse.class);
    }
    public AddOutboundTestPhoneNumberResponse addOutboundTestPhoneNumber(AddOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddOutboundTestPhoneNumber", RequestSerializer.serialize(req)), AddOutboundTestPhoneNumberResponse.class);
    }
    public AddPstnBlackListItemResponse addPstnBlackListItem(AddPstnBlackListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddPstnBlackListItem", RequestSerializer.serialize(req)), AddPstnBlackListItemResponse.class);
    }
    public AddPushCredentialResponse addPushCredential(AddPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddPushCredential", RequestSerializer.serialize(req)), AddPushCredentialResponse.class);
    }
    public AddQueueResponse addQueue(AddQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddQueue", RequestSerializer.serialize(req)), AddQueueResponse.class);
    }
    public AddRuleResponse addRule(AddRuleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddRule", RequestSerializer.serialize(req)), AddRuleResponse.class);
    }
    public AddScenarioResponse addScenario(AddScenarioRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddScenario", RequestSerializer.serialize(req)), AddScenarioResponse.class);
    }
    public AddSipWhiteListItemResponse addSipWhiteListItem(AddSipWhiteListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddSipWhiteListItem", RequestSerializer.serialize(req)), AddSipWhiteListItemResponse.class);
    }
    public AddSkillResponse addSkill(AddSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddSkill", RequestSerializer.serialize(req)), AddSkillResponse.class);
    }
    public AddSubUserResponse addSubUser(AddSubUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddSubUser", RequestSerializer.serialize(req)), AddSubUserResponse.class);
    }
    public AddUserResponse addUser(AddUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AddUser", RequestSerializer.serialize(req)), AddUserResponse.class);
    }
    public AppendToCallListResponse appendToCallList(AppendToCallListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AppendToCallList", RequestSerializer.serialize(req)), AppendToCallListResponse.class);
    }
    public AttachAdminRoleResponse attachAdminRole(AttachAdminRoleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AttachAdminRole", RequestSerializer.serialize(req)), AttachAdminRoleResponse.class);
    }
    public AttachPhoneNumberResponse attachPhoneNumber(AttachPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("AttachPhoneNumber", RequestSerializer.serialize(req)), AttachPhoneNumberResponse.class);
    }
    public BindDialogflowKeysResponse bindDialogflowKeys(BindDialogflowKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("BindDialogflowKeys", RequestSerializer.serialize(req)), BindDialogflowKeysResponse.class);
    }
    public BindPhoneNumberToApplicationResponse bindPhoneNumberToApplication(BindPhoneNumberToApplicationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("BindPhoneNumberToApplication", RequestSerializer.serialize(req)), BindPhoneNumberToApplicationResponse.class);
    }
    public BindPushCredentialResponse bindPushCredential(BindPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("BindPushCredential", RequestSerializer.serialize(req)), BindPushCredentialResponse.class);
    }
    public BindScenarioResponse bindScenario(BindScenarioRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("BindScenario", RequestSerializer.serialize(req)), BindScenarioResponse.class);
    }
    public BindSipRegistrationResponse bindSipRegistration(BindSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("BindSipRegistration", RequestSerializer.serialize(req)), BindSipRegistrationResponse.class);
    }
    public BindSkillResponse bindSkill(BindSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("BindSkill", RequestSerializer.serialize(req)), BindSkillResponse.class);
    }
    public BindUserToQueueResponse bindUserToQueue(BindUserToQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("BindUserToQueue", RequestSerializer.serialize(req)), BindUserToQueueResponse.class);
    }
    public CancelCallListTaskResponse cancelCallListTask(CancelCallListTaskRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("CancelCallListTask", RequestSerializer.serialize(req)), CancelCallListTaskResponse.class);
    }
    public ChangeAccountPlanResponse changeAccountPlan(ChangeAccountPlanRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("ChangeAccountPlan", RequestSerializer.serialize(req)), ChangeAccountPlanResponse.class);
    }
    public ChargeAccountResponse chargeAccount(ChargeAccountRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("ChargeAccount", RequestSerializer.serialize(req)), ChargeAccountResponse.class);
    }
    public CheckAuthorizedAccountIPResponse checkAuthorizedAccountIP(CheckAuthorizedAccountIPRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("CheckAuthorizedAccountIP", RequestSerializer.serialize(req)), CheckAuthorizedAccountIPResponse.class);
    }
    public ControlSmsResponse controlSms(ControlSmsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("ControlSms", RequestSerializer.serialize(req)), ControlSmsResponse.class);
    }
    public CreateCallListResponse createCallList(CreateCallListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("CreateCallList", RequestSerializer.serialize(req)), CreateCallListResponse.class);
    }
    public CreateKeyResponse createKey(CreateKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("CreateKey", RequestSerializer.serialize(req)), CreateKeyResponse.class);
    }
    public CreateSipRegistrationResponse createSipRegistration(CreateSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("CreateSipRegistration", RequestSerializer.serialize(req)), CreateSipRegistrationResponse.class);
    }
    public DeactivatePhoneNumberResponse deactivatePhoneNumber(DeactivatePhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DeactivatePhoneNumber", RequestSerializer.serialize(req)), DeactivatePhoneNumberResponse.class);
    }
    public DelAdminRoleResponse delAdminRole(DelAdminRoleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelAdminRole", RequestSerializer.serialize(req)), DelAdminRoleResponse.class);
    }
    public DelAdminUserResponse delAdminUser(DelAdminUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelAdminUser", RequestSerializer.serialize(req)), DelAdminUserResponse.class);
    }
    public DelApplicationResponse delApplication(DelApplicationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelApplication", RequestSerializer.serialize(req)), DelApplicationResponse.class);
    }
    public DelAuthorizedAccountIPResponse delAuthorizedAccountIP(DelAuthorizedAccountIPRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelAuthorizedAccountIP", RequestSerializer.serialize(req)), DelAuthorizedAccountIPResponse.class);
    }
    public DelCallerIDResponse delCallerID(DelCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelCallerID", RequestSerializer.serialize(req)), DelCallerIDResponse.class);
    }
    public DelDialogflowKeyResponse delDialogflowKey(DelDialogflowKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelDialogflowKey", RequestSerializer.serialize(req)), DelDialogflowKeyResponse.class);
    }
    public DelKeyValueItemResponse delKeyValueItem(DelKeyValueItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelKeyValueItem", RequestSerializer.serialize(req)), DelKeyValueItemResponse.class);
    }
    public DelOutboundTestPhoneNumberResponse delOutboundTestPhoneNumber(DelOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelOutboundTestPhoneNumber", RequestSerializer.serialize(req)), DelOutboundTestPhoneNumberResponse.class);
    }
    public DelPstnBlackListItemResponse delPstnBlackListItem(DelPstnBlackListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelPstnBlackListItem", RequestSerializer.serialize(req)), DelPstnBlackListItemResponse.class);
    }
    public DelPushCredentialResponse delPushCredential(DelPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelPushCredential", RequestSerializer.serialize(req)), DelPushCredentialResponse.class);
    }
    public DelQueueResponse delQueue(DelQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelQueue", RequestSerializer.serialize(req)), DelQueueResponse.class);
    }
    public DelRuleResponse delRule(DelRuleRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelRule", RequestSerializer.serialize(req)), DelRuleResponse.class);
    }
    public DelScenarioResponse delScenario(DelScenarioRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelScenario", RequestSerializer.serialize(req)), DelScenarioResponse.class);
    }
    public DelSipWhiteListItemResponse delSipWhiteListItem(DelSipWhiteListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelSipWhiteListItem", RequestSerializer.serialize(req)), DelSipWhiteListItemResponse.class);
    }
    public DelSkillResponse delSkill(DelSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelSkill", RequestSerializer.serialize(req)), DelSkillResponse.class);
    }
    public DelSubUserResponse delSubUser(DelSubUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelSubUser", RequestSerializer.serialize(req)), DelSubUserResponse.class);
    }
    public DelUserResponse delUser(DelUserRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DelUser", RequestSerializer.serialize(req)), DelUserResponse.class);
    }
    public DeleteCallListResponse deleteCallList(DeleteCallListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DeleteCallList", RequestSerializer.serialize(req)), DeleteCallListResponse.class);
    }
    public DeleteKeyResponse deleteKey(DeleteKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DeleteKey", RequestSerializer.serialize(req)), DeleteKeyResponse.class);
    }
    public DeleteRecordResponse deleteRecord(DeleteRecordRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DeleteRecord", RequestSerializer.serialize(req)), DeleteRecordResponse.class);
    }
    public DeleteSipRegistrationResponse deleteSipRegistration(DeleteSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("DeleteSipRegistration", RequestSerializer.serialize(req)), DeleteSipRegistrationResponse.class);
    }
    public DownloadHistoryReportResponse downloadHistoryReport(DownloadHistoryReportRequest req) throws java.io.IOException, ClientException {
        Object res = impl.performRequest("DownloadHistoryReport", RequestSerializer.serialize(req));
        if (res instanceof String) {
            ObjectMapper mapper  = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            return mapper.readValue((String)res, DownloadHistoryReportResponse.class);
        } else {
            DownloadHistoryReportResponse responseObj = new DownloadHistoryReportResponse();
            responseObj.setFileContent((InputStream)res);
            return responseObj;
        }
    }
    public DownloadInvoiceResponse downloadInvoice(DownloadInvoiceRequest req) throws java.io.IOException, ClientException {
        Object res = impl.performRequest("DownloadInvoice", RequestSerializer.serialize(req));
        if (res instanceof String) {
            ObjectMapper mapper  = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            return mapper.readValue((String)res, DownloadInvoiceResponse.class);
        } else {
            DownloadInvoiceResponse responseObj = new DownloadInvoiceResponse();
            responseObj.setFileContent((InputStream)res);
            return responseObj;
        }
    }
    public EditCallListTaskResponse editCallListTask(EditCallListTaskRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("EditCallListTask", RequestSerializer.serialize(req)), EditCallListTaskResponse.class);
    }
    public GetACDHistoryResponse getACDHistory(GetACDHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetACDHistory", RequestSerializer.serialize(req)), GetACDHistoryResponse.class);
    }
    public GetACDOperatorStatisticsResponse getACDOperatorStatistics(GetACDOperatorStatisticsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetACDOperatorStatistics", RequestSerializer.serialize(req)), GetACDOperatorStatisticsResponse.class);
    }
    public GetACDOperatorStatusStatisticsResponse getACDOperatorStatusStatistics(GetACDOperatorStatusStatisticsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetACDOperatorStatusStatistics", RequestSerializer.serialize(req)), GetACDOperatorStatusStatisticsResponse.class);
    }
    public GetACDQueueStatisticsResponse getACDQueueStatistics(GetACDQueueStatisticsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetACDQueueStatistics", RequestSerializer.serialize(req)), GetACDQueueStatisticsResponse.class);
    }
    public GetACDStateResponse getACDState(GetACDStateRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetACDState", RequestSerializer.serialize(req)), GetACDStateResponse.class);
    }
    public GetAccountDocumentsResponse getAccountDocuments(GetAccountDocumentsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAccountDocuments", RequestSerializer.serialize(req)), GetAccountDocumentsResponse.class);
    }
    public GetAccountInfoResponse getAccountInfo(GetAccountInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAccountInfo", RequestSerializer.serialize(req)), GetAccountInfoResponse.class);
    }
    public GetAccountInvoicesResponse getAccountInvoices(GetAccountInvoicesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAccountInvoices", RequestSerializer.serialize(req)), GetAccountInvoicesResponse.class);
    }
    public GetAccountPhoneNumberCountriesResponse getAccountPhoneNumberCountries(GetAccountPhoneNumberCountriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAccountPhoneNumberCountries", RequestSerializer.serialize(req)), GetAccountPhoneNumberCountriesResponse.class);
    }
    public GetAccountPlansResponse getAccountPlans(GetAccountPlansRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAccountPlans", RequestSerializer.serialize(req)), GetAccountPlansResponse.class);
    }
    public GetActualPhoneNumberRegionResponse getActualPhoneNumberRegion(GetActualPhoneNumberRegionRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetActualPhoneNumberRegion", RequestSerializer.serialize(req)), GetActualPhoneNumberRegionResponse.class);
    }
    public GetAdminRolesResponse getAdminRoles(GetAdminRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAdminRoles", RequestSerializer.serialize(req)), GetAdminRolesResponse.class);
    }
    public GetAdminUsersResponse getAdminUsers(GetAdminUsersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAdminUsers", RequestSerializer.serialize(req)), GetAdminUsersResponse.class);
    }
    public GetApplicationsResponse getApplications(GetApplicationsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetApplications", RequestSerializer.serialize(req)), GetApplicationsResponse.class);
    }
    public GetAuditLogResponse getAuditLog(GetAuditLogRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAuditLog", RequestSerializer.serialize(req)), GetAuditLogResponse.class);
    }
    public GetAuditLogAsyncResponse getAuditLogAsync(GetAuditLogAsyncRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAuditLogAsync", RequestSerializer.serialize(req)), GetAuditLogAsyncResponse.class);
    }
    public GetAuthorizedAccountIPsResponse getAuthorizedAccountIPs(GetAuthorizedAccountIPsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAuthorizedAccountIPs", RequestSerializer.serialize(req)), GetAuthorizedAccountIPsResponse.class);
    }
    public GetAvailableAdminRoleEntriesResponse getAvailableAdminRoleEntries(GetAvailableAdminRoleEntriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAvailableAdminRoleEntries", RequestSerializer.serialize(req)), GetAvailableAdminRoleEntriesResponse.class);
    }
    public GetAvailablePlansResponse getAvailablePlans(GetAvailablePlansRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAvailablePlans", RequestSerializer.serialize(req)), GetAvailablePlansResponse.class);
    }
    public GetAvailableRegulationsResponse getAvailableRegulations(GetAvailableRegulationsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetAvailableRegulations", RequestSerializer.serialize(req)), GetAvailableRegulationsResponse.class);
    }
    public GetBriefCallHistoryResponse getBriefCallHistory(GetBriefCallHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetBriefCallHistory", RequestSerializer.serialize(req)), GetBriefCallHistoryResponse.class);
    }
    public GetCallHistoryResponse getCallHistory(GetCallHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetCallHistory", RequestSerializer.serialize(req)), GetCallHistoryResponse.class);
    }
    public GetCallHistoryAsyncResponse getCallHistoryAsync(GetCallHistoryAsyncRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetCallHistoryAsync", RequestSerializer.serialize(req)), GetCallHistoryAsyncResponse.class);
    }
    public GetCallListDetailsResponse getCallListDetails(GetCallListDetailsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetCallListDetails", RequestSerializer.serialize(req)), GetCallListDetailsResponse.class);
    }
    public GetCallListsResponse getCallLists(GetCallListsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetCallLists", RequestSerializer.serialize(req)), GetCallListsResponse.class);
    }
    public GetCallerIDsResponse getCallerIDs(GetCallerIDsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetCallerIDs", RequestSerializer.serialize(req)), GetCallerIDsResponse.class);
    }
    public GetChildrenAccountsResponse getChildrenAccounts(GetChildrenAccountsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetChildrenAccounts", RequestSerializer.serialize(req)), GetChildrenAccountsResponse.class);
    }
    public GetCountriesResponse getCountries(GetCountriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetCountries", RequestSerializer.serialize(req)), GetCountriesResponse.class);
    }
    public GetCurrencyRateResponse getCurrencyRate(GetCurrencyRateRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetCurrencyRate", RequestSerializer.serialize(req)), GetCurrencyRateResponse.class);
    }
    public GetDialogflowKeysResponse getDialogflowKeys(GetDialogflowKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetDialogflowKeys", RequestSerializer.serialize(req)), GetDialogflowKeysResponse.class);
    }
    public GetHistoryReportsResponse getHistoryReports(GetHistoryReportsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetHistoryReports", RequestSerializer.serialize(req)), GetHistoryReportsResponse.class);
    }
    public GetKeyRolesResponse getKeyRoles(GetKeyRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetKeyRoles", RequestSerializer.serialize(req)), GetKeyRolesResponse.class);
    }
    public GetKeyValueItemResponse getKeyValueItem(GetKeyValueItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetKeyValueItem", RequestSerializer.serialize(req)), GetKeyValueItemResponse.class);
    }
    public GetKeyValueItemsResponse getKeyValueItems(GetKeyValueItemsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetKeyValueItems", RequestSerializer.serialize(req)), GetKeyValueItemsResponse.class);
    }
    public GetKeyValueKeysResponse getKeyValueKeys(GetKeyValueKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetKeyValueKeys", RequestSerializer.serialize(req)), GetKeyValueKeysResponse.class);
    }
    public GetKeysResponse getKeys(GetKeysRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetKeys", RequestSerializer.serialize(req)), GetKeysResponse.class);
    }
    public GetMoneyAmountToChargeResponse getMoneyAmountToCharge(GetMoneyAmountToChargeRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetMoneyAmountToCharge", RequestSerializer.serialize(req)), GetMoneyAmountToChargeResponse.class);
    }
    public GetNewPhoneNumbersResponse getNewPhoneNumbers(GetNewPhoneNumbersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetNewPhoneNumbers", RequestSerializer.serialize(req)), GetNewPhoneNumbersResponse.class);
    }
    public GetOutboundTestPhoneNumbersResponse getOutboundTestPhoneNumbers(GetOutboundTestPhoneNumbersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetOutboundTestPhoneNumbers", RequestSerializer.serialize(req)), GetOutboundTestPhoneNumbersResponse.class);
    }
    public GetPhoneNumberCategoriesResponse getPhoneNumberCategories(GetPhoneNumberCategoriesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPhoneNumberCategories", RequestSerializer.serialize(req)), GetPhoneNumberCategoriesResponse.class);
    }
    public GetPhoneNumberCountryStatesResponse getPhoneNumberCountryStates(GetPhoneNumberCountryStatesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPhoneNumberCountryStates", RequestSerializer.serialize(req)), GetPhoneNumberCountryStatesResponse.class);
    }
    public GetPhoneNumberRegionsResponse getPhoneNumberRegions(GetPhoneNumberRegionsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPhoneNumberRegions", RequestSerializer.serialize(req)), GetPhoneNumberRegionsResponse.class);
    }
    public GetPhoneNumberReportsResponse getPhoneNumberReports(GetPhoneNumberReportsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPhoneNumberReports", RequestSerializer.serialize(req)), GetPhoneNumberReportsResponse.class);
    }
    public GetPhoneNumbersResponse getPhoneNumbers(GetPhoneNumbersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPhoneNumbers", RequestSerializer.serialize(req)), GetPhoneNumbersResponse.class);
    }
    public GetPhoneNumbersAsyncResponse getPhoneNumbersAsync(GetPhoneNumbersAsyncRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPhoneNumbersAsync", RequestSerializer.serialize(req)), GetPhoneNumbersAsyncResponse.class);
    }
    public GetPstnBlackListResponse getPstnBlackList(GetPstnBlackListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPstnBlackList", RequestSerializer.serialize(req)), GetPstnBlackListResponse.class);
    }
    public GetPushCredentialResponse getPushCredential(GetPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetPushCredential", RequestSerializer.serialize(req)), GetPushCredentialResponse.class);
    }
    public GetQueuesResponse getQueues(GetQueuesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetQueues", RequestSerializer.serialize(req)), GetQueuesResponse.class);
    }
    public GetRecordStoragesResponse getRecordStorages(GetRecordStoragesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetRecordStorages", RequestSerializer.serialize(req)), GetRecordStoragesResponse.class);
    }
    public GetRegionsResponse getRegions(GetRegionsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetRegions", RequestSerializer.serialize(req)), GetRegionsResponse.class);
    }
    public GetRegulationsAddressResponse getRegulationsAddress(GetRegulationsAddressRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetRegulationsAddress", RequestSerializer.serialize(req)), GetRegulationsAddressResponse.class);
    }
    public GetResourcePriceResponse getResourcePrice(GetResourcePriceRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetResourcePrice", RequestSerializer.serialize(req)), GetResourcePriceResponse.class);
    }
    public GetRoleGroupsResponse getRoleGroups(GetRoleGroupsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetRoleGroups", RequestSerializer.serialize(req)), GetRoleGroupsResponse.class);
    }
    public GetRolesResponse getRoles(GetRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetRoles", RequestSerializer.serialize(req)), GetRolesResponse.class);
    }
    public GetRulesResponse getRules(GetRulesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetRules", RequestSerializer.serialize(req)), GetRulesResponse.class);
    }
    public GetSQStateResponse getSQState(GetSQStateRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSQState", RequestSerializer.serialize(req)), GetSQStateResponse.class);
    }
    public GetScenariosResponse getScenarios(GetScenariosRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetScenarios", RequestSerializer.serialize(req)), GetScenariosResponse.class);
    }
    public GetSipRegistrationsResponse getSipRegistrations(GetSipRegistrationsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSipRegistrations", RequestSerializer.serialize(req)), GetSipRegistrationsResponse.class);
    }
    public GetSipWhiteListResponse getSipWhiteList(GetSipWhiteListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSipWhiteList", RequestSerializer.serialize(req)), GetSipWhiteListResponse.class);
    }
    public GetSkillsResponse getSkills(GetSkillsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSkills", RequestSerializer.serialize(req)), GetSkillsResponse.class);
    }
    public GetSmartQueueDayHistoryResponse getSmartQueueDayHistory(GetSmartQueueDayHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSmartQueueDayHistory", RequestSerializer.serialize(req)), GetSmartQueueDayHistoryResponse.class);
    }
    public GetSmartQueueRealtimeMetricsResponse getSmartQueueRealtimeMetrics(GetSmartQueueRealtimeMetricsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSmartQueueRealtimeMetrics", RequestSerializer.serialize(req)), GetSmartQueueRealtimeMetricsResponse.class);
    }
    public GetSmsHistoryResponse getSmsHistory(GetSmsHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSmsHistory", RequestSerializer.serialize(req)), GetSmsHistoryResponse.class);
    }
    public GetSubUserRolesResponse getSubUserRoles(GetSubUserRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSubUserRoles", RequestSerializer.serialize(req)), GetSubUserRolesResponse.class);
    }
    public GetSubUsersResponse getSubUsers(GetSubUsersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSubUsers", RequestSerializer.serialize(req)), GetSubUsersResponse.class);
    }
    public GetSubscriptionPriceResponse getSubscriptionPrice(GetSubscriptionPriceRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetSubscriptionPrice", RequestSerializer.serialize(req)), GetSubscriptionPriceResponse.class);
    }
    public GetTransactionHistoryResponse getTransactionHistory(GetTransactionHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetTransactionHistory", RequestSerializer.serialize(req)), GetTransactionHistoryResponse.class);
    }
    public GetTransactionHistoryAsyncResponse getTransactionHistoryAsync(GetTransactionHistoryAsyncRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetTransactionHistoryAsync", RequestSerializer.serialize(req)), GetTransactionHistoryAsyncResponse.class);
    }
    public GetUsersResponse getUsers(GetUsersRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetUsers", RequestSerializer.serialize(req)), GetUsersResponse.class);
    }
    public GetZIPCodesResponse getZIPCodes(GetZIPCodesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("GetZIPCodes", RequestSerializer.serialize(req)), GetZIPCodesResponse.class);
    }
    public LinkRegulationAddressResponse linkRegulationAddress(LinkRegulationAddressRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("LinkRegulationAddress", RequestSerializer.serialize(req)), LinkRegulationAddressResponse.class);
    }
    public RecoverCallListResponse recoverCallList(RecoverCallListRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("RecoverCallList", RequestSerializer.serialize(req)), RecoverCallListResponse.class);
    }
    public RemoveKeyRolesResponse removeKeyRoles(RemoveKeyRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("RemoveKeyRoles", RequestSerializer.serialize(req)), RemoveKeyRolesResponse.class);
    }
    public RemoveSubUserRolesResponse removeSubUserRoles(RemoveSubUserRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("RemoveSubUserRoles", RequestSerializer.serialize(req)), RemoveSubUserRolesResponse.class);
    }
    public ReorderRulesResponse reorderRules(ReorderRulesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("ReorderRules", RequestSerializer.serialize(req)), ReorderRulesResponse.class);
    }
    public ReorderScenariosResponse reorderScenarios(ReorderScenariosRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("ReorderScenarios", RequestSerializer.serialize(req)), ReorderScenariosResponse.class);
    }
    public RequestSmartQueueHistoryResponse requestSmartQueueHistory(RequestSmartQueueHistoryRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("RequestSmartQueueHistory", RequestSerializer.serialize(req)), RequestSmartQueueHistoryResponse.class);
    }
    public SQ_AddQueueResponse sQ_AddQueue(SQ_AddQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_AddQueue", RequestSerializer.serialize(req)), SQ_AddQueueResponse.class);
    }
    public SQ_AddSkillResponse sQ_AddSkill(SQ_AddSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_AddSkill", RequestSerializer.serialize(req)), SQ_AddSkillResponse.class);
    }
    public SQ_BindAgentResponse sQ_BindAgent(SQ_BindAgentRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_BindAgent", RequestSerializer.serialize(req)), SQ_BindAgentResponse.class);
    }
    public SQ_BindSkillResponse sQ_BindSkill(SQ_BindSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_BindSkill", RequestSerializer.serialize(req)), SQ_BindSkillResponse.class);
    }
    public SQ_DelQueueResponse sQ_DelQueue(SQ_DelQueueRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_DelQueue", RequestSerializer.serialize(req)), SQ_DelQueueResponse.class);
    }
    public SQ_DelSkillResponse sQ_DelSkill(SQ_DelSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_DelSkill", RequestSerializer.serialize(req)), SQ_DelSkillResponse.class);
    }
    public SQ_DeleteAgentCustomStatusMappingResponse sQ_DeleteAgentCustomStatusMapping(SQ_DeleteAgentCustomStatusMappingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_DeleteAgentCustomStatusMapping", RequestSerializer.serialize(req)), SQ_DeleteAgentCustomStatusMappingResponse.class);
    }
    public SQ_GetAgentCustomStatusMappingResponse sQ_GetAgentCustomStatusMapping(SQ_GetAgentCustomStatusMappingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_GetAgentCustomStatusMapping", RequestSerializer.serialize(req)), SQ_GetAgentCustomStatusMappingResponse.class);
    }
    public SQ_GetAgentsResponse sQ_GetAgents(SQ_GetAgentsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_GetAgents", RequestSerializer.serialize(req)), SQ_GetAgentsResponse.class);
    }
    public SQ_GetQueuesResponse sQ_GetQueues(SQ_GetQueuesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_GetQueues", RequestSerializer.serialize(req)), SQ_GetQueuesResponse.class);
    }
    public SQ_GetSkillsResponse sQ_GetSkills(SQ_GetSkillsRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_GetSkills", RequestSerializer.serialize(req)), SQ_GetSkillsResponse.class);
    }
    public SQ_SetAgentCustomStatusMappingResponse sQ_SetAgentCustomStatusMapping(SQ_SetAgentCustomStatusMappingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_SetAgentCustomStatusMapping", RequestSerializer.serialize(req)), SQ_SetAgentCustomStatusMappingResponse.class);
    }
    public SQ_SetAgentInfoResponse sQ_SetAgentInfo(SQ_SetAgentInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_SetAgentInfo", RequestSerializer.serialize(req)), SQ_SetAgentInfoResponse.class);
    }
    public SQ_SetQueueInfoResponse sQ_SetQueueInfo(SQ_SetQueueInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_SetQueueInfo", RequestSerializer.serialize(req)), SQ_SetQueueInfoResponse.class);
    }
    public SQ_SetSkillInfoResponse sQ_SetSkillInfo(SQ_SetSkillInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_SetSkillInfo", RequestSerializer.serialize(req)), SQ_SetSkillInfoResponse.class);
    }
    public SQ_UnbindAgentResponse sQ_UnbindAgent(SQ_UnbindAgentRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_UnbindAgent", RequestSerializer.serialize(req)), SQ_UnbindAgentResponse.class);
    }
    public SQ_UnbindSkillResponse sQ_UnbindSkill(SQ_UnbindSkillRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SQ_UnbindSkill", RequestSerializer.serialize(req)), SQ_UnbindSkillResponse.class);
    }
    public SendSmsMessageResponse sendSmsMessage(SendSmsMessageRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SendSmsMessage", RequestSerializer.serialize(req)), SendSmsMessageResponse.class);
    }
    public SetAccountInfoResponse setAccountInfo(SetAccountInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetAccountInfo", RequestSerializer.serialize(req)), SetAccountInfoResponse.class);
    }
    public SetAdminRoleInfoResponse setAdminRoleInfo(SetAdminRoleInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetAdminRoleInfo", RequestSerializer.serialize(req)), SetAdminRoleInfoResponse.class);
    }
    public SetAdminUserInfoResponse setAdminUserInfo(SetAdminUserInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetAdminUserInfo", RequestSerializer.serialize(req)), SetAdminUserInfoResponse.class);
    }
    public SetApplicationInfoResponse setApplicationInfo(SetApplicationInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetApplicationInfo", RequestSerializer.serialize(req)), SetApplicationInfoResponse.class);
    }
    public SetChildAccountInfoResponse setChildAccountInfo(SetChildAccountInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetChildAccountInfo", RequestSerializer.serialize(req)), SetChildAccountInfoResponse.class);
    }
    public SetDialogflowKeyResponse setDialogflowKey(SetDialogflowKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetDialogflowKey", RequestSerializer.serialize(req)), SetDialogflowKeyResponse.class);
    }
    public SetKeyRolesResponse setKeyRoles(SetKeyRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetKeyRoles", RequestSerializer.serialize(req)), SetKeyRolesResponse.class);
    }
    public SetKeyValueItemResponse setKeyValueItem(SetKeyValueItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetKeyValueItem", RequestSerializer.serialize(req)), SetKeyValueItemResponse.class);
    }
    public SetPhoneNumberInfoResponse setPhoneNumberInfo(SetPhoneNumberInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetPhoneNumberInfo", RequestSerializer.serialize(req)), SetPhoneNumberInfoResponse.class);
    }
    public SetPstnBlackListItemResponse setPstnBlackListItem(SetPstnBlackListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetPstnBlackListItem", RequestSerializer.serialize(req)), SetPstnBlackListItemResponse.class);
    }
    public SetPushCredentialResponse setPushCredential(SetPushCredentialRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetPushCredential", RequestSerializer.serialize(req)), SetPushCredentialResponse.class);
    }
    public SetQueueInfoResponse setQueueInfo(SetQueueInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetQueueInfo", RequestSerializer.serialize(req)), SetQueueInfoResponse.class);
    }
    public SetRuleInfoResponse setRuleInfo(SetRuleInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetRuleInfo", RequestSerializer.serialize(req)), SetRuleInfoResponse.class);
    }
    public SetScenarioInfoResponse setScenarioInfo(SetScenarioInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetScenarioInfo", RequestSerializer.serialize(req)), SetScenarioInfoResponse.class);
    }
    public SetSipWhiteListItemResponse setSipWhiteListItem(SetSipWhiteListItemRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetSipWhiteListItem", RequestSerializer.serialize(req)), SetSipWhiteListItemResponse.class);
    }
    public SetSkillInfoResponse setSkillInfo(SetSkillInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetSkillInfo", RequestSerializer.serialize(req)), SetSkillInfoResponse.class);
    }
    public SetSubUserInfoResponse setSubUserInfo(SetSubUserInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetSubUserInfo", RequestSerializer.serialize(req)), SetSubUserInfoResponse.class);
    }
    public SetSubUserRolesResponse setSubUserRoles(SetSubUserRolesRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetSubUserRoles", RequestSerializer.serialize(req)), SetSubUserRolesResponse.class);
    }
    public SetUserInfoResponse setUserInfo(SetUserInfoRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("SetUserInfo", RequestSerializer.serialize(req)), SetUserInfoResponse.class);
    }
    public StartConferenceResponse startConference(StartConferenceRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("StartConference", RequestSerializer.serialize(req)), StartConferenceResponse.class);
    }
    public StartScenariosResponse startScenarios(StartScenariosRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("StartScenarios", RequestSerializer.serialize(req)), StartScenariosResponse.class);
    }
    public StopCallListProcessingResponse stopCallListProcessing(StopCallListProcessingRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("StopCallListProcessing", RequestSerializer.serialize(req)), StopCallListProcessingResponse.class);
    }
    public UpdateKeyResponse updateKey(UpdateKeyRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("UpdateKey", RequestSerializer.serialize(req)), UpdateKeyResponse.class);
    }
    public UpdateSipRegistrationResponse updateSipRegistration(UpdateSipRegistrationRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("UpdateSipRegistration", RequestSerializer.serialize(req)), UpdateSipRegistrationResponse.class);
    }
    public VerifyCallerIDResponse verifyCallerID(VerifyCallerIDRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("VerifyCallerID", RequestSerializer.serialize(req)), VerifyCallerIDResponse.class);
    }
    public VerifyOutboundTestPhoneNumberResponse verifyOutboundTestPhoneNumber(VerifyOutboundTestPhoneNumberRequest req) throws java.io.IOException, ClientException {
        ObjectMapper mapper  = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.readValue((String) impl.performRequest("VerifyOutboundTestPhoneNumber", RequestSerializer.serialize(req)), VerifyOutboundTestPhoneNumberResponse.class);
    }
}