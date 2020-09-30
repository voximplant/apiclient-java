package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The part of the [A2PSendSms] function result.
*/
public class FailedSms {

    private String destinationNumber;

    /**
    * The SMS destination number.
    */
    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    private String errorDescription;

    /**
    * The error description.
    */
    public String getErrorDescription() {
        return this.errorDescription;
    }

    public boolean hasErrorDescription() {
        return this.errorDescription != null;
    }

    private Long errorCode;

    /**
    * The error code.
    */
    public long getErrorCode() {
        return this.errorCode.longValue();
    }

    public boolean hasErrorCode() {
        return this.errorCode != null;
    }

}