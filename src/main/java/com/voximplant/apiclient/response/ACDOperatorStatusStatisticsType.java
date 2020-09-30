package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Individual record in the  [ACDOperatorStatusAggregationGroupType]
* group.
*/
public class ACDOperatorStatusStatisticsType {

    private String userId;

    /**
    * If aggregation was enabled, contains user ID  for the results
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
    * If aggregation was enabled, contains UTC date  for the results in
    * 24-h 'YYYY-MM-DD' format
    */
    public Date getDate() {
        return this.date;
    }

    public boolean hasDate() {
        return this.date != null;
    }

    private Long hour;

    /**
    * If aggregation was enabled, contains the  60-minute interval number
    * from 1 to 24
    */
    public long getHour() {
        return this.hour.longValue();
    }

    public boolean hasHour() {
        return this.hour != null;
    }

    private ACDOperatorStatusStatisticsDetail[] acdStatus;

    /**
    * The user statistics.
    */
    public ACDOperatorStatusStatisticsDetail[] getAcdStatus() {
        return this.acdStatus;
    }

    public boolean hasAcdStatus() {
        return this.acdStatus != null;
    }

}