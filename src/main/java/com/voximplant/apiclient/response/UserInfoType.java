package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetUsers] function result.
*/
public class UserInfoType implements Alignable {

    private Long userId;

    /**
    * The user ID
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The user name
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * The display user name
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    private Boolean userActive;

    /**
    * Whether the user is active. Inactive users cannot log in to
    * applications
    */
    public Boolean getUserActive() {
        return this.userActive;
    }

    public boolean hasUserActive() {
        return this.userActive != null;
    }

    private Boolean parentAccounting;

    /**
    * Whether the user uses the parent account's money, 'false' if the user
    * has a separate balance
    */
    public Boolean getParentAccounting() {
        return this.parentAccounting;
    }

    public boolean hasParentAccounting() {
        return this.parentAccounting != null;
    }

    private String mobilePhone;

    /**
    * The user mobile phone
    */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public boolean hasMobilePhone() {
        return this.mobilePhone != null;
    }

    private BigDecimal liveBalance;

    /**
    * The current user's money in the currency specified for the account.
    * The value is the number rounded to 4 decimal places and it changes
    * during the calls, transcribing, purchases etc
    */
    public BigDecimal getLiveBalance() {
        return this.liveBalance;
    }

    public boolean hasLiveBalance() {
        return this.liveBalance != null;
    }

    private BigDecimal balance;

    /**
    * The current user's money in the currency specified for the account.
    * The value is the number rounded to 4 decimal places. The parameter is
    * the alias to live_balance by default. But there is a possibility to
    * make the alias to fixed_balance: just to pass
    * return_live_balance=false into the [GetAccountInfo] method
    */
    public BigDecimal getBalance() {
        return this.balance;
    }

    public boolean hasBalance() {
        return this.balance != null;
    }

    private BigDecimal fixedBalance;

    /**
    * The last committed balance which has been approved by billing's
    * transaction
    */
    public BigDecimal getFixedBalance() {
        return this.fixedBalance;
    }

    public boolean hasFixedBalance() {
        return this.fixedBalance != null;
    }

    private String userCustomData;

    /**
    * The custom data
    */
    public String getUserCustomData() {
        return this.userCustomData;
    }

    public boolean hasUserCustomData() {
        return this.userCustomData != null;
    }

    private ApplicationInfoType[] applications;

    /**
    * The bound applications
    */
    public ApplicationInfoType[] getApplications() {
        return this.applications;
    }

    public boolean hasApplications() {
        return this.applications != null;
    }

    private SkillInfoType[] skills;

    /**
    * The bound skills
    */
    public SkillInfoType[] getSkills() {
        return this.skills;
    }

    public boolean hasSkills() {
        return this.skills != null;
    }

    private ACDQueueOperatorInfoType[] acdQueues;

    /**
    * The bound ACD queues
    */
    public ACDQueueOperatorInfoType[] getAcdQueues() {
        return this.acdQueues;
    }

    public boolean hasAcdQueues() {
        return this.acdQueues != null;
    }

    private String acdStatus;

    /**
    * The ACD operator status. The following values are possible: OFFLINE,
    * ONLINE, READY, BANNED, IN_SERVICE, AFTER_SERVICE, TIMEOUT, DND
    */
    public String getAcdStatus() {
        return this.acdStatus;
    }

    public boolean hasAcdStatus() {
        return this.acdStatus != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date acdStatusChangeTime;

    /**
    * The ACD status changing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getAcdStatusChangeTime() {
        return this.acdStatusChangeTime;
    }

    public boolean hasAcdStatusChangeTime() {
        return this.acdStatusChangeTime != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date created;

    /**
    * The user editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getCreated() {
        return this.created;
    }

    public boolean hasCreated() {
        return this.created != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date modified;

    /**
    * The user editing UTC date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getModified() {
        return this.modified;
    }

    public boolean hasModified() {
        return this.modified != null;
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
        if (userDisplayName != null) {
            sb.append(aligned)
                .append("\"userDisplayName\": \"")
                .append(userDisplayName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userActive != null) {
            sb.append(aligned)
                .append("\"userActive\": \"")
                .append(userActive)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (parentAccounting != null) {
            sb.append(aligned)
                .append("\"parentAccounting\": \"")
                .append(parentAccounting)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mobilePhone != null) {
            sb.append(aligned)
                .append("\"mobilePhone\": \"")
                .append(mobilePhone)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (liveBalance != null) {
            sb.append(aligned)
                .append("\"liveBalance\": \"")
                .append(liveBalance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (balance != null) {
            sb.append(aligned)
                .append("\"balance\": \"")
                .append(balance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (fixedBalance != null) {
            sb.append(aligned)
                .append("\"fixedBalance\": \"")
                .append(fixedBalance)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userCustomData != null) {
            sb.append(aligned)
                .append("\"userCustomData\": \"")
                .append(userCustomData)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (applications != null) {
            sb.append(aligned)
                .append("\"ApplicationInfoType\": ")
                .append(StringHelper.arrayToString(applications, alignment + 1))
                .append(System.lineSeparator());
        }
        if (skills != null) {
            sb.append(aligned)
                .append("\"SkillInfoType\": ")
                .append(StringHelper.arrayToString(skills, alignment + 1))
                .append(System.lineSeparator());
        }
        if (acdQueues != null) {
            sb.append(aligned)
                .append("\"ACDQueueOperatorInfoType\": ")
                .append(StringHelper.arrayToString(acdQueues, alignment + 1))
                .append(System.lineSeparator());
        }
        if (acdStatus != null) {
            sb.append(aligned)
                .append("\"acdStatus\": \"")
                .append(acdStatus)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdStatusChangeTime != null) {
            sb.append(aligned)
                .append("\"acdStatusChangeTime\": \"")
                .append(acdStatusChangeTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (created != null) {
            sb.append(aligned)
                .append("\"created\": \"")
                .append(created)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (modified != null) {
            sb.append(aligned)
                .append("\"modified\": \"")
                .append(modified)
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