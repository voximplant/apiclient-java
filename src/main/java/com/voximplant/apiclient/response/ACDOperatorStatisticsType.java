package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Individual record in the [ACDOperatorAggregationGroupType] group.
*/
public class ACDOperatorStatisticsType {

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

    private ACDStatisticsItemType SA;

    /**
    * Delay between a call started to ring and operator answered it. Name
    * is 'SpeedOfAnswer' if 'abbreviation' is set to 'false'
    */
    public ACDStatisticsItemType getSA() {
        return this.SA;
    }

    public boolean hasSA() {
        return this.SA != null;
    }

    private ACDStatisticsItemType TT;

    /**
    * Time between operator answering and ending a call. Name is 'TalkTime'
    * if 'abbreviation' is set to 'false'
    */
    public ACDStatisticsItemType getTT() {
        return this.TT;
    }

    public boolean hasTT() {
        return this.TT != null;
    }

    private ACDStatisticsItemType ACW;

    /**
    * Time between operator ended a call and changed status to a one
    * different from the 'AFTER_SERVICE'. This time is tracked only if
    * operator changed status to 'AFTER_SERVICE' after the call. Name is
    * 'AfterCallWork' if 'abbreviation' is set to 'false'
    */
    public ACDStatisticsItemType getACW() {
        return this.ACW;
    }

    public boolean hasACW() {
        return this.ACW != null;
    }

    private ACDStatisticsItemType HT;

    /**
    * Sum of 'TalkTime' and 'AfterCallWork'. Name is 'HandlingTime' if
    * 'abbreviation' is set to 'false'
    */
    public ACDStatisticsItemType getHT() {
        return this.HT;
    }

    public boolean hasHT() {
        return this.HT != null;
    }

    private Long AC;

    /**
    * Number of answered calls. Name is 'AnsweredCalls' if 'abbreviation'
    * is set to 'false'
    */
    public long getAC() {
        return this.AC.longValue();
    }

    public boolean hasAC() {
        return this.AC != null;
    }

    private Long UAC;

    /**
    * Number of unanswered calls. Name is 'UnansweredCalls' if
    * 'abbreviation' is set to 'false'
    */
    public long getUAC() {
        return this.UAC.longValue();
    }

    public boolean hasUAC() {
        return this.UAC != null;
    }

    private Long TDT;

    /**
    * Sum of delays between calls started to ring and operator answered
    * them, in seconds. Name is 'TotalDialingTime' if 'abbreviation' is set
    * to 'false'
    */
    public long getTDT() {
        return this.TDT.longValue();
    }

    public boolean hasTDT() {
        return this.TDT != null;
    }

    private Long THT;

    /**
    * Sum of 'HandlingTime', in seconds. Name is 'TotalHandlingTime' if
    * 'abbreviation' is set to 'false'
    */
    public long getTHT() {
        return this.THT.longValue();
    }

    public boolean hasTHT() {
        return this.THT != null;
    }

    private Long TTT;

    /**
    * Sum of 'TalkTime', in seconds. Name is 'TotalTalkTime' if
    * 'abbreviation' is set to 'false'
    */
    public long getTTT() {
        return this.TTT.longValue();
    }

    public boolean hasTTT() {
        return this.TTT != null;
    }

    private Long TACW;

    /**
    * Sum of 'AfterCallWork', in seconds. Name is 'TotalAfterCallWork' if
    * 'abbreviation' is set to 'false'
    */
    public long getTACW() {
        return this.TACW.longValue();
    }

    public boolean hasTACW() {
        return this.TACW != null;
    }

}