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
    * to it. Making HTTP request on this URL will result in the
    * [AppEvents.HttpRequest](https://voximplant.com/docs/references/voxengine/appevents#httprequest)
    * VoxEngine event being triggered for a scenario, with an HTTP request
    * data passed to it.
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
    * to it. Making HTTPS request on this URL will result in the
    * [AppEvents.HttpRequest](https://voximplant.com/docs/references/voxengine/appevents#httprequest)
    * VoxEngine event being triggered for a scenario, with an HTTP request
    * data passed to it.
    */
    public String getMediaSessionAccessSecureUrl() {
        return this.mediaSessionAccessSecureUrl;
    }

    public boolean hasMediaSessionAccessSecureUrl() {
        return this.mediaSessionAccessSecureUrl != null;
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
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}