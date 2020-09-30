package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The record info.
*/
public class RecordType {

    private Long recordId;

    /**
    * The record ID.
    */
    public long getRecordId() {
        return this.recordId.longValue();
    }

    public boolean hasRecordId() {
        return this.recordId != null;
    }

    private String recordName;

    /**
    * The record name.
    */
    public String getRecordName() {
        return this.recordName;
    }

    public boolean hasRecordName() {
        return this.recordName != null;
    }

    private BigDecimal cost;

    /**
    * The record cost.
    */
    public BigDecimal getCost() {
        return this.cost;
    }

    public boolean hasCost() {
        return this.cost != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date startTime;

    /**
    * The start recording time in the selected timezone in 24-h format:
    * YYYY-MM-DD HH:mm:ss
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

    private BigDecimal fileSize;

    /**
    * The file size.
    */
    public BigDecimal getFileSize() {
        return this.fileSize;
    }

    public boolean hasFileSize() {
        return this.fileSize != null;
    }

    private String transcriptionUrl;

    /**
    * The url of transcription.
    */
    public String getTranscriptionUrl() {
        return this.transcriptionUrl;
    }

    public boolean hasTranscriptionUrl() {
        return this.transcriptionUrl != null;
    }

    private String transcriptionStatus;

    /**
    * The status of transcription. The possible values are: Not required,
    * In progress, Complete
    */
    public String getTranscriptionStatus() {
        return this.transcriptionStatus;
    }

    public boolean hasTranscriptionStatus() {
        return this.transcriptionStatus != null;
    }

}