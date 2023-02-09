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
* The specific account callback details.
*/
public class TranscriptionCompleteCallbackItem implements Alignable {

    private String recordUrl;

    /**
    * The record url
    */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public boolean hasRecordUrl() {
        return this.recordUrl != null;
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

    private Long callSessionHistoryId;

    /**
    * The call session history ID
    */
    public Long getCallSessionHistoryId() {
        return this.callSessionHistoryId;
    }

    public boolean hasCallSessionHistoryId() {
        return this.callSessionHistoryId != null;
    }

    private BigDecimal transcriptionCost;

    /**
    * The cost of transcription
    */
    public BigDecimal getTranscriptionCost() {
        return this.transcriptionCost;
    }

    public boolean hasTranscriptionCost() {
        return this.transcriptionCost != null;
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
        if (recordUrl != null) {
            sb.append(aligned)
                .append("\"recordUrl\": \"")
                .append(recordUrl)
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
        if (callSessionHistoryId != null) {
            sb.append(aligned)
                .append("\"callSessionHistoryId\": \"")
                .append(callSessionHistoryId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transcriptionCost != null) {
            sb.append(aligned)
                .append("\"transcriptionCost\": \"")
                .append(transcriptionCost)
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