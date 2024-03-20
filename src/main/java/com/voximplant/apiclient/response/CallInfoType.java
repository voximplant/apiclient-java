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
* The call info.
*/
public class CallInfoType implements Alignable {

    private Long callId;

    /**
    * The call history ID
    */
    public Long getCallId() {
        return this.callId;
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
    * The call duration in seconds
    */
    public Long getDuration() {
        return this.duration;
    }

    public boolean hasDuration() {
        return this.duration != null;
    }

    private String localNumber;

    /**
    * The local number on the platform side
    */
    public String getLocalNumber() {
        return this.localNumber;
    }

    public boolean hasLocalNumber() {
        return this.localNumber != null;
    }

    private String remoteNumber;

    /**
    * The remote number on the client side
    */
    public String getRemoteNumber() {
        return this.remoteNumber;
    }

    public boolean hasRemoteNumber() {
        return this.remoteNumber != null;
    }

    private String remoteNumberType;

    /**
    * The type of the remote number, such as PSTN, mobile, user or sip
    * address
    */
    public String getRemoteNumberType() {
        return this.remoteNumberType;
    }

    public boolean hasRemoteNumberType() {
        return this.remoteNumberType != null;
    }

    private Boolean incoming;

    /**
    * Whether the call is incoming
    */
    public Boolean getIncoming() {
        return this.incoming;
    }

    public boolean hasIncoming() {
        return this.incoming != null;
    }

    private Boolean successful;

    /**
    * Whether the call is successful
    */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public boolean hasSuccessful() {
        return this.successful != null;
    }

    private Long transactionId;

    /**
    * The transaction ID
    */
    public Long getTransactionId() {
        return this.transactionId;
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private String recordUrl;

    /**
    * The record URL
    */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public boolean hasRecordUrl() {
        return this.recordUrl != null;
    }

    private String mediaServerAddress;

    /**
    * The media server IP address
    */
    public String getMediaServerAddress() {
        return this.mediaServerAddress;
    }

    public boolean hasMediaServerAddress() {
        return this.mediaServerAddress != null;
    }

    private BigDecimal cost;

    /**
    * The call cost
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
    }

    private String customData;

    /**
    * The custom data passed to the JS session
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
        if (callId != null) {
            sb.append(aligned)
                .append("\"callId\": \"")
                .append(callId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (startTime != null) {
            sb.append(aligned)
                .append("\"startTime\": \"")
                .append(startTime)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (duration != null) {
            sb.append(aligned)
                .append("\"duration\": \"")
                .append(duration)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localNumber != null) {
            sb.append(aligned)
                .append("\"localNumber\": \"")
                .append(localNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (remoteNumber != null) {
            sb.append(aligned)
                .append("\"remoteNumber\": \"")
                .append(remoteNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (remoteNumberType != null) {
            sb.append(aligned)
                .append("\"remoteNumberType\": \"")
                .append(remoteNumberType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (incoming != null) {
            sb.append(aligned)
                .append("\"incoming\": \"")
                .append(incoming)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (successful != null) {
            sb.append(aligned)
                .append("\"successful\": \"")
                .append(successful)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transactionId != null) {
            sb.append(aligned)
                .append("\"transactionId\": \"")
                .append(transactionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (recordUrl != null) {
            sb.append(aligned)
                .append("\"recordUrl\": \"")
                .append(recordUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mediaServerAddress != null) {
            sb.append(aligned)
                .append("\"mediaServerAddress\": \"")
                .append(mediaServerAddress)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cost != null) {
            sb.append(aligned)
                .append("\"cost\": \"")
                .append(cost)
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