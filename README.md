# Voximplant API client library

#### Version 1.6.0

## Prerequisites

In order to use the Voximplant Java SDK, you need the following:

1. A developer account. If you don't have one, [sign up here](https://voximplant.com/sign-up/).
1. A private API key. There are 2 options to obtain it:
    1. Either generate it in the [Voximplant Control panel](https://manage.voximplant.com/settings/service_accounts)
    1. Or call the [CreateKey](https://voximplant.com/docs/references/httpapi/managing_role_system#createkey) HTTP API
       method with the
       specified [authentication parameters](https://voximplant.com/docs/references/httpapi/auth_parameters). You'll
       receive a response with the __result__ field in it. Save the __result__ value in a file (since we don't store the
       keys, save it securely on your side).
1. JDK 8 and above

## How to use

Setup a `maven` dependency for your project:

```xml

<dependency>
    <groupId>org.voximplant</groupId>
    <artifactId>apiclient</artifactId>
    <version>1.6.0</version>
</dependency>
```

Next, specify the path to the JSON service account file in the constructor.

```java
VoximplantAPIClient api=new VoximplantAPIClient("/path/to/credentials.json");
```

## Examples

### Get a call history item

```java
VoximplantAPIClient api=new VoximplantAPIClient("/path/to/credentials.json");

        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");

        GetCallHistoryResponse callHistory=api.getCallHistory(new GetCallHistoryRequest()
        .setFromDate(df.parse("2020-09-01"))
        .setToDate(df.parse("2020-10-01"))
        .setCount(1));

        CallSessionInfoType[]callSessions=callHistory.getResult();
        if(callSessions.length==1){
        CallSessionInfoType result=callSessions[0];
        }
```

### Send an SMS

```java
VoximplantAPIClient api=new VoximplantAPIClient("/path/to/credentials.json");

        SendSmsMessageResponse sendSmsMessageResponse=api.sendSmsMessage(new SendSmsMessageRequest()
        .setSource("447443332211")
        .setDestination("447443332212")
        .setSmsBody("Test message"));

        if(sendSmsMessageResponse.hasResult()){
        long result=sendSmsMessageResponse.getResult();
        }else{
        throw new IllegalArgumentException(sendSmsMessageResponse.getError().getMsg());
        }
```
