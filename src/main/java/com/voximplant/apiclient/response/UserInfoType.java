package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetUsers] function result.
*/
public class UserInfoType {

    private Long userId;

    /**
    * The user ID.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The user name.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * The display user name.
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    private Boolean userActive;

    /**
    * The user active flag.
    */
    public boolean getUserActive() {
        return this.userActive.booleanValue();
    }

    public boolean hasUserActive() {
        return this.userActive != null;
    }

    private Boolean parentAccounting;

    /**
    * 'True' if the user uses the parent account's money, 'false' if the
    * user has a separate balance.
    */
    public boolean getParentAccounting() {
        return this.parentAccounting.booleanValue();
    }

    public boolean hasParentAccounting() {
        return this.parentAccounting != null;
    }

    private String mobilePhone;

    /**
    * The user mobile phone.
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
    * during the calls, transcribing, purchases etc.
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
    * return_live_balance=false into the [GetAccountInfo] method.
    */
    public BigDecimal getBalance() {
        return this.balance;
    }

    public boolean hasBalance() {
        return this.balance != null;
    }

    private BigDecimal fixedBalance;

    /**
    * The last committed balance which was approved by billing's
    * transaction.
    */
    public BigDecimal getFixedBalance() {
        return this.fixedBalance;
    }

    public boolean hasFixedBalance() {
        return this.fixedBalance != null;
    }

    private String userCustomData;

    /**
    * The custom data.
    */
    public String getUserCustomData() {
        return this.userCustomData;
    }

    public boolean hasUserCustomData() {
        return this.userCustomData != null;
    }

    private ApplicationInfoType[] applications;

    /**
    * The bound applications.
    */
    public ApplicationInfoType[] getApplications() {
        return this.applications;
    }

    public boolean hasApplications() {
        return this.applications != null;
    }

    private SkillInfoType[] skills;

    /**
    * The bound skills.
    */
    public SkillInfoType[] getSkills() {
        return this.skills;
    }

    public boolean hasSkills() {
        return this.skills != null;
    }

    private ACDQueueOperatorInfoType[] acdQueues;

    /**
    * The bound ACD queues.
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
    * ONLINE, READY, BANNED, IN_SERVICE, AFTER_SERVICE, TIMEOUT, DND.
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

}