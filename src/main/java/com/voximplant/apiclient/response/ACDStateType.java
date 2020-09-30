package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetACDState] function result item.
*/
public class ACDStateType {

    private ACDQueueStateType[] acdQueues;

    /**
    * The queues' states.
    */
    public ACDQueueStateType[] getAcdQueues() {
        return this.acdQueues;
    }

    public boolean hasAcdQueues() {
        return this.acdQueues != null;
    }

}