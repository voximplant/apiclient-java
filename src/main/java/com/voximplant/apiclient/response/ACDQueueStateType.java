package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The ACD queue state.
*/
public class ACDQueueStateType {

    private Long acdQueueId;

    /**
    * The ACD queue ID
    */
    public long getAcdQueueId() {
        return this.acdQueueId.longValue();
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
    * Number of ready operators.
    */
    public long getReadyOperatorsCount() {
        return this.readyOperatorsCount.longValue();
    }

    public boolean hasReadyOperatorsCount() {
        return this.readyOperatorsCount != null;
    }

    private ACDLockedOperatorStateType[] lockedOperators;

    /**
    * List of operators with the 'READY' state that can't accept a call
    * from this queue. Operator can't accept a call if they are temporarily
    * banned or they are servicing a call right now
    */
    public ACDLockedOperatorStateType[] getLockedOperators() {
        return this.lockedOperators;
    }

    public boolean hasLockedOperators() {
        return this.lockedOperators != null;
    }

    private Long lockedOperatorsCount;

    /**
    * Number of locked operators.
    */
    public long getLockedOperatorsCount() {
        return this.lockedOperatorsCount.longValue();
    }

    public boolean hasLockedOperatorsCount() {
        return this.lockedOperatorsCount != null;
    }

    private ACDAfterServiceOperatorStateType[] afterServiceOperators;

    /**
    * List of operators with the 'AFTER_SERVICE' state. This state is set
    * right after a call is ended to indicate a call postprocessing.
    */
    public ACDAfterServiceOperatorStateType[] getAfterServiceOperators() {
        return this.afterServiceOperators;
    }

    public boolean hasAfterServiceOperators() {
        return this.afterServiceOperators != null;
    }

    private Long afterServiceOperatorCount;

    /**
    * Number of operators with the 'AFTER SERVICE' state.
    */
    public long getAfterServiceOperatorCount() {
        return this.afterServiceOperatorCount.longValue();
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

}