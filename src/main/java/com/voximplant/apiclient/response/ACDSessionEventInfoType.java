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
* The ACD session event info.
*/
public class ACDSessionEventInfoType implements Alignable {

    private Long acdSessionEventId;

    /**
    * The ACD session event ID
    */
    public Long getAcdSessionEventId() {
        return this.acdSessionEventId;
    }

    public boolean hasAcdSessionEventId() {
        return this.acdSessionEventId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date time;

    /**
    * The UTC start date in 24-h format: YYYY-MM-DD HH:mm:ss
    */
    public Date getTime() {
        return this.time;
    }

    public boolean hasTime() {
        return this.time != null;
    }

    private String type;

    /**
    * The event type name
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private Long userId;

    /**
    * The user ID
    */
    public Long getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String customData;

    /**
    * The custom data
    */
    public String getCustomData() {
        return this.customData;
    }

    public boolean hasCustomData() {
        return this.customData != null;
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
        if (acdSessionEventId != null) {
            sb.append(aligned)
                .append("\"acdSessionEventId\": \"")
                .append(acdSessionEventId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (time != null) {
            sb.append(aligned)
                .append("\"time\": \"")
                .append(time)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (type != null) {
            sb.append(aligned)
                .append("\"type\": \"")
                .append(type)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (userId != null) {
            sb.append(aligned)
                .append("\"userId\": \"")
                .append(userId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (customData != null) {
            sb.append(aligned)
                .append("\"customData\": \"")
                .append(customData)
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