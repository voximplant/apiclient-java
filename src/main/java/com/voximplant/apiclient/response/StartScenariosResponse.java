package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class StartScenariosResponse {
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
    public long getResult() {
        return this.result.longValue();
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
    * VoxEngine event being triggered for scenario, with HTTP request data
    * passed to it.
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
    * VoxEngine event being triggered for scenario, with HTTP request data
    * passed to it.
    */
    public String getMediaSessionAccessSecureUrl() {
        return this.mediaSessionAccessSecureUrl;
    }

    public boolean hasMediaSessionAccessSecureUrl() {
        return this.mediaSessionAccessSecureUrl != null;
    }

    private String mediaSessionCheckUrl;

    /**
    * The URL to check media session
    */
    public String getMediaSessionCheckUrl() {
        return this.mediaSessionCheckUrl;
    }

    public boolean hasMediaSessionCheckUrl() {
        return this.mediaSessionCheckUrl != null;
    }

}