package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Individual service level description used in the
* [ACDQueueStatisticsType].
*/
public class ACDQueueStatisticsServiceLevelType {

    private Long acceptableWaitingTime;

    /**
    * Maximum time, is seconds, user was waiting operator for a given
    * service level
    */
    public long getAcceptableWaitingTime() {
        return this.acceptableWaitingTime.longValue();
    }

    public boolean hasAcceptableWaitingTime() {
        return this.acceptableWaitingTime != null;
    }

    private Long callCount;

    /**
    * Number of calls for a given service level
    */
    public long getCallCount() {
        return this.callCount.longValue();
    }

    public boolean hasCallCount() {
        return this.callCount != null;
    }

    private Long serviceLevel;

    /**
    * Percentage of calls for a given service level, from 0 (non-inclusive)
    * up to 1 (all calls)
    */
    public long getServiceLevel() {
        return this.serviceLevel.longValue();
    }

    public boolean hasServiceLevel() {
        return this.serviceLevel != null;
    }

}