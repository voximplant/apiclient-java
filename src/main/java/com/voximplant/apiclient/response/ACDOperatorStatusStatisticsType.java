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
* Individual record in the  [ACDOperatorStatusAggregationGroupType]
* group.
*/
public class ACDOperatorStatusStatisticsType implements Alignable {

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
    public Long getHour() {
        return this.hour;
    }

    public boolean hasHour() {
        return this.hour != null;
    }

    private ACDOperatorStatusStatisticsDetail[] acdStatus;

    /**
    * The user statistics
    */
    public ACDOperatorStatusStatisticsDetail[] getAcdStatus() {
        return this.acdStatus;
    }

    public boolean hasAcdStatus() {
        return this.acdStatus != null;
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
        if (date != null) {
            sb.append(aligned)
                .append("\"date\": \"")
                .append(date)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (hour != null) {
            sb.append(aligned)
                .append("\"hour\": \"")
                .append(hour)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdStatus != null) {
            sb.append(aligned)
                .append("\"ACDOperatorStatusStatisticsDetail\": ")
                .append(StringHelper.arrayToString(acdStatus, alignment + 1))
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}