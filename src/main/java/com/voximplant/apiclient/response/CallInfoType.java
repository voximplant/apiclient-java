package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The call info.
*/
public class CallInfoType {

    private Long callId;

    /**
    * The call history ID.
    */
    public long getCallId() {
        return this.callId.longValue();
    }

    public boolean hasCallId() {
        return this.callId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date startTime;

    /**
    * The start time in the selected timezone in 24-h format: YYYY-MM-DD
    * HH:mm:ss
    */
    public Date getStartTime() {
        return this.startTime;
    }

    public boolean hasStartTime() {
        return this.startTime != null;
    }

    private Long duration;

    /**
    * The call duration in seconds.
    */
    public long getDuration() {
        return this.duration.longValue();
    }

    public boolean hasDuration() {
        return this.duration != null;
    }

    private String localNumber;

    /**
    * The local number.
    */
    public String getLocalNumber() {
        return this.localNumber;
    }

    public boolean hasLocalNumber() {
        return this.localNumber != null;
    }

    private String remoteNumber;

    /**
    * The remote number.
    */
    public String getRemoteNumber() {
        return this.remoteNumber;
    }

    public boolean hasRemoteNumber() {
        return this.remoteNumber != null;
    }

    private String remoteNumberType;

    /**
    * The remote number type.
    */
    public String getRemoteNumberType() {
        return this.remoteNumberType;
    }

    public boolean hasRemoteNumberType() {
        return this.remoteNumberType != null;
    }

    private Boolean incoming;

    /**
    * The incoming flag.
    */
    public boolean getIncoming() {
        return this.incoming.booleanValue();
    }

    public boolean hasIncoming() {
        return this.incoming != null;
    }

    private Boolean successful;

    /**
    * The success flag.
    */
    public boolean getSuccessful() {
        return this.successful.booleanValue();
    }

    public boolean hasSuccessful() {
        return this.successful != null;
    }

    private Long transactionId;

    /**
    * The transaction ID.
    */
    public long getTransactionId() {
        return this.transactionId.longValue();
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private String recordUrl;

    /**
    * The record URL.
    */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public boolean hasRecordUrl() {
        return this.recordUrl != null;
    }

    private String mediaServerAddress;

    /**
    * The media server IP address.
    */
    public String getMediaServerAddress() {
        return this.mediaServerAddress;
    }

    public boolean hasMediaServerAddress() {
        return this.mediaServerAddress != null;
    }

    private BigDecimal cost;

    /**
    * The call cost.
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
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