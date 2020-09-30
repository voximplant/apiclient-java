package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetAvailableRegulationsResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private Boolean result;

    /**
    * If result equals 1: 1) the user has at least one regulation address
    * which is appropriate for verification or 2) the verification is not
    * required. If result equals 0, the regulations address needs to be
    * created.
    */
    public boolean getResult() {
        return this.result.booleanValue();
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private RegulationAddress[] availableAddress;

    /**
    * The available RegulationAddress records.
    */
    public RegulationAddress[] getAvailableAddress() {
        return this.availableAddress;
    }

    public boolean hasAvailableAddress() {
        return this.availableAddress != null;
    }

    private Long countInProgress;

    /**
    * The count of RegulationAddress in progress status.
    */
    public long getCountInProgress() {
        return this.countInProgress.longValue();
    }

    public boolean hasCountInProgress() {
        return this.countInProgress != null;
    }

}