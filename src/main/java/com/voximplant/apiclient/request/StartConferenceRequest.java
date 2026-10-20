package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class StartConferenceRequest implements Alignable {
    private String conferenceName;

    @RequestField(name="conference_name")
    /**
    * The conference name. The name length should be less than 50 symbols
    */
    public String getConferenceName() {
        return this.conferenceName;
    }

    public boolean hasConferenceName() {
        return this.conferenceName != null;
    }

    /**
    * The conference name. The name length should be less than 50 symbols
    */
    public StartConferenceRequest setConferenceName(String d) {
        this.conferenceName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID that needs to be launched. Please note, the necessary
    * scenario needs to be attached to the rule. <b>Required</b> unless
    * <b>rule_name</b> is provided.
    */
    public Long getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID that needs to be launched. Please note, the necessary
    * scenario needs to be attached to the rule. <b>Required</b> unless
    * <b>rule_name</b> is provided.
    */
    public StartConferenceRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name. <b>Required</b> unless <b>rule_id</b> is provided.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name. <b>Required</b> unless <b>rule_id</b> is provided.
    */
    public StartConferenceRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user ID. Run the scripts from the user if set. Can be used
    * instead of the <b>user_name</b> parameter
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID. Run the scripts from the user if set. Can be used
    * instead of the <b>user_name</b> parameter
    */
    public StartConferenceRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name. Run the scripts from the user if set. Can be used
    * instead of the <b>user_id</b> parameter
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name. Run the scripts from the user if set. Can be used
    * instead of the <b>user_id</b> parameter
    */
    public StartConferenceRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID. Can be used instead of the
    * <b>application_name</b> parameter
    */
    public Long getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID. Can be used instead of the
    * <b>application_name</b> parameter
    */
    public StartConferenceRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name. Can be used instead of the
    * <b>application_id</b> parameter
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name. Can be used instead of the
    * <b>application_id</b> parameter
    */
    public StartConferenceRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String scriptCustomData;

    @RequestField(name="script_custom_data")
    /**
    * The script custom data, that can be accessed in the scenario via the
    * <a
    * href='/docs/references/voxengine/voxengine/customdata'>VoxEngine.customData()</a>
    * method. Use the application/x-www-form-urlencoded content type with
    * UTF-8 encoding.
    */
    public String getScriptCustomData() {
        return this.scriptCustomData;
    }

    public boolean hasScriptCustomData() {
        return this.scriptCustomData != null;
    }

    /**
    * The script custom data, that can be accessed in the scenario via the
    * <a
    * href='/docs/references/voxengine/voxengine/customdata'>VoxEngine.customData()</a>
    * method. Use the application/x-www-form-urlencoded content type with
    * UTF-8 encoding.
    */
    public StartConferenceRequest setScriptCustomData(String d) {
        this.scriptCustomData = d;
        return this;
    }

    private String referenceIp;

    @RequestField(name="reference_ip")
    /**
    * Specifies the IP from the geolocation of predicted subscribers. It
    * allows selecting the nearest server for serving subscribers. If not
    * specified, the IP address of the HTTP request is used
    */
    public String getReferenceIp() {
        return this.referenceIp;
    }

    public boolean hasReferenceIp() {
        return this.referenceIp != null;
    }

    /**
    * Specifies the IP from the geolocation of predicted subscribers. It
    * allows selecting the nearest server for serving subscribers. If not
    * specified, the IP address of the HTTP request is used
    */
    public StartConferenceRequest setReferenceIp(String d) {
        this.referenceIp = d;
        return this;
    }

    private String serverLocation;

    @RequestField(name="server_location")
    /**
    * Specifies the location of the server where the scenario needs to be
    * executed. Has higher priority than `reference_ip`. Request
    * [getServerLocations](https://api.voximplant.com/getServerLocations)
    * for possible values
    */
    public String getServerLocation() {
        return this.serverLocation;
    }

    public boolean hasServerLocation() {
        return this.serverLocation != null;
    }

    /**
    * Specifies the location of the server where the scenario needs to be
    * executed. Has higher priority than `reference_ip`. Request
    * [getServerLocations](https://api.voximplant.com/getServerLocations)
    * for possible values
    */
    public StartConferenceRequest setServerLocation(String d) {
        this.serverLocation = d;
        return this;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (conferenceName != null) {
            sb.append(aligned)
                .append("\"conferenceName\": \"")
                .append(conferenceName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleId != null) {
            sb.append(aligned)
                .append("\"ruleId\": \"")
                .append(ruleId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ruleName != null) {
            sb.append(aligned)
                .append("\"ruleName\": \"")
                .append(ruleName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userName != null) {
            sb.append(aligned)
                .append("\"userName\": \"")
                .append(userName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationId != null) {
            sb.append(aligned)
                .append("\"applicationId\": \"")
                .append(applicationId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applicationName != null) {
            sb.append(aligned)
                .append("\"applicationName\": \"")
                .append(applicationName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (scriptCustomData != null) {
            sb.append(aligned)
                .append("\"scriptCustomData\": \"")
                .append(scriptCustomData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (referenceIp != null) {
            sb.append(aligned)
                .append("\"referenceIp\": \"")
                .append(referenceIp)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (serverLocation != null) {
            sb.append(aligned)
                .append("\"serverLocation\": \"")
                .append(serverLocation)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}