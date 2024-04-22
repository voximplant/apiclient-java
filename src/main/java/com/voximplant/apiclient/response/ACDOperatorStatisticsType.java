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
public class ACDOperatorStatisticsType implements Alignable {

    private String userId;

    /**
    * If aggregation is enabled, contains user ID for the results
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
    public Long getAC() {
        return this.AC;
    }

    public boolean hasAC() {
        return this.AC != null;
    }

    private Long UAC;

    /**
    * Number of unanswered calls. Name is 'UnansweredCalls' if
    * 'abbreviation' is set to 'false'
    */
    public Long getUAC() {
        return this.UAC;
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
    public Long getTDT() {
        return this.TDT;
    }

    public boolean hasTDT() {
        return this.TDT != null;
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
        if (SA != null) {
            sb.append(aligned)
                .append("\"SA\": \"")
                .append(SA)
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
        if (HT != null) {
            sb.append(aligned)
                .append("\"HT\": \"")
                .append(HT)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (AC != null) {
            sb.append(aligned)
                .append("\"AC\": \"")
                .append(AC)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (UAC != null) {
            sb.append(aligned)
                .append("\"UAC\": \"")
                .append(UAC)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (TDT != null) {
            sb.append(aligned)
                .append("\"TDT\": \"")
                .append(TDT)
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