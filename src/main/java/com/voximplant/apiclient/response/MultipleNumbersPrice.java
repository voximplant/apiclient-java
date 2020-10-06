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
* Info about multiple numbers subscription for the child accounts.
*/
public class MultipleNumbersPrice implements Alignable {

    private Long count;

    /**
    * The number of subscriptions which must be purchased simultaneously to
    * enable a multiple numbers subscription.
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private BigDecimal price;

    /**
    * The subscription price for one number, i.e., the total multiple
    * numbers subscription price divided by the __count__ value.
    */
    public BigDecimal getPrice() {
        return this.price;
    }

    public boolean hasPrice() {
        return this.price != null;
    }

    private BigDecimal installationPrice;

    /**
    * The installation price for one number, i.e., the total multiple
    * numbers installation price divided by the __count__ value.
    */
    public BigDecimal getInstallationPrice() {
        return this.installationPrice;
    }

    public boolean hasInstallationPrice() {
        return this.installationPrice != null;
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
        if (count != null) {
            sb.append(aligned)
                .append("\"count\": \"")
                .append(count)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (price != null) {
            sb.append(aligned)
                .append("\"price\": \"")
                .append(price)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (installationPrice != null) {
            sb.append(aligned)
                .append("\"installationPrice\": \"")
                .append(installationPrice)
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