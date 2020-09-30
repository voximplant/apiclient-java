package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The cloned account info.
*/
public class ClonedAccountType {

    private Long accountId;

    /**
    * The account's ID.
    */
    public long getAccountId() {
        return this.accountId.longValue();
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    private String accountName;

    /**
    * The account's name.
    */
    public String getAccountName() {
        return this.accountName;
    }

    public boolean hasAccountName() {
        return this.accountName != null;
    }

    private String accountEmail;

    /**
    * The account's email.
    */
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public boolean hasAccountEmail() {
        return this.accountEmail != null;
    }

    private Boolean active;

    /**
    * The account activation flag.
    */
    public boolean getActive() {
        return this.active.booleanValue();
    }

    public boolean hasActive() {
        return this.active != null;
    }

    private String apiKey;

    /**
    * The account API key.
    */
    public String getApiKey() {
        return this.apiKey;
    }

    public boolean hasApiKey() {
        return this.apiKey != null;
    }

    private ClonedUserType[] users;

    /**
    * The cloned users.
    */
    public ClonedUserType[] getUsers() {
        return this.users;
    }

    public boolean hasUsers() {
        return this.users != null;
    }

    private ClonedScenarioType[] scenarios;

    /**
    * The cloned scenarios.
    */
    public ClonedScenarioType[] getScenarios() {
        return this.scenarios;
    }

    public boolean hasScenarios() {
        return this.scenarios != null;
    }

    private ClonedApplicationType[] applications;

    /**
    * The cloned applications.
    */
    public ClonedApplicationType[] getApplications() {
        return this.applications;
    }

    public boolean hasApplications() {
        return this.applications != null;
    }

    private ClonedACDQueueType[] acdQueues;

    /**
    * The cloned ACD queues.
    */
    public ClonedACDQueueType[] getAcdQueues() {
        return this.acdQueues;
    }

    public boolean hasAcdQueues() {
        return this.acdQueues != null;
    }

    private ClonedACDSkillType[] acdSkills;

    /**
    * The cloned ACD skills.
    */
    public ClonedACDSkillType[] getAcdSkills() {
        return this.acdSkills;
    }

    public boolean hasAcdSkills() {
        return this.acdSkills != null;
    }

    private ClonedAdminRoleType[] adminRoles;

    /**
    * The cloned admin roles.
    */
    public ClonedAdminRoleType[] getAdminRoles() {
        return this.adminRoles;
    }

    public boolean hasAdminRoles() {
        return this.adminRoles != null;
    }

    private ClonedAdminUserType[] adminUsers;

    /**
    * The cloned admin users.
    */
    public ClonedAdminUserType[] getAdminUsers() {
        return this.adminUsers;
    }

    public boolean hasAdminUsers() {
        return this.adminUsers != null;
    }

}