package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The [GetACDOperatorStatusStatistics] function result item.
*/
public class ACDOperatorStatusAggregationGroupType {

    private String userId;

    /**
    * If aggregation was enabled, contains user ID for the results
    */
    public String getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date date;

    /**
    * If aggregation was enabled, contains UTC date for the results in 24-h
    * 'YYYY-MM-DD' format
    */
    public Date getDate() {
        return this.date;
    }

    public boolean hasDate() {
        return this.date != null;
    }

    private Long hour;

    /**
    * If aggregation was enabled, contains the 60-minute interval number
    * from 1 to 24
    */
    public long getHour() {
        return this.hour.longValue();
    }

    public boolean hasHour() {
        return this.hour != null;
    }

    private ACDOperatorStatusStatisticsType[] statistics;

    /**
    * List of records grouped by date or user ID according to the 'group'
    * method call argument
    */
    public ACDOperatorStatusStatisticsType[] getStatistics() {
        return this.statistics;
    }

    public boolean hasStatistics() {
        return this.statistics != null;
    }

}