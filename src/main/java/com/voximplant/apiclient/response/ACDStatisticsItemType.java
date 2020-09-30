package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Individual statistics item in the [ACDOperatorStatisticsType],
* [ACDQueueStatisticsType], and [ACDOperatorStatusStatisticsDetail]
* records.
*/
public class ACDStatisticsItemType {

    private Long min;

    /**
    * Minimum value over the aggregated interval, in seconds
    */
    public long getMin() {
        return this.min.longValue();
    }

    public boolean hasMin() {
        return this.min != null;
    }

    private Long avg;

    /**
    * Average value over the aggregated interval, in seconds
    */
    public long getAvg() {
        return this.avg.longValue();
    }

    public boolean hasAvg() {
        return this.avg != null;
    }

    private Long max;

    /**
    * Maximum value over the aggregated interval, in seconds
    */
    public long getMax() {
        return this.max.longValue();
    }

    public boolean hasMax() {
        return this.max != null;
    }

    private Long count;

    /**
    * Samples count over the aggregated interval
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private Long sum;

    /**
    * Sum of all samples over the aggregated interval, in seconds
    */
    public long getSum() {
        return this.sum.longValue();
    }

    public boolean hasSum() {
        return this.sum != null;
    }

}