package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details.
*/
public class TranscriptionCompleteCallbackItem {

    private String recordUrl;

    /**
    * The record url.
    */
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public boolean hasRecordUrl() {
        return this.recordUrl != null;
    }

    private String transcriptionUrl;

    /**
    * The transcription url.
    */
    public String getTranscriptionUrl() {
        return this.transcriptionUrl;
    }

    public boolean hasTranscriptionUrl() {
        return this.transcriptionUrl != null;
    }

    private Long callSessionHistoryId;

    /**
    * The call session history id.
    */
    public long getCallSessionHistoryId() {
        return this.callSessionHistoryId.longValue();
    }

    public boolean hasCallSessionHistoryId() {
        return this.callSessionHistoryId != null;
    }

    private BigDecimal transcriptionCost;

    /**
    * The cost of transcription.
    */
    public BigDecimal getTranscriptionCost() {
        return this.transcriptionCost;
    }

    public boolean hasTranscriptionCost() {
        return this.transcriptionCost != null;
    }

}