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
    * enable a multiple numbers subscription
    */
    public Long getCount() {
        return this.count;
    }

    public boolean hasCount() {
        return this.count != null;
    }

    private Long installationTaxReserve;

    /**
    * The phone number installation tax reserve
    */
    public Long getInstallationTaxReserve() {
        return this.installationTaxReserve;
    }

    public boolean hasInstallationTaxReserve() {
        return this.installationTaxReserve != null;
    }

    private Long taxReserve;

    /**
    * The phone number tax reserve
    */
    public Long getTaxReserve() {
        return this.taxReserve;
    }

    public boolean hasTaxReserve() {
        return this.taxReserve != null;
    }

    private Long localPrice;

    /**
    * Phone number price from the price list
    */
    public Long getLocalPrice() {
        return this.localPrice;
    }

    public boolean hasLocalPrice() {
        return this.localPrice != null;
    }

    private Long localInstallationPrice;

    /**
    * Phone number installation price from the price list
    */
    public Long getLocalInstallationPrice() {
        return this.localInstallationPrice;
    }

    public boolean hasLocalInstallationPrice() {
        return this.localInstallationPrice != null;
    }

    private String localCurrency;

    /**
    * Price list currency
    */
    public String getLocalCurrency() {
        return this.localCurrency;
    }

    public boolean hasLocalCurrency() {
        return this.localCurrency != null;
    }

    private Long accountPrice;

    /**
    * Phone number price in the account currency
    */
    public Long getAccountPrice() {
        return this.accountPrice;
    }

    public boolean hasAccountPrice() {
        return this.accountPrice != null;
    }

    private Long accountInstallationPrice;

    /**
    * Phone number installation price in the account currency
    */
    public Long getAccountInstallationPrice() {
        return this.accountInstallationPrice;
    }

    public boolean hasAccountInstallationPrice() {
        return this.accountInstallationPrice != null;
    }

    private String accountCurrency;

    /**
    * Account currency
    */
    public String getAccountCurrency() {
        return this.accountCurrency;
    }

    public boolean hasAccountCurrency() {
        return this.accountCurrency != null;
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
        if (installationTaxReserve != null) {
            sb.append(aligned)
                .append("\"installationTaxReserve\": \"")
                .append(installationTaxReserve)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (taxReserve != null) {
            sb.append(aligned)
                .append("\"taxReserve\": \"")
                .append(taxReserve)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localPrice != null) {
            sb.append(aligned)
                .append("\"localPrice\": \"")
                .append(localPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localInstallationPrice != null) {
            sb.append(aligned)
                .append("\"localInstallationPrice\": \"")
                .append(localInstallationPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (localCurrency != null) {
            sb.append(aligned)
                .append("\"localCurrency\": \"")
                .append(localCurrency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountPrice != null) {
            sb.append(aligned)
                .append("\"accountPrice\": \"")
                .append(accountPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountInstallationPrice != null) {
            sb.append(aligned)
                .append("\"accountInstallationPrice\": \"")
                .append(accountInstallationPrice)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountCurrency != null) {
            sb.append(aligned)
                .append("\"accountCurrency\": \"")
                .append(accountCurrency)
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