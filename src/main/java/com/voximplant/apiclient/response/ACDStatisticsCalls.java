package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Individual statistics item in the [ACDQueueStatisticsType] record.
*/
public class ACDStatisticsCalls {

    private Long count;

    /**
    * Absolute number of calls.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private Long percent;

    /**
    * Percentage of answered/rejected/unanswered calls, is counted against
    * total number of calls.
    */
    public long getPercent() {
        return this.percent.longValue();
    }

    public boolean hasPercent() {
        return this.percent != null;
    }

}