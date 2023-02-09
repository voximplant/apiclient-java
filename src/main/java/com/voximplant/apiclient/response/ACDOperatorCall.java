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
* The ACD operator call type.
*/
public class ACDOperatorCall implements Alignable {

    private Long acdSessionHistoryId;

    /**
    * The ACD session history ID of the request
    */
    public Long getAcdSessionHistoryId() {
        return this.acdSessionHistoryId;
    }

    public boolean hasAcdSessionHistoryId() {
        return this.acdSessionHistoryId != null;
    }

    private String acdRequestId;

    /**
    * The internal ACD session history ID
    */
    public String getAcdRequestId() {
        return this.acdRequestId;
    }

    public boolean hasAcdRequestId() {
        return this.acdRequestId != null;
    }

    private Long acdQueueId;

    /**
    * The ACD queue ID
    */
    public Long getAcdQueueId() {
        return this.acdQueueId;
    }

    public boolean hasAcdQueueId() {
        return this.acdQueueId != null;
    }

    private String acdQueueName;

    /**
    * The ACD queue name
    */
    public String getAcdQueueName() {
        return this.acdQueueName;
    }

    public boolean hasAcdQueueName() {
        return this.acdQueueName != null;
    }

    private String callerid;

    /**
    * The client callerid
    */
    public String getCallerid() {
        return this.callerid;
    }

    public boolean hasCallerid() {
        return this.callerid != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date beginTime;

    /**
    * The begin time of the request in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getBeginTime() {
        return this.beginTime;
    }

    public boolean hasBeginTime() {
        return this.beginTime != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date submitted;

    /**
    * The submission time of the request in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getSubmitted() {
        return this.submitted;
    }

    public boolean hasSubmitted() {
        return this.submitted != null;
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
        if (acdSessionHistoryId != null) {
            sb.append(aligned)
                .append("\"acdSessionHistoryId\": \"")
                .append(acdSessionHistoryId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdRequestId != null) {
            sb.append(aligned)
                .append("\"acdRequestId\": \"")
                .append(acdRequestId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueId != null) {
            sb.append(aligned)
                .append("\"acdQueueId\": \"")
                .append(acdQueueId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acdQueueName != null) {
            sb.append(aligned)
                .append("\"acdQueueName\": \"")
                .append(acdQueueName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (callerid != null) {
            sb.append(aligned)
                .append("\"callerid\": \"")
                .append(callerid)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (beginTime != null) {
            sb.append(aligned)
                .append("\"beginTime\": \"")
                .append(beginTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (submitted != null) {
            sb.append(aligned)
                .append("\"submitted\": \"")
                .append(submitted)
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