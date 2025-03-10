package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

public class StartConferenceResponse implements Alignable {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Long result;

    /**
    * 1
    */
    public Long getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private String mediaSessionAccessUrl;

    /**
    * The URL to control a created media session. It can be used for
    * arbitrary tasks such as stopping scenario or passing additional data
    * to it. Making HTTP request on this URL results in the
    * [AppEvents.HttpRequest](/docs/references/voxengine/appevents#httprequest)
    * VoxEngine event being triggered for a scenario, with an HTTP request
    * data passed to it
    */
    public String getMediaSessionAccessUrl() {
        return this.mediaSessionAccessUrl;
    }

    public boolean hasMediaSessionAccessUrl() {
        return this.mediaSessionAccessUrl != null;
    }

    private String mediaSessionAccessSecureUrl;

    /**
    * The URL to control a created media session. It can be used for
    * arbitrary tasks such as stopping scenario or passing additional data
    * to it. Making HTTPS request on this URL results in the
    * [AppEvents.HttpRequest](/docs/references/voxengine/appevents#httprequest)
    * VoxEngine event being triggered for a scenario, with an HTTP request
    * data passed to it
    */
    public String getMediaSessionAccessSecureUrl() {
        return this.mediaSessionAccessSecureUrl;
    }

    public boolean hasMediaSessionAccessSecureUrl() {
        return this.mediaSessionAccessSecureUrl != null;
    }

    private Long callSessionHistoryId;

    /**
    * The call session history ID. To search a call session result, paste
    * the ID to the <a
    * href='/docs/references/httpapi/history#getcallhistory'>GetCallHistory</a>
    * method's <b>call_session_history_id</b> parameter
    */
    public Long getCallSessionHistoryId() {
        return this.callSessionHistoryId;
    }

    public boolean hasCallSessionHistoryId() {
        return this.callSessionHistoryId != null;
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
        if (result != null) {
            sb.append(aligned)
                .append("\"result\": \"")
                .append(result)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mediaSessionAccessUrl != null) {
            sb.append(aligned)
                .append("\"mediaSessionAccessUrl\": \"")
                .append(mediaSessionAccessUrl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (mediaSessionAccessSecureUrl != null) {
            sb.append(aligned)
                .append("\"mediaSessionAccessSecureUrl\": \"")
                .append(mediaSessionAccessSecureUrl)
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}