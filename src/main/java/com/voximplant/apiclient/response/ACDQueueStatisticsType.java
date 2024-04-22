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
* Individual record in the [ACDOperatorAggregationGroupType] group.
*/
public class ACDQueueStatisticsType implements Alignable {

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date date;

    /**
    * If aggregation is enabled, contains UTC date for the results in 24-h
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
    * If aggregation is enabled, contains the 60-minute interval number
    * from 1 to 24
    */
    public Long getHour() {
        return this.hour;
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
    public Long getTC() {
        return this.TC;
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
    public Long getTWT() {
        return this.TWT;
    }

    public boolean hasTWT() {
        return this.TWT != null;
    }

    private Long TST;

    /**
    * Sum of 'SpeedOfAnswer', in seconds. Name is 'TotalSubmissionTime' if
    * 'abbreviation' is set to 'false'
    */
    public Long getTST() {
        return this.TST;
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
    public Long getTAT() {
        return this.TAT;
    }

    public boolean hasTAT() {
        return this.TAT != null;
    }

    private Long THT;

    /**
    * Sum of 'HandlingTime', in seconds. Name is 'TotalHandlingTime' if
    * 'abbreviation' is set to 'false'
    */
    public Long getTHT() {
        return this.THT;
    }

    public boolean hasTHT() {
        return this.THT != null;
    }

    private Long TTT;

    /**
    * Sum of 'TalkTime', in seconds. Name is 'TotalTalkTime' if
    * 'abbreviation' is set to 'false'
    */
    public Long getTTT() {
        return this.TTT;
    }

    public boolean hasTTT() {
        return this.TTT != null;
    }

    private Long TACW;

    /**
    * Sum of 'AfterCallWork', in seconds. Name is 'TotalAfterCallWork' if
    * 'abbreviation' is set to 'false'
    */
    public Long getTACW() {
        return this.TACW;
    }

    public boolean hasTACW() {
        return this.TACW != null;
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
        if (WT != null) {
            sb.append(aligned)
                .append("\"WT\": \"")
                .append(WT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (SA != null) {
            sb.append(aligned)
                .append("\"SA\": \"")
                .append(SA)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (AT != null) {
            sb.append(aligned)
                .append("\"AT\": \"")
                .append(AT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (HT != null) {
            sb.append(aligned)
                .append("\"HT\": \"")
                .append(HT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TT != null) {
            sb.append(aligned)
                .append("\"TT\": \"")
                .append(TT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ACW != null) {
            sb.append(aligned)
                .append("\"ACW\": \"")
                .append(ACW)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (QL != null) {
            sb.append(aligned)
                .append("\"QL\": \"")
                .append(QL)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TC != null) {
            sb.append(aligned)
                .append("\"TC\": \"")
                .append(TC)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (AC != null) {
            sb.append(aligned)
                .append("\"ACDStatisticsCalls\": ")
                .append(StringHelper.arrayToString(AC, alignment + 1))
                .append(System.lineSeparator());
        }
        if (UAC != null) {
            sb.append(aligned)
                .append("\"ACDStatisticsCalls\": ")
                .append(StringHelper.arrayToString(UAC, alignment + 1))
                .append(System.lineSeparator());
        }
        if (RC != null) {
            sb.append(aligned)
                .append("\"ACDStatisticsCalls\": ")
                .append(StringHelper.arrayToString(RC, alignment + 1))
                .append(System.lineSeparator());
        }
        if (SL != null) {
            sb.append(aligned)
                .append("\"ACDQueueStatisticsServiceLevelType\": ")
                .append(StringHelper.arrayToString(SL, alignment + 1))
                .append(System.lineSeparator());
        }
        if (TWT != null) {
            sb.append(aligned)
                .append("\"TWT\": \"")
                .append(TWT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TST != null) {
            sb.append(aligned)
                .append("\"TST\": \"")
                .append(TST)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TAT != null) {
            sb.append(aligned)
                .append("\"TAT\": \"")
                .append(TAT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (THT != null) {
            sb.append(aligned)
                .append("\"THT\": \"")
                .append(THT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TTT != null) {
            sb.append(aligned)
                .append("\"TTT\": \"")
                .append(TTT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TACW != null) {
            sb.append(aligned)
                .append("\"TACW\": \"")
                .append(TACW)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}