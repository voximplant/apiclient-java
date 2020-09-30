package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The inbound SMS callback. Received as part of the [AccountCallback]
* structure.
*/
public class InboundSmsCallback {

    private InboundSmsCallbackItem[] smsInbound;

    /**
    * The inbound SMS info.
    */
    public InboundSmsCallbackItem[] getSmsInbound() {
        return this.smsInbound;
    }

    public boolean hasSmsInbound() {
        return this.smsInbound != null;
    }

}