package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The ZipCode record.
*/
public class ZipCode implements Alignable {

    private String city;

    /**
    * The city name
    */
    public String getCity() {
        return this.city;
    }

    public boolean hasCity() {
        return this.city != null;
    }

    private String zipCode;

    /**
    * The zip code
    */
    public String getZipCode() {
        return this.zipCode;
    }

    public boolean hasZipCode() {
        return this.zipCode != null;
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
        if (city != null) {
            sb.append(aligned)
                .append("\"city\": \"")
                .append(city)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (zipCode != null) {
            sb.append(aligned)
                .append("\"zipCode\": \"")
                .append(zipCode)
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