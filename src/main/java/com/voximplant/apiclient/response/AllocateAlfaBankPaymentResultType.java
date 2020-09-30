package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The newAlfaBankPayment function result.
*/
public class AllocateAlfaBankPaymentResultType {

    private String formUrl;

    /**
    * The URL to redirect.
    */
    public String getFormUrl() {
        return this.formUrl;
    }

    public boolean hasFormUrl() {
        return this.formUrl != null;
    }

    private String paymentId ;

    /**
    * The payment ID.
    */
    public String getPaymentId () {
        return this.paymentId ;
    }

    public boolean hasPaymentId () {
        return this.paymentId  != null;
    }

}