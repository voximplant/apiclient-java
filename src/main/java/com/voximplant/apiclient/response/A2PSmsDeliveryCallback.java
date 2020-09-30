package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The A2P SMS delivery status callback.
*/
public class A2PSmsDeliveryCallback {

    private Long id;

    /**
    * The SMS delivery ID.
    */
    public long getId() {
        return this.id.longValue();
    }

    public boolean hasId() {
        return this.id != null;
    }

    private String sourceNumber;

    /**
    * The source number.
    */
    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    private String status;

    /**
    * The SMS delivery status.
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    private String destinationNumbers;

    /**
    * The destination number(s).
    */
    public String getDestinationNumbers() {
        return this.destinationNumbers;
    }

    public boolean hasDestinationNumbers() {
        return this.destinationNumbers != null;
    }

}