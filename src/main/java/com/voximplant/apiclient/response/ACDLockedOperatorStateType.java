package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The locked operator state.
*/
public class ACDLockedOperatorStateType {

    private Long userId;

    /**
    * The user ID of the operator.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String userName;

    /**
    * The user name of the operator.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    private String userDisplayName;

    /**
    * The display user name of the operator.
    */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean hasUserDisplayName() {
        return this.userDisplayName != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date unreached;

    /**
    * The UTC time when the operator becomes unavailable in 24-h format:
    * YYYY-MM-DD HH:mm:ss
    */
    public Date getUnreached() {
        return this.unreached;
    }

    public boolean hasUnreached() {
        return this.unreached != null;
    }

    private ACDLock[] locks;

    /**
    * The operator locks.
    */
    public ACDLock[] getLocks() {
        return this.locks;
    }

    public boolean hasLocks() {
        return this.locks != null;
    }

    private ACDOperatorCall[] acdCalls;

    /**
    * The ACD operator calls.
    */
    public ACDOperatorCall[] getAcdCalls() {
        return this.acdCalls;
    }

    public boolean hasAcdCalls() {
        return this.acdCalls != null;
    }

    private String status;

    /**
    * The operator <a
    * href='//voximplant.com/docs/references/websdk/voximplant/operatoracdstatuses'>status
    * string</a>. 'BANNED' string indicates temporarily <a
    * href='/docs/tutorials/step-by-step-call-center-tutorial'>banned
    * operators</a>. The following values are possible: READY, BANNED.
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

}