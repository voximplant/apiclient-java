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
* The record info.
*/
public class RecordType implements Alignable {

    private Long recordId;

    /**
    * The record ID
    */
    public Long getRecordId() {
        return this.recordId;
    }

    public boolean hasRecordId() {
        return this.recordId != null;
    }

    private String recordName;

    /**
    * The record name
    */
    public String getRecordName() {
        return this.recordName;
    }

    public boolean hasRecordName() {
        return this.recordName != null;
    }

    private BigDecimal cost;

    /**
    * The record cost
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
    * The call duration in seconds
    */
    public Long getDuration() {
        return this.duration;
    }

    public boolean hasDuration() {
        return this.duration != null;
    }

    private String recordUrl;

    /**
    * The record URL.  If you have issues accessing the record file, check
    * if the application has "Secure storage of applications and logs"
    * feature enabled. In this case, you need to <a
    * href='/docs/guides/managementapi/secureobjects'>authorize</a>.
    */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public boolean hasRecordUrl() {
        return this.recordUrl != null;
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

    private BigDecimal fileSize;

    /**
    * The file size
    */
    public BigDecimal getFileSize() {
        return this.fileSize;
    }

    public boolean hasFileSize() {
        return this.fileSize != null;
    }

    private String transcriptionUrl;

    /**
    * Transcription URL. To open the URL, please add authorization
    * parameters and <b>record_id</b> to it
    */
    public String getTranscriptionUrl() {
        return this.transcriptionUrl;
    }

    public boolean hasTranscriptionUrl() {
        return this.transcriptionUrl != null;
    }

    private String transcriptionStatus;

    /**
    * The status of transcription. The possible values are Not required, In
    * progress, Complete
    */
    public String getTranscriptionStatus() {
        return this.transcriptionStatus;
    }

    public boolean hasTranscriptionStatus() {
        return this.transcriptionStatus != null;
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
        if (recordId != null) {
            sb.append(aligned)
                .append("\"recordId\": \"")
                .append(recordId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (recordName != null) {
            sb.append(aligned)
                .append("\"recordName\": \"")
                .append(recordName)
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
        if (recordUrl != null) {
            sb.append(aligned)
                .append("\"recordUrl\": \"")
                .append(recordUrl)
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
        if (fileSize != null) {
            sb.append(aligned)
                .append("\"fileSize\": \"")
                .append(fileSize)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transcriptionUrl != null) {
            sb.append(aligned)
                .append("\"transcriptionUrl\": \"")
                .append(transcriptionUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transcriptionStatus != null) {
            sb.append(aligned)
                .append("\"transcriptionStatus\": \"")
                .append(transcriptionStatus)
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