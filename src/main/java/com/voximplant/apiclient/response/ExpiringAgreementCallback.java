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

/**
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class ExpiringAgreementCallback implements Alignable {

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
    public Long getUntilExpiration() {
        return this.untilExpiration;
    }

    public boolean hasUntilExpiration() {
        return this.untilExpiration != null;
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
        if (expirationDate  != null) {
            sb.append(aligned)
                .append("\"expirationDate \": \"")
                .append(expirationDate )
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (untilExpiration != null) {
            sb.append(aligned)
                .append("\"untilExpiration\": \"")
                .append(untilExpiration)
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