package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class TranscriptionCompleteCallback {

    private TranscriptionCompleteCallbackItem transcriptionComplete;

    /**
    * The transcription info.
    */
    public TranscriptionCompleteCallbackItem getTranscriptionComplete() {
        return this.transcriptionComplete;
    }

    public boolean hasTranscriptionComplete() {
        return this.transcriptionComplete != null;
    }

}