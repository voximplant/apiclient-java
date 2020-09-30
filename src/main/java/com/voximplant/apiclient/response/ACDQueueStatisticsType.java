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
public class ACDQueueStatisticsType {

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

    private ACDStatisticsItemType WT;

    /**
    * Delay between user called and operator answered the call (or call is
    * terminated). Name is 'WaitingTime' if 'abbreviation' is set to
    * 'false'
    */
    public ACDStatisticsItemType getWT() {
        return this.WT;
    }

    public boolean hasWT() {
        return this.WT != null;
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

    private ACDStatisticsItemType AT;

    /**
    * Time between user called Voximplant cloud and time they disconnect
    * not reaching the operator. Name is 'AbandonmentTime' if
    * 'abbreviation' is set to 'false'
    */
    public ACDStatisticsItemType getAT() {
        return this.AT;
    }

    public boolean hasAT() {
        return this.AT != null;
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

    private ACDStatisticsItemType QL;

    /**
    * How many users are in the queue. Name is 'QueueLength' if
    * 'abbreviation' is set to 'false'
    */
    public ACDStatisticsItemType getQL() {
        return this.QL;
    }

    public boolean hasQL() {
        return this.QL != null;
    }

    private Long TC;

    /**
    * Total number of calls. Name is 'TotalCalls' if 'abbreviation' is set
    * to 'false'
    */
    public long getTC() {
        return this.TC.longValue();
    }

    public boolean hasTC() {
        return this.TC != null;
    }

    private ACDStatisticsCalls[] AC;

    /**
    * Number of answered calls. Name is 'AnsweredCalls' if 'abbreviation'
    * is set to 'false'
    */
    public ACDStatisticsCalls[] getAC() {
        return this.AC;
    }

    public boolean hasAC() {
        return this.AC != null;
    }

    private ACDStatisticsCalls[] UAC;

    /**
    * Number of unanswered calls. Name is 'UnansweredCalls' if
    * 'abbreviation' is set to 'false'
    */
    public ACDStatisticsCalls[] getUAC() {
        return this.UAC;
    }

    public boolean hasUAC() {
        return this.UAC != null;
    }

    private ACDStatisticsCalls[] RC;

    /**
    * Number of calls rejected by the ACD. Call is rejected if all
    * operators are offline or banned, or queue length is exceeded, or
    * predicted answer time exceeds maximum specified for the query. Name
    * is 'RejectedCalls' if 'abbreviation' is set to 'false'
    */
    public ACDStatisticsCalls[] getRC() {
        return this.RC;
    }

    public boolean hasRC() {
        return this.RC != null;
    }

    private ACDQueueStatisticsServiceLevelType[] SL;

    /**
    * List of service levels. Name is 'ServiceLevel' if 'abbreviation' is
    * set to 'false'
    */
    public ACDQueueStatisticsServiceLevelType[] getSL() {
        return this.SL;
    }

    public boolean hasSL() {
        return this.SL != null;
    }

    private Long TWT;

    /**
    * Sum of 'WaitingTime', in seconds. Name is 'TotalWaitingTime' if
    * 'abbreviation' is set to 'false'
    */
    public long getTWT() {
        return this.TWT.longValue();
    }

    public boolean hasTWT() {
        return this.TWT != null;
    }

    private Long TST;

    /**
    * Sum of 'SpeedOfAnswer', in seconds. Name is 'TotalSubmissionTime' if
    * 'abbreviation' is set to 'false'
    */
    public long getTST() {
        return this.TST.longValue();
    }

    public boolean hasTST() {
        return this.TST != null;
    }

    private Long TAT;

    /**
    * Sum for all times between user called Voximplant cloud and time they
    * disconnect not reaching the operator, in seconds. Name is
    * 'TotalAbandonmentTime' if 'abbreviation' is set to 'false'
    */
    public long getTAT() {
        return this.TAT.longValue();
    }

    public boolean hasTAT() {
        return this.TAT != null;
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