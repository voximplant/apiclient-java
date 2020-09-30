package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The ready operator state.
*/
public class ACDReadyOperatorStateType {

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

    private Long idleDuration;

    /**
    * The idle duration in seconds. The minimum of the duration after the
    * last hangup and the duration after the operator status changing to
    * READY.
    */
    public long getIdleDuration() {
        return this.idleDuration.longValue();
    }

    public boolean hasIdleDuration() {
        return this.idleDuration != null;
    }

}