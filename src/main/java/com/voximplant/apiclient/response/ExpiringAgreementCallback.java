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
public class ExpiringAgreementCallback {

    @JsonDeserialize(using=com.voximplant.apiclient.util.DateDeserializer.class)
    private Date expirationDate ;

    /**
    * The date of agreement expiration in format: YYYY-MM-DD.
    */
    public Date getExpirationDate () {
        return this.expirationDate ;
    }

    public boolean hasExpirationDate () {
        return this.expirationDate  != null;
    }

    private Long untilExpiration;

    /**
    * The number of days left until an expiration date.
    */
    public long getUntilExpiration() {
        return this.untilExpiration.longValue();
    }

    public boolean hasUntilExpiration() {
        return this.untilExpiration != null;
    }

}