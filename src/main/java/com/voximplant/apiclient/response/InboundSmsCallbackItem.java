package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The details of the [InboundSmsCallback].
*/
public class InboundSmsCallbackItem {

    private String sourceNumber;

    /**
    * The source phone number.
    */
    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private String destinationNumber;

    /**
    * The destination phone number.
    */
    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    private String smsBody;

    /**
    * The message.
    */
    public String getSmsBody() {
        return this.smsBody;
    }

    public boolean hasSmsBody() {
        return this.smsBody != null;
    }

}