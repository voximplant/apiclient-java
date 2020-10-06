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
* The ready operator state.
*/
public class ACDReadyOperatorStateType implements Alignable {

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

    private Long idleDuration;

    /**
    * The idle duration in seconds. The minimum of the duration after the
    * last hangup and the duration after the operator status changing to
    * READY.
    */
    public Long getIdleDuration() {
        return this.idleDuration;
    }

    public boolean hasIdleDuration() {
        return this.idleDuration != null;
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
        if (idleDuration != null) {
            sb.append(aligned)
                .append("\"idleDuration\": \"")
                .append(idleDuration)
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