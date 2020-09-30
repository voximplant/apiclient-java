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
public class ExpiredAgreementCallback {

    private long[] documentIds;

    /**
    * The list of the expired agreements IDs.
    */
    public long[] getDocumentIds() {
        return this.documentIds;
    }

    public boolean hasDocumentIds() {
        return this.documentIds != null;
    }

}