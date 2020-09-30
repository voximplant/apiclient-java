package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The ACD session event info.
*/
public class ACDSessionEventInfoType {

    private Long acdSessionEventId;

    /**
    * The ACD session event ID.
    */
    public long getAcdSessionEventId() {
        return this.acdSessionEventId.longValue();
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
    * The event type name.
    */
    public String getType() {
        return this.type;
    }

    public boolean hasType() {
        return this.type != null;
    }

    private Long userId;

    /**
    * The user ID.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    private String customData;

    /**
    * The custom data.
    */
    public String getCustomData() {
        return this.customData;
    }

    public boolean hasCustomData() {
        return this.customData != null;
    }

}