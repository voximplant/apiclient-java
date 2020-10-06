package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The cloned account info.
*/
public class ClonedAccountType implements Alignable {

    private Long accountId;

    /**
    * The account's ID.
    */
    public Long getAccountId() {
        return this.accountId;
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
    public Boolean getActive() {
        return this.active;
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

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountName != null) {
            sb.append(aligned)
                .append("\"accountName\": \"")
                .append(accountName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountEmail != null) {
            sb.append(aligned)
                .append("\"accountEmail\": \"")
                .append(accountEmail)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (active != null) {
            sb.append(aligned)
                .append("\"active\": \"")
                .append(active)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (apiKey != null) {
            sb.append(aligned)
                .append("\"apiKey\": \"")
                .append(apiKey)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (users != null) {
            sb.append(aligned)
                .append("\"ClonedUserType\": ")
                .append(StringHelper.arrayToString(users, alignment + 1))
                .append(System.lineSeparator());
        }
        if (scenarios != null) {
            sb.append(aligned)
                .append("\"ClonedScenarioType\": ")
                .append(StringHelper.arrayToString(scenarios, alignment + 1))
                .append(System.lineSeparator());
        }
        if (applications != null) {
            sb.append(aligned)
                .append("\"ClonedApplicationType\": ")
                .append(StringHelper.arrayToString(applications, alignment + 1))
                .append(System.lineSeparator());
        }
        if (acdQueues != null) {
            sb.append(aligned)
                .append("\"ClonedACDQueueType\": ")
                .append(StringHelper.arrayToString(acdQueues, alignment + 1))
                .append(System.lineSeparator());
        }
        if (acdSkills != null) {
            sb.append(aligned)
                .append("\"ClonedACDSkillType\": ")
                .append(StringHelper.arrayToString(acdSkills, alignment + 1))
                .append(System.lineSeparator());
        }
        if (adminRoles != null) {
            sb.append(aligned)
                .append("\"ClonedAdminRoleType\": ")
                .append(StringHelper.arrayToString(adminRoles, alignment + 1))
                .append(System.lineSeparator());
        }
        if (adminUsers != null) {
            sb.append(aligned)
                .append("\"ClonedAdminUserType\": ")
                .append(StringHelper.arrayToString(adminUsers, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}