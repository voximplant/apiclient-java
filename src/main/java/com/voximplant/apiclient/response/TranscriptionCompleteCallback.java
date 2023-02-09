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
* Received when a transcription is saved. Received as part of the
* [AccountCallback] structure.
*/
public class TranscriptionCompleteCallback implements Alignable {

    private TranscriptionCompleteCallbackItem transcriptionComplete;

    /**
    * The transcription info
    */
    public TranscriptionCompleteCallbackItem getTranscriptionComplete() {
        return this.transcriptionComplete;
    }

    public boolean hasTranscriptionComplete() {
        return this.transcriptionComplete != null;
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
        if (transcriptionComplete != null) {
            sb.append(aligned)
                .append("\"transcriptionComplete\": \"")
                .append(transcriptionComplete)
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