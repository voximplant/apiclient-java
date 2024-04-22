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
* The ACD queue state.
*/
public class ACDQueueStateType implements Alignable {

    private Long acdQueueId;

    /**
    * The ACD queue ID
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    private ACDReadyOperatorStateType[] readyOperators;

    /**
    * List of operators with the 'READY' state that can accept a call from
    * this queue
    */
    public ACDReadyOperatorStateType[] getReadyOperators() {
        return this.readyOperators;
    }

    public boolean hasReadyOperators() {
        return this.readyOperators != null;
    }

    private Long readyOperatorsCount;

    /**
    * Number of ready operators
    */
    public Long getReadyOperatorsCount() {
        return this.readyOperatorsCount;
    }

    public boolean hasReadyOperatorsCount() {
        return this.readyOperatorsCount != null;
    }

    private ACDLockedOperatorStateType[] lockedOperators;

    /**
    * List of operators with the 'READY' state that cannot accept a call
    * from this queue. Operator cannot accept a call if they are
    * temporarily banned or they are servicing a call right now
    */
    public ACDLockedOperatorStateType[] getLockedOperators() {
        return this.lockedOperators;
    }

    public boolean hasLockedOperators() {
        return this.lockedOperators != null;
    }

    private Long lockedOperatorsCount;

    /**
    * Number of locked operators
    */
    public Long getLockedOperatorsCount() {
        return this.lockedOperatorsCount;
    }

    public boolean hasLockedOperatorsCount() {
        return this.lockedOperatorsCount != null;
    }

    private ACDAfterServiceOperatorStateType[] afterServiceOperators;

    /**
    * List of operators with the 'AFTER_SERVICE' state. This state is set
    * right after a call is ended to indicate a call postprocessing
    */
    public ACDAfterServiceOperatorStateType[] getAfterServiceOperators() {
        return this.afterServiceOperators;
    }

    public boolean hasAfterServiceOperators() {
        return this.afterServiceOperators != null;
    }

    private Long afterServiceOperatorCount;

    /**
    * Number of operators with the 'AFTER SERVICE' state
    */
    public Long getAfterServiceOperatorCount() {
        return this.afterServiceOperatorCount;
    }

    public boolean hasAfterServiceOperatorCount() {
        return this.afterServiceOperatorCount != null;
    }

    private ACDServicingCallStateType[] servicingCalls;

    /**
    * List of calls enqueued into this queue that are being serviced right
    * now by operators
    */
    public ACDServicingCallStateType[] getServicingCalls() {
        return this.servicingCalls;
    }

    public boolean hasServicingCalls() {
        return this.servicingCalls != null;
    }

    private ACDWaitingCallStateType[] waitingCalls;

    /**
    * List of calls enqueued into this queue that are not yet serviced by
    * operators
    */
    public ACDWaitingCallStateType[] getWaitingCalls() {
        return this.waitingCalls;
    }

    public boolean hasWaitingCalls() {
        return this.waitingCalls != null;
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
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (readyOperators != null) {
            sb.append(aligned)
                .append("\"ACDReadyOperatorStateType\": ")
                .append(StringHelper.arrayToString(readyOperators, alignment + 1))
                .append(System.lineSeparator());
        }
        if (readyOperatorsCount != null) {
            sb.append(aligned)
                .append("\"readyOperatorsCount\": \"")
                .append(readyOperatorsCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lockedOperators != null) {
            sb.append(aligned)
                .append("\"ACDLockedOperatorStateType\": ")
                .append(StringHelper.arrayToString(lockedOperators, alignment + 1))
                .append(System.lineSeparator());
        }
        if (lockedOperatorsCount != null) {
            sb.append(aligned)
                .append("\"lockedOperatorsCount\": \"")
                .append(lockedOperatorsCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (afterServiceOperators != null) {
            sb.append(aligned)
                .append("\"ACDAfterServiceOperatorStateType\": ")
                .append(StringHelper.arrayToString(afterServiceOperators, alignment + 1))
                .append(System.lineSeparator());
        }
        if (afterServiceOperatorCount != null) {
            sb.append(aligned)
                .append("\"afterServiceOperatorCount\": \"")
                .append(afterServiceOperatorCount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (servicingCalls != null) {
            sb.append(aligned)
                .append("\"ACDServicingCallStateType\": ")
                .append(StringHelper.arrayToString(servicingCalls, alignment + 1))
                .append(System.lineSeparator());
        }
        if (waitingCalls != null) {
            sb.append(aligned)
                .append("\"ACDWaitingCallStateType\": ")
                .append(StringHelper.arrayToString(waitingCalls, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}