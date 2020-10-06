package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class AddAuthorizedAccountIPRequest implements Alignable {
    private String authorizedIp;

    @RequestField(name="authorized_ip")
    /**
    * The authorized IP4 or network.
    */
    public String getAuthorizedIp() {
        return this.authorizedIp;
    }

    public boolean hasAuthorizedIp() {
        return this.authorizedIp != null;
    }

    /**
    * The authorized IP4 or network.
    */
    public AddAuthorizedAccountIPRequest setAuthorizedIp(String d) {
        this.authorizedIp = d;
        return this;
    }

    private Boolean allowed;

    @RequestField(name="allowed")
    /**
    * Set false to add the IP to the blacklist.
    */
    public Boolean getAllowed() {
        return this.allowed;
    }

    public boolean hasAllowed() {
        return this.allowed != null;
    }

    /**
    * Set false to add the IP to the blacklist.
    */
    public AddAuthorizedAccountIPRequest setAllowed(boolean d) {
        this.allowed = Boolean.valueOf(d);
        return this;
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
        if (authorizedIp != null) {
            sb.append(aligned)
                .append("\"authorizedIp\": \"")
                .append(authorizedIp)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (allowed != null) {
            sb.append(aligned)
                .append("\"allowed\": \"")
                .append(allowed)
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