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
* The locked operator state.
*/
public class ACDLockedOperatorStateType implements Alignable {

    private Long userId;

    /**
    * The user ID of the operator.
    */
    public Long getUserId() {
        return this.userId;
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
        if (unreached != null) {
            sb.append(aligned)
                .append("\"unreached\": \"")
                .append(unreached)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (locks != null) {
            sb.append(aligned)
                .append("\"ACDLock\": ")
                .append(StringHelper.arrayToString(locks, alignment + 1))
                .append(System.lineSeparator());
        }
        if (acdCalls != null) {
            sb.append(aligned)
                .append("\"ACDOperatorCall\": ")
                .append(StringHelper.arrayToString(acdCalls, alignment + 1))
                .append(System.lineSeparator());
        }
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
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